package kp7;

import com.revolut.data.model.Data;
import java.time.YearMonth;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f188177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f188179c;
    public final Map d;
    public final YearMonth e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f188180g;

    public j(Data plansContainer, String str, Map smartDriving, Map yearlyPayment, YearMonth renewalYearMonth, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(plansContainer, "plansContainer");
        Intrinsics.checkNotNullParameter(smartDriving, "smartDriving");
        Intrinsics.checkNotNullParameter(yearlyPayment, "yearlyPayment");
        Intrinsics.checkNotNullParameter(renewalYearMonth, "renewalYearMonth");
        this.f188177a = plansContainer;
        this.f188178b = str;
        this.f188179c = smartDriving;
        this.d = yearlyPayment;
        this.e = renewalYearMonth;
        this.f = z;
        this.f188180g = z3;
    }

    public static j a(j jVar, Data data, String str, Map map, Map map2, YearMonth yearMonth, int i) {
        if ((i & 1) != 0) {
            data = jVar.f188177a;
        }
        Data plansContainer = data;
        if ((i & 2) != 0) {
            str = jVar.f188178b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            map = jVar.f188179c;
        }
        Map smartDriving = map;
        if ((i & 8) != 0) {
            map2 = jVar.d;
        }
        Map yearlyPayment = map2;
        if ((i & 16) != 0) {
            yearMonth = jVar.e;
        }
        YearMonth renewalYearMonth = yearMonth;
        boolean z = jVar.f;
        boolean z3 = jVar.f188180g;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(plansContainer, "plansContainer");
        Intrinsics.checkNotNullParameter(smartDriving, "smartDriving");
        Intrinsics.checkNotNullParameter(yearlyPayment, "yearlyPayment");
        Intrinsics.checkNotNullParameter(renewalYearMonth, "renewalYearMonth");
        return new j(plansContainer, str2, smartDriving, yearlyPayment, renewalYearMonth, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f188177a, jVar.f188177a) && Intrinsics.f(this.f188178b, jVar.f188178b) && Intrinsics.f(this.f188179c, jVar.f188179c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && this.f == jVar.f && this.f188180g == jVar.f188180g;
    }

    public final int hashCode() {
        int iHashCode = this.f188177a.hashCode() * 31;
        String str = this.f188178b;
        return Boolean.hashCode(this.f188180g) + j6.a.c((this.e.hashCode() + p.a.e(p.a.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f188179c), 31, this.d)) * 31, 31, this.f);
    }
}
