package fva;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138404a;

    public m(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f138404a = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f138404a, ((m) obj2).f138404a);
    }

    public final int hashCode() {
        return this.f138404a.hashCode();
    }
}
