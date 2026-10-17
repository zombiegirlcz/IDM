package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class o7 {

    @NotNull
    public static final n7 Companion = new n7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153245a;

    public /* synthetic */ o7(int i, String str) {
        if (1 == (i & 1)) {
            this.f153245a = str;
        } else {
            qlm.j1.f(m7.f153216a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o7) && Intrinsics.f(this.f153245a, ((o7) obj2).f153245a);
    }

    public final int hashCode() {
        return this.f153245a.hashCode();
    }

    public o7(String reservationId) {
        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
        this.f153245a = reservationId;
    }
}
