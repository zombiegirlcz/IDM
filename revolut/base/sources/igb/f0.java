package igb;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class f0 {

    @NotNull
    public static final o Companion = new o();
    public static final Lazy[] i = {null, null, yhm.j.c(yhm.k.PUBLICATION, new j(0)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f161125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f161126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f161127c;
    public final y d;
    public final b0 e;
    public final s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0 f161128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Instant f161129h;

    public /* synthetic */ f0(int i2, boolean z, v vVar, List list, y yVar, b0 b0Var, s sVar, e0 e0Var, Instant instant) {
        if (7 != (i2 & 7)) {
            j1.f(k.f161140a.getDescriptor(), i2, 7);
            throw null;
        }
        this.f161125a = z;
        this.f161126b = vVar;
        this.f161127c = list;
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = yVar;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = b0Var;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = sVar;
        }
        if ((i2 & 64) == 0) {
            this.f161128g = null;
        } else {
            this.f161128g = e0Var;
        }
        if ((i2 & 128) == 0) {
            this.f161129h = null;
        } else {
            this.f161129h = instant;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return this.f161125a == f0Var.f161125a && Intrinsics.f(this.f161126b, f0Var.f161126b) && Intrinsics.f(this.f161127c, f0Var.f161127c) && Intrinsics.f(this.d, f0Var.d) && Intrinsics.f(this.e, f0Var.e) && Intrinsics.f(this.f, f0Var.f) && Intrinsics.f(this.f161128g, f0Var.f161128g) && Intrinsics.f(this.f161129h, f0Var.f161129h);
    }

    public final int hashCode() {
        int iD = p.a.d((this.f161126b.hashCode() + (Boolean.hashCode(this.f161125a) * 31)) * 31, 31, this.f161127c);
        y yVar = this.d;
        int iHashCode = (iD + (yVar == null ? 0 : yVar.hashCode())) * 31;
        b0 b0Var = this.e;
        int iHashCode2 = (iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        s sVar = this.f;
        int iHashCode3 = (iHashCode2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        e0 e0Var = this.f161128g;
        int iHashCode4 = (iHashCode3 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        Instant instant = this.f161129h;
        return iHashCode4 + (instant != null ? instant.hashCode() : 0);
    }

    public f0(boolean z, v header, ArrayList availableRewards, y yVar, b0 b0Var, s sVar, e0 e0Var, Instant instant) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(availableRewards, "availableRewards");
        this.f161125a = z;
        this.f161126b = header;
        this.f161127c = availableRewards;
        this.d = yVar;
        this.e = b0Var;
        this.f = sVar;
        this.f161128g = e0Var;
        this.f161129h = instant;
    }
}
