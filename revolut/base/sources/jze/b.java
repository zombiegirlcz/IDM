package jze;

import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import d8l.d;
import ji1.m;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;
import yki.j;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements j {
    public final FacadeCardTopupFlowDescriptor$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xoj.a f179798p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y51.a f179799q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f179800r;

    public b(FacadeCardTopupFlowDescriptor$InputData inputData, xoj.a featuresInteractor, y51.a externalCardsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(externalCardsInteractor, "externalCardsInteractor");
        this.o = inputData;
        this.f179798p = featuresInteractor;
        this.f179799q = externalCardsInteractor;
        this.f179800r = d.a(this, new jnf.d(this, 23));
    }

    @Override // yki.j
    public final void M0() {
        l2(new m(this, null, 22), new jud.d(this, 25));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f179800r;
    }
}
