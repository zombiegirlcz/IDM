package jy6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f179341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f179342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f179343c;

    public k(j headerState, List items, i footerState) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        this.f179341a = headerState;
        this.f179342b = items;
        this.f179343c = footerState;
    }

    @Override // cli.p
    public final List c() {
        return this.f179342b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f179341a, kVar.f179341a) && Intrinsics.f(this.f179342b, kVar.f179342b) && Intrinsics.f(this.f179343c, kVar.f179343c);
    }

    public final int hashCode() {
        return this.f179343c.hashCode() + p.a.d(this.f179341a.hashCode() * 31, 31, this.f179342b);
    }
}
