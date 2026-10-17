package hib;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.c7;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f152581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c7 f152582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f152583c;

    public k(List items, c7 footerContent, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footerContent, "footerContent");
        this.f152581a = items;
        this.f152582b = footerContent;
        this.f152583c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f152581a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f152581a, kVar.f152581a) && this.f152582b.equals(kVar.f152582b) && this.f152583c == kVar.f152583c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f152583c) + ((this.f152582b.hashCode() + (this.f152581a.hashCode() * 31)) * 31);
    }
}
