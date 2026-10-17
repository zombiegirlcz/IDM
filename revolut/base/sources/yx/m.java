package yx;

import com.revolut.camerakit.revolut.ui.barcodeqr.models.BarcodeQrReaderScreenSettings;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class m implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f317509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f317510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BarcodeQrReaderScreenSettings.ButtonConfiguration f317511c;
    public final BarcodeQrReaderScreenSettings.ButtonConfiguration d;

    public m(Clause navBarTitle, List navBarMenuItems, BarcodeQrReaderScreenSettings.ButtonConfiguration buttonConfiguration, BarcodeQrReaderScreenSettings.ButtonConfiguration buttonConfiguration2) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarMenuItems, "navBarMenuItems");
        this.f317509a = navBarTitle;
        this.f317510b = navBarMenuItems;
        this.f317511c = buttonConfiguration;
        this.d = buttonConfiguration2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f317509a, mVar.f317509a) && Intrinsics.f(this.f317510b, mVar.f317510b) && Intrinsics.f(this.f317511c, mVar.f317511c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f317509a.hashCode() * 31, 31, this.f317510b);
        BarcodeQrReaderScreenSettings.ButtonConfiguration buttonConfiguration = this.f317511c;
        int iHashCode = (iD + (buttonConfiguration == null ? 0 : buttonConfiguration.hashCode())) * 31;
        BarcodeQrReaderScreenSettings.ButtonConfiguration buttonConfiguration2 = this.d;
        return iHashCode + (buttonConfiguration2 != null ? buttonConfiguration2.hashCode() : 0);
    }
}
