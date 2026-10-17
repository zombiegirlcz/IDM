package oq3;

import ft3.a1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yp3.d f227714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yp3.f f227715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f227716c;
    public final boolean d;

    public i(yp3.d productArticleStrategy, yp3.f productIntroStrategy, a1 entryPointPayload, boolean z) {
        Intrinsics.checkNotNullParameter(productArticleStrategy, "productArticleStrategy");
        Intrinsics.checkNotNullParameter(productIntroStrategy, "productIntroStrategy");
        Intrinsics.checkNotNullParameter(entryPointPayload, "entryPointPayload");
        this.f227714a = productArticleStrategy;
        this.f227715b = productIntroStrategy;
        this.f227716c = entryPointPayload;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f227714a == iVar.f227714a && this.f227715b == iVar.f227715b && Intrinsics.f(this.f227716c, iVar.f227716c) && this.d == iVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f227716c.hashCode() + ((this.f227715b.hashCode() + (this.f227714a.hashCode() * 31)) * 31)) * 31);
    }
}
