package s1l;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f259164c;

    public /* synthetic */ c0(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            j1.f(a0.f259158a.getDescriptor(), i, 3);
            throw null;
        }
        this.f259162a = str;
        this.f259163b = str2;
        if ((i & 4) == 0) {
            this.f259164c = null;
        } else {
            this.f259164c = str3;
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
        return Intrinsics.f(this.f259162a, c0Var.f259162a) && Intrinsics.f(this.f259163b, c0Var.f259163b) && Intrinsics.f(this.f259164c, c0Var.f259164c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f259162a.hashCode() * 31, 31, this.f259163b);
        String str = this.f259164c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public c0(String action, String label, String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f259162a = action;
        this.f259163b = label;
        this.f259164c = str;
    }
}
