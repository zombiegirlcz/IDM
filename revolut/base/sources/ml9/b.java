package ml9;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f206650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.g f206651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f206652c;

    public b(List items, aw0.g actionFooterModel, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f206650a = items;
        this.f206651b = actionFooterModel;
        this.f206652c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f206650a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f206650a, bVar.f206650a) && this.f206651b.equals(bVar.f206651b) && this.f206652c == bVar.f206652c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f206652c) + ((this.f206651b.hashCode() + (this.f206650a.hashCode() * 31)) * 31);
    }
}
