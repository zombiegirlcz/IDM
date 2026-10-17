package cc4;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.form.FormFlowContract$InputData;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import ra0.h;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends t implements a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FormFlowContract$InputData f22935p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jx3.a f22936q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f22937r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f22938s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FormFlowContract$InputData inputData, jx3.a interactor, h backendFormRepository, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(backendFormRepository, "backendFormRepository");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f22935p = inputData;
        this.f22936q = interactor;
        this.f22937r = backendFormRepository;
        this.f22938s = d8l.d.a(this, new c9f.c(this, 8));
    }

    @Override // yki.j
    public final void M0() {
        l2(new b(this, null, 0), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f22938s;
    }
}
