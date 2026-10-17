package h30;

import com.google.common.collect.ImmutableSet;
import com.revolut.chat.ui.agentinfo.AgentInfoContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AgentInfoContract$InputData f148897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f148898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f148899c;

    public i(n nVar, o oVar, AgentInfoContract$InputData agentInfoContract$InputData) {
        this.f148897a = agentInfoContract$InputData;
        int i = 6;
        this.f148898b = e4m.b.b(new h08.e(nVar, this, 1, i));
        this.f148899c = e4m.b.b(new h08.e(nVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
