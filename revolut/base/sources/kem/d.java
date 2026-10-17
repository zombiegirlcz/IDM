package kem;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class d extends o {

    @NotNull
    public static final c Companion = new c();

    static {
        zhm.f0 f0Var = zhm.f0.f322471a;
        new d("file", f0Var);
        new d("mixed", f0Var);
        new d("attachment", f0Var);
        new d("inline", f0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String disposition, List parameters) {
        super(disposition, parameters);
        Intrinsics.checkNotNullParameter(disposition, "disposition");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f183219a, dVar.f183219a) && Intrinsics.f(this.f183220b, dVar.f183220b);
    }

    public final int hashCode() {
        return (this.f183219a.hashCode() * 31) + this.f183220b.hashCode();
    }
}
