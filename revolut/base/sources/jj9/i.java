package jj9;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f174789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f174790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f174791c;

    public i(g header, List items, w0 w0Var) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f174789a = header;
        this.f174790b = items;
        this.f174791c = w0Var;
    }

    @Override // jki.n
    public final List c() {
        return this.f174790b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f174789a, iVar.f174789a) && Intrinsics.f(this.f174790b, iVar.f174790b) && Intrinsics.f(this.f174791c, iVar.f174791c);
    }

    public final int hashCode() {
        return AnalyticsContext.a(this.f174791c) + p.a.d(this.f174789a.hashCode() * 31, 31, this.f174790b);
    }
}
