package l0c;

import cli.y;
import com.revolut.core.model.FileExtension;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.impl.ui.terms_review.screen.RevPointsReadTermsControllerContract$InputData;
import klf.a3;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kye.m0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends oki.h implements k {
    public final RevPointsReadTermsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pre.c f191226p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hk0.a f191227q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tqi.g f191228r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f191229s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f191230t;

    public u(RevPointsReadTermsControllerContract$InputData inputData, x mapper, pre.c termsInteractor, hk0.a networkFileRepository, tqi.g shareNaviCommandFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        this.o = inputData;
        this.f191226p = termsInteractor;
        this.f191227q = networkFileRepository;
        this.f191228r = shareNaviCommandFactory;
        this.f191229s = new vii.b();
        this.f191230t = mra.d.b(this, new j(null, new Data(null, null, true, 3, null), false), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f191229s, new a3(continuation, this, 15)), null, null, new krc.h(this, continuation, 26), 3);
    }

    public final vkm.d I2(String str, FileExtension fileExtension, Function1 function1) {
        efm.r map = this.f191227q.b(str, true, fileExtension).x().map(new kxj.e(new js7.c(6, function1), 11));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarStartWith = ue0.e.H(map, h0.f322473a, new m0(24)).startWith(new Data(null, null, true, 3, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rd0.e.b(rVarStartWith);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f191230t;
    }
}
