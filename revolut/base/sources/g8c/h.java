package g8c;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f141345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f141346b;

    public h(List items, aw0.e actionFooterModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f141345a = items;
        this.f141346b = actionFooterModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f141345a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f141345a, hVar.f141345a) && this.f141346b.equals(hVar.f141346b);
    }

    public final int hashCode() {
        return this.f141346b.hashCode() + (this.f141345a.hashCode() * 31);
    }
}
