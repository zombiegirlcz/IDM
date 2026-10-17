package e0f;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f121618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f121619c;

    public /* synthetic */ j(z zVar, String str, int i) {
        this.f121617a = i;
        this.f121618b = zVar;
        this.f121619c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.d0 d0VarL;
        switch (this.f121617a) {
            case 0:
                Data externalCardData = (Data) obj2;
                Intrinsics.checkNotNullParameter(externalCardData, "externalCardData");
                Throwable error = externalCardData.getError();
                if (error == null || !(error instanceof HttpException) || ((HttpException) error).code() != 404) {
                    return efm.r.just(externalCardData);
                }
                i iVar = this.f121618b.i;
                iVar.getClass();
                String externalCardId = this.f121619c;
                Intrinsics.checkNotNullParameter(externalCardId, "externalCardId");
                e31.j jVar = (e31.j) iVar.f121613b;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(externalCardId, "externalCardId");
                pfm.n nVar = new pfm.n(new a09.r(jVar, externalCardId, 26), 1);
                Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
                pfm.r rVarG0 = te0.w.g0(nVar);
                u21.k kVar = (u21.k) iVar.f121612a;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(externalCardId, "externalCardId");
                pfm.h hVar = new pfm.h(new r2d.e(kVar, 12, kVar.f276536b, externalCardId), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                pfm.a aVarE = rVarG0.e(te0.w.g0(hVar));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE.g(z9h.n.f(null, error, false, 5, null));
            case 1:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                z zVar = this.f121618b;
                pfm.h hVarI = zVar.f121705c.i();
                if ((it8 instanceof HttpException) && ((HttpException) it8).code() == 400) {
                    u21.k kVar2 = (u21.k) zVar.f121703a;
                    efm.b bVarC = kVar2.c();
                    String id10 = this.f121619c;
                    Intrinsics.checkNotNullParameter(id10, "id");
                    w4l.h loadingStrategy = w4l.h.f294642c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    sfm.b bVarG = bVarC.g(kVar2.f276538g.e(id10, loadingStrategy));
                    Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
                    efm.d0 d0VarFirstOrError = m70.a.g(bVarG, null, new e07.k(1), 1).firstOrError();
                    k kVar3 = new k(new l(zVar, 0), 2);
                    d0VarFirstOrError.getClass();
                    d0VarL = new ufm.i(d0VarFirstOrError, kVar3, 1);
                    Intrinsics.checkNotNullExpressionValue(d0VarL, "map(...)");
                } else {
                    d0VarL = efm.d0.l(it8);
                }
                rfm.f0 f0VarF = hVarI.f(d0VarL);
                Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
                return f0VarF;
            default:
                Data paymentData = (Data) obj2;
                Intrinsics.checkNotNullParameter(paymentData, "paymentData");
                if (!paymentData.getLoading()) {
                    cue.d dVar = (cue.d) paymentData.getContent();
                    if ((dVar != null ? dVar.d : null) == null) {
                        return this.f121618b.e(this.f121619c).g(te0.w.h(paymentData));
                    }
                }
                return te0.w.h(paymentData);
        }
    }
}
