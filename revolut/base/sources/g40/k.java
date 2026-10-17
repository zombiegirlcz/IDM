package g40;

import com.revolut.chat.data.repository.chat.AgentInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AgentInfo f140315b;

    public /* synthetic */ k(AgentInfo agentInfo, int i) {
        this.f140314a = i;
        this.f140315b = agentInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f140314a) {
            case 0:
                AgentInfo agentInfo = this.f140315b;
                Intrinsics.h(agentInfo);
                ((a) obj2).getClass();
                Intrinsics.checkNotNullParameter(agentInfo, "agentInfo");
                return new a(agentInfo);
            default:
                return p40.i.a((p40.i) obj2, this.f140315b, null, null, null, false, 507);
        }
    }
}
