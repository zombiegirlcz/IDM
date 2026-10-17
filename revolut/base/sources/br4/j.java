package br4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw4.d f17898a;

    public j(yw4.d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f17898a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f17898a == ((j) obj2).f17898a;
    }

    public final int hashCode() {
        return this.f17898a.hashCode();
    }
}
