package ip0;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class xn implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithContainerBackground f167199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vn f167200c;
    public final boolean d;

    public /* synthetic */ xn(NavBarWithContainerBackground navBarWithContainerBackground, vn vnVar) {
        this("homeScreenPreviewDelegate_currentBackground", navBarWithContainerBackground, vnVar, false);
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59488a() {
        return this.f167198a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof xn)) {
            return false;
        }
        xn xnVar = (xn) obj2;
        return Intrinsics.f(this.f167198a, xnVar.f167198a) && Intrinsics.f(this.f167199b, xnVar.f167199b) && Intrinsics.f(this.f167200c, xnVar.f167200c) && this.d == xnVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f167200c.hashCode() + ((this.f167199b.hashCode() + (this.f167198a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof xn ? (xn) oldItem : null) == null) {
            return null;
        }
        xn xnVar = (xn) oldItem;
        return new yn(this.f167200c.z(xnVar.f167200c), !Intrinsics.f(xnVar.f167199b, this.f167199b), xnVar.d != this.d);
    }

    public xn(String listId, NavBarWithContainerBackground background, vn innerModel, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(innerModel, "innerModel");
        this.f167198a = listId;
        this.f167199b = background;
        this.f167200c = innerModel;
        this.d = z;
    }
}
