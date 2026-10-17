package b4d;

import java.util.List;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class g {
    private g() {
    }

    public static final String a(g gVar, mgd.g gVar2) {
        String strK0;
        String strK02;
        String strK03;
        gVar.getClass();
        StringBuilder sb6 = new StringBuilder("assetTypeKeys=");
        sb6.append(d0.k0(gVar2.c(), ",", null, null, 0, new b0a.j(25), 30));
        sb6.append("|alertStates=");
        sb6.append(d0.k0(gVar2.a(), ",", null, null, 0, new b0a.j(26), 30));
        sb6.append("|baseAssetIds=");
        List listD = gVar2.d();
        String str = "null";
        if (listD == null || (strK0 = d0.k0(listD, ",", null, null, 0, null, 62)) == null) {
            strK0 = "null";
        }
        sb6.append(strK0);
        sb6.append("|targetPriceQuotesAssetIds=");
        List listG = gVar2.g();
        if (listG == null || (strK02 = d0.k0(listG, ",", null, null, 0, null, 62)) == null) {
            strK02 = "null";
        }
        sb6.append(strK02);
        sb6.append("|limit=");
        sb6.append(gVar2.e());
        sb6.append("|offset=");
        sb6.append(gVar2.f());
        sb6.append("|usePreviewDataset=");
        sb6.append(gVar2.h());
        sb6.append("|alertTypes=");
        List listB = gVar2.b();
        if (listB != null && (strK03 = d0.k0(listB, ",", null, null, 0, new b0a.j(27), 30)) != null) {
            str = strK03;
        }
        sb6.append(str);
        return sb6.toString();
    }
}
