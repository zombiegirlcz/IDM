package wf6;

import com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionId;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements ke6.b0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f296988a;

    public h0(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f296988a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "one-off-topup-institution-auth");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        HashMap map = cVar.d;
        return new q06.i(new q06.a(new MainScreenContainerActionData(new MainScreenContainerActionId("EXTERNAL_ACCOUNT_TOPUP"), new ExternalAccountTopupPayload.OneOffPayload((String) map.get("institutionId"), (String) map.get("branchId"), Intrinsics.f(map.get("success"), "true") ? com.revolut.feature.external_accounts.models.a.SUCCESS : com.revolut.feature.external_accounts.models.a.FAILURE))));
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        pfm.z zVarD = new pfm.h(new v3e.t(this, deeplink, 21), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
