package up0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f281725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f281726b;

    public j(a0 renderedContent, a0 requestedContent) {
        Intrinsics.checkNotNullParameter(renderedContent, "renderedContent");
        Intrinsics.checkNotNullParameter(requestedContent, "requestedContent");
        this.f281725a = renderedContent;
        this.f281726b = requestedContent;
    }

    @Override // up0.n
    public final a0 a() {
        return this.f281726b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f281725a, jVar.f281725a) && Intrinsics.f(this.f281726b, jVar.f281726b);
    }

    public final int hashCode() {
        return this.f281726b.hashCode() + (this.f281725a.hashCode() * 31);
    }
}
