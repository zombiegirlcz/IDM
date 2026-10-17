package avk;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f10118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x2h.b f10119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f10120c;

    public r(q header, x2h.b actionsPanelState, ArrayList items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f10118a = header;
        this.f10119b = actionsPanelState;
        this.f10120c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f10120c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f10118a.equals(rVar.f10118a) && Intrinsics.f(this.f10119b, rVar.f10119b) && this.f10120c.equals(rVar.f10120c);
    }

    public final int hashCode() {
        return this.f10120c.hashCode() + ((this.f10119b.hashCode() + (this.f10118a.hashCode() * 31)) * 31);
    }
}
