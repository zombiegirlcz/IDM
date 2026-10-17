package qje;

import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlowContract$FlowState;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q87.z;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uje.a f246858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final itb.c f246859b;

    public v(uje.a headerMappingUtils, itb.c headerUiProvider) {
        Intrinsics.checkNotNullParameter(headerMappingUtils, "headerMappingUtils");
        Intrinsics.checkNotNullParameter(headerUiProvider, "headerUiProvider");
        this.f246858a = headerMappingUtils;
        this.f246859b = headerUiProvider;
    }

    public final p a(TabCryptoFlowContract$FlowState tabCryptoFlowContract$FlowState) {
        ArrayList arrayListC = this.f246858a.c(tabCryptoFlowContract$FlowState.f89789a.e.f263437c);
        ake.a aVar = tabCryptoFlowContract$FlowState.f89789a;
        List list = aVar.d;
        o oVar = tabCryptoFlowContract$FlowState.f89790b;
        return new p(((kbb.f) this.f246859b).b(oVar.f246841b), arrayListC, list, aVar.e.f263435a, oVar.f246842c, oVar.d);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TabCryptoFlowContract$FlowState domainState = (TabCryptoFlowContract$FlowState) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (p) iii.c.f(domainState.f89789a.f5802a, new qce.a(this, domainState, 14), new qce.b(this, domainState, 3), new z(this, domainState, 8));
    }
}
