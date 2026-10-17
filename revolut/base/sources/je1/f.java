package je1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173174c;

    public f(String name, String color, String initialColor) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(initialColor, "initialColor");
        this.f173172a = name;
        this.f173173b = color;
        this.f173174c = initialColor;
    }

    public static f a(f fVar, String name, String color, int i) {
        if ((i & 1) != 0) {
            name = fVar.f173172a;
        }
        if ((i & 2) != 0) {
            color = fVar.f173173b;
        }
        String initialColor = fVar.f173174c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(initialColor, "initialColor");
        return new f(name, color, initialColor);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f173172a, fVar.f173172a) && Intrinsics.f(this.f173173b, fVar.f173173b) && Intrinsics.f(this.f173174c, fVar.f173174c);
    }

    public final int hashCode() {
        return this.f173174c.hashCode() + p.a.c(this.f173172a.hashCode() * 31, 31, this.f173173b);
    }
}
