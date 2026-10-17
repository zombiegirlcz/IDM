package sri;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f265230a;

    public a(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f265230a = fragment;
    }

    @Override // sri.c
    public final FragmentManager a() {
        FragmentManager childFragmentManager = this.f265230a.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        return childFragmentManager;
    }
}
