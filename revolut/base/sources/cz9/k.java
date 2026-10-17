package cz9;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.send_from_clipboard.api.R$string;
import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardPaymentOption;
import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = 0;
        if (!(domainState instanceof e)) {
            if (!(domainState instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            d domainState2 = (d) domainState;
            Intrinsics.checkNotNullParameter(domainState2, "domainState");
            List list = domainState2.f110166a.f79688a;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                SendFromClipboardType sendFromClipboardType = (SendFromClipboardType) obj2;
                arrayList.add(new RowDelegate.Model(a0.d.n("ITEM_RECOGNIZED_KEY_ID-", i), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(sendFromClipboardType.getIcon(), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), sendFromClipboardType.getTitle(), null, 0, null, null, null, 0, null, true, null, false, null, null, null, null, null, null, new fz9.a(sendFromClipboardType), null, 0, 0, 0, 0, 532674552));
                i = i2;
            }
            lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.payments_clipboard_bottom_sheet_multiple_aliases, null, null, 14), null, null, null, false, 30);
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            return new h(arrayList, aVar);
        }
        e domainState3 = (e) domainState;
        Intrinsics.checkNotNullParameter(domainState3, "domainState");
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.payments_clipboard_bottom_sheet_subtitle, null, null, 14), null, null, null, false, 30);
        List list2 = domainState3.f110167a.f79691a;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (Object obj3 : list2) {
            int i3 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            SendFromClipboardPaymentOption sendFromClipboardPaymentOption = (SendFromClipboardPaymentOption) obj3;
            String strN = a0.d.n("ITEM_RECOGNIZED_KEY_ID-", i);
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int i5 = sendFromClipboardPaymentOption.f79690c;
            List list3 = sendFromClipboardPaymentOption.f79688a;
            arrayList2.add(new RowDelegate.Model(strN, new RowDelegate.Model.MainImage.Image40(companion.i(i5, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), sendFromClipboardPaymentOption.f79689b, null, 0, null, null, null, 0, null, true, null, false, null, null, null, null, null, null, list3.size() > 1 ? new fz9.b(sendFromClipboardPaymentOption) : new fz9.a((SendFromClipboardType) d0.b0(list3)), null, 0, 0, 0, 0, 532674552));
            i = i3;
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return new h(arrayList2, aVar2);
    }
}
