package hc2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.qvik.impl.ui.pay.QvikPayFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class t implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QvikPayFlowContract$InputData f150831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f150832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f150833c;
    public final e4m.e d;
    public final e4m.e e;

    public t(m mVar, QvikPayFlowContract$InputData qvikPayFlowContract$InputData) {
        this.f150832b = mVar;
        this.f150831a = qvikPayFlowContract$InputData;
        int i = 20;
        this.f150833c = e4m.b.b(new h08.e(mVar, this, 1, i));
        this.d = e4m.b.b(new h08.e(mVar, this, 0, i));
        this.e = e4m.b.b(new h08.e(mVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
