package mb5;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements Serializable {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f204133a;

    static {
        new d(f0.f322471a);
    }

    public d(List documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f204133a = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f204133a, ((d) obj2).f204133a);
    }

    public final int hashCode() {
        return this.f204133a.hashCode();
    }
}
