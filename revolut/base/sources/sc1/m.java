package sc1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import zhm.a0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements p {
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayList = new ArrayList();
        List list = domainState.f261605a;
        boolean z = domainState.f261606b;
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            CardReaderDevice cardReaderDevice = (CardReaderDevice) obj2;
            arrayList2.add(new RowDelegate.Model(a0.d.n("device_", i), LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_card_reader, Integer.valueOf(R$attr.uikit_colorDeepGrey), R$attr.uikit_colorDeepGrey_10, 10.0f, null, null, 48), null, null, new TextClause(f0.O0(3, cardReaderDevice.getName()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, 0, new RowDelegate.Model.c.b(new TextClause(f0.V0(3, cardReaderDevice.getName()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 126), false, false, null, null, null, null, null, cardReaderDevice, null, 0, 0, 0, 0, 1056962540));
            i = i2;
        }
        a0.x(arrayList2, arrayList);
        if (z) {
            arrayList.add(new pb0("scanning"));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new h(arrayList, z, u.a(u.b()));
    }
}
