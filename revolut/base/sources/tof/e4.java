package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes8.dex */
public final class e4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f272732c;

    public e4(String firstName, String lastName, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f272730a = firstName;
        this.f272731b = lastName;
        this.f272732c = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj2;
        return Intrinsics.f(this.f272730a, e4Var.f272730a) && Intrinsics.f(this.f272731b, e4Var.f272731b) && Intrinsics.f(this.f272732c, e4Var.f272732c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f272730a.hashCode() * 31, 31, this.f272731b);
        LocalDate localDate = this.f272732c;
        return iC + (localDate == null ? 0 : localDate.hashCode());
    }
}
