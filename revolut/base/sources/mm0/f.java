package mm0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass f207107a;

    public f(KClass type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f207107a = type;
    }

    public final KClass a() {
        return this.f207107a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f207107a, ((f) obj2).f207107a);
    }

    public final int hashCode() {
        return this.f207107a.hashCode();
    }
}
