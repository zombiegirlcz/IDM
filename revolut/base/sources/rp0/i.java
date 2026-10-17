package rp0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f256090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f256091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f256092c;
    public final Object d;

    public i(Clause title, Clause clause, Image icon, rwh.c cVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f256090a = title;
        this.f256091b = clause;
        this.f256092c = icon;
        this.d = cVar;
    }

    public final Image a() {
        return this.f256092c;
    }

    public final Object b() {
        return this.d;
    }

    public final Clause c() {
        return this.f256091b;
    }

    public final Clause d() {
        return this.f256090a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f256090a, iVar.f256090a) && Intrinsics.f(this.f256091b, iVar.f256091b) && Intrinsics.f(this.f256092c, iVar.f256092c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f256090a.hashCode() * 31;
        Clause clause = this.f256091b;
        int iC = a10.b.c(this.f256092c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31);
        Object obj2 = this.d;
        return iC + (obj2 != null ? obj2.hashCode() : 0);
    }
}
