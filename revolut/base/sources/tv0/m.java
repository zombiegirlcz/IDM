package tv0;

import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends WindowInsetsAnimationCompat.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f274677a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, int i) {
        super(i);
        this.f274677a = nVar;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onEnd(WindowInsetsAnimationCompat animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        n nVar = this.f274677a;
        if (n.a(nVar, animation)) {
            int i = nVar.f - 1;
            if (i < 0) {
                i = 0;
            }
            nVar.f = i;
            if (i > 0) {
                return;
            }
            nVar.i = null;
            if (!nVar.f274683j.equals(j.f274675a) && nVar.f274682h <= 0) {
                nVar.f274678a.postDelayed(nVar.k, 500L);
            }
            nVar.b();
            nVar.d();
        }
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onPrepare(WindowInsetsAnimationCompat animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        n nVar = this.f274677a;
        if (n.a(nVar, animation)) {
            nVar.f++;
            if (nVar.i == null) {
                nVar.i = (Integer) nVar.f274679b.invoke();
            }
            nVar.f274678a.removeCallbacks(nVar.k);
        }
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsCompat onProgress(WindowInsetsCompat insets, List runningAnimations) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
        int size = runningAnimations.size();
        for (int i = 0; i < size; i++) {
            WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) runningAnimations.get(i);
            n nVar = this.f274677a;
            if (n.a(nVar, windowInsetsAnimationCompat)) {
                nVar.i = Integer.valueOf(insets.getInsets(WindowInsetsCompat.Type.ime()).bottom);
                return insets;
            }
        }
        return insets;
    }
}
