package pne;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f237710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f237711c;

    public /* synthetic */ d0(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            j1.f(b0.f237705a.getDescriptor(), i, 3);
            throw null;
        }
        this.f237709a = str;
        this.f237710b = str2;
        if ((i & 4) == 0) {
            this.f237711c = null;
        } else {
            this.f237711c = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f237709a, d0Var.f237709a) && Intrinsics.f(this.f237710b, d0Var.f237710b) && Intrinsics.f(this.f237711c, d0Var.f237711c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f237709a.hashCode() * 31, 31, this.f237710b);
        String str = this.f237711c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public d0(String name, String value, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f237709a = name;
        this.f237710b = value;
        this.f237711c = str;
    }
}
