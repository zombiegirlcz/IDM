package vr0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ai0.a f291449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f291450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f291451c;

    public c(ai0.a bitmapDescriptor, float f, float f4) {
        Intrinsics.checkNotNullParameter(bitmapDescriptor, "bitmapDescriptor");
        this.f291449a = bitmapDescriptor;
        this.f291450b = f;
        this.f291451c = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f291449a, cVar.f291449a) && Float.compare(this.f291450b, cVar.f291450b) == 0 && Float.compare(this.f291451c, cVar.f291451c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f291451c) + m72.b.b(this.f291450b, this.f291449a.hashCode() * 31, 31);
    }
}
