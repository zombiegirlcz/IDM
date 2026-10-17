package h96;

import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150179a;

    public c(String str) {
        this.f150179a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f150179a, ((c) obj2).f150179a);
    }

    public final int hashCode() {
        String str = this.f150179a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
