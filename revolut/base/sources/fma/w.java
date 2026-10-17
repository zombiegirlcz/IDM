package fma;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.profile.impl.ui.documents_redesigned.flow.DocumentsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class w implements xki.c, z7a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentsFlowContract$InputData f136230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f136231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f136232c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public w(c0 c0Var, DocumentsFlowContract$InputData documentsFlowContract$InputData) {
        this.f136231b = c0Var;
        this.f136230a = documentsFlowContract$InputData;
        int i = 21;
        this.d = e4m.b.b(new fa0.q(c0Var, this, 0, i));
        this.e = e4m.b.b(new fa0.q(c0Var, this, 1, i));
        this.f = e4m.b.b(new fa0.q(c0Var, this, 2, i));
    }

    @Override // z7a.c
    public final z7a.a c() {
        return new eyd.u(this.f136231b, this.f136232c, 1);
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
