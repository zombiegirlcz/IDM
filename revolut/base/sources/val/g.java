package val;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f287334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tal.c f287335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tal.a f287336c;

    public g(List items, tal.c twinButtonModel, tal.a navBarModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(twinButtonModel, "twinButtonModel");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        this.f287334a = items;
        this.f287335b = twinButtonModel;
        this.f287336c = navBarModel;
    }

    @Override // jki.n
    public final List c() {
        return this.f287334a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f287334a, gVar.f287334a) && Intrinsics.f(this.f287335b, gVar.f287335b) && Intrinsics.f(this.f287336c, gVar.f287336c);
    }

    public final int hashCode() {
        return this.f287336c.hashCode() + ((this.f287335b.hashCode() + (this.f287334a.hashCode() * 31)) * 31);
    }
}
