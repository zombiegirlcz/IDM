package c2d;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi0.b f20751b;

    public /* synthetic */ v0(int i, xi0.b bVar) {
        this.f20750a = i;
        this.f20751b = bVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Integer numValueOf;
        Integer num;
        switch (this.f20750a) {
            case 0:
                String str = ((xi0.b) ((Pair) obj3).f186385a).f306286a;
                xi0.b bVar = this.f20751b;
                return cim.b.b(Boolean.valueOf(Intrinsics.f(str, bVar.f306286a)), Boolean.valueOf(Intrinsics.f(((xi0.b) ((Pair) obj2).f186385a).f306286a, bVar.f306286a)));
            case 1:
                Object obj4 = ((Pair) obj3).f186385a;
                xi0.b bVar2 = this.f20751b;
                return cim.b.b(Boolean.valueOf(Intrinsics.f(obj4, bVar2)), Boolean.valueOf(Intrinsics.f(((Pair) obj2).f186385a, bVar2)));
            case 2:
                Integer numValueOf2 = 2147483644;
                ncd.a aVar = (ncd.a) obj3;
                xi0.b bVar3 = aVar.f214169a.f86683a.f86618b;
                xi0.b bVar4 = this.f20751b;
                if (Intrinsics.f(bVar3, bVar4)) {
                    numValueOf = Integer.MAX_VALUE;
                } else {
                    xi0.a aVar2 = xi0.b.Companion;
                    aVar2.getClass();
                    if (Intrinsics.f(bVar3, xi0.b.f306272g)) {
                        numValueOf = 2147483646;
                    } else {
                        aVar2.getClass();
                        if (Intrinsics.f(bVar3, xi0.b.i)) {
                            numValueOf = 2147483645;
                        } else {
                            aVar2.getClass();
                            numValueOf = Intrinsics.f(bVar3, xi0.b.f306273h) ? numValueOf2 : Integer.valueOf((int) (opg.a.d(aVar.f214169a) * ((double) 100)));
                        }
                    }
                }
                ncd.a aVar3 = (ncd.a) obj2;
                xi0.b bVar5 = aVar3.f214169a.f86683a.f86618b;
                if (Intrinsics.f(bVar5, bVar4)) {
                    numValueOf2 = Integer.MAX_VALUE;
                } else {
                    xi0.a aVar4 = xi0.b.Companion;
                    aVar4.getClass();
                    if (Intrinsics.f(bVar5, xi0.b.f306272g)) {
                        numValueOf2 = 2147483646;
                    } else {
                        aVar4.getClass();
                        if (Intrinsics.f(bVar5, xi0.b.i)) {
                            numValueOf2 = 2147483645;
                        } else {
                            aVar4.getClass();
                            if (!Intrinsics.f(bVar5, xi0.b.f306273h)) {
                                numValueOf2 = Integer.valueOf((int) (opg.a.d(aVar3.f214169a) * ((double) 100)));
                            }
                        }
                    }
                }
                return cim.b.b(numValueOf, numValueOf2);
            default:
                Integer num2 = 1;
                xi0.b bVar6 = ((SavingsProductData) obj3).f86683a.f86618b;
                xi0.b bVar7 = this.f20751b;
                if (Intrinsics.f(bVar6, bVar7)) {
                    num = 4;
                } else {
                    xi0.a aVar5 = xi0.b.Companion;
                    aVar5.getClass();
                    if (Intrinsics.f(bVar6, xi0.b.f306272g)) {
                        num = 3;
                    } else {
                        aVar5.getClass();
                        num = Intrinsics.f(bVar6, xi0.b.i) ? 2 : num2;
                    }
                }
                xi0.b bVar8 = ((SavingsProductData) obj2).f86683a.f86618b;
                if (Intrinsics.f(bVar8, bVar7)) {
                    num2 = 4;
                } else {
                    xi0.a aVar6 = xi0.b.Companion;
                    aVar6.getClass();
                    if (Intrinsics.f(bVar8, xi0.b.f306272g)) {
                        num2 = 3;
                    } else {
                        aVar6.getClass();
                        if (Intrinsics.f(bVar8, xi0.b.i)) {
                            num2 = 2;
                        }
                    }
                }
                return cim.b.b(num, num2);
        }
    }
}
