package wfb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.data.SalarySwitchAssistantService;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.SwitchAssistantFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwitchAssistantFlowContract$InputData f297070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wpc.b f297071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f297072c;
    public final q d = this;
    public final e4m.e e;

    public q(i iVar, SwitchAssistantFlowContract$InputData switchAssistantFlowContract$InputData, wpc.b bVar) {
        this.f297072c = iVar;
        this.f297070a = switchAssistantFlowContract$InputData;
        this.f297071b = bVar;
        this.e = e4m.b.b(new vtc.n(iVar, this, 27));
    }

    public final fkg.a b() {
        return new fkg.a(new fnc.s((SalarySwitchAssistantService) this.f297072c.K.get()));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
