package yfe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yfe.h;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class h0 extends h.c {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f313264c;
    public final String d;

    public /* synthetic */ h0(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qlm.j1.f(f0.f313253a.getDescriptor(), i, 1);
            throw null;
        }
        this.f313264c = str;
        if ((i & 2) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f313264c, h0Var.f313264c) && Intrinsics.f(this.d, h0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f313264c.hashCode() * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public h0(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f313264c = title;
        this.d = str;
    }
}
