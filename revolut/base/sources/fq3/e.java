package fq3;

import a08.g0;
import a08.o0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.credit.application.close.provider.CancellationDialogProvider$CancellationConfirmationOption;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import ff4.z;
import fo1.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rfm.f0;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f137175b;

    public /* synthetic */ e(j jVar, int i) {
        this.f137174a = i;
        this.f137175b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f137174a) {
            case 0:
                this.f137175b.i.c(com.revolut.retail.core.navigation.a.c(new FinishCommand(-1, null, null, 6), (NaviCommand) obj2));
                return Unit.f186387a;
            case 1:
                CancellationDialogProvider$CancellationConfirmationOption it8 = (CancellationDialogProvider$CancellationConfirmationOption) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                j jVar = this.f137175b;
                ifm.b bVar = jVar.f239031a;
                Continuation continuation = null;
                if (it8 instanceof CancellationDialogProvider$CancellationConfirmationOption.ConfirmCancellation) {
                    f0 f0VarF = ((opi.b) jVar.k).O().e(ue0.e.v(pd.b.n(p0.f264003c, new z(jVar, continuation, 26)))).f(w.o0(kotlin.coroutines.g.f186406a, new b0(jVar, continuation, 3)));
                    Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
                    e eVar = new e(jVar, 0);
                    Function1 function1K = jVar.K();
                    ufm.i iVar = new ufm.i(f0VarF, new o0(15, new fa9.c(new BreadcrumbException(), 5)), 2);
                    Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                    ofm.i iVar2 = new ofm.i(new g0(17, eVar), new g0(17, function1K), 0);
                    iVar.q(iVar2);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
                    w.j0(bVar, iVar2);
                } else if (it8 instanceof CancellationDialogProvider$CancellationConfirmationOption.RejectCancellation) {
                    jVar.O();
                } else if (!(it8 instanceof CancellationDialogProvider$CancellationConfirmationOption.SaveForLater)) {
                    if (!(it8 instanceof CancellationDialogProvider$CancellationConfirmationOption.BackendAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pfm.h hVarN = pd.b.n(kotlin.coroutines.g.f186406a, new i(jVar, it8, null));
                    Function1 function1K2 = jVar.K();
                    pfm.a aVar = new pfm.a(hVarN, new o0(15, new fa9.c(new BreadcrumbException(), 9)), 2);
                    Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                    ofm.h hVarW = aVar.w(new g0(17, function1K2), new ea9.c(8, h.f137179a));
                    Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                    w.j0(bVar, hVarW);
                }
                return Unit.f186387a;
            default:
                com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, this.f137175b.i);
                return Unit.f186387a;
        }
    }
}
