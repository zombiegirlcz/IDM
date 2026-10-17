package wy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f301072a;

    public e(b content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f301072a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f301072a, ((e) obj2).f301072a);
    }

    public final int hashCode() {
        return this.f301072a.hashCode();
    }
}
