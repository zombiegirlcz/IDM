package jl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f175547b;

    public /* synthetic */ k(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qlm.j1.f(i.f175541a.getDescriptor(), i, 1);
            throw null;
        }
        this.f175546a = str;
        if ((i & 2) == 0) {
            this.f175547b = null;
        } else {
            this.f175547b = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f175546a, kVar.f175546a) && Intrinsics.f(this.f175547b, kVar.f175547b);
    }

    public final int hashCode() {
        int iHashCode = this.f175546a.hashCode() * 31;
        String str = this.f175547b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return j6.a.s("CompletionMetaData(uploadId=", this.f175546a, ", type=", this.f175547b, ")");
    }

    public k(String uploadId, String str) {
        Intrinsics.checkNotNullParameter(uploadId, "uploadId");
        this.f175546a = uploadId;
        this.f175547b = str;
    }
}
