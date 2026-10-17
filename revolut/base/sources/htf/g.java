package htf;

import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ttf.b f155365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferReasonCategory f155366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f155367c;
    public final TransferReasonCategory d;
    public final Set e;
    public final boolean f;

    public g(ttf.b catalogue, TransferReasonCategory mainSection, h otherSection, TransferReasonCategory transferReasonCategory, Set selectedReasons, boolean z) {
        Intrinsics.checkNotNullParameter(catalogue, "catalogue");
        Intrinsics.checkNotNullParameter(mainSection, "mainSection");
        Intrinsics.checkNotNullParameter(otherSection, "otherSection");
        Intrinsics.checkNotNullParameter(selectedReasons, "selectedReasons");
        this.f155365a = catalogue;
        this.f155366b = mainSection;
        this.f155367c = otherSection;
        this.d = transferReasonCategory;
        this.e = selectedReasons;
        this.f = z;
    }

    public static g a(g gVar, TransferReasonCategory transferReasonCategory, Set set, boolean z, int i) {
        ttf.b catalogue = gVar.f155365a;
        TransferReasonCategory mainSection = gVar.f155366b;
        h otherSection = gVar.f155367c;
        if ((i & 8) != 0) {
            transferReasonCategory = gVar.d;
        }
        TransferReasonCategory transferReasonCategory2 = transferReasonCategory;
        if ((i & 16) != 0) {
            set = gVar.e;
        }
        Set selectedReasons = set;
        if ((i & 32) != 0) {
            z = gVar.f;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(catalogue, "catalogue");
        Intrinsics.checkNotNullParameter(mainSection, "mainSection");
        Intrinsics.checkNotNullParameter(otherSection, "otherSection");
        Intrinsics.checkNotNullParameter(selectedReasons, "selectedReasons");
        return new g(catalogue, mainSection, otherSection, transferReasonCategory2, selectedReasons, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f155365a == gVar.f155365a && Intrinsics.f(this.f155366b, gVar.f155366b) && Intrinsics.f(this.f155367c, gVar.f155367c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f;
    }

    public final int hashCode() {
        int iHashCode = (this.f155367c.hashCode() + ((this.f155366b.hashCode() + (this.f155365a.hashCode() * 31)) * 31)) * 31;
        TransferReasonCategory transferReasonCategory = this.d;
        return Boolean.hashCode(this.f) + p.a.f((iHashCode + (transferReasonCategory == null ? 0 : transferReasonCategory.hashCode())) * 31, 31, this.e);
    }
}
