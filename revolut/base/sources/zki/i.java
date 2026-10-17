package zki;

import aii.m;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f323054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f323055c;
    public final ModalDestination.Style d;
    public final boolean e;

    public i(int i, com.revolut.kompot.navigable.a modalController, ModalDestination.Style style, boolean z) {
        Intrinsics.checkNotNullParameter(modalController, "modalController");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f323054b = i;
        this.f323055c = modalController;
        this.d = style;
        this.e = z;
    }

    public final com.revolut.kompot.navigable.a b() {
        return this.f323055c;
    }

    public final boolean c() {
        return this.e;
    }

    public final ModalDestination.Style d() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f323054b == iVar.f323054b && Intrinsics.f(this.f323055c, iVar.f323055c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.f323055c.hashCode() + (Integer.hashCode(this.f323054b) * 31)) * 31)) * 31);
    }
}
