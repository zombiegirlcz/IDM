package saj;

import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.crypto.newlyadded.api.R$string;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f261429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f261430b;

    public g(h hVar, String str) {
        this.f261429a = hVar;
        this.f261430b = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        BigDecimal bigDecimal;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.isEmpty()) {
            return h.i(this.f261429a, this.f261430b);
        }
        List list = content;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            CompositeClause compositeClauseB = null;
            if (!it8.hasNext()) {
                return new ContactsWidgetDelegate.Model(this.f261430b, arrayList, new TextLocalisedClause(R$string.crypto_home_widget_newly_added_title, null, null, 14), true, null, null, 48);
            }
            haj.a aVar = (haj.a) it8.next();
            xi0.b bVar = aVar.f150521a;
            xi0.b bVar2 = aVar.f150521a;
            String strQ = j6.a.q("LIST_ITEM_ID_", bVar.f306286a);
            CurrencyImage currencyImage = new CurrencyImage(bVar2.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
            CurrencyClause currencyClause = new CurrencyClause(bVar2, CurrencyClause.Format.Ticker.f57756a, null, 4);
            vel.a aVar2 = aVar.f150523c;
            if (aVar2 != null && (bigDecimal = aVar2.f288346c) != null) {
                compositeClauseB = xqi.a.b(bigDecimal, false, 7);
            }
            arrayList.add(new ReferralContactDelegate.Model(strQ, currencyImage, currencyClause, compositeClauseB, null, null, null, null, null, aVar, null, 393200));
        }
    }
}
