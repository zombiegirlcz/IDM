package ntj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class r {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f219117c;
    public final String d;
    public final String e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f219118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f219119h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f219120j;
    public final Boolean k;

    public /* synthetic */ r(int i, String str, String str2, String str3, String str4, String str5, Long l2, Long l3, Integer num, q qVar, Boolean bool, Boolean bool2) {
        if (2047 != (i & 2047)) {
            qlm.j1.f(m.f219097a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f219115a = str;
        this.f219116b = str2;
        this.f219117c = str3;
        this.d = str4;
        this.e = str5;
        this.f = l2;
        this.f219118g = l3;
        this.f219119h = num;
        this.i = qVar;
        this.f219120j = bool;
        this.k = bool2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f219115a, rVar.f219115a) && Intrinsics.f(this.f219116b, rVar.f219116b) && Intrinsics.f(this.f219117c, rVar.f219117c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f219118g, rVar.f219118g) && Intrinsics.f(this.f219119h, rVar.f219119h) && Intrinsics.f(this.i, rVar.i) && Intrinsics.f(this.f219120j, rVar.f219120j) && Intrinsics.f(this.k, rVar.k);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.f219115a.hashCode() * 31, 31, this.f219116b), 31, this.f219117c), 31, this.d), 31, this.e);
        Long l2 = this.f;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f219118g;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.f219119h;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        q qVar = this.i;
        int iHashCode4 = (iHashCode3 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Boolean bool = this.f219120j;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.k;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public r(String id10, String campaignId, String title, String state, String asset, Long l2, Long l3, Integer num, q qVar, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f219115a = id10;
        this.f219116b = campaignId;
        this.f219117c = title;
        this.d = state;
        this.e = asset;
        this.f = l2;
        this.f219118g = l3;
        this.f219119h = num;
        this.i = qVar;
        this.f219120j = bool;
        this.k = bool2;
    }
}
