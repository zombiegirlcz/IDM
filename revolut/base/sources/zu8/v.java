package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.idnow.video_ident.flow.IdnowVideoIdentFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdnowVideoIdentFlowContract$InputData f325404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f325405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f325406c = this;
    public final e4m.e d;

    public v(c0 c0Var, IdnowVideoIdentFlowContract$InputData idnowVideoIdentFlowContract$InputData) {
        this.f325405b = c0Var;
        this.f325404a = idnowVideoIdentFlowContract$InputData;
        this.d = e4m.b.b(new r(c0Var, this, 1));
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
