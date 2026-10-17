package iyd;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f169657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f169658b;

    public /* synthetic */ d0(int i, LocalDate localDate, LocalDate localDate2) {
        if (3 != (i & 3)) {
            j1.f(b0.f169652a.getDescriptor(), i, 3);
            throw null;
        }
        this.f169657a = localDate;
        this.f169658b = localDate2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f169657a, d0Var.f169657a) && Intrinsics.f(this.f169658b, d0Var.f169658b);
    }

    public final int hashCode() {
        return this.f169658b.hashCode() + (this.f169657a.hashCode() * 31);
    }

    public d0(LocalDate from, LocalDate to6) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f169657a = from;
        this.f169658b = to6;
    }
}
