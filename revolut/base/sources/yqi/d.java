package yqi;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f316032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f316033b;

    public d(Object obj2, List errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.f316032a = obj2;
        this.f316033b = errors;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f316032a, dVar.f316032a) && Intrinsics.f(this.f316033b, dVar.f316033b);
    }

    public final int hashCode() {
        Object obj2 = this.f316032a;
        return this.f316033b.hashCode() + ((obj2 == null ? 0 : obj2.hashCode()) * 31);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Object obj2, b error) {
        this(obj2, u.c(error));
        Intrinsics.checkNotNullParameter(error, "error");
    }
}
