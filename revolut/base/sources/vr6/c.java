package vr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f291512b;

    public c(String type, String message) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f291511a = type;
        this.f291512b = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f291511a, cVar.f291511a) && Intrinsics.f(this.f291512b, cVar.f291512b);
    }

    public final int hashCode() {
        return this.f291512b.hashCode() + (this.f291511a.hashCode() * 31);
    }
}
