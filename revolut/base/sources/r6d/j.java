package r6d;

import com.revolut.core.ui_kit.delegates.kj;
import com.revolut.core.ui_kit.delegates.mj;
import com.youTransactor.uCube.rpc.Constants;
import ip0.cp0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f251673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f251674b;

    public j(k kVar, d dVar) {
        this.f251673a = kVar;
        this.f251674b = dVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = ((e) obj2).f251666a;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-shared-branding-impl-ui-preview_auto-PaymentLinkAutoPreviewScreenContract-PreviewUrl$-previewUrl$0");
        return u.c(new kj("LIST_ID_WEB_VIEW", new mj(str, null), new cp0(true, j6.a.q("Revolut/", this.f251673a.f251675a.a()), this.f251674b.f251664a, null, 76), Constants.TAG_FULL_SVPP_IDENTIFICATION));
    }
}
