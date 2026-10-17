package fu6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f138091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f138092c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m header, aim.e items) {
        super(items);
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f138091b = header;
        this.f138092c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f138092c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f138091b, kVar.f138091b) && Intrinsics.f(this.f138092c, kVar.f138092c);
    }

    public final int hashCode() {
        return this.f138092c.hashCode() + (this.f138091b.hashCode() * 31);
    }
}
