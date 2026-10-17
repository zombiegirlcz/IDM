package qng;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.address.models.Address;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uh1.a f247947a;

    public m(uh1.a addressPrinter) {
        Intrinsics.checkNotNullParameter(addressPrinter, "addressPrinter");
        this.f247947a = addressPrinter;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem addressSuggestionItem;
        RowDelegate.Model.c.a aVar;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f247941a;
        WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem addressSuggestionItem2 = domainState.f247942b;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem addressSuggestionItem3 = (WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem) obj2;
            Address address = addressSuggestionItem3.f105518a;
            TextClause textClause = new TextClause(((yi1.a) this.f247947a).b(address, address.getFormat()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            boolean zEquals = addressSuggestionItem3.equals(addressSuggestionItem2);
            TextClause textClause2 = new TextClause(addressSuggestionItem3.f105519b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = addressSuggestionItem3.f105520c;
            String strN = a0.d.n("address_suggestion_", i);
            vd0 vd0Var = vd0.RADIO;
            String strN2 = a0.d.n("address_suggestion_", i);
            if (str != null) {
                addressSuggestionItem = addressSuggestionItem2;
                aVar = new RowDelegate.Model.c.a(new TagViewData(null, new TextClause(str, (Style) null, Integer.valueOf(R$attr.uikit_colorWhite), false, (o9) null, (List) null, 122), new TagViewData.TagBackground.Solid(new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorWhite), 0.2f)), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorTransparent), false, null, null, null, 0, null, 2024), null, false, 6);
            } else {
                addressSuggestionItem = addressSuggestionItem2;
                aVar = null;
            }
            arrayList.add(new SelectableDelegate.Model(strN, new RowDelegate.Model(strN2, null, textClause2, null, 0, textClause, null, null, 0, aVar, false, null, false, null, null, null, null, null, null, addressSuggestionItem3, null, 0, 0, 0, 0, 532675546), zEquals ? qd0.SELECTED : qd0.UNSELECTED, null, vd0Var, null, false, zEquals, null, addressSuggestionItem3, null, null, null, null, null, null, 0, 0, 0, 0, 4193128));
            addressSuggestionItem2 = addressSuggestionItem;
            i = i2;
        }
        WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem addressSuggestionItem4 = addressSuggestionItem2;
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new j(arrayList, addressSuggestionItem4 != null);
    }
}
