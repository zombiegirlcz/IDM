package xu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f308894c;
    public final String d;

    public f(String title, String description, String closeButtonTitle, String manualUploadButtonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(closeButtonTitle, "closeButtonTitle");
        Intrinsics.checkNotNullParameter(manualUploadButtonTitle, "manualUploadButtonTitle");
        this.f308892a = title;
        this.f308893b = description;
        this.f308894c = closeButtonTitle;
        this.d = manualUploadButtonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f308892a, fVar.f308892a) && Intrinsics.f(this.f308893b, fVar.f308893b) && Intrinsics.f(this.f308894c, fVar.f308894c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f308892a.hashCode() * 31, 31, this.f308893b), 31, this.f308894c);
    }
}
