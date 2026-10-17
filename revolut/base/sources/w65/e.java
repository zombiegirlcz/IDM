package w65;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295382b;

    public e(String title, String documentUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(documentUrl, "documentUrl");
        this.f295381a = title;
        this.f295382b = documentUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f295381a, eVar.f295381a) && Intrinsics.f(this.f295382b, eVar.f295382b);
    }

    public final int hashCode() {
        return this.f295382b.hashCode() + (this.f295381a.hashCode() * 31);
    }
}
