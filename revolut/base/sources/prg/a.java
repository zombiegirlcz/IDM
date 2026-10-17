package prg;

import com.revolut.feature.view.image.core.BaseViewImageContract$InputData;
import hrg.b;
import hrg.c;
import jki.g;
import jki.i;
import kotlin.jvm.internal.Intrinsics;
import pnf.f;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BaseViewImageContract$InputData f239013p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bk0.a f239014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hrg.a f239015r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BaseViewImageContract$InputData inputData, bk0.a authHeadersProvider, c stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(authHeadersProvider, "authHeadersProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f239013p = inputData;
        this.f239014q = authHeadersProvider;
        this.f239015r = new hrg.a(0);
    }

    @Override // yji.l
    public final void I1() {
        BaseViewImageContract$InputData baseViewImageContract$InputData = this.f239013p;
        if (baseViewImageContract$InputData instanceof BaseViewImageContract$InputData.Remote) {
            l2(new f(this, ((BaseViewImageContract$InputData.Remote) baseViewImageContract$InputData).f94813a, null, 9), new yi5.b(26));
        }
    }

    @Override // jki.g
    public final i r2() {
        return this.f239015r;
    }
}
