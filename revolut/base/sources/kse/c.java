package kse;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f189443c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String type) {
        super(type, 3);
        Intrinsics.checkNotNullParameter(type, "type");
        this.f189443c = type;
    }

    @Override // av1.c
    public final String c() {
        return this.f189443c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f189443c, ((c) obj2).f189443c);
    }

    public final int hashCode() {
        return this.f189443c.hashCode();
    }
}
