package qth;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$InputData;
import java.util.Set;
import ql7.v1;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SdkFlowContract$InputData f249129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f249130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f249131c;
    public final e4m.e d;
    public final e4m.e e;

    public f(g gVar, SdkFlowContract$InputData sdkFlowContract$InputData) {
        this.f249130b = gVar;
        this.f249129a = sdkFlowContract$InputData;
        int i = 5;
        this.f249131c = e4m.b.b(new v1(gVar, this, 1, i));
        this.d = e4m.b.b(new v1(gVar, this, 0, i));
        this.e = e4m.b.b(new v1(gVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
