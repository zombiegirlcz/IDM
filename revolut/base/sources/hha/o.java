package hha;

import ip0.v7;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements Serializable {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f152326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f152327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f152328c;

    public o(dj0.d total, dj0.d fee2, List taxes) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        this.f152326a = total;
        this.f152327b = fee2;
        this.f152328c = taxes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f152326a, oVar.f152326a) && Intrinsics.f(this.f152327b, oVar.f152327b) && Intrinsics.f(this.f152328c, oVar.f152328c);
    }

    public final int hashCode() {
        return this.f152328c.hashCode() + v7.c(this.f152326a.hashCode() * 31, 31, this.f152327b);
    }
}
