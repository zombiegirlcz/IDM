package k9a;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pix.api.model.PixQrCodeAdditionalInformation;
import ip0.t5;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f182301a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            PixQrCodeAdditionalInformation pixQrCodeAdditionalInformation = (PixQrCodeAdditionalInformation) obj2;
            String strN = a0.d.n("PAYMENT_INFO_ITEM_ID_", i);
            String str = pixQrCodeAdditionalInformation.f80420a;
            TextClause textClause = new TextClause(str == null ? "" : str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str2 = pixQrCodeAdditionalInformation.f80421b;
            TextClause textClause2 = new TextClause(str2 == null ? "" : str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str3 = pixQrCodeAdditionalInformation.f80421b;
            int i3 = R$attr.uikit_dp12;
            int i5 = R$attr.uikit_dp16;
            arrayList.add(new t5(strN, textClause2, textClause, str3, null, null, i3, i3, i5, i5, 104));
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new e(arrayList);
    }
}
