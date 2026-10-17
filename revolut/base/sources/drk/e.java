package drk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f117165c;
    public final Integer d;
    public final h e;
    public String f;

    public e(String ref2, String type, int i, Integer num, h statementItems) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(statementItems, "statementItems");
        this.f117163a = ref2;
        this.f117164b = type;
        this.f117165c = i;
        this.d = num;
        this.e = statementItems;
        this.f = String.valueOf(num);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f117163a, eVar.f117163a) && Intrinsics.f(this.f117164b, eVar.f117164b) && this.f117165c == eVar.f117165c && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f117165c, p.a.c(this.f117163a.hashCode() * 31, 31, this.f117164b), 31);
        Integer num = this.d;
        return this.e.f117171a.hashCode() + ((iB + (num == null ? 0 : num.hashCode())) * 31);
    }
}
