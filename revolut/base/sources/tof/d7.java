package tof;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class d7 implements Serializable {

    @NotNull
    public static final a7 Companion = new a7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f272693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f272694c;
    public final boolean d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c7 f272695g;

    public d7(String vaultId, DateTime dateTime, dj0.d dVar, boolean z, List deducted, List taxes, c7 c7Var) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        Intrinsics.checkNotNullParameter(deducted, "deducted");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        this.f272692a = vaultId;
        this.f272693b = dateTime;
        this.f272694c = dVar;
        this.d = z;
        this.e = deducted;
        this.f = taxes;
        this.f272695g = c7Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d7)) {
            return false;
        }
        d7 d7Var = (d7) obj2;
        return Intrinsics.f(this.f272692a, d7Var.f272692a) && Intrinsics.f(this.f272693b, d7Var.f272693b) && Intrinsics.f(this.f272694c, d7Var.f272694c) && this.d == d7Var.d && Intrinsics.f(this.e, d7Var.e) && Intrinsics.f(this.f, d7Var.f) && Intrinsics.f(this.f272695g, d7Var.f272695g);
    }

    public final int hashCode() {
        int iHashCode = this.f272692a.hashCode() * 31;
        DateTime dateTime = this.f272693b;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        dj0.d dVar = this.f272694c;
        int iD = p.a.d(p.a.d(j6.a.c((iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        c7 c7Var = this.f272695g;
        return iD + (c7Var != null ? c7Var.hashCode() : 0);
    }
}
