package cv3;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f109249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f109250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f109251c;
    public final fu3.a d;
    public final List e;
    public final String f;

    public d0(fu3.a aVar, Integer num, Long l2, Long l3, String str, List credits) {
        Intrinsics.checkNotNullParameter(credits, "credits");
        this.f109249a = l2;
        this.f109250b = l3;
        this.f109251c = num;
        this.d = aVar;
        this.e = credits;
        this.f = str;
    }

    public static d0 b(d0 d0Var, Long l2, Long l3, Integer num, fu3.a aVar, String str, int i) {
        if ((i & 1) != 0) {
            l2 = d0Var.f109249a;
        }
        Long l4 = l2;
        if ((i & 2) != 0) {
            l3 = d0Var.f109250b;
        }
        Long l5 = l3;
        if ((i & 4) != 0) {
            num = d0Var.f109251c;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            aVar = d0Var.d;
        }
        fu3.a aVar2 = aVar;
        List credits = d0Var.e;
        if ((i & 32) != 0) {
            str = d0Var.f;
        }
        Intrinsics.checkNotNullParameter(credits, "credits");
        return new d0(aVar2, num2, l4, l5, str, credits);
    }

    public final d0 a(u offerParameters) {
        Intrinsics.checkNotNullParameter(offerParameters, "offerParameters");
        String strA = a0.AMOUNT.a();
        Map map = offerParameters.f109270a;
        Object orDefault = map.getOrDefault(strA, null);
        if (!(orDefault instanceof Long)) {
            orDefault = null;
        }
        Long l2 = (Long) orDefault;
        if (l2 == null) {
            l2 = null;
        }
        Object orDefault2 = map.getOrDefault(a0.DURATION.a(), null);
        if (!(orDefault2 instanceof Long)) {
            orDefault2 = null;
        }
        Long l3 = (Long) orDefault2;
        if (l3 == null) {
            l3 = null;
        }
        Object orDefault3 = map.getOrDefault(a0.REPAYMENT_DAY.a(), null);
        if (!(orDefault3 instanceof Integer)) {
            orDefault3 = null;
        }
        Integer num = (Integer) orDefault3;
        if (num == null) {
            num = null;
        }
        Object orDefault4 = map.getOrDefault(a0.REPAYMENT_TYPE.a(), null);
        if (!(orDefault4 instanceof fu3.a)) {
            orDefault4 = null;
        }
        fu3.a aVar = (fu3.a) orDefault4;
        if (aVar == null) {
            aVar = null;
        }
        Object orDefault5 = map.getOrDefault(a0.INSURANCE.a(), null);
        if (!(orDefault5 instanceof String)) {
            orDefault5 = null;
        }
        String str = (String) orDefault5;
        String str2 = str != null ? str : null;
        if (l2 == null) {
            l2 = this.f109249a;
        }
        Long l4 = l2;
        if (l3 == null) {
            l3 = this.f109250b;
        }
        Long l5 = l3;
        if (num == null) {
            num = this.f109251c;
        }
        Integer num2 = num;
        if (aVar == null) {
            aVar = this.d;
        }
        fu3.a aVar2 = aVar;
        if (str2 == null) {
            str2 = this.f;
        }
        return b(this, l4, l5, num2, aVar2, str2, 16);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f109249a, d0Var.f109249a) && Intrinsics.f(this.f109250b, d0Var.f109250b) && Intrinsics.f(this.f109251c, d0Var.f109251c) && this.d == d0Var.d && Intrinsics.f(this.e, d0Var.e) && Intrinsics.f(this.f, d0Var.f);
    }

    public final int hashCode() {
        Long l2 = this.f109249a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.f109250b;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.f109251c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        fu3.a aVar = this.d;
        int iD = p.a.d((iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return iD + (str != null ? str.hashCode() : 0);
    }
}
