package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f120579a;

    public e(u1 document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f120579a = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f120579a, ((e) obj2).f120579a);
    }

    public final int hashCode() {
        return this.f120579a.hashCode();
    }

    @Override // dx4.l
    public final String j() {
        return p.a.p("ShowDocument(name=", this.f120579a.f120785c, ")");
    }
}
