package xzg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f309972a;

    public b(List expectedTypes) {
        Intrinsics.checkNotNullParameter(expectedTypes, "expectedTypes");
        this.f309972a = expectedTypes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f309972a, ((b) obj2).f309972a);
    }

    public final int hashCode() {
        return this.f309972a.hashCode();
    }
}
