package oxf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f230810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f230811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f230812c;
    public final String d;

    public c(String id10, String name, String image, String type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f230810a = id10;
        this.f230811b = name;
        this.f230812c = image;
        this.d = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f230810a, cVar.f230810a) && Intrinsics.f(this.f230811b, cVar.f230811b) && Intrinsics.f(this.f230812c, cVar.f230812c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f230810a.hashCode() * 31, 31, this.f230811b), 31, this.f230812c);
    }
}
