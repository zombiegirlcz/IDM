package gli;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f144699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f144700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f144701c;
    public final c d;
    public final c e;

    public a(c viewCreation, c viewTotalLayout, c viewTotalMeasure, c viewTotalDraw, c viewTotalBind) {
        Intrinsics.checkNotNullParameter(viewCreation, "viewCreation");
        Intrinsics.checkNotNullParameter(viewTotalLayout, "viewTotalLayout");
        Intrinsics.checkNotNullParameter(viewTotalMeasure, "viewTotalMeasure");
        Intrinsics.checkNotNullParameter(viewTotalDraw, "viewTotalDraw");
        Intrinsics.checkNotNullParameter(viewTotalBind, "viewTotalBind");
        this.f144699a = viewCreation;
        this.f144700b = viewTotalLayout;
        this.f144701c = viewTotalMeasure;
        this.d = viewTotalDraw;
        this.e = viewTotalBind;
    }

    public final long a() {
        return ((((this.f144699a.f144705a + this.f144700b.f144705a) + this.f144701c.f144705a) + this.d.f144705a) + this.e.f144705a) / ((long) 1000000);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f144699a, aVar.f144699a) && Intrinsics.f(this.f144700b, aVar.f144700b) && Intrinsics.f(this.f144701c, aVar.f144701c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f144701c.hashCode() + ((this.f144700b.hashCode() + (this.f144699a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
