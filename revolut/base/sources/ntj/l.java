package ntj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();
    public static final Lazy[] o = {null, null, null, null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new ns1.a(5)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f219089c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f219090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f219091h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f219092j;
    public final Boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f219093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Boolean f219094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Boolean f219095n;

    public /* synthetic */ l(int i, String str, String str2, String str3, String str4, String str5, String str6, Long l2, Long l3, Integer num, List list, Boolean bool, i iVar, Boolean bool2, Boolean bool3) {
        if (16383 != (i & 16383)) {
            qlm.j1.f(j.f219076a.getDescriptor(), i, 16383);
            throw null;
        }
        this.f219087a = str;
        this.f219088b = str2;
        this.f219089c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f219090g = l2;
        this.f219091h = l3;
        this.i = num;
        this.f219092j = list;
        this.k = bool;
        this.f219093l = iVar;
        this.f219094m = bool2;
        this.f219095n = bool3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f219087a, lVar.f219087a) && Intrinsics.f(this.f219088b, lVar.f219088b) && Intrinsics.f(this.f219089c, lVar.f219089c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f219090g, lVar.f219090g) && Intrinsics.f(this.f219091h, lVar.f219091h) && Intrinsics.f(this.i, lVar.i) && Intrinsics.f(this.f219092j, lVar.f219092j) && Intrinsics.f(this.k, lVar.k) && Intrinsics.f(this.f219093l, lVar.f219093l) && Intrinsics.f(this.f219094m, lVar.f219094m) && Intrinsics.f(this.f219095n, lVar.f219095n);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f219087a.hashCode() * 31, 31, this.f219088b), 31, this.f219089c), 31, this.d), 31, this.e), 31, this.f);
        Long l2 = this.f219090g;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f219091h;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.i;
        int iD = p.a.d((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f219092j);
        Boolean bool = this.k;
        int iHashCode3 = (iD + (bool == null ? 0 : bool.hashCode())) * 31;
        i iVar = this.f219093l;
        int iHashCode4 = (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Boolean bool2 = this.f219094m;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f219095n;
        return iHashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public l(String id10, String campaignId, String title, String subtitle, String state, String asset, Long l2, Long l3, Integer num, ArrayList challengeSteps, Boolean bool, i iVar, Boolean bool2, Boolean bool3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(challengeSteps, "challengeSteps");
        this.f219087a = id10;
        this.f219088b = campaignId;
        this.f219089c = title;
        this.d = subtitle;
        this.e = state;
        this.f = asset;
        this.f219090g = l2;
        this.f219091h = l3;
        this.i = num;
        this.f219092j = challengeSteps;
        this.k = bool;
        this.f219093l = iVar;
        this.f219094m = bool2;
        this.f219095n = bool3;
    }
}
