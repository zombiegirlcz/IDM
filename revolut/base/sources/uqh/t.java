package uqh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.f f282175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f282176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f282177c;

    public t(int i, List filters, zel.f instrumentGroup) {
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f282175a = instrumentGroup;
        this.f282176b = filters;
        this.f282177c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f282175a == tVar.f282175a && Intrinsics.f(this.f282176b, tVar.f282176b) && this.f282177c == tVar.f282177c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f282177c) + p.a.d(this.f282175a.hashCode() * 31, 31, this.f282176b);
    }

    public /* synthetic */ t(zel.f fVar, List list) {
        this(1000, list, fVar);
    }
}
