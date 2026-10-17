package kmk;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.c;
import eh1.g;
import imk.a0;
import imk.b0;
import imk.c0;
import imk.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import wik.u;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u f185904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fkg.a f185905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j2 f185906n;
    public boolean o;

    public f(u planWaveAnimationInteractor) {
        Intrinsics.checkNotNullParameter(planWaveAnimationInteractor, "planWaveAnimationInteractor");
        this.f185904l = planWaveAnimationInteractor;
        this.f185905m = new fkg.a(this, 29);
        this.f185906n = q.c(a.PENDING);
    }

    @Override // yji.n
    public final void F2() {
        e3(a.PENDING);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kmk.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(imk.u r7, hha.d r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kmk.f.Z2(imk.u, hha.d, gim.c):java.lang.Object");
    }

    @Override // kmk.b
    public final Flow b3() {
        return this.f185906n;
    }

    @Override // kmk.b
    public final Data c3(imk.u uVar, Data data, com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.c cVar, boolean z) {
        if (data.getContent() == null && data.getLoading()) {
            return uVar.f162546b;
        }
        if (data.getContent() != null || data.getError() == null) {
            int i = d.f185900a[((a) this.f185906n.getValue()).ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                if (i == 4) {
                    return uVar.f162546b;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                this.o = true;
                if (z) {
                    return uVar.f162546b;
                }
                if (!(cVar instanceof a0) && !(cVar instanceof c0) && !Intrinsics.f(cVar, c.a.f103569a) && !(cVar instanceof d0) && !(cVar instanceof b0)) {
                    if (!Intrinsics.f(cVar, c.b.f103570a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.o = false;
                    V2(new g(this, 300L, (Continuation) null), new yi5.b(29));
                }
                return uVar.f162546b;
            }
        }
        return data;
    }

    @Override // kmk.b
    public final void d3() {
        if (this.o) {
            this.o = false;
            V2(new g(this, 500L, (Continuation) null), new yi5.b(29));
        }
    }

    public final void e3(a aVar) {
        int i = d.f185900a[aVar.ordinal()];
        if (i != 1) {
            u uVar = this.f185904l;
            if (i == 2) {
                uVar.b();
            } else if (i == 3) {
                this.o = false;
                uVar.a(egk.b.PLAN_HUB);
            } else if (i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        j2 j2Var = this.f185906n;
        j2Var.getClass();
        j2Var.g(null, aVar);
    }
}
