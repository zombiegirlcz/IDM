package gu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class a0 extends u {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146710b;

    public /* synthetic */ a0(int i, String str) {
        if (1 == (i & 1)) {
            this.f146710b = str;
        } else {
            qlm.j1.f(y.f146868a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f146710b, ((a0) obj2).f146710b);
    }

    public final int hashCode() {
        return this.f146710b.hashCode();
    }

    public a0(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f146710b = url2;
    }
}
