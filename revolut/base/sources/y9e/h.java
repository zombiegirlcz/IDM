package y9e;

import aw0.m6;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        Integer numValueOf;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.subscription_edit_frequency_title, null, null, 14), new TextLocalisedClause(R$string.subscription_edit_frequency_subtitle, null, null, 14), null, null, false, 28);
        List<fva.e> list = domainState.f311846c;
        ArrayList arrayList = new ArrayList();
        for (fva.e eVar : list) {
            switch (i.f311849a[eVar.ordinal()]) {
                case 1:
                    numValueOf = Integer.valueOf(R$string.subscriptions_change_frequency_options_weekly);
                    break;
                case 2:
                    numValueOf = Integer.valueOf(R$string.subscriptions_change_frequency_options_every_two_weeks);
                    break;
                case 3:
                    numValueOf = Integer.valueOf(R$string.subscriptions_change_frequency_options_monthly);
                    break;
                case 4:
                    numValueOf = Integer.valueOf(R$string.subscriptions_change_frequency_options_quarterly);
                    break;
                case 5:
                    numValueOf = Integer.valueOf(R$string.subscriptions_change_frequency_options_every_six_months);
                    break;
                case 6:
                    numValueOf = Integer.valueOf(R$string.subscriptions_change_frequency_options_yearly);
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    numValueOf = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            SingleChoiceDelegate.Model model = numValueOf != null ? new SingleChoiceDelegate.Model(eVar.name(), new TextLocalisedClause(numValueOf.intValue(), null, null, 14), eVar == domainState.f311845b, null, eVar, 1992) : null;
            if (model != null) {
                arrayList.add(model);
            }
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.subscription_edit_frequency_confirm_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "CONFIRM_FREQUENCY_BUTTON_TAG", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 55), arrayList, aVar);
    }
}
