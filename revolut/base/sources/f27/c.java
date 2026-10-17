package f27;

import android.os.Parcelable;
import aw0.e;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import ft6.i;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f131443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f131444b;

    public c(i freelancerLegalMapper, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(freelancerLegalMapper, "freelancerLegalMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f131443a = freelancerLegalMapper;
        this.f131444b = uiKitResources;
    }

    public static dii.a a(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3) {
        lw0.a aVar = new lw0.a(textLocalisedClause, textLocalisedClause2, null, null, false, 28);
        e eVar = new e(false, null, null, new n6(textLocalisedClause3, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Freelancer;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24);
    }
}
