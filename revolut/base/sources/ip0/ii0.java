package ip0;

import com.revolut.core.ui_kit.delegates.SwipeableCardCoverItemDelegate;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ii0 implements koi.j, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Media f164697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi0 f164698c;
    public final aw0.i d;
    public final Object e;

    public ii0(String listId, Media media, hi0 header, aw0.e eVar, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f164696a = listId;
        this.f164697b = media;
        this.f164698c = header;
        this.d = eVar;
        this.e = obj2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new SwipeableCardCoverItemDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53623w() {
        return this.e;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53609a() {
        return this.f164696a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ii0)) {
            return false;
        }
        ii0 ii0Var = (ii0) obj2;
        return Intrinsics.f(this.f164696a, ii0Var.f164696a) && Intrinsics.f(this.f164697b, ii0Var.f164697b) && Intrinsics.f(this.f164698c, ii0Var.f164698c) && Intrinsics.f(this.d, ii0Var.d) && Intrinsics.f(this.e, ii0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f164696a.hashCode() * 31;
        Media media = this.f164697b;
        int iHashCode2 = (this.f164698c.hashCode() + ((iHashCode + (media == null ? 0 : media.hashCode())) * 31)) * 31;
        aw0.i iVar = this.d;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Object obj2 = this.e;
        return iHashCode3 + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof ii0)) {
            super.z(oldItem);
            return null;
        }
        ii0 ii0Var = (ii0) oldItem;
        boolean z = !Intrinsics.f(ii0Var.f164697b, this.f164697b);
        hi0 oldItem2 = ii0Var.f164698c;
        this.f164698c.getClass();
        Intrinsics.checkNotNullParameter(oldItem2, "oldItem");
        return new ji0(z, new gi0(!oldItem2.f164564a.equals(r3.f164564a), !oldItem2.f164565b.equals(r3.f164565b), !Intrinsics.f(oldItem2.f164566c, r3.f164566c)), !Intrinsics.f(ii0Var.d, this.d));
    }
}
