package pka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f236969c;

    public /* synthetic */ i(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(g.f236964a.getDescriptor(), i, 7);
            throw null;
        }
        this.f236967a = str;
        this.f236968b = str2;
        this.f236969c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f236967a, iVar.f236967a) && Intrinsics.f(this.f236968b, iVar.f236968b) && Intrinsics.f(this.f236969c, iVar.f236969c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f236967a.hashCode() * 31, 31, this.f236968b);
        String str = this.f236969c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public i(String icon, String title, String str) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f236967a = icon;
        this.f236968b = title;
        this.f236969c = str;
    }
}
