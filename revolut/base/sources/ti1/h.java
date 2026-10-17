package ti1;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.address.common.api.R$string;
import com.revolut.feature.address.common.impl.flow.validation_flow.suggestion.SuggestionSheetContract$InputData;
import com.revolut.feature.address.models.Address;
import ip0.qd0;
import ip0.vd0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuggestionSheetContract$InputData f271404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uh1.a f271405b;

    public h(SuggestionSheetContract$InputData inputData, uh1.a addressPrinter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(addressPrinter, "addressPrinter");
        this.f271404a = inputData;
        this.f271405b = addressPrinter;
    }

    public final SelectableDelegate.Model a(a aVar, int i, boolean z, Address address) {
        String strB = ((yi1.a) this.f271405b).b(address, address.getFormat());
        return new SelectableDelegate.Model(aVar.b(), new RowDelegate.Model(aVar.b(), null, new TextLocalisedClause(i, null, null, 14), null, 0, new TextClause(strB, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, address, null, 0, 0, 0, 0, 532676570), z ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.RADIO, null, false, z, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 4194152);
    }

    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        SuggestionSheetContract$InputData suggestionSheetContract$InputData = this.f271404a;
        TextLocalisedClause textLocalisedClause = suggestionSheetContract$InputData.f61037c ? new TextLocalisedClause(R$string.address_verification_suggested_address_verified_subtitle, null, null, 14) : new TextLocalisedClause(R$string.address_verification_suggested_address_subtitle, null, null, 14);
        a aVar = a.ORIGINAL;
        SelectableDelegate.Model modelA = a(aVar, R$string.address_verification_suggested_address_original, domainState.f271398a == aVar, suggestionSheetContract$InputData.f61035a);
        a aVar2 = a.SUGGESTED;
        List listK = v.k(modelA, a(aVar2, R$string.address_verification_suggested_address_suggested, domainState.f271398a == aVar2, suggestionSheetContract$InputData.f61036b));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.address_verification_suggested_address_confirm_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), listK, new lw0.a(new TextLocalisedClause(R$string.address_verification_suggested_address_title, null, null, 14), textLocalisedClause, null, null, false, 28));
    }
}
