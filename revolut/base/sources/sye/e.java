package sye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f266666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aim.e f266667b;

    public e(lw0.a header, aim.e items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f266666a = header;
        this.f266667b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f266666a.equals(eVar.f266666a) && this.f266667b.equals(eVar.f266667b);
    }

    public final int hashCode() {
        return this.f266667b.hashCode() + (this.f266666a.hashCode() * 31);
    }
}
