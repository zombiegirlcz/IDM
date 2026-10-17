package eg0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf0.c f125508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f125510c;

    public c(zf0.c langKey, String scopeKey, String faqKey) {
        Intrinsics.checkNotNullParameter(langKey, "langKey");
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
        this.f125508a = langKey;
        this.f125509b = scopeKey;
        this.f125510c = faqKey;
    }

    public final String a() {
        zf0.c cVar = this.f125508a;
        String str = cVar.f321832a.f297794a;
        String str2 = cVar.f321833b;
        return j6.a.r(j6.a.w(v0.a.m("FaqLangKey(userCountry=", str, ",additionalLang=", str2, ",lastTimeUpdated="), cVar.f321834c, ",localeLang=", cVar.d, ")"), ".", this.f125509b, this.f125510c);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f125508a, cVar.f125508a) && Intrinsics.f(this.f125509b, cVar.f125509b) && Intrinsics.f(this.f125510c, cVar.f125510c);
    }

    public final int hashCode() {
        return this.f125510c.hashCode() + p.a.c(this.f125508a.hashCode() * 31, 31, this.f125509b);
    }
}
