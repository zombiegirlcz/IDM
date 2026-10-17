package tof;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class fb extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f272757a;

    public fb(Set pocketType) {
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f272757a = pocketType;
    }

    public final Set a() {
        return this.f272757a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof fb) && Intrinsics.f(this.f272757a, ((fb) obj2).f272757a);
    }

    public final int hashCode() {
        return this.f272757a.hashCode();
    }
}
