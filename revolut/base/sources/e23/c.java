package e23;

import com.revolut.feature.credit.api.entry_points.CreditApplicationPrimaryEntryPoint;
import com.revolut.feature.statements.api.models.SelectableOption;
import ft3.d1;
import ft3.q0;
import god.h;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import sh1.m;
import tof.i3;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f122016b;

    public /* synthetic */ c(int i, Set set) {
        this.f122015a = i;
        this.f122016b = set;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f122015a) {
            case 0:
                String str = ((b) obj3).f122014b;
                Set set = this.f122016b;
                return cim.b.b(Boolean.valueOf(set.contains(str)), Boolean.valueOf(set.contains(((b) obj2).f122014b)));
            case 1:
                Set set2 = this.f122016b;
                Integer numValueOf = Integer.valueOf(d0.f0(set2, (xi0.b) obj2));
                if (numValueOf.intValue() == -1) {
                    numValueOf = null;
                }
                Integer numValueOf2 = Integer.valueOf(numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE);
                Integer numValueOf3 = Integer.valueOf(d0.f0(set2, (xi0.b) obj3));
                Integer num = numValueOf3.intValue() != -1 ? numValueOf3 : null;
                return cim.b.b(numValueOf2, Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE));
            case 2:
                String type = ((SelectableOption) obj3).getType();
                Set set3 = this.f122016b;
                return cim.b.b(Boolean.valueOf(set3.contains(type)), Boolean.valueOf(set3.contains(((SelectableOption) obj2).getType())));
            case 3:
                Iterator it8 = ((CreditApplicationPrimaryEntryPoint) obj2).getProducts().iterator();
                if (!it8.hasNext()) {
                    throw new NoSuchElementException();
                }
                q0 q0Var = (q0) it8.next();
                Set set4 = this.f122016b;
                Integer numValueOf4 = Integer.valueOf(d0.f0(set4, new d1(q0Var.getF137852c(), q0Var.getD(), null)));
                while (it8.hasNext()) {
                    q0 q0Var2 = (q0) it8.next();
                    Integer numValueOf5 = Integer.valueOf(d0.f0(set4, new d1(q0Var2.getF137852c(), q0Var2.getD(), null)));
                    if (numValueOf4.compareTo(numValueOf5) < 0) {
                        numValueOf4 = numValueOf5;
                    }
                }
                Iterator it9 = ((CreditApplicationPrimaryEntryPoint) obj3).getProducts().iterator();
                if (!it9.hasNext()) {
                    throw new NoSuchElementException();
                }
                q0 q0Var3 = (q0) it9.next();
                Integer numValueOf6 = Integer.valueOf(d0.f0(set4, new d1(q0Var3.getF137852c(), q0Var3.getD(), null)));
                while (it9.hasNext()) {
                    q0 q0Var4 = (q0) it9.next();
                    Integer numValueOf7 = Integer.valueOf(d0.f0(set4, new d1(q0Var4.getF137852c(), q0Var4.getD(), null)));
                    if (numValueOf6.compareTo(numValueOf7) < 0) {
                        numValueOf6 = numValueOf7;
                    }
                }
                return cim.b.b(numValueOf4, numValueOf6);
            case 4:
                String str2 = ((h) obj3).f145142b;
                Set set5 = this.f122016b;
                return cim.b.b(Boolean.valueOf(set5.contains(str2)), Boolean.valueOf(set5.contains(((h) obj2).f145142b)));
            case 5:
                Set set6 = this.f122016b;
                return cim.b.b(Boolean.valueOf(set6.contains((i3) obj3)), Boolean.valueOf(set6.contains((i3) obj2)));
            case 6:
                Set set7 = this.f122016b;
                return cim.b.b(Boolean.valueOf(set7.contains((xi0.b) obj3)), Boolean.valueOf(set7.contains((xi0.b) obj2)));
            case 7:
                String str3 = ((ird.a) obj3).f168040b;
                Set set8 = this.f122016b;
                return cim.b.b(Boolean.valueOf(set8.contains(str3)), Boolean.valueOf(set8.contains(((ird.a) obj2).f168040b)));
            case 8:
                String str4 = ((xi0.b) obj3).f306286a;
                Set set9 = this.f122016b;
                return cim.b.b(Boolean.valueOf(set9.contains(str4)), Boolean.valueOf(set9.contains(((xi0.b) obj2).f306286a)));
            case 9:
                Set set10 = this.f122016b;
                return cim.b.b(Boolean.valueOf(set10.contains((xi0.b) obj3)), Boolean.valueOf(set10.contains((xi0.b) obj2)));
            case 10:
                String str5 = ((lvb.a) obj3).f200353b;
                Set set11 = this.f122016b;
                return cim.b.b(Boolean.valueOf(set11.contains(str5)), Boolean.valueOf(set11.contains(((lvb.a) obj2).f200353b)));
            default:
                String str6 = ((m) obj3).f263379b;
                Set set12 = this.f122016b;
                return cim.b.b(Boolean.valueOf(set12.contains(str6)), Boolean.valueOf(set12.contains(((m) obj2).f263379b)));
        }
    }
}
