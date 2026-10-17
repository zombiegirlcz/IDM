package tof;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class db extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f272699a;

    public db(Set pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f272699a = pocketId;
    }

    public final Set a() {
        return this.f272699a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof db) && Intrinsics.f(this.f272699a, ((db) obj2).f272699a);
    }

    public final int hashCode() {
        return this.f272699a.hashCode();
    }
}
