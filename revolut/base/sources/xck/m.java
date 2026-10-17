package xck;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f304170c;
    public final Integer d;
    public final n e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f304171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f304172h;
    public final k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f304173j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f304174l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f304175m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f304176n;
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f304177p;

    public m(String title, String str, Instant instant, Integer num, n state, ArrayList promotedRewards, f everydayRewards, g exceptionalRewards, k kVar, ArrayList arrayList, String str2, String str3, String str4, d dVar, c cVar, String str5) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(promotedRewards, "promotedRewards");
        Intrinsics.checkNotNullParameter(everydayRewards, "everydayRewards");
        Intrinsics.checkNotNullParameter(exceptionalRewards, "exceptionalRewards");
        this.f304168a = title;
        this.f304169b = str;
        this.f304170c = instant;
        this.d = num;
        this.e = state;
        this.f = promotedRewards;
        this.f304171g = everydayRewards;
        this.f304172h = exceptionalRewards;
        this.i = kVar;
        this.f304173j = arrayList;
        this.k = str2;
        this.f304174l = str3;
        this.f304175m = str4;
        this.f304176n = dVar;
        this.o = cVar;
        this.f304177p = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f304168a, mVar.f304168a) && Intrinsics.f(this.f304169b, mVar.f304169b) && Intrinsics.f(this.f304170c, mVar.f304170c) && Intrinsics.f(this.d, mVar.d) && this.e == mVar.e && this.f.equals(mVar.f) && this.f304171g.equals(mVar.f304171g) && this.f304172h.equals(mVar.f304172h) && Intrinsics.f(this.i, mVar.i) && Intrinsics.f(this.f304173j, mVar.f304173j) && Intrinsics.f(this.k, mVar.k) && Intrinsics.f(this.f304174l, mVar.f304174l) && Intrinsics.f(this.f304175m, mVar.f304175m) && Intrinsics.f(this.f304176n, mVar.f304176n) && Intrinsics.f(this.o, mVar.o) && Intrinsics.f(this.f304177p, mVar.f304177p);
    }

    public final int hashCode() {
        int iHashCode = this.f304168a.hashCode() * 31;
        String str = this.f304169b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Instant instant = this.f304170c;
        int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (this.f304172h.hashCode() + ((this.f304171g.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, (this.e.hashCode() + ((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31)) * 31)) * 31;
        k kVar = this.i;
        int iHashCode5 = (iHashCode4 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        List list = this.f304173j;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f304174l;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f304175m;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        d dVar = this.f304176n;
        int iHashCode10 = (iHashCode9 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        c cVar = this.o;
        int iHashCode11 = (iHashCode10 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str5 = this.f304177p;
        return iHashCode11 + (str5 != null ? str5.hashCode() : 0);
    }
}
