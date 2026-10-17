package tpe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273358a;

    public d(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f273358a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f273358a, ((d) obj2).f273358a);
    }

    public final int hashCode() {
        return this.f273358a.hashCode();
    }
}
