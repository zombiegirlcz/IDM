package adk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3423c;

    public /* synthetic */ p(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(n.f3414a.getDescriptor(), i, 7);
            throw null;
        }
        this.f3421a = str;
        this.f3422b = str2;
        this.f3423c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f3421a, pVar.f3421a) && Intrinsics.f(this.f3422b, pVar.f3422b) && Intrinsics.f(this.f3423c, pVar.f3423c);
    }

    public final int hashCode() {
        String str = this.f3421a;
        return this.f3423c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f3422b);
    }

    public p(String str, String label, String deeplink) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f3421a = str;
        this.f3422b = label;
        this.f3423c = deeplink;
    }
}
