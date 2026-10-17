package q6d;

import com.revolut.core.ui_kit.delegates.kj;
import com.revolut.core.ui_kit.delegates.mj;
import com.revolut.feature.shared.branding.api.PaymentLinkPreviewScreenProvider$InputData;
import com.youTransactor.uCube.rpc.Constants;
import ip0.cp0;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements p {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentLinkPreviewScreenProvider$InputData f242566a;

    public f(PaymentLinkPreviewScreenProvider$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f242566a = inputData;
    }

    @Override // jki.p
    public final m a(i iVar) {
        b domainState = (b) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new c(u.c(new kj("ITEM_ID_WEB_VIEW", new mj(domainState.f242562a, null), new cp0(true, domainState.f242563b, this.f242566a.d, null, 76), Constants.TAG_FULL_SVPP_IDENTIFICATION)));
    }
}
