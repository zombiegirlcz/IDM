package ht3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f155313c;

    public v(String title, String value, u image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f155311a = title;
        this.f155312b = value;
        this.f155313c = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f155311a, vVar.f155311a) && Intrinsics.f(this.f155312b, vVar.f155312b) && Intrinsics.f(this.f155313c, vVar.f155313c);
    }

    public final int hashCode() {
        return this.f155313c.hashCode() + p.a.c(this.f155311a.hashCode() * 31, 31, this.f155312b);
    }
}
