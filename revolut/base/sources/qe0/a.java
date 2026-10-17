package qe0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qfm.f1;
import qfm.u;
import qfm.x;
import s7a.m0;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f245013b;

    public /* synthetic */ a(f fVar, int i) {
        this.f245012a = i;
        this.f245013b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f245012a) {
            case 0:
                f fVar = this.f245013b;
                Long l2 = (Long) obj2;
                Intrinsics.h(l2);
                fVar.e = l2.longValue();
                return Unit.f186387a;
            default:
                f fVar2 = this.f245013b;
                e data = (e) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                pfm.h hVar = new pfm.h(new aed.d(fVar2, fVar2.f245024b.invoke(data.b()), data.b(), data.a(), 8), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                Intrinsics.checkNotNullParameter(data, "<this>");
                f1 f1VarI = efm.i.i(data);
                Intrinsics.checkNotNullExpressionValue(f1VarI, "just(...)");
                u uVar = new u(hVar, f1VarI, 2);
                Intrinsics.checkNotNullExpressionValue(uVar, "andThen(...)");
                h0 customKeys = h0.f322473a;
                Intrinsics.checkNotNullParameter(uVar, "<this>");
                Intrinsics.checkNotNullParameter(customKeys, "customKeys");
                Intrinsics.checkNotNullParameter(uVar, "<this>");
                Intrinsics.checkNotNullParameter(customKeys, "customKeys");
                vf0.n nVar = new vf0.n(new m0(14, customKeys), 14);
                dfm.c cVar = mfm.f.d;
                en.a aVar = mfm.f.f205043c;
                x xVar = new x(uVar, cVar, nVar, aVar, aVar);
                Intrinsics.checkNotNullExpressionValue(xVar, "doOnError(...)");
                qfm.n nVar2 = new qfm.n(xVar, new mfm.d(data), 1);
                Intrinsics.checkNotNullExpressionValue(nVar2, "onErrorReturnItem(...)");
                return nVar2;
        }
    }
}
