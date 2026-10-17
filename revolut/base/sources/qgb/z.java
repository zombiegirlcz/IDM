package qgb;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class z {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f245773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f245774b;

    public /* synthetic */ z(int i, jo3.a aVar, Instant instant) {
        if (1 != (i & 1)) {
            j1.f(x.f245772a.getDescriptor(), i, 1);
            throw null;
        }
        this.f245773a = aVar;
        if ((i & 2) == 0) {
            this.f245774b = null;
        } else {
            this.f245774b = instant;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f245773a, zVar.f245773a) && Intrinsics.f(this.f245774b, zVar.f245774b);
    }

    public final int hashCode() {
        int iHashCode = this.f245773a.hashCode() * 31;
        Instant instant = this.f245774b;
        return iHashCode + (instant == null ? 0 : instant.hashCode());
    }

    public z(jo3.a prizeAmount, Instant instant) {
        Intrinsics.checkNotNullParameter(prizeAmount, "prizeAmount");
        this.f245773a = prizeAmount;
        this.f245774b = instant;
    }
}
