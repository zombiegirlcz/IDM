package nk2;

import aw0.n6;
import c93.p;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.atm.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static n6 a(boolean z) {
        return new n6(new TextLocalisedClause(R$string.atm_dialog_monthly_limit_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "MONTHLY_LIMIT_BUTTON_TAG", z, null, null, 972);
    }

    public static cii.b b(f fVar, boolean z) {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.atm_dialog_daily_limit_title, null, null, 14), new TextLocalisedClause(R$string.atm_dialog_daily_limit_subtitle, null, null, 14), null, null, false, 28);
        List listK = v.k(new RowDelegate.Model("LIMIT_ITEM_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_limit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.atm_dialog_daily_limit_limit_title, u.c(new MoneyClause(fVar.f216633b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, 0, !z ? new TextLocalisedClause(R$string.atm_dialog_daily_limit_limit_cannot_increase, null, null, 14) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("INFO_ITEM_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.atm_dialog_daily_limit_applies_to_accounts, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(z ? new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.atm_dialog_daily_limit_update_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "UPDATE_DAILY_LIMIT_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 55) : null, listK, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static cii.b d(nk2.f r38, c93.p r39) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nk2.i.d(nk2.f, c93.p):cii.b");
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        final f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = j.f216639a[domainState.f216632a.ordinal()];
        if (i == 1) {
            final int i2 = 0;
            final int i3 = 0;
            return (cii.b) iii.c.f(domainState.d, new njf.d(13), new Function2(this) { // from class: nk2.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Function1 function1 = (Function1) obj3;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(function1, "<unused var>");
                            return i.b(domainState, false);
                        default:
                            Intrinsics.checkNotNullParameter(function1, "<unused var>");
                            return i.d(domainState, null);
                    }
                }
            }, new Function3(this) { // from class: nk2.h
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    switch (i3) {
                        case 0:
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            ((Boolean) obj3).getClass();
                            return i.b(domainState, zBooleanValue);
                        default:
                            p eligibility = (p) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                            return i.d(domainState, eligibility);
                    }
                }
            });
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Data data = domainState.f216634c;
        if (data == null) {
            return d(domainState, null);
        }
        final int i5 = 1;
        final int i6 = 1;
        return (cii.b) iii.c.f(data, new njf.d(14), new Function2(this) { // from class: nk2.g
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Function1 function1 = (Function1) obj3;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(function1, "<unused var>");
                        return i.b(domainState, false);
                    default:
                        Intrinsics.checkNotNullParameter(function1, "<unused var>");
                        return i.d(domainState, null);
                }
            }
        }, new Function3(this) { // from class: nk2.h
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                switch (i6) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        ((Boolean) obj3).getClass();
                        return i.b(domainState, zBooleanValue);
                    default:
                        p eligibility = (p) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                        return i.d(domainState, eligibility);
                }
            }
        });
    }
}
