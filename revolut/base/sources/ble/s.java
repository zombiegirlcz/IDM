package ble;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.b f16594a;

    public s(aw0.b content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f16594a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f16594a, ((s) obj2).f16594a);
    }

    public final int hashCode() {
        return this.f16594a.hashCode();
    }
}
