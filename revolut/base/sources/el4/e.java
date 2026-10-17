package el4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f127251c;
    public final c d;
    public final d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f127252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f127253h;
    public final xi0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f127254j;
    public final boolean k;

    public e(String userId, String firstName, String lastName, c state, d type, dj0.d dVar, dj0.d dVar2, Integer num, xi0.b currency) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f127249a = userId;
        this.f127250b = firstName;
        this.f127251c = lastName;
        this.d = state;
        this.e = type;
        this.f = dVar;
        this.f127252g = dVar2;
        this.f127253h = num;
        this.i = currency;
        this.f127254j = com.google.android.gms.internal.mlkit_vision_face.a.o(firstName, " ", lastName);
        this.k = type == d.ADMIN;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f127249a, eVar.f127249a) && Intrinsics.f(this.f127250b, eVar.f127250b) && Intrinsics.f(this.f127251c, eVar.f127251c) && this.d == eVar.d && this.e == eVar.e && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f127252g, eVar.f127252g) && Intrinsics.f(this.f127253h, eVar.f127253h) && Intrinsics.f(this.i, eVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.c(this.f127249a.hashCode() * 31, 31, this.f127250b), 31, this.f127251c)) * 31)) * 31;
        dj0.d dVar = this.f;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f127252g;
        int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        Integer num = this.f127253h;
        return this.i.hashCode() + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }
}
