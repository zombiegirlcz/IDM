package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class e21 implements c21.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f27977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final le1 f27978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z10 f27979c;

    public e21(c81 title, le1 mask, z10 closeImageSource) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(mask, "mask");
        Intrinsics.checkNotNullParameter(closeImageSource, "closeImageSource");
        this.f27977a = title;
        this.f27978b = mask;
        this.f27979c = closeImageSource;
    }

    @Override // com.fourthline.orca.internal.c21.b
    public z10 b() {
        return this.f27979c;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e21)) {
            return false;
        }
        e21 e21Var = (e21) obj2;
        return Intrinsics.f(this.f27977a, e21Var.f27977a) && Intrinsics.f(this.f27978b, e21Var.f27978b) && Intrinsics.f(this.f27979c, e21Var.f27979c);
    }

    @Override // com.fourthline.orca.internal.c21.b
    public le1 getMask() {
        return this.f27978b;
    }

    @Override // com.fourthline.orca.internal.c21
    public c81 getTitle() {
        return this.f27977a;
    }

    public int hashCode() {
        return (((this.f27977a.hashCode() * 31) + this.f27978b.hashCode()) * 31) + this.f27979c.hashCode();
    }

    public String toString() {
        return "Mask(title=" + this.f27977a + ", mask=" + this.f27978b + ", closeImageSource=" + this.f27979c + ")";
    }
}
