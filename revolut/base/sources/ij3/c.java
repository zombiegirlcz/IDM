package ij3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161675b;

    public /* synthetic */ c(int i, String str, String str2) {
        if (2 != (i & 2)) {
            j1.f(a.f161673a.getDescriptor(), i, 2);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f161674a = null;
        } else {
            this.f161674a = str;
        }
        this.f161675b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f161674a, cVar.f161674a) && Intrinsics.f(this.f161675b, cVar.f161675b);
    }

    public final int hashCode() {
        String str = this.f161674a;
        return this.f161675b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public c(String str, String darkUrl) {
        Intrinsics.checkNotNullParameter(darkUrl, "darkUrl");
        this.f161674a = str;
        this.f161675b = darkUrl;
    }
}
