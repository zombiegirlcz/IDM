package eol;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f127996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f127997b;

    public c(Data passkeys, boolean z) {
        Intrinsics.checkNotNullParameter(passkeys, "passkeys");
        this.f127996a = passkeys;
        this.f127997b = z;
    }

    public static c a(c cVar, Data passkeys, boolean z, int i) {
        if ((i & 1) != 0) {
            passkeys = cVar.f127996a;
        }
        if ((i & 2) != 0) {
            z = cVar.f127997b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(passkeys, "passkeys");
        return new c(passkeys, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f127996a, cVar.f127996a) && this.f127997b == cVar.f127997b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127997b) + (this.f127996a.hashCode() * 31);
    }
}
