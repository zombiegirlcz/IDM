package gu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c2 extends w1 {

    @NotNull
    public static final b2 Companion = new b2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146722b;

    public /* synthetic */ c2(int i, String str) {
        if (1 == (i & 1)) {
            this.f146722b = str;
        } else {
            qlm.j1.f(a2.f146711a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c2) && Intrinsics.f(this.f146722b, ((c2) obj2).f146722b);
    }

    public final int hashCode() {
        return this.f146722b.hashCode();
    }

    public c2(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f146722b = url2;
    }
}
