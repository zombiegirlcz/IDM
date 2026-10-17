package rp8;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f256280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f256281c;

    public k(String name, String description, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f256279a = name;
        this.f256280b = description;
        this.f256281c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f256279a, kVar.f256279a) && Intrinsics.f(this.f256280b, kVar.f256280b) && this.f256281c == kVar.f256281c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f256281c) + p.a.c(this.f256279a.hashCode() * 31, 31, this.f256280b);
    }
}
