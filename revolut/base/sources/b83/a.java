package b83;

import cim.b;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import h93.f0;
import he3.j;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kh5.c;
import kotlin.jvm.internal.Intrinsics;
import nel.a0;
import q2j.d;
import vel.f;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13089b;

    public /* synthetic */ a(List list, int i) {
        this.f13088a = i;
        this.f13089b = list;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        n9l.a aVarA;
        n9l.a aVarA2;
        int i;
        int i2;
        switch (this.f13088a) {
            case 0:
                f0 card1 = (f0) obj2;
                f0 card2 = (f0) obj3;
                Intrinsics.checkNotNullParameter(card1, "card1");
                Intrinsics.checkNotNullParameter(card2, "card2");
                if (!card1.b0() && !card2.b0()) {
                    return 0;
                }
                int iB = b.b(Boolean.valueOf(card1.b0()), Boolean.valueOf(card2.b0()));
                if (iB == 0) {
                    iB = b.b(card1.B, card2.B);
                }
                if (iB != 0) {
                    return iB;
                }
                String str = card1.u;
                List list = this.f13089b;
                JuniorBankingProfile juniorBankingProfileG = c8g.a.g(str, list);
                String str2 = juniorBankingProfileG != null ? juniorBankingProfileG.f77099b : null;
                JuniorBankingProfile juniorBankingProfileG2 = c8g.a.g(card2.u, list);
                String str3 = juniorBankingProfileG2 != null ? juniorBankingProfileG2.f77099b : null;
                if (str2 == null) {
                    return 1;
                }
                if (str3 == null) {
                    return -1;
                }
                return str2.compareTo(str3);
            case 1:
                String strA = ((f) obj2).a();
                List list2 = this.f13089b;
                return b.b(Integer.valueOf(list2.indexOf(strA)), Integer.valueOf(list2.indexOf(((f) obj3).a())));
            case 2:
                long jValueOf = 0L;
                eh5.b bVar = (eh5.b) obj3;
                List list3 = this.f13089b;
                Long lValueOf = (list3 == null || (aVarA2 = c.a(list3, bVar)) == null) ? 0L : Long.valueOf(pyd.c.K(bVar.a(), aVarA2.f213663c, aVarA2.f213662b).f115082a);
                eh5.b bVar2 = (eh5.b) obj2;
                if (list3 != null && (aVarA = c.a(list3, bVar2)) != null) {
                    jValueOf = Long.valueOf(pyd.c.K(bVar2.a(), aVarA.f213663c, aVarA.f213662b).f115082a);
                }
                return b.b(lValueOf, jValueOf);
            case 3:
                String str4 = ((j) obj2).f151563a;
                List list4 = this.f13089b;
                return b.b(Integer.valueOf(list4.indexOf(str4)), Integer.valueOf(list4.indexOf(((j) obj3).f151563a)));
            case 4:
                String strA2 = ((enh.a) obj2).f127830a.a();
                List list5 = this.f13089b;
                return b.b(Integer.valueOf(list5.indexOf(strA2)), Integer.valueOf(list5.indexOf(((enh.a) obj3).f127830a.a())));
            case 5:
                d dVar = (d) obj2;
                List list6 = this.f13089b;
                Iterator it8 = list6.iterator();
                int i3 = 0;
                int i5 = 0;
                while (true) {
                    i = -1;
                    if (!it8.hasNext()) {
                        i5 = -1;
                    } else if (!Intrinsics.f(((io3.d) it8.next()).f163147c, dVar.e().f306286a)) {
                        i5++;
                    }
                }
                Integer numValueOf = i5 >= 0 ? Integer.valueOf(i5) : Integer.MAX_VALUE;
                d dVar2 = (d) obj3;
                Iterator it9 = list6.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        if (Intrinsics.f(((io3.d) it9.next()).f163147c, dVar2.e().f306286a)) {
                            i = i3;
                        } else {
                            i3++;
                        }
                    }
                }
                return b.b(numValueOf, i >= 0 ? Integer.valueOf(i) : Integer.MAX_VALUE);
            case 6:
                String str5 = ((xzg.d) obj2).f309976a;
                List list7 = this.f13089b;
                return b.b(Integer.valueOf(list7.indexOf(str5)), Integer.valueOf(list7.indexOf(((xzg.d) obj3).f309976a)));
            case 7:
                String str6 = ((xi0.b) obj2).f306286a;
                List list8 = this.f13089b;
                return b.b(Integer.valueOf(list8.indexOf(str6)), Integer.valueOf(list8.indexOf(((xi0.b) obj3).f306286a)));
            case 8:
                String str7 = ((xi0.b) obj2).f306286a;
                List list9 = this.f13089b;
                return b.b(Integer.valueOf(list9.indexOf(str7)), Integer.valueOf(list9.indexOf(((xi0.b) obj3).f306286a)));
            case 9:
                String str8 = ((xzg.d) obj2).f309976a;
                List list10 = this.f13089b;
                return b.b(Integer.valueOf(list10.indexOf(str8)), Integer.valueOf(list10.indexOf(((xzg.d) obj3).f309976a)));
            case 10:
                String str9 = ((a0) obj2).f214560a.f214596b;
                List list11 = this.f13089b;
                return b.b(Integer.valueOf(list11.indexOf(str9)), Integer.valueOf(list11.indexOf(((a0) obj3).f214560a.f214596b)));
            case 11:
                String str10 = ((xzg.d) obj2).f309976a;
                List list12 = this.f13089b;
                return b.b(Integer.valueOf(list12.indexOf(str10)), Integer.valueOf(list12.indexOf(((xzg.d) obj3).f309976a)));
            case 12:
                String strA3 = ((f) obj2).a();
                List list13 = this.f13089b;
                return b.b(Integer.valueOf(list13.indexOf(strA3)), Integer.valueOf(list13.indexOf(((f) obj3).a())));
            case 13:
                List list14 = this.f13089b;
                int iIndexOf = list14.indexOf((String) obj2);
                if (iIndexOf == -1) {
                    iIndexOf = Integer.MAX_VALUE;
                }
                Integer numValueOf2 = Integer.valueOf(iIndexOf);
                int iIndexOf2 = list14.indexOf((String) obj3);
                return b.b(numValueOf2, Integer.valueOf(iIndexOf2 != -1 ? iIndexOf2 : Integer.MAX_VALUE));
            default:
                d1k.c cVar = (d1k.c) obj2;
                List list15 = this.f13089b;
                Iterator it10 = list15.iterator();
                int i6 = 0;
                int i21 = 0;
                while (true) {
                    i2 = -1;
                    if (!it10.hasNext()) {
                        i21 = -1;
                    } else if (!Intrinsics.f((rzj.b) it10.next(), cVar.getSymbol())) {
                        i21++;
                    }
                }
                Integer numValueOf3 = Integer.valueOf(i21);
                d1k.c cVar2 = (d1k.c) obj3;
                Iterator it11 = list15.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        if (Intrinsics.f((rzj.b) it11.next(), cVar2.getSymbol())) {
                            i2 = i6;
                        } else {
                            i6++;
                        }
                    }
                }
                return b.b(numValueOf3, Integer.valueOf(i2));
        }
    }

    public a(List list, c cVar) {
        this.f13088a = 2;
        this.f13089b = list;
    }

    public a(List walletProfilesExtended) {
        this.f13088a = 0;
        Intrinsics.checkNotNullParameter(walletProfilesExtended, "walletProfilesExtended");
        this.f13089b = walletProfilesExtended;
    }
}
