package xqa;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f308139a;

    public e(List additionalFields) {
        Intrinsics.checkNotNullParameter(additionalFields, "additionalFields");
        this.f308139a = additionalFields;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f308139a, ((e) obj2).f308139a);
    }

    public final int hashCode() {
        return this.f308139a.hashCode();
    }
}
