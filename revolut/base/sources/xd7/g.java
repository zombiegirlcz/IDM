package xd7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f304277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f304278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f304279c;
    public final String d;

    public g(int i, Integer num, String currentCaption, List images) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(currentCaption, "currentCaption");
        this.f304277a = images;
        this.f304278b = i;
        this.f304279c = num;
        this.d = currentCaption;
    }

    public static g a(g gVar, Integer num, String currentCaption, int i) {
        List images = gVar.f304277a;
        int i2 = gVar.f304278b;
        if ((i & 4) != 0) {
            num = gVar.f304279c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(currentCaption, "currentCaption");
        return new g(i2, num, currentCaption, images);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f304277a, gVar.f304277a) && this.f304278b == gVar.f304278b && Intrinsics.f(this.f304279c, gVar.f304279c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f304278b, this.f304277a.hashCode() * 31, 31);
        Integer num = this.f304279c;
        return this.d.hashCode() + ((iB + (num == null ? 0 : num.hashCode())) * 31);
    }
}
