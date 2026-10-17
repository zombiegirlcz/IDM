package ip0;

import com.revolut.core.ui_kit.delegates.SwipeableCardFullSizeContentItemDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class oi0 implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ni0 f165671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f165672c;
    public final Image d;

    public oi0(String listId, ni0 header, Clause subtitle, UrlImage urlImage) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f165670a = listId;
        this.f165671b = header;
        this.f165672c = subtitle;
        this.d = urlImage;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new SwipeableCardFullSizeContentItemDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52218a() {
        return this.f165670a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof oi0)) {
            return false;
        }
        oi0 oi0Var = (oi0) obj2;
        return Intrinsics.f(this.f165670a, oi0Var.f165670a) && Intrinsics.f(this.f165671b, oi0Var.f165671b) && Intrinsics.f(this.f165672c, oi0Var.f165672c) && Intrinsics.f(this.d, oi0Var.d);
    }

    public final int hashCode() {
        int iA = p.a.a((this.f165671b.hashCode() + (this.f165670a.hashCode() * 31)) * 31, 31, this.f165672c);
        Image image = this.d;
        return iA + (image == null ? 0 : image.hashCode());
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof oi0)) {
            super.z(oldItem);
            return null;
        }
        oi0 oi0Var = (oi0) oldItem;
        boolean z = !Intrinsics.f(oi0Var.d, this.d);
        boolean z3 = !Intrinsics.f(oi0Var.f165672c, this.f165672c);
        ni0 oldItem2 = oi0Var.f165671b;
        Intrinsics.checkNotNullParameter(oldItem2, "oldItem");
        TextClause textClause = oldItem2.f165517a;
        ni0 ni0Var = this.f165671b;
        return new pi0(new mi0(!textClause.equals(ni0Var.f165517a), !oldItem2.f165518b.equals(ni0Var.f165518b), !oldItem2.f165519c.equals(ni0Var.f165519c)), z3, z);
    }
}
