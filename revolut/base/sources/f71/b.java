package f71;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements Serializable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f132553b;

    static {
        new b("", "");
    }

    public b(String bic2, String name) {
        Intrinsics.checkNotNullParameter(bic2, "bic");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f132552a = bic2;
        this.f132553b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f132552a, bVar.f132552a) && Intrinsics.f(this.f132553b, bVar.f132553b);
    }

    public final int hashCode() {
        return this.f132553b.hashCode() + (this.f132552a.hashCode() * 31);
    }
}
