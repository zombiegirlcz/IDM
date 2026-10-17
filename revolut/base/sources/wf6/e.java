package wf6;

import android.net.Uri;
import com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionData;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionId;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionId;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ke6.h {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f296981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f80.a f296982b;

    public e(sri.m navigator, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f296981a = navigator;
        this.f296982b = uriHelper;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "openbanking") && zhm.v.k("topup", "topup-institution-auth").contains(cVar.e(2));
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        Uri uriF = ((f80.b) this.f296982b).f(cVar.f173627a);
        return new q06.i(new q06.a(new MainScreenContainerActionData(new MainScreenContainerActionId("EXTERNAL_ACCOUNT_TOPUP"), new ExternalAccountTopupPayload.DirectLinkPayload(uriF.getEncodedFragment(), uriF.getEncodedQuery()))));
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Uri uriF = ((f80.b) this.f296982b).f(deeplink.f173627a);
        pfm.z zVarD = new pfm.h(new v3e.t(this, new FeatureCommand(new MainScreenFeatureConfig.WithAction(s49.a.SINGLE_TOP, new MainContainerActionData(new MainContainerActionId("EXTERNAL_ACCOUNT_TOPUP"), new ExternalAccountTopupPayload.DirectLinkPayload(uriF.getEncodedFragment(), uriF.getEncodedQuery())))), 17), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
