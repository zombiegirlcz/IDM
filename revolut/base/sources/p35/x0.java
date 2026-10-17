package p35;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class x0 implements Serializable {

    @NotNull
    public static final v0 Companion = new v0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x0 f232679c = new x0(false, w0.Generated);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f232680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f232681b;

    public x0(boolean z, w0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f232680a = z;
        this.f232681b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return this.f232680a == x0Var.f232680a && this.f232681b == x0Var.f232681b;
    }

    public final int hashCode() {
        return this.f232681b.hashCode() + (Boolean.hashCode(this.f232680a) * 31);
    }
}
