package xq4;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f308111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f308112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f308113c;
    public final AnalyticsContext d;

    public j(i toolbarModel, List items, h buttonModel, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(toolbarModel, "toolbarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonModel, "buttonModel");
        this.f308111a = toolbarModel;
        this.f308112b = items;
        this.f308113c = buttonModel;
        this.d = analyticsContext;
    }

    @Override // jki.n
    public final List c() {
        return this.f308112b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f308111a, jVar.f308111a) && Intrinsics.f(this.f308112b, jVar.f308112b) && Intrinsics.f(this.f308113c, jVar.f308113c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f308113c.hashCode() + p.a.d(this.f308111a.hashCode() * 31, 31, this.f308112b)) * 31;
        AnalyticsContext analyticsContext = this.d;
        return iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }
}
