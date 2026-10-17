package ifk;

import com.revolut.feature.pricingplans.models.cancel.ValueOfferReminderResponse$Content;
import hfk.r;
import hfk.s;
import hfk.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class g {
    public static final ValueOfferReminderResponse$Content.Button a(r rVar) {
        e eVar;
        String type = rVar.getType();
        e[] eVarArrValues = e.values();
        int length = eVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i];
            if (a0.z(eVar.name(), type, true)) {
                break;
            }
            i++;
        }
        if (eVar == null) {
            throw new IllegalArgumentException(j6.a.q("Unknown ValueOfferReminder button type: ", rVar.getType()));
        }
        int i2 = f.f161038a[eVar.ordinal()];
        if (i2 == 1) {
            String deeplink = rVar.getDeeplink();
            if (deeplink != null) {
                return new ValueOfferReminderResponse$Content.Button.Deeplink(deeplink, rVar.getLabel());
            }
            throw new IllegalArgumentException("Deeplink button must have deeplink");
        }
        if (i2 == 2) {
            return new ValueOfferReminderResponse$Content.Button.Continue(rVar.getLabel());
        }
        if (i2 == 3) {
            return new ValueOfferReminderResponse$Content.Button.Cancel(rVar.getLabel());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ValueOfferReminderResponse$Content b(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        String iconAssetName = sVar.getIconAssetName();
        String title = sVar.getTitle();
        String text = sVar.getText();
        t info = sVar.getInfo();
        ValueOfferReminderResponse$Content.Info info2 = info != null ? new ValueOfferReminderResponse$Content.Info(info.getTitle(), info.getSubtitle()) : null;
        ValueOfferReminderResponse$Content.Button buttonA = a(sVar.getPrimaryButton());
        r secondaryButton = sVar.getSecondaryButton();
        return new ValueOfferReminderResponse$Content(iconAssetName, title, text, info2, buttonA, secondaryButton != null ? a(secondaryButton) : null);
    }
}
