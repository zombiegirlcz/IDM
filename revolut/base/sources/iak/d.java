package iak;

import efm.d0;
import efm.k;
import efm.r;
import i4g.g;
import i83.m;
import i9g.e0;
import i9g.f0;
import ihm.j;
import kotlin.jvm.internal.Intrinsics;
import rfm.l;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements lak.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f160049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f160050b;

    public d(b presentationModel) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f160049a = presentationModel;
        this.f160050b = p.a.D("toSerialized(...)");
    }

    @Override // ln.d
    public final r T() {
        r rVarMergeWith = this.f160050b.mergeWith(this.f160049a.a().map(new f0(17, new e0(this, 14))));
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        return rVarMergeWith;
    }

    public final efm.b a() {
        k kVarFirstElement = this.f160049a.a().firstElement();
        f0 f0Var = new f0(20, new e0(this, 15));
        kVarFirstElement.getClass();
        pfm.a aVar = new pfm.a(new l(kVarFirstElement, f0Var, 0), new f0(21, new g(1, this.f160049a, b.class, "updateCurrentStep", "updateCurrentStep(Lcom/revolut/retail/feature/pda/impl/ui/SetUpPdaActivityContract$Step;)Lio/reactivex/Completable;", 0, 10)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.a b() {
        d0 d0VarFirstOrError = m70.a.g(this.f160049a.f160046c.k(false), null, new m(8), 1).map(new f0(14, new e0(12))).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        f0 f0Var = new f0(22, new c(this, 1));
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, f0Var, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
