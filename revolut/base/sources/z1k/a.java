package z1k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f318851c;

    public a(dj0.d senderAmount, String name, String logo) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(senderAmount, "senderAmount");
        this.f318849a = name;
        this.f318850b = logo;
        this.f318851c = senderAmount;
    }

    @Override // z1k.c
    public final dj0.d a() {
        return this.f318851c;
    }

    @Override // z1k.c
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f318849a, aVar.f318849a) && Intrinsics.f(this.f318850b, aVar.f318850b) && Intrinsics.f(this.f318851c, aVar.f318851c);
    }

    public final int hashCode() {
        return this.f318851c.hashCode() + p.a.c(this.f318849a.hashCode() * 31, 31, this.f318850b);
    }
}
