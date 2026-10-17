package k61;

import com.revolut.core.model.account.AccountId;
import efm.d0;
import efm.r;
import k3k.l;
import k50.a4;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qua.p;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f181590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0.b f181591c;

    public /* synthetic */ b(i iVar, xi0.b bVar, int i) {
        this.f181589a = i;
        this.f181590b = iVar;
        this.f181591c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f181589a) {
            case 0:
                dj0.d maxTransferAmount = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(maxTransferAmount, "maxTransferAmount");
                dj0.d dVar = gk3.h.f144326a;
                if (Intrinsics.f(maxTransferAmount, dVar)) {
                    return w.h(dVar);
                }
                xi0.b bVar = maxTransferAmount.f115083b;
                xi0.b bVar2 = this.f181591c;
                if (Intrinsics.f(bVar, bVar2)) {
                    return w.h(maxTransferAmount);
                }
                r map = zi0.c.J(this.f181590b.f.d(u.c(new Pair(bVar2, maxTransferAmount.f115083b)), n9l.b.SEC_3)).switchMap(new l(new a4(18), 18)).map(new l(new exe.c(maxTransferAmount, bVar2, 1), 19));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return ue0.e.E(map, dVar);
            case 1:
                p payment = (p) obj2;
                Intrinsics.checkNotNullParameter(payment, "payment");
                return this.f181590b.f181612b.n0(this.f181591c, AccountId.Personal.f51414a).f(d0.m(payment));
            default:
                p payment2 = (p) obj2;
                Intrinsics.checkNotNullParameter(payment2, "payment");
                return this.f181590b.f181612b.n0(this.f181591c, AccountId.Personal.f51414a).f(d0.m(payment2));
        }
    }

    public /* synthetic */ b(xi0.b bVar, i iVar) {
        this.f181589a = 0;
        this.f181591c = bVar;
        this.f181590b = iVar;
    }
}
