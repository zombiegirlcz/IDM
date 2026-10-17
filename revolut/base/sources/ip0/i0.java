package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f164616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bw0.h f164617c;
    public final nx0.e d;
    public final nx0.g e;
    public final bw0.m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bw0.m f164618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f164619h;
    public final Image i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f164620j;

    public i0(String listId, Clause amountType, bw0.h amountInputModel, nx0.e chevron, nx0.g switcher, bw0.m mVar, bw0.m mVar2, boolean z, Image image, String str, int i) {
        chevron = (i & 8) != 0 ? nx0.e.NONE : chevron;
        switcher = (i & 16) != 0 ? nx0.g.NONE : switcher;
        z = (i & 128) != 0 ? true : z;
        image = (i & 256) != 0 ? null : image;
        str = (i & 512) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(amountInputModel, "amountInputModel");
        Intrinsics.checkNotNullParameter(chevron, "chevron");
        Intrinsics.checkNotNullParameter(switcher, "switcher");
        this.f164615a = listId;
        this.f164616b = amountType;
        this.f164617c = amountInputModel;
        this.d = chevron;
        this.e = switcher;
        this.f = mVar;
        this.f164618g = mVar2;
        this.f164619h = z;
        this.i = image;
        this.f164620j = str;
    }

    public final j0 a(i0 oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem != null ? oldItem : null) == null) {
            return null;
        }
        return new j0(this.f164617c, !Intrinsics.f(this.f164616b, oldItem.f164616b), !Intrinsics.f(this.i, oldItem.i), !Intrinsics.f(this.f164620j, oldItem.f164620j), !Intrinsics.f(this.f164617c, oldItem.f164617c), this.d != oldItem.d, this.e != oldItem.e, !Intrinsics.f(this.f, oldItem.f), !Intrinsics.f(this.f164618g, oldItem.f164618g), this.f164619h != oldItem.f164619h);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f164615a, i0Var.f164615a) && Intrinsics.f(this.f164616b, i0Var.f164616b) && Intrinsics.f(this.f164617c, i0Var.f164617c) && this.d == i0Var.d && this.e == i0Var.e && Intrinsics.f(this.f, i0Var.f) && Intrinsics.f(this.f164618g, i0Var.f164618g) && this.f164619h == i0Var.f164619h && Intrinsics.f(this.i, i0Var.i) && Intrinsics.f(this.f164620j, i0Var.f164620j);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.f164617c.hashCode() + p.a.a(this.f164615a.hashCode() * 31, 31, this.f164616b)) * 31)) * 31)) * 31;
        bw0.m mVar = this.f;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        bw0.m mVar2 = this.f164618g;
        int iC = j6.a.c((iHashCode2 + (mVar2 == null ? 0 : mVar2.hashCode())) * 31, 31, this.f164619h);
        Image image = this.i;
        int iHashCode3 = (iC + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.f164620j;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }
}
