package i2l;

import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.TravelStatusPartnerActionBottomSheetData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelStatusPartnerActionBottomSheetData f158051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f158052c;

    public w(TravelStatusPartnerActionBottomSheetData bottomSheetData, p confirmAction, String partnerId) {
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
        Intrinsics.checkNotNullParameter(confirmAction, "confirmAction");
        this.f158050a = partnerId;
        this.f158051b = bottomSheetData;
        this.f158052c = confirmAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f158050a, wVar.f158050a) && Intrinsics.f(this.f158051b, wVar.f158051b) && this.f158052c == wVar.f158052c;
    }

    public final int hashCode() {
        return this.f158052c.hashCode() + ((this.f158051b.hashCode() + (this.f158050a.hashCode() * 31)) * 31);
    }
}
