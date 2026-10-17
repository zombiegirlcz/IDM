package mx0;

import android.animation.Animator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209796a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f209797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f209798c;

    public l0(ux0.s0 s0Var, boolean z) {
        this.f209798c = s0Var;
        this.f209797b = z;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        switch (this.f209796a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f209797b = true;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f209796a) {
            case 0:
                p0 p0Var = (p0) this.f209798c;
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (!this.f209797b) {
                    p0Var.f209914y = false;
                    p0Var.f209906n = p0Var.o;
                    p0Var.f209908q = p0Var.f209909r;
                    ?? r110 = p0Var.f209898a;
                    ArrayList arrayList = new ArrayList();
                    int size = r110.size();
                    for (int i = 0; i < size; i++) {
                        Object obj2 = r110.get(i);
                        if (((s0) obj2).f209982b != k0.REMOVE) {
                            arrayList.add(obj2);
                        }
                    }
                    p0Var.f209898a = arrayList;
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        s0 s0Var = (s0) arrayList.get(i2);
                        s0Var.a(k0.NONE);
                        s0Var.f209983c = s0Var.d;
                        s0Var.f209984g = s0Var.f209985h;
                        s0Var.i = BitmapDescriptorFactory.HUE_RED;
                    }
                    break;
                }
                break;
            case 1:
                rp0.e eVar = (rp0.e) this.f209798c;
                if (!this.f209797b) {
                    ix0.j2 j2Var = eVar.k;
                    if (j2Var != null) {
                        j2Var.cancel();
                    }
                    eVar.k = null;
                    eVar.f256067c = null;
                    eVar.f256065a.invalidate();
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        switch (this.f209796a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        switch (this.f209796a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            case 1:
                break;
            default:
                ux0.s0 s0Var = (ux0.s0) this.f209798c;
                s0Var.b(s0Var.getAccountsSelectionView(), BitmapDescriptorFactory.HUE_RED, this.f209797b);
                break;
        }
    }

    public l0(boolean z, rp0.e eVar) {
        this.f209797b = z;
        this.f209798c = eVar;
    }

    public l0(p0 p0Var) {
        this.f209798c = p0Var;
    }
}
