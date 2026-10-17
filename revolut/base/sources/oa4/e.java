package oa4;

import com.revolut.feature.credit.application.plugins.impl.ui.drop_out_form.DropOutFormFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import nt4.f;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends h implements b {
    public final DropOutFormFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ow3.e f223519p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ra0.h f223520q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f223521r;

    public e(DropOutFormFlowContract$InputData inputData, ow3.e cancellationInteractor, ra0.h backendFormRepository) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cancellationInteractor, "cancellationInteractor");
        Intrinsics.checkNotNullParameter(backendFormRepository, "backendFormRepository");
        this.o = inputData;
        this.f223519p = cancellationInteractor;
        this.f223520q = backendFormRepository;
        this.f223521r = d8l.d.a(this, new c(this, 0));
    }

    @Override // yki.j
    public final void M0() {
        l2(new f(this, null, 15), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f223521r;
    }
}
