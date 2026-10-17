package qp6;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f248296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f248297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f248298c;

    public b(CharSequence comment, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f248296a = comment;
        this.f248297b = z;
        this.f248298c = num;
    }

    public static b a(b bVar, String str, int i) {
        CharSequence comment = str;
        if ((i & 1) != 0) {
            comment = bVar.f248296a;
        }
        boolean z = (i & 2) != 0 ? bVar.f248297b : true;
        Integer num = bVar.f248298c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(comment, "comment");
        return new b(comment, z, num);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f248296a, bVar.f248296a) && this.f248297b == bVar.f248297b && Intrinsics.f(this.f248298c, bVar.f248298c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f248296a.hashCode() * 31, 31, this.f248297b);
        Integer num = this.f248298c;
        return iC + (num == null ? 0 : num.hashCode());
    }
}
