package n61;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class s implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f212703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f212704b;

    public s(String code, String name) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f212703a = code;
        this.f212704b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f212703a, sVar.f212703a) && Intrinsics.f(this.f212704b, sVar.f212704b);
    }

    public final int hashCode() {
        return this.f212704b.hashCode() + (this.f212703a.hashCode() * 31);
    }
}
