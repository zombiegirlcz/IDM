package uwb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f283604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tvb.g f283605c;
    public final tvb.f d;
    public final String e;
    public final f f;

    public e(String code, String str, tvb.g format, tvb.f algorithm, String backgroundColor, f cardDimensions) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(cardDimensions, "cardDimensions");
        this.f283603a = code;
        this.f283604b = str;
        this.f283605c = format;
        this.d = algorithm;
        this.e = backgroundColor;
        this.f = cardDimensions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f283603a, eVar.f283603a) && Intrinsics.f(this.f283604b, eVar.f283604b) && this.f283605c == eVar.f283605c && this.d == eVar.d && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f283603a.hashCode() * 31;
        String str = this.f283604b;
        return this.f.hashCode() + p.a.c((this.d.hashCode() + ((this.f283605c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.e);
    }
}
