package ccf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.trading_add_ons.impl.R$string;
import ip0.jh0;
import ip0.lh0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import rp0.y;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final acf.c f23067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final acf.c f23068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final acf.a f23069c;
    public final acf.k d;

    public a(acf.c featureItemMapper, acf.c featureItemMapperRevamp, acf.a errorStateMapper, acf.k loadingStateMapper) {
        Intrinsics.checkNotNullParameter(featureItemMapper, "featureItemMapper");
        Intrinsics.checkNotNullParameter(featureItemMapperRevamp, "featureItemMapperRevamp");
        Intrinsics.checkNotNullParameter(errorStateMapper, "errorStateMapper");
        Intrinsics.checkNotNullParameter(loadingStateMapper, "loadingStateMapper");
        this.f23067a = featureItemMapper;
        this.f23068b = featureItemMapperRevamp;
        this.f23069c = errorStateMapper;
        this.d = loadingStateMapper;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        do3.n nVar;
        List<qbf.i> availableDowngradeReasons;
        q domainState = (q) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.d;
        Data data2 = domainState.f23081b;
        Data data3 = domainState.f23080a;
        if (data.getContent() == null && data.getLoading()) {
            return c();
        }
        if (data3.getContent() == null && data3.getLoading()) {
            return c();
        }
        if (data2.getContent() == null && data2.getLoading()) {
            return c();
        }
        lbf.p pVar = (lbf.p) data3.getContent();
        if (pVar != null && (nVar = (do3.n) data2.getContent()) != null) {
            qbf.j jVar = (qbf.j) data.getContent();
            if (jVar == null || (availableDowngradeReasons = jVar.getAvailableDowngradeReasons()) == null) {
                return b();
            }
            qbf.i iVar2 = domainState.f23082c;
            Data data4 = domainState.f;
            List list = data4 != null ? (List) iii.c.f(data4, new c8i.c(27), new c2f.m(29), new a4b.i(domainState.f23083g, this, pVar.f193684a, 2)) : null;
            if (list == null) {
                list = f0.f322471a;
            }
            List list2 = list;
            String str = nVar.f116410c;
            TextClause textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            ArrayList arrayList = new ArrayList();
            for (qbf.i iVar3 : availableDowngradeReasons) {
                String strName = iVar3.name();
                Integer num = (Integer) b.f23070a.get(iVar3);
                SuggestionsBarDelegate.Suggestion suggestion = num != null ? new SuggestionsBarDelegate.Suggestion(strName, new TextLocalisedClause(num.intValue(), null, null, 14), null, iVar2 == iVar3 ? lh0.ACCENT : lh0.GREY, null, false, iVar3, null, 372) : null;
                if (suggestion != null) {
                    arrayList.add(suggestion);
                }
            }
            List listK = zhm.v.k(new nh("ADD_ONS_SUGGESTION_BOX_ID", arrayList, null, jh0.FLEXBOX, 0, 0, 0, 0, 0, 32756), new InputTextDelegate.Model("ADD_ONS_SUGGESTION_INPUT_ID", null, null, new TextLocalisedClause(R$string.price_plan_add_ons_add_on_leaving_edit_text, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -10, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH), new LargeActionButtonDelegate.Model("ADD_ONS_SUGGESTION_SEND_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.price_plan_add_ons_add_on_leaving_button, null, null, 14), true, null, null, null, null, 968));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            return new o(list2, textClause, new y(listK, new rp0.t(new TextLocalisedClause(R$string.price_plan_add_ons_add_on_leaving_title, null, null, 14), null, null, 30), null, null, null, null, 1020), new l(new TextLocalisedClause(R$string.price_plan_add_ons_add_on_goodbye_button_confirm_unsubscribe, null, null, 14)), new l(new TextLocalisedClause(R$string.price_plan_add_ons_add_on_goodbye_button_cancel_unsubscribe, null, null, 14)));
        }
        return b();
    }

    public final o b() {
        List listA = ((acf.b) this.f23069c).a();
        yp0.b.k(listA, 0, 0, 0, 0, 31);
        return new o(listA, null, null, null, null);
    }

    public final o c() {
        this.d.getClass();
        List listK = zhm.v.k(new pb0("1"), new pb0("2"), new pb0("3"));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        m mVar = m.f23076a;
        return new o(listK, null, null, mVar, mVar);
    }
}
