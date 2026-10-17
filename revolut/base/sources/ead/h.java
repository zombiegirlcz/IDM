package ead;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9d.d f124198a;

    public h(t9d.d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f124198a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f124198a == ((h) obj2).f124198a;
    }

    public final int hashCode() {
        return this.f124198a.hashCode();
    }
}
