package g9f;

import java.time.ZonedDateTime;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();
    public static final Lazy[] e = {yhm.j.c(yhm.k.PUBLICATION, new g53.e(26)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f141560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f141561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f141562c;
    public final String d;

    public /* synthetic */ j0(int i, l0 l0Var, ZonedDateTime zonedDateTime, String str, String str2) {
        if (14 != (i & 14)) {
            j1.f(h0.f141558a.getDescriptor(), i, 14);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f141560a = l0.UNKNOWN;
        } else {
            this.f141560a = l0Var;
        }
        this.f141561b = zonedDateTime;
        this.f141562c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return this.f141560a == j0Var.f141560a && Intrinsics.f(this.f141561b, j0Var.f141561b) && Intrinsics.f(this.f141562c, j0Var.f141562c) && Intrinsics.f(this.d, j0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f141560a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.f141561b;
        int iC = p.a.c((iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31, 31, this.f141562c);
        String str = this.d;
        return iC + (str != null ? str.hashCode() : 0);
    }

    public j0(l0 state, ZonedDateTime zonedDateTime, String title, String str) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f141560a = state;
        this.f141561b = zonedDateTime;
        this.f141562c = title;
        this.d = str;
    }
}
