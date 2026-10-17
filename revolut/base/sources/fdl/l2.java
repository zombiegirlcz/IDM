package fdl;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class l2 {

    @NotNull
    public static final k2 Companion = new k2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jed.g f134184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f134185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f134186c;
    public final Instant d;
    public final String e;
    public final Instant f;

    public /* synthetic */ l2(int i, jed.g gVar, Instant instant, String str, Instant instant2, String str2, Instant instant3) {
        if (3 != (i & 3)) {
            qlm.j1.f(j2.f134167a.getDescriptor(), i, 3);
            throw null;
        }
        this.f134184a = gVar;
        this.f134185b = instant;
        if ((i & 4) == 0) {
            this.f134186c = null;
        } else {
            this.f134186c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = instant2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = instant3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj2;
        return Intrinsics.f(this.f134184a, l2Var.f134184a) && Intrinsics.f(this.f134185b, l2Var.f134185b) && Intrinsics.f(this.f134186c, l2Var.f134186c) && Intrinsics.f(this.d, l2Var.d) && Intrinsics.f(this.e, l2Var.e) && Intrinsics.f(this.f, l2Var.f);
    }

    public final int hashCode() {
        int iC = r6.b.c(this.f134184a.hashCode() * 31, 31, this.f134185b);
        String str = this.f134186c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Instant instant = this.d;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Instant instant2 = this.f;
        return iHashCode3 + (instant2 != null ? instant2.hashCode() : 0);
    }
}
