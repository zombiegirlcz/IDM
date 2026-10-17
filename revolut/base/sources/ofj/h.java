package ofj;

import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import com.revolut.retail.feature.esim.api.model.EsimIcon;
import com.revolut.retail.feature.esim.api.model.EsimInfoBottomSheetData;
import kfj.f0;
import kfj.h0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class h {
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.retail.feature.esim.api.model.EsimInfoBottomSheetData.Content a(kfj.g0.Companion r13, java.util.List r14, kfj.e0 r15) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ofj.h.a(kfj.g0$a, java.util.List, kfj.e0):com.revolut.retail.feature.esim.api.model.EsimInfoBottomSheetData$Content");
    }

    public static final h0 b(EsimInfoBottomSheetData.Item item) {
        Intrinsics.checkNotNullParameter(item, "<this>");
        EsimIcon esimIcon = item.f100289a;
        f0 f0VarC = esimIcon != null ? g.c(esimIcon) : null;
        String str = item.f100290b;
        EsimHyperText esimHyperText = item.f100291c;
        return new h0(f0VarC, str, esimHyperText != null ? f.a(esimHyperText) : null);
    }
}
