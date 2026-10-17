package gu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class z1 extends w1 {

    @NotNull
    public static final y1 Companion = new y1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146873b;

    public /* synthetic */ z1(int i, String str) {
        if (1 == (i & 1)) {
            this.f146873b = str;
        } else {
            qlm.j1.f(x1.f146862a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z1) && Intrinsics.f(this.f146873b, ((z1) obj2).f146873b);
    }

    public final int hashCode() {
        return this.f146873b.hashCode();
    }

    public z1(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f146873b = url2;
    }
}
