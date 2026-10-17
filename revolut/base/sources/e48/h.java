package e48;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.joint.impl.ui.close_flow.JointCloseFlowContract$InputData;
import dw3.v7;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JointCloseFlowContract$InputData f122441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f122442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f122443c = this;
    public final e4m.e d;
    public final e4m.e e;

    public h(g gVar, JointCloseFlowContract$InputData jointCloseFlowContract$InputData) {
        this.f122442b = gVar;
        this.f122441a = jointCloseFlowContract$InputData;
        this.d = e4m.b.b(new v7(gVar, this, 0, 15));
        this.e = e4m.b.b(new v7(gVar, this, 1, 15));
    }

    @Override // xki.e
    public final Set f() {
        p48.k extension = (p48.k) this.d.get();
        s48.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        vc.s.k(extension);
        return ImmutableSet.of(extension);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
