package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.web_id.flow.WebIdFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebIdFlowContract$InputData f325300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f325301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f325302c = this;
    public final e4m.e d;

    public j0(c0 c0Var, WebIdFlowContract$InputData webIdFlowContract$InputData) {
        this.f325301b = c0Var;
        this.f325300a = webIdFlowContract$InputData;
        this.d = e4m.b.b(new r(c0Var, this, 5));
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
