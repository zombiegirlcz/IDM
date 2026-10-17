package d3c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111015b;

    public f(String str, String avatar) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        this.f111014a = str;
        this.f111015b = avatar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f111014a, fVar.f111014a) && Intrinsics.f(this.f111015b, fVar.f111015b);
    }

    public final int hashCode() {
        String str = this.f111014a;
        return this.f111015b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
