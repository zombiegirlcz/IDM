package xck;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f304188c;

    public u(String urlLight, String urlDark, boolean z) {
        Intrinsics.checkNotNullParameter(urlLight, "urlLight");
        Intrinsics.checkNotNullParameter(urlDark, "urlDark");
        this.f304186a = urlLight;
        this.f304187b = urlDark;
        this.f304188c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f304186a, uVar.f304186a) && Intrinsics.f(this.f304187b, uVar.f304187b) && this.f304188c == uVar.f304188c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f304188c) + p.a.c(this.f304186a.hashCode() * 31, 31, this.f304187b);
    }
}
