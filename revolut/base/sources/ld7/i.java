package ld7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194046b;

    public /* synthetic */ i(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(g.f194044a.getDescriptor(), i, 3);
            throw null;
        }
        this.f194045a = str;
        this.f194046b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f194045a, iVar.f194045a) && Intrinsics.f(this.f194046b, iVar.f194046b);
    }

    public final int hashCode() {
        return this.f194046b.hashCode() + (this.f194045a.hashCode() * 31);
    }

    public i(String text, String url2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f194045a = text;
        this.f194046b = url2;
    }
}
