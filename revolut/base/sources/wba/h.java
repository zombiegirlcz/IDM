package wba;

import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f296073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PixQrCodeDecodeData f296075c;
    public final TransferScheduleData d;
    public final LocalDate e;

    public h(dj0.d amount, String reference, PixQrCodeDecodeData qrDecodeResult, TransferScheduleData transferScheduleData, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(qrDecodeResult, "qrDecodeResult");
        Intrinsics.checkNotNullParameter(transferScheduleData, "transferScheduleData");
        this.f296073a = amount;
        this.f296074b = reference;
        this.f296075c = qrDecodeResult;
        this.d = transferScheduleData;
        this.e = localDate;
    }

    public static h a(h hVar, String str, PixQrCodeDecodeData pixQrCodeDecodeData, TransferScheduleData transferScheduleData, int i) {
        dj0.d amount = hVar.f296073a;
        if ((i & 2) != 0) {
            str = hVar.f296074b;
        }
        String reference = str;
        if ((i & 4) != 0) {
            pixQrCodeDecodeData = hVar.f296075c;
        }
        PixQrCodeDecodeData qrDecodeResult = pixQrCodeDecodeData;
        if ((i & 8) != 0) {
            transferScheduleData = hVar.d;
        }
        TransferScheduleData transferScheduleData2 = transferScheduleData;
        LocalDate localDate = hVar.e;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(qrDecodeResult, "qrDecodeResult");
        Intrinsics.checkNotNullParameter(transferScheduleData2, "transferScheduleData");
        return new h(amount, reference, qrDecodeResult, transferScheduleData2, localDate);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f296073a, hVar.f296073a) && Intrinsics.f(this.f296074b, hVar.f296074b) && Intrinsics.f(this.f296075c, hVar.f296075c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iF = h30.l.f(this.d, (this.f296075c.hashCode() + p.a.c(this.f296073a.hashCode() * 31, 31, this.f296074b)) * 31, 31);
        LocalDate localDate = this.e;
        return iF + (localDate == null ? 0 : localDate.hashCode());
    }
}
