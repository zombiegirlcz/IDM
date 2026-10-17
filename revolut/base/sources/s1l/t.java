package s1l;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f259209c;
    public final String d;

    public /* synthetic */ t(int i, String str, String str2, String str3, String str4) {
        if (7 != (i & 7)) {
            j1.f(r.f259203a.getDescriptor(), i, 7);
            throw null;
        }
        this.f259207a = str;
        this.f259208b = str2;
        this.f259209c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f259207a, tVar.f259207a) && Intrinsics.f(this.f259208b, tVar.f259208b) && Intrinsics.f(this.f259209c, tVar.f259209c) && Intrinsics.f(this.d, tVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f259207a.hashCode() * 31, 31, this.f259208b), 31, this.f259209c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public t(String id10, String label, String keyboardType, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
        this.f259207a = id10;
        this.f259208b = label;
        this.f259209c = keyboardType;
        this.d = str;
    }
}
