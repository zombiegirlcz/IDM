package vb2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f287370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f287371b;

    public o(aim.e items, aw0.e actionFooterModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f287370a = items;
        this.f287371b = actionFooterModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f287370a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f287370a, oVar.f287370a) && this.f287371b.equals(oVar.f287371b);
    }

    public final int hashCode() {
        return this.f287371b.hashCode() + (this.f287370a.hashCode() * 31);
    }
}
