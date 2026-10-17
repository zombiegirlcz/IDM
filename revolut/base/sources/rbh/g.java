package rbh;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f253070b;

    public /* synthetic */ g(m mVar, int i) {
        this.f253069a = i;
        this.f253070b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f253069a) {
            case 0:
                m1h.h config = (m1h.h) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                m mVar = this.f253070b;
                return mVar.f253077m.c(mVar.o.f253066a.getF95657a(), config.f201497b);
            case 1:
                g1j.b outputData = (g1j.b) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData == null) {
                    throw new NoWhenBranchMatchedException();
                }
                j1j.d dVar = outputData.f139686a;
                m mVar2 = this.f253070b;
                a2 a2Var = mVar2.f253082s;
                Continuation continuation = null;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                mVar2.f253082s = yji.n.l2(mVar2, rd0.e.n(mVar2.f253077m.a(dVar), h0.f322473a), null, new h(mVar2, continuation, 0), 3);
                return Unit.f186387a;
            default:
                pch.d parcel = (pch.d) obj2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                this.f253070b.d3(new raf.o(parcel, 4));
                return Unit.f186387a;
        }
    }
}
