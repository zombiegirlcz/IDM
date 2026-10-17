package au0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c2 implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f9155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9157c;
    public final boolean d;

    public /* synthetic */ c2(Image image, String str, int i) {
        this(image, str, (i & 4) != 0, false);
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55185b() {
        return this.f9156b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        return Intrinsics.f(this.f9155a, c2Var.f9155a) && Intrinsics.f(this.f9156b, c2Var.f9156b) && this.f9157c == c2Var.f9157c && this.d == c2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(p.a.c(this.f9155a.hashCode() * 31, 31, this.f9156b), 31, this.f9157c);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof c2 ? (c2) oldItem : null) == null) {
            return null;
        }
        c2 c2Var = (c2) oldItem;
        return new d2(!Intrinsics.f(c2Var.f9155a, this.f9155a), c2Var.f9157c != this.f9157c, c2Var.d != this.d);
    }

    public c2(Image image, String listId, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f9155a = image;
        this.f9156b = listId;
        this.f9157c = z;
        this.d = z3;
    }
}
