package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120561a;

    public c(String deleteUrl) {
        Intrinsics.checkNotNullParameter(deleteUrl, "deleteUrl");
        this.f120561a = deleteUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f120561a, ((c) obj2).f120561a);
    }

    public final int hashCode() {
        return this.f120561a.hashCode();
    }

    @Override // dx4.l
    public final String j() {
        return p.a.p("DeleteDocument(deleteUrl=", this.f120561a, ")");
    }
}
