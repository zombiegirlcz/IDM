package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120588a;

    public f(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f120588a = categoryId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f120588a, ((f) obj2).f120588a);
    }

    public final int hashCode() {
        return this.f120588a.hashCode();
    }

    @Override // dx4.l
    public final String j() {
        return p.a.p("ShowDocumentsUploadScreen(categoryId=", this.f120588a, ")");
    }
}
