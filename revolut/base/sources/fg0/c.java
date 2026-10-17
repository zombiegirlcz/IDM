package fg0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf0.c f134865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f134867c;

    public c(zf0.c langKey, String scopeKey, String faqKey) {
        Intrinsics.checkNotNullParameter(langKey, "langKey");
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
        this.f134865a = langKey;
        this.f134866b = scopeKey;
        this.f134867c = faqKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f134865a, cVar.f134865a) && Intrinsics.f(this.f134866b, cVar.f134866b) && Intrinsics.f(this.f134867c, cVar.f134867c);
    }

    public final int hashCode() {
        return this.f134867c.hashCode() + p.a.c(this.f134865a.hashCode() * 31, 31, this.f134866b);
    }
}
