package ar2;

import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcode;
import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcodeDetectorSettings;
import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcodeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xq2.f;
import xq2.g;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class e {
    public static xq2.a a(MsBarcode msBarcode, f source) {
        g gVar;
        Intrinsics.checkNotNullParameter(msBarcode, "msBarcode");
        Intrinsics.checkNotNullParameter(source, "source");
        String str = msBarcode.f51390a;
        String str2 = msBarcode.f51391b;
        MsBarcodeType msBarcodeType = msBarcode.f51392c;
        Intrinsics.checkNotNullParameter(msBarcodeType, "msBarcodeType");
        switch (d.f8509b[msBarcodeType.ordinal()]) {
            case 1:
                gVar = g.UNKNOWN;
                break;
            case 2:
                gVar = g.CONTACT_INFO;
                break;
            case 3:
                gVar = g.EMAIL;
                break;
            case 4:
                gVar = g.ISBN;
                break;
            case 5:
                gVar = g.PHONE;
                break;
            case 6:
                gVar = g.PRODUCT;
                break;
            case 7:
                gVar = g.SMS;
                break;
            case 8:
                gVar = g.TEXT;
                break;
            case 9:
                gVar = g.URL;
                break;
            case 10:
                gVar = g.WIFI;
                break;
            case 11:
                gVar = g.GEO;
                break;
            case 12:
                gVar = g.CALENDAR_EVENT;
                break;
            case 13:
                gVar = g.DRIVER_LICENSE;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new xq2.a(str, str2, gVar, source);
    }

    public static bh0.a b(xq2.e barcodeFormat) {
        Intrinsics.checkNotNullParameter(barcodeFormat, "barcodeFormat");
        switch (d.f8508a[barcodeFormat.ordinal()]) {
            case 1:
                return bh0.a.UNKNOWN;
            case 2:
                return bh0.a.ALL_FORMATS;
            case 3:
                return bh0.a.CODE_128;
            case 4:
                return bh0.a.CODE_39;
            case 5:
                return bh0.a.CODE_93;
            case 6:
                return bh0.a.CODABAR;
            case 7:
                return bh0.a.DATA_MATRIX;
            case 8:
                return bh0.a.EAN_13;
            case 9:
                return bh0.a.EAN_8;
            case 10:
                return bh0.a.ITF;
            case 11:
                return bh0.a.QR_CODE;
            case 12:
                return bh0.a.UPC_A;
            case 13:
                return bh0.a.UPC_E;
            case 14:
                return bh0.a.PDF417;
            case 15:
                return bh0.a.AZTEC;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static MsBarcodeDetectorSettings c(xq2.d barcodeDetectorSettings) {
        Intrinsics.checkNotNullParameter(barcodeDetectorSettings, "barcodeDetectorSettings");
        bh0.a aVarB = b(barcodeDetectorSettings.f308057a);
        List list = barcodeDetectorSettings.f308058b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(b((xq2.e) it8.next()));
        }
        return new MsBarcodeDetectorSettings(aVarB, arrayList);
    }
}
