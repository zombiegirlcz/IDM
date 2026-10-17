package bn2;

import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements cm2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final km2.k f17040a;

    public s(km2.k chosenBackgroundRepository) {
        Intrinsics.checkNotNullParameter(chosenBackgroundRepository, "chosenBackgroundRepository");
        this.f17040a = chosenBackgroundRepository;
    }

    public final Object a(GlobalThemeDeclaration globalThemeDeclaration, GlobalThemeDeclaration globalThemeDeclaration2, gim.c cVar) throws Throwable {
        km2.j jVarJ = m70.a.j(globalThemeDeclaration2);
        km2.r rVar = (km2.r) this.f17040a;
        if (rVar.a(jVarJ)) {
            return Unit.f186387a;
        }
        km2.j jVarJ2 = m70.a.j(globalThemeDeclaration);
        km2.j jVarJ3 = m70.a.j(globalThemeDeclaration2);
        rVar.getClass();
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, new k0g.b(rVar, jVarJ3, jVarJ2, (Continuation) null, 29), cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
