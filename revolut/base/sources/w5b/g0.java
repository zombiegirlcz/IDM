package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294842c;
    public final String d;

    public /* synthetic */ g0(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            qlm.j1.f(e0.f294818a.getDescriptor(), i, 15);
            throw null;
        }
        this.f294840a = str;
        this.f294841b = str2;
        this.f294842c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f294840a, g0Var.f294840a) && Intrinsics.f(this.f294841b, g0Var.f294841b) && Intrinsics.f(this.f294842c, g0Var.f294842c) && Intrinsics.f(this.d, g0Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f294840a.hashCode() * 31, 31, this.f294841b);
        String str = this.f294842c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public g0(String id10, String label, String str, String keyboardType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
        this.f294840a = id10;
        this.f294841b = label;
        this.f294842c = str;
        this.d = keyboardType;
    }
}
