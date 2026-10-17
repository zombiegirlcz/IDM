package lnd;

import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dj0.d f197189b;

    public /* synthetic */ n0(int i, dj0.d dVar) {
        this.f197188a = i;
        this.f197189b = dVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f197188a) {
            case 0:
                float f = ((he3.j) obj3).f151564b.a().f115082a * 100.0f;
                dj0.d dVar = this.f197189b;
                return cim.b.b(Float.valueOf(f / dVar.a().f115082a), Float.valueOf((((he3.j) obj2).f151564b.a().f115082a * 100.0f) / dVar.a().f115082a));
            case 1:
                BalanceWrapper balanceWrapper = (BalanceWrapper) obj3;
                xi0.b f99406c = balanceWrapper.getF99406c();
                dj0.d dVar2 = this.f197189b;
                boolean z = false;
                Boolean boolValueOf = Boolean.valueOf(Intrinsics.f(f99406c, dVar2.f115083b) && balanceWrapper.getF99407g() == k1j.a.JOINT_ACCOUNT);
                BalanceWrapper balanceWrapper2 = (BalanceWrapper) obj2;
                if (Intrinsics.f(balanceWrapper2.getF99406c(), dVar2.f115083b) && balanceWrapper2.getF99407g() == k1j.a.JOINT_ACCOUNT) {
                    z = true;
                }
                return cim.b.b(boolValueOf, Boolean.valueOf(z));
            case 2:
                BalanceWrapper balanceWrapper3 = (BalanceWrapper) obj3;
                xi0.b f99406c2 = balanceWrapper3.getF99406c();
                dj0.d dVar3 = this.f197189b;
                boolean z3 = false;
                Boolean boolValueOf2 = Boolean.valueOf(Intrinsics.f(f99406c2, dVar3.f115083b) && balanceWrapper3.getF99407g() == k1j.a.POCKETS);
                BalanceWrapper balanceWrapper4 = (BalanceWrapper) obj2;
                if (Intrinsics.f(balanceWrapper4.getF99406c(), dVar3.f115083b) && balanceWrapper4.getF99407g() == k1j.a.POCKETS) {
                    z3 = true;
                }
                return cim.b.b(boolValueOf2, Boolean.valueOf(z3));
            default:
                BalanceWrapper balanceWrapper5 = (BalanceWrapper) obj3;
                xi0.b f99406c3 = balanceWrapper5.getF99406c();
                dj0.d dVar4 = this.f197189b;
                boolean z4 = false;
                Boolean boolValueOf3 = Boolean.valueOf(Intrinsics.f(f99406c3, dVar4.f115083b) && balanceWrapper5.getF99407g() == k1j.a.PRO);
                BalanceWrapper balanceWrapper6 = (BalanceWrapper) obj2;
                if (Intrinsics.f(balanceWrapper6.getF99406c(), dVar4.f115083b) && balanceWrapper6.getF99407g() == k1j.a.PRO) {
                    z4 = true;
                }
                return cim.b.b(boolValueOf3, Boolean.valueOf(z4));
        }
    }
}
