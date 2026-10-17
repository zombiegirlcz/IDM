package abf;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.e f2955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2956b;

    public m(aw0.e actionFooterModel, ArrayList items) {
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f2955a = actionFooterModel;
        this.f2956b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f2956b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f2955a.equals(mVar.f2955a) && this.f2956b.equals(mVar.f2956b);
    }

    public final int hashCode() {
        return this.f2956b.hashCode() + (this.f2955a.hashCode() * 31);
    }
}
