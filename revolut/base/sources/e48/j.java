package e48;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.joint.impl.ui.close_flow.close_prompt.JointClosePromptScreenContract$InputData;
import dw3.v7;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JointClosePromptScreenContract$InputData f122446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f122447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f122448c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f122449g;

    public j(g gVar, h hVar, JointClosePromptScreenContract$InputData jointClosePromptScreenContract$InputData) {
        this.f122447b = gVar;
        this.f122446a = jointClosePromptScreenContract$InputData;
        this.f122448c = e4m.b.b(new v7(gVar, this, 2, 16));
        this.d = e4m.b.b(new v7(gVar, this, 1, 16));
        this.e = e4m.b.b(new v7(gVar, this, 0, 16));
        this.f = e4m.b.b(new v7(gVar, this, 3, 16));
        this.f122449g = e4m.b.b(new v7(gVar, this, 4, 16));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
