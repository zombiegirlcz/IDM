package vch;

import ble.c1;
import com.revolut.feature.wealth.impl.ui.screens.withdraw.WithdrawScreenContract$Input;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f287704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f287705b;

    public /* synthetic */ g0(x0 x0Var, int i) {
        this.f287704a = i;
        this.f287705b = x0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f287704a) {
            case 0:
                t1h.h config = (t1h.h) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                boolean z = config.f267358c;
                x0 x0Var = this.f287705b;
                Continuation continuation = null;
                if (z) {
                    dj0.d dVar = ((k) x0Var.t2()).f287710c;
                    x0Var.l2(new v06.i(x0Var, dVar, continuation, 21), new ux7.i(1, x0Var.B, fah.b.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 25));
                } else {
                    x0Var.v2(new r(((k) x0Var.t2()).f287710c, ((k) x0Var.t2()).f287709b, null));
                }
                return Unit.f186387a;
            case 1:
                Intrinsics.checkNotNullParameter((t1h.h) obj2, "config");
                x0 x0Var2 = this.f287705b;
                t1h.i iVar = x0Var2.u;
                WithdrawScreenContract$Input withdrawScreenContract$Input = x0Var2.f287743q;
                return iVar.a(withdrawScreenContract$Input.f95652a.getF95657a(), withdrawScreenContract$Input.f95653b);
            case 2:
                if (!((Boolean) obj2).booleanValue()) {
                    od0.i.Companion.getClass();
                    return new go.g(od0.i.f224256b, 2);
                }
                x0 x0Var3 = this.f287705b;
                rbh.r rVar = x0Var3.D;
                WithdrawScreenContract$Input withdrawScreenContract$Input2 = x0Var3.f287743q;
                return new c1(c8g.a.D(rVar.c(withdrawScreenContract$Input2.f95652a.getF95657a(), withdrawScreenContract$Input2.f95653b)), 27);
            case 3:
                this.f287705b.x2(new h0(2));
                return Unit.f186387a;
            default:
                g1j.b bVar = (g1j.b) obj2;
                if (bVar == null) {
                    throw new NoWhenBranchMatchedException();
                }
                j1j.d dVar2 = bVar.f139686a;
                x0 x0Var4 = this.f287705b;
                a2 a2Var = x0Var4.I;
                Continuation continuation2 = null;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                x0Var4.I = yji.l.b1(x0Var4, rd0.e.n(x0Var4.D.a(dVar2), zhm.h0.f322473a), null, new u29.c(x0Var4, dVar2, continuation2, 12), 3);
                return Unit.f186387a;
        }
    }
}
