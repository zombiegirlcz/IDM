package i65;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f158868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hx4.a f158869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f158870c;

    public o(ArrayList items, hx4.a navBarWithToolbarModel, aw0.i actionFooterModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarWithToolbarModel, "navBarWithToolbarModel");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f158868a = items;
        this.f158869b = navBarWithToolbarModel;
        this.f158870c = actionFooterModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f158868a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f158868a.equals(oVar.f158868a) && this.f158869b.equals(oVar.f158869b) && this.f158870c.equals(oVar.f158870c);
    }

    public final int hashCode() {
        return this.f158870c.hashCode() + ((this.f158869b.hashCode() + (this.f158868a.hashCode() * 31)) * 31);
    }
}
