package rbg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ubg.d f253054a;

    public e(ubg.d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f253054a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f253054a == ((e) obj2).f253054a;
    }

    public final int hashCode() {
        return this.f253054a.hashCode();
    }
}
