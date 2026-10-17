package oy3;

import dx4.d1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f230877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f230878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1 f230879c;
    public final b d;

    public c(String id10, String title, d1 image, b progressColor) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(progressColor, "progressColor");
        this.f230877a = id10;
        this.f230878b = title;
        this.f230879c = image;
        this.d = progressColor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f230877a, cVar.f230877a) && Intrinsics.f(this.f230878b, cVar.f230878b) && Intrinsics.f(this.f230879c, cVar.f230879c) && this.d == cVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f230879c.hashCode() + p.a.c(this.f230877a.hashCode() * 31, 31, this.f230878b)) * 31);
    }
}
