package wda;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f296479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296480b;

    public f(Integer num, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f296479a = num;
        this.f296480b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f296479a, fVar.f296479a) && Intrinsics.f(this.f296480b, fVar.f296480b);
    }

    public final int hashCode() {
        Integer num = this.f296479a;
        return this.f296480b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }
}
