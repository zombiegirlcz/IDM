package up0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f281730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f281731b;

    public l(a0 renderedContent, a0 requestedContent) {
        Intrinsics.checkNotNullParameter(renderedContent, "renderedContent");
        Intrinsics.checkNotNullParameter(requestedContent, "requestedContent");
        this.f281730a = renderedContent;
        this.f281731b = requestedContent;
    }

    @Override // up0.n
    public final a0 a() {
        return this.f281731b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f281730a, lVar.f281730a) && Intrinsics.f(this.f281731b, lVar.f281731b);
    }

    public final int hashCode() {
        return this.f281731b.hashCode() + (this.f281730a.hashCode() * 31);
    }
}
