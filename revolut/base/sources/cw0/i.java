package cw0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import cw0.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f109520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f109521c;
    public final f d;
    public final Object e;

    public i(String id10, Image image, g.c state, Object obj2, int i) {
        state = (i & 4) != 0 ? new g.c(0) : state;
        f size = f.DEFAULT;
        obj2 = (i & 16) != 0 ? null : obj2;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f109519a = id10;
        this.f109520b = image;
        this.f109521c = state;
        this.d = size;
        this.e = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f109519a, iVar.f109519a) && Intrinsics.f(this.f109520b, iVar.f109520b) && Intrinsics.f(this.f109521c, iVar.f109521c) && this.d == iVar.d && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f109521c.hashCode() + p.a.b(this.f109519a.hashCode() * 31, 31, this.f109520b)) * 31)) * 31;
        Object obj2 = this.e;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
