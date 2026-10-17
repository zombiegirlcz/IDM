package lhk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends k {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.i f195345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f195346c;
    public final boolean d;
    public final boolean e;

    public i(String planId, hha.i iVar, String str, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f195344a = planId;
        this.f195345b = iVar;
        this.f195346c = str;
        this.d = z;
        this.e = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f195344a, iVar.f195344a) && this.f195345b == iVar.f195345b && Intrinsics.f(this.f195346c, iVar.f195346c) && this.d == iVar.d && this.e == iVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f195344a.hashCode() * 31;
        hha.i iVar = this.f195345b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.f195346c;
        return j6.a.c(j6.a.c((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.d), 29791, this.e);
    }
}
