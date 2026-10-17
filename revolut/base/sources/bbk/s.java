package bbk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f14339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f14340c;

    public s(List items, m headerModel, aw0.h hVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        this.f14338a = items;
        this.f14339b = headerModel;
        this.f14340c = hVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f14338a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f14338a, sVar.f14338a) && Intrinsics.f(this.f14339b, sVar.f14339b) && Intrinsics.f(this.f14340c, sVar.f14340c);
    }

    public final int hashCode() {
        int iHashCode = (this.f14339b.hashCode() + (this.f14338a.hashCode() * 31)) * 31;
        aw0.i iVar = this.f14340c;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
