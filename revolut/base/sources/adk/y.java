package adk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3456c;

    public /* synthetic */ y(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(w.f3452a.getDescriptor(), i, 7);
            throw null;
        }
        this.f3454a = str;
        this.f3455b = str2;
        this.f3456c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f3454a, yVar.f3454a) && Intrinsics.f(this.f3455b, yVar.f3455b) && Intrinsics.f(this.f3456c, yVar.f3456c);
    }

    public final int hashCode() {
        String str = this.f3454a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f3455b);
        String str2 = this.f3456c;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public y(String str, String title, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f3454a = str;
        this.f3455b = title;
        this.f3456c = str2;
    }
}
