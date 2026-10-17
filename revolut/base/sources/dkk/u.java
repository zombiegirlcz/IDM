package dkk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f115623b;

    public /* synthetic */ u(v vVar, int i) {
        this.f115622a = i;
        this.f115623b = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f115622a) {
            case 0:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                wi0.b.Companion.getClass();
                if (te0.w.S(user, wi0.b.f297770q3)) {
                    return zi0.c.j(v.b());
                }
                dl7.a aVar = dl7.a.PURCHASE_PROTECTION_PREMIUM;
                ti7.d dVar = ti7.d.PURCHASE_PROTECTION_ANNUAL_REFUND_LIMIT;
                v vVar = this.f115623b;
                return nim.a.w(vVar.c(aVar, dVar), new m(vVar, 7));
            case 1:
                do3.n user2 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user2, "user");
                wi0.b.Companion.getClass();
                boolean zS = te0.w.S(user2, wi0.b.f297770q3);
                v vVar2 = this.f115623b;
                if (zS) {
                    vVar2.getClass();
                    return zi0.c.j(v.b());
                }
                vVar2.getClass();
                return nim.a.w(vVar2.c(dl7.a.PURCHASE_PROTECTION_METAL, ti7.d.PURCHASE_PROTECTION_ANNUAL_REFUND_LIMIT), new u(vVar2, 3));
            case 2:
                do3.n user3 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user3, "user");
                wi0.b.Companion.getClass();
                if (te0.w.S(user3, wi0.b.f297770q3)) {
                    return zi0.c.j(v.b());
                }
                dl7.a aVar2 = dl7.a.PURCHASE_PROTECTION_PLUS;
                ti7.d dVar2 = ti7.d.PURCHASE_PROTECTION_ANNUAL_REFUND_LIMIT;
                v vVar3 = this.f115623b;
                return nim.a.w(vVar3.c(aVar2, dVar2), new m(vVar3, 8));
            default:
                dj0.d purchaseProtectionMoney = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(purchaseProtectionMoney, "purchaseProtectionMoney");
                hha.u.Companion.getClass();
                hha.u uVar = hha.u.N;
                this.f115623b.getClass();
                return v.a(uVar, purchaseProtectionMoney);
        }
    }
}
