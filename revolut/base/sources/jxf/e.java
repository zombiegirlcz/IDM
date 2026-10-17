package jxf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f179200a;

    public e(List properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.f179200a = properties;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f179200a, ((e) obj2).f179200a);
    }

    public final int hashCode() {
        return this.f179200a.hashCode();
    }
}
