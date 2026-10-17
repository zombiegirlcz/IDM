package ie6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f160636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.g f160637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f160638c;

    public h(List items, aw0.g actionFooterModel, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f160636a = items;
        this.f160637b = actionFooterModel;
        this.f160638c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f160636a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f160636a, hVar.f160636a) && this.f160637b.equals(hVar.f160637b) && this.f160638c == hVar.f160638c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f160638c) + ((this.f160637b.hashCode() + (this.f160636a.hashCode() * 31)) * 31);
    }
}
