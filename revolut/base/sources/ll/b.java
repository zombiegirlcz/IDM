package ll;

import androidx.fragment.app.FragmentManager;
import kl.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements FragmentManager.OnBackStackChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f196488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentManager f196489b;

    public b(m screenBackStackChanged, FragmentManager childFragmentManager) {
        Intrinsics.checkNotNullParameter(screenBackStackChanged, "screenBackStackChanged");
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        this.f196488a = screenBackStackChanged;
        this.f196489b = childFragmentManager;
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public final void onBackStackChanged() {
        this.f196488a.invoke(Integer.valueOf(this.f196489b.getBackStackEntryCount()));
    }
}
