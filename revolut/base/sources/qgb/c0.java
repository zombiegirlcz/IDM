package qgb;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f245727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f245728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f245729c;

    public /* synthetic */ c0(int i, boolean z, Instant instant, t tVar) {
        if (1 != (i & 1)) {
            j1.f(a0.f245725a.getDescriptor(), i, 1);
            throw null;
        }
        this.f245727a = z;
        if ((i & 2) == 0) {
            this.f245728b = null;
        } else {
            this.f245728b = instant;
        }
        if ((i & 4) == 0) {
            this.f245729c = null;
        } else {
            this.f245729c = tVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f245727a == c0Var.f245727a && Intrinsics.f(this.f245728b, c0Var.f245728b) && Intrinsics.f(this.f245729c, c0Var.f245729c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f245727a) * 31;
        Instant instant = this.f245728b;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        t tVar = this.f245729c;
        return iHashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    public c0(boolean z, Instant instant, t tVar) {
        this.f245727a = z;
        this.f245728b = instant;
        this.f245729c = tVar;
    }
}
