package cld;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24972b;

    public a(String comment, boolean z) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f24971a = comment;
        this.f24972b = z;
    }

    public static a a(a aVar, String comment, int i) {
        if ((i & 1) != 0) {
            comment = aVar.f24971a;
        }
        boolean z = (i & 2) != 0 ? aVar.f24972b : true;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(comment, "comment");
        return new a(comment, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f24971a, aVar.f24971a) && this.f24972b == aVar.f24972b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24972b) + (this.f24971a.hashCode() * 31);
    }
}
