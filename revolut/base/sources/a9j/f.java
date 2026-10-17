package a9j;

import android.text.Spanned;
import bn2.i0;
import c2d.j0;
import c2d.p0;
import c2d.v0;
import com.revolut.feature.backgroundpicker.impl.interactor.ThemesInteractor$Theme;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import dej.c2;
import dej.t1;
import java.util.Comparator;
import java.util.Date;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2675b;

    public /* synthetic */ f(Object obj2, int i) {
        this.f2674a = i;
        this.f2675b = obj2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f2674a) {
            case 0:
                ((g) this.f2675b).getClass();
                io3.l lVar = ((io3.d) obj2).e;
                int[] iArr = d.f2672b;
                return cim.b.b(Integer.valueOf(iArr[lVar.ordinal()] == 1 ? 0 : 1), Integer.valueOf(iArr[((io3.d) obj3).e.ordinal()] != 1 ? 1 : 0));
            case 1:
                int iCompare = ((aed.n) this.f2675b).compare(obj2, obj3);
                return iCompare != 0 ? iCompare : cim.b.b(((pcd.s) obj2).f234881a, ((pcd.s) obj3).f234881a);
            case 2:
                cim.a aVar = (cim.a) this.f2675b;
                DateTime dateTime = ((c4d.a) obj3).f21136h;
                Long lValueOf = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
                DateTime dateTime2 = ((c4d.a) obj2).f21136h;
                return aVar.compare(lValueOf, dateTime2 != null ? Long.valueOf(dateTime2.getMillis()) : null);
            case 3:
                int iCompare2 = ((f) this.f2675b).compare(obj2, obj3);
                return iCompare2 != 0 ? iCompare2 : cim.b.b(Long.valueOf(((c4d.a) obj3).f21135g.getMillis()), Long.valueOf(((c4d.a) obj2).f21135g.getMillis()));
            case 4:
                String str = ((zm3.f) obj3).d;
                String str2 = (String) this.f2675b;
                return cim.b.b(Boolean.valueOf(Intrinsics.f(str, str2)), Boolean.valueOf(Intrinsics.f(((zm3.f) obj2).d, str2)));
            case 5:
                int iCompare3 = ((bm8.a) this.f2675b).compare(obj2, obj3);
                return iCompare3 != 0 ? iCompare3 : cim.b.b(((zm3.f) obj2).d, ((zm3.f) obj3).d);
            case 6:
                int iCompare4 = ((f) this.f2675b).compare(obj2, obj3);
                return iCompare4 != 0 ? iCompare4 : cim.b.b(((zm3.f) obj2).e, ((zm3.f) obj3).e);
            case 7:
                int iCompare5 = ((i0) this.f2675b).compare(obj2, obj3);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                return cim.b.b(Boolean.valueOf(((ThemesInteractor$Theme) obj3).f63800a.e2() != null), Boolean.valueOf(((ThemesInteractor$Theme) obj2).f63800a.e2() != null));
            case 8:
                int iCompare6 = ((f) this.f2675b).compare(obj2, obj3);
                return iCompare6 != 0 ? iCompare6 : cim.b.b(Boolean.valueOf(((ThemesInteractor$Theme) obj3).f63800a.getD()), Boolean.valueOf(((ThemesInteractor$Theme) obj2).f63800a.getD()));
            case 9:
                int iCompare7 = ((f) this.f2675b).compare(obj2, obj3);
                return iCompare7 != 0 ? iCompare7 : cim.b.b(((xi0.b) ((Pair) obj2).f186385a).f306286a, ((xi0.b) ((Pair) obj3).f186385a).f306286a);
            case 10:
                int iCompare8 = ((j0) this.f2675b).compare(obj2, obj3);
                return iCompare8 != 0 ? iCompare8 : cim.b.b((dj0.d) ((Pair) obj3).f186386b, (dj0.d) ((Pair) obj2).f186386b);
            case 11:
                int iCompare9 = ((f) this.f2675b).compare(obj2, obj3);
                return iCompare9 != 0 ? iCompare9 : cim.b.b(((xi0.b) ((Pair) obj2).f186385a).f306286a, ((xi0.b) ((Pair) obj3).f186385a).f306286a);
            case 12:
                int iCompare10 = ((p0) this.f2675b).compare(obj2, obj3);
                return iCompare10 != 0 ? iCompare10 : cim.b.b((dj0.d) ((Pair) obj3).f186386b, (dj0.d) ((Pair) obj2).f186386b);
            case 13:
                int iCompare11 = ((f) this.f2675b).compare(obj2, obj3);
                return iCompare11 != 0 ? iCompare11 : cim.b.b(((xi0.b) ((Pair) obj2).f186385a).f306286a, ((xi0.b) ((Pair) obj3).f186385a).f306286a);
            case 14:
                int iCompare12 = ((v0) this.f2675b).compare(obj2, obj3);
                return iCompare12 != 0 ? iCompare12 : cim.b.b((dj0.d) ((Pair) obj3).f186386b, (dj0.d) ((Pair) obj2).f186386b);
            case 15:
                int iCompare13 = ((cd7.k) this.f2675b).compare(obj2, obj3);
                return iCompare13 != 0 ? iCompare13 : cim.b.b(((RecurringPaymentWithExtra) obj2).getF81653a().f249314a.f, ((RecurringPaymentWithExtra) obj3).getF81653a().f249314a.f);
            case 16:
                int iCompare14 = ((csk.p) this.f2675b).compare(obj2, obj3);
                if (iCompare14 != 0) {
                    return iCompare14;
                }
                Integer num = ((esk.b) obj2).f128996b;
                if (num == null) {
                    num = num;
                }
                Integer num2 = ((esk.b) obj3).f128996b;
                return cim.b.b(num, num2 != null ? num2 : 0);
            case 17:
                int iCompare15 = ((d2d.b) this.f2675b).compare(obj2, obj3);
                return iCompare15 != 0 ? iCompare15 : cim.b.b(((xi0.b) ((d2d.a) obj2).f110795b.f186385a).f306286a, ((xi0.b) ((d2d.a) obj3).f110795b.f186385a).f306286a);
            case 18:
                int iCompare16 = ((d78.s) this.f2675b).compare(obj2, obj3);
                return iCompare16 != 0 ? iCompare16 : cim.b.b(((vf8.a) obj2).f288532a.f77099b, ((vf8.a) obj3).f288532a.f77099b);
            case 19:
                int iCompare17 = ((d88.f) this.f2675b).compare(obj2, obj3);
                return iCompare17 != 0 ? iCompare17 : cim.b.b(((d88.c) obj2).f112141a.f262362c, ((d88.c) obj3).f112141a.f262362c);
            case 20:
                int iCompare18 = ((dc8.d) this.f2675b).compare(obj2, obj3);
                return iCompare18 != 0 ? iCompare18 : cim.b.b(((nb8.b) obj2).f214008c, ((nb8.b) obj3).f214008c);
            case 21:
                int iCompare19 = ((bm8.a) this.f2675b).compare(obj2, obj3);
                if (iCompare19 != 0) {
                    return iCompare19;
                }
                t1 t1Var = (t1) obj3;
                c2 c2Var = t1Var.M;
                Long lValueOf2 = Long.valueOf(c2Var != null ? c2Var.f113509a : t1Var.L);
                t1 t1Var2 = (t1) obj2;
                c2 c2Var2 = t1Var2.M;
                return cim.b.b(lValueOf2, Long.valueOf(c2Var2 != null ? c2Var2.f113509a : t1Var2.L));
            case 22:
                int iCompare20 = ((dv5.k) this.f2675b).compare(obj2, obj3);
                if (iCompare20 != 0) {
                    return iCompare20;
                }
                LocalDate localDate = ((qua.p) obj2).f249314a.f;
                Date date = localDate != null ? localDate.toDate() : null;
                LocalDate localDate2 = ((qua.p) obj3).f249314a.f;
                return cim.b.b(date, localDate2 != null ? localDate2.toDate() : null);
            case 23:
                int iCompare21 = ((e23.c) this.f2675b).compare(obj2, obj3);
                return iCompare21 != 0 ? iCompare21 : cim.b.b(((e23.b) obj2).f122013a, ((e23.b) obj3).f122013a);
            case 24:
                int iCompare22 = ((bm8.a) this.f2675b).compare(obj2, obj3);
                return iCompare22 != 0 ? iCompare22 : cim.b.b(((e2d.b) obj2).f122047a.f225109a.f86864b, ((e2d.b) obj3).f122047a.f225109a.f86864b);
            case 25:
                int iCompare23 = ((e2j.n) this.f2675b).compare(obj2, obj3);
                return iCompare23 != 0 ? iCompare23 : cim.b.b(cp5.d.K(((e2j.e) obj2).f122119b.f115083b), cp5.d.K(((e2j.e) obj3).f122119b.f115083b));
            case 26:
                e50.q qVar = (e50.q) this.f2675b;
                return cim.b.b(e50.q.a(qVar, (qv0.i) obj3), e50.q.a(qVar, (qv0.i) obj2));
            case 27:
                int iCompare24 = ((ec8.k) this.f2675b).compare(obj2, obj3);
                return iCompare24 != 0 ? iCompare24 : cim.b.b(((nb8.b) obj2).f214008c, ((nb8.b) obj3).f214008c);
            case 28:
                Spanned spanned = (Spanned) this.f2675b;
                return cim.b.b(Integer.valueOf(spanned.getSpanStart(obj2)), Integer.valueOf(spanned.getSpanStart(obj3)));
            default:
                xk5.a aVar2 = (xk5.a) this.f2675b;
                Integer num3 = (Integer) aVar2.f306608a.get((String) obj2);
                Integer numValueOf = Integer.valueOf(num3 != null ? num3.intValue() : Integer.MAX_VALUE);
                Integer num4 = (Integer) aVar2.f306608a.get((String) obj3);
                return cim.b.b(numValueOf, Integer.valueOf(num4 != null ? num4.intValue() : Integer.MAX_VALUE));
        }
    }
}
