package bvj;

import cli.j;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f19131a;

    public a(LocalDate localDate) {
        this.f19131a = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f19131a, ((a) obj2).f19131a);
    }

    public final int hashCode() {
        LocalDate localDate = this.f19131a;
        if (localDate == null) {
            return 0;
        }
        return localDate.hashCode();
    }
}
