package gu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h3 extends e3 {

    @NotNull
    public static final g3 Companion = new g3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146759b;

    public /* synthetic */ h3(int i, String str) {
        if (1 == (i & 1)) {
            this.f146759b = str;
        } else {
            qlm.j1.f(f3.f146748a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h3) && Intrinsics.f(this.f146759b, ((h3) obj2).f146759b);
    }

    public final int hashCode() {
        return this.f146759b.hashCode();
    }

    public h3(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f146759b = url2;
    }
}
