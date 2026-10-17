package vge;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d2 implements qfe.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2 f288884a;

    public d2(e2 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f288884a = repository;
    }

    @Override // qfe.d
    public final Object a(ProductAccountDescriptor$Value.Main main, ProductAccountDescriptor$Value.Main main2, pzl.s sVar) {
        t2 t2Var = (t2) this.f288884a;
        mk0.a aVar = t2Var.f289011b;
        t2Var.g();
        Object objP = t2Var.p(aVar, "ACCOUNT_SWITCHER_FAVOURITES", null, new uyh.w(t2Var, 15, main, main2), sVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objP != aVar2) {
            objP = Unit.f186387a;
        }
        return objP == aVar2 ? objP : Unit.f186387a;
    }
}
