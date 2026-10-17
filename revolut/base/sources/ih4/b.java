package ih4;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f161292b;

    public b(String value) {
        wi0.b bVarA;
        Intrinsics.checkNotNullParameter(value, "value");
        this.f161291a = value;
        try {
            String strU0 = f0.U0(2, value);
            wi0.b.Companion.getClass();
            bVarA = wi0.a.a(strU0);
        } catch (IllegalArgumentException unused) {
            bVarA = null;
        }
        this.f161292b = bVarA;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f161291a, ((b) obj2).f161291a);
    }

    public final int hashCode() {
        return this.f161291a.hashCode();
    }
}
