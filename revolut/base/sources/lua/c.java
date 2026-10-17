package lua;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f200204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f200205b;

    public c(List items, aw0.e actionFooterModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f200204a = items;
        this.f200205b = actionFooterModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f200204a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f200204a.equals(cVar.f200204a) && this.f200205b.equals(cVar.f200205b);
    }

    public final int hashCode() {
        return this.f200205b.hashCode() + (this.f200204a.hashCode() * 31);
    }
}
