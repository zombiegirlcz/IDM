package ll;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.android.sdk.capture.internal.navigation.navigator.FragmentNavigationManager;
import com.onfido.workflow.internal.ui.LoadingScreen;
import java.util.ArrayList;
import java.util.List;
import kl.m;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements FragmentManager.OnBackStackChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentNavigationManager f196490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f196491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FragmentManager f196492c;
    public final m d;
    public final ArrayList e;

    public c(FragmentNavigationManager navigationManager, m onBackStackChanged, FragmentManager parentFragmentManager, m onScreenBackStackChanged) {
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(onBackStackChanged, "onBackStackChanged");
        Intrinsics.checkNotNullParameter(parentFragmentManager, "parentFragmentManager");
        Intrinsics.checkNotNullParameter(onScreenBackStackChanged, "onScreenBackStackChanged");
        this.f196490a = navigationManager;
        this.f196491b = onBackStackChanged;
        this.f196492c = parentFragmentManager;
        this.d = onScreenBackStackChanged;
        this.e = new ArrayList();
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public final void onBackStackChanged() {
        FragmentManager childFragmentManager;
        List<Screen> currentScreensSnapshot = this.f196490a.getCurrentScreensSnapshot();
        this.f196491b.invoke(currentScreensSnapshot);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : currentScreensSnapshot) {
            if (!(((Screen) obj2) instanceof LoadingScreen)) {
                arrayList.add(obj2);
            }
        }
        Screen screen = (Screen) d0.o0(arrayList);
        int size = arrayList.size();
        ArrayList<a> arrayList2 = this.e;
        if (size != 1 || screen == null) {
            for (a aVar : arrayList2) {
                aVar.f196486a.removeOnBackStackChangedListener(aVar.f196487b);
            }
            arrayList2.clear();
            return;
        }
        Fragment fragmentFindFragmentByTag = this.f196492c.findFragmentByTag(screen.screenKey());
        if (fragmentFindFragmentByTag == null || (childFragmentManager = fragmentFindFragmentByTag.getChildFragmentManager()) == null) {
            return;
        }
        b bVar = new b(this.d, childFragmentManager);
        arrayList2.add(new a(childFragmentManager, bVar));
        childFragmentManager.addOnBackStackChangedListener(bVar);
    }
}
