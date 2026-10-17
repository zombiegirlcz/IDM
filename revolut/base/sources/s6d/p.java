package s6d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.branding.api.InvalidImageException;
import com.revolut.feature.shared.branding.impl.R$string;
import com.revolut.feature.shared.branding.impl.ui.settings.BrandingSettingsScreenContract$Parcel$RestoreSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.f1;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shared.branding.impl.ui.settings.a f260250b;

    public /* synthetic */ p(com.revolut.feature.shared.branding.impl.ui.settings.a aVar, int i) {
        this.f260249a = i;
        this.f260250b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f260249a) {
            case 0:
                eii.k output = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if ((output instanceof eii.i) && (((eii.i) output).f126655a instanceof BrandingSettingsScreenContract$Parcel$RestoreSettings)) {
                    com.revolut.feature.shared.branding.impl.ui.settings.a aVar = this.f260250b;
                    aVar.H2(aVar.f86085y, new p(aVar, 1));
                    aVar.X1(new mii.k("SUCCEED_DIALOG_ID", new TextLocalisedClause(R$string.merchant_profile_branding_reset_action_suceed_title, null, null, 14), null, null, f1.ABOVE_ANCHOR_VIEW, 12));
                }
                return Unit.f186387a;
            case 1:
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return j.a(update, Data.copy$default(update.f260240a, new k6d.h(k6d.a.LIGHT, (String) d0.b0(this.f260250b.f86084x), k6d.b.BASIER_CIRCLE, true, true, true, true, null, null), null, false, 6, null), false, null, null, null, null, 121);
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                boolean z = it8 instanceof InvalidImageException;
                if (z) {
                    this.f260250b.K2();
                }
                return Boolean.valueOf(z);
        }
    }
}
