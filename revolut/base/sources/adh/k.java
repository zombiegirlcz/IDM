package adh;

import com.google.android.gms.internal.mlkit_vision_text_common.zzv;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesCounterpartAsset;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import dec.z;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import raf.p;
import wjh.a0;
import wjh.y;
import xv.q;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3356a;

    public /* synthetic */ k(int i) {
        this.f3356a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        int i;
        int i2;
        int i3;
        int i5 = 1;
        switch (this.f3356a) {
            case 0:
                return cim.b.b(a.b((vel.f) obj2), a.b((vel.f) obj3));
            case 1:
                BigDecimal bigDecimalB = a.b((vel.f) obj3);
                BigDecimal bigDecimalAbs = bigDecimalB != null ? bigDecimalB.abs() : null;
                BigDecimal bigDecimalB2 = a.b((vel.f) obj2);
                return cim.b.b(bigDecimalAbs, bigDecimalB2 != null ? bigDecimalB2.abs() : null);
            case 2:
                return cim.b.b(a.b((vel.f) obj3), a.b((vel.f) obj2));
            case 3:
                dj0.d dVar = ((FavouritesCounterpartAsset) obj2).d;
                Integer numValueOf = Integer.valueOf(dVar == null ? 2 : dVar.f115082a > 0 ? 0 : 1);
                dj0.d dVar2 = ((FavouritesCounterpartAsset) obj3).d;
                return cim.b.b(numValueOf, Integer.valueOf(dVar2 != null ? dVar2.f115082a > 0 ? 0 : 1 : 2));
            case 4:
                int[] iArr = z.f113385b;
                switch (iArr[((com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f) obj2).ordinal()]) {
                    case 1:
                        i = 0;
                        break;
                    case 2:
                        i = 1;
                        break;
                    case 3:
                        i = 2;
                        break;
                    case 4:
                        i = 3;
                        break;
                    case 5:
                        i = 4;
                        break;
                    case 6:
                        i = 5;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                Integer numValueOf2 = Integer.valueOf(i);
                switch (iArr[((com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f) obj3).ordinal()]) {
                    case 1:
                        i = 0;
                        break;
                    case 2:
                        i = 1;
                        break;
                    case 3:
                        break;
                    case 4:
                        i = 3;
                        break;
                    case 5:
                        i = 4;
                        break;
                    case 6:
                        i = 5;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return cim.b.b(numValueOf2, Integer.valueOf(i));
            case 5:
                a0 a0Var = (a0) obj2;
                if (a0Var instanceof y) {
                    i2 = 0;
                } else {
                    if (!(a0Var instanceof wjh.z)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 1;
                }
                Integer numValueOf3 = Integer.valueOf(i2);
                a0 a0Var2 = (a0) obj3;
                if (a0Var2 instanceof y) {
                    i5 = 0;
                } else if (!(a0Var2 instanceof wjh.z)) {
                    throw new NoWhenBranchMatchedException();
                }
                return cim.b.b(numValueOf3, Integer.valueOf(i5));
            case 6:
                return cim.b.b(((nmm.l) obj2).f217412a, ((nmm.l) obj3).f217412a);
            case 7:
                return cim.b.b(nn3.l.a((cn3.g) obj2), nn3.l.a((cn3.g) obj3));
            case 8:
                BigDecimal bigDecimalB3 = a.b(((enh.a) obj3).f127830a);
                BigDecimal bigDecimalAbs2 = bigDecimalB3 != null ? bigDecimalB3.abs() : null;
                BigDecimal bigDecimalB4 = a.b(((enh.a) obj2).f127830a);
                return cim.b.b(bigDecimalAbs2, bigDecimalB4 != null ? bigDecimalB4.abs() : null);
            case 9:
                return cim.b.b(qy.b.c(((q) obj2).getClass()), qy.b.c(((q) obj3).getClass()));
            case 10:
                return cim.b.b(qy.b.c(((q) obj2).getClass()), qy.b.c(((q) obj3).getClass()));
            case 11:
                cfl.b d = ((TradingAccount) obj3).getD();
                int[] iArr2 = p.f252845a;
                switch (iArr2[d.ordinal()]) {
                    case 1:
                    case 5:
                        i3 = 0;
                        break;
                    case 2:
                        i3 = 2;
                        break;
                    case 3:
                        i3 = Integer.MAX_VALUE;
                        break;
                    case 4:
                    case 6:
                        i3 = 1;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                Integer numValueOf4 = Integer.valueOf(i3);
                switch (iArr2[((TradingAccount) obj2).getD().ordinal()]) {
                    case 1:
                    case 5:
                        i = 0;
                        break;
                    case 2:
                        break;
                    case 3:
                        i = Integer.MAX_VALUE;
                        break;
                    case 4:
                    case 6:
                        i = 1;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return cim.b.b(numValueOf4, Integer.valueOf(i));
            case 12:
                zzv zzvVar = rh.d.f254283a;
                return ((Integer) ((Map.Entry) obj2).getValue()).compareTo((Integer) ((Map.Entry) obj3).getValue());
            default:
                return ((xh.e) obj2).d - ((xh.e) obj3).d;
        }
    }
}
