package p2i;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_exchange.impl.R$string;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.y;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements e {

    @NotNull
    public static final s Companion = new s();

    public final y a(f2i.g selectedPeriod) {
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        f2i.g[] gVarArrValues = f2i.g.values();
        ArrayList arrayList = new ArrayList(gVarArrValues.length);
        int length = gVarArrValues.length;
        for (int i = 0; i < length; i++) {
            f2i.g gVar = gVarArrValues[i];
            arrayList.add(new SingleChoiceDelegate.Model(a0.d.h(gVar.b(), "_FREQUENCY_PICKER_ITEM_ID"), new TextLocalisedClause(gVar.b(), null, null, 14), gVar == selectedPeriod, null, gVar, YearClass.CLASS_2008));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new y(arrayList, new rp0.t(new TextLocalisedClause(R$string.fx_orders_recurring_frequency, null, null, 14), null, null, 30), rp0.l.WINDOW, null, "FREQUENCY_DIALOG_TAG", null, 984);
    }
}
