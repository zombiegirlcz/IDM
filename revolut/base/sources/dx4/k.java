package dx4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f120644b;

    public k(String uploadUrl, List allowedFileTypes) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
        this.f120643a = uploadUrl;
        this.f120644b = allowedFileTypes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f120643a, kVar.f120643a) && Intrinsics.f(this.f120644b, kVar.f120644b);
    }

    public final int hashCode() {
        return this.f120644b.hashCode() + (this.f120643a.hashCode() * 31);
    }

    @Override // dx4.l
    public final String j() {
        return p.a.p("UploadDocument(uploadUrl=", this.f120643a, ")");
    }
}
