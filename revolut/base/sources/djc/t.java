package djc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f115314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f115315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f115316c;

    public t(m headerState, List items, boolean z) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f115314a = headerState;
        this.f115315b = items;
        this.f115316c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f115315b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f115314a, tVar.f115314a) && Intrinsics.f(this.f115315b, tVar.f115315b) && this.f115316c == tVar.f115316c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115316c) + p.a.d(this.f115314a.hashCode() * 31, 31, this.f115315b);
    }
}
