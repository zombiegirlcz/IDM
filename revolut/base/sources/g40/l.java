package g40;

import com.revolut.chat.ui.agentinfo.AgentInfoContract$InputData;
import fo1.b0;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import n30.n;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends jki.g implements b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f140316p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nf3.a f140317q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f140318r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AgentInfoContract$InputData inputData, p stateMapper, n chatInteractor, nf3.a chatAssistantResourcesConfig) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        Intrinsics.checkNotNullParameter(chatAssistantResourcesConfig, "chatAssistantResourcesConfig");
        this.f140316p = chatInteractor;
        this.f140317q = chatAssistantResourcesConfig;
        this.f140318r = new a(inputData.f51113a);
    }

    @Override // yji.l
    public final void I1() {
        l2(new b0(this, null, 14), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f140318r;
    }
}
