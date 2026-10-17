package fel;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f134653b;

    public c(String key, List instruments) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        this.f134652a = key;
        this.f134653b = instruments;
    }

    public static c a(c cVar, List instruments) {
        String key = cVar.f134652a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        return new c(key, instruments);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f134652a, cVar.f134652a) && Intrinsics.f(this.f134653b, cVar.f134653b);
    }

    public final int hashCode() {
        return this.f134653b.hashCode() + (this.f134652a.hashCode() * 31);
    }
}
