package r8b;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f252402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f252403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f252404c;

    public a(String code, String name, String phoneCode) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phoneCode, "phoneCode");
        this.f252402a = code;
        this.f252403b = name;
        this.f252404c = phoneCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f252402a, aVar.f252402a) && Intrinsics.f(this.f252403b, aVar.f252403b) && Intrinsics.f(this.f252404c, aVar.f252404c);
    }

    public final int hashCode() {
        return this.f252404c.hashCode() + p.a.c(this.f252402a.hashCode() * 31, 31, this.f252403b);
    }
}
