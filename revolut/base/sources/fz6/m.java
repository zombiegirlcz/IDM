package fz6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f139120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f139121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f139122c;

    public m(l header, aim.e items, k footer) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f139120a = header;
        this.f139121b = items;
        this.f139122c = footer;
    }

    @Override // cli.p
    public final List c() {
        return this.f139121b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f139120a, mVar.f139120a) && Intrinsics.f(this.f139121b, mVar.f139121b) && Intrinsics.f(this.f139122c, mVar.f139122c);
    }

    public final int hashCode() {
        return this.f139122c.f139117a.hashCode() + p.a.d(this.f139120a.hashCode() * 31, 31, this.f139121b);
    }
}
