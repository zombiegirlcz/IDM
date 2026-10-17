package usj;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f282941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f282942b;

    public /* synthetic */ e0(int i, LocalDate localDate, x xVar) {
        if (3 != (i & 3)) {
            j1.f(c0.f282939a.getDescriptor(), i, 3);
            throw null;
        }
        this.f282941a = localDate;
        this.f282942b = xVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f282941a, e0Var.f282941a) && Intrinsics.f(this.f282942b, e0Var.f282942b);
    }

    public final int hashCode() {
        int iHashCode = this.f282941a.hashCode() * 31;
        x xVar = this.f282942b;
        return iHashCode + (xVar == null ? 0 : xVar.hashCode());
    }

    public e0(LocalDate date, x xVar) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f282941a = date;
        this.f282942b = xVar;
    }
}
