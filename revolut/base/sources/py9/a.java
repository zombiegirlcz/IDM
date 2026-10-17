package py9;

import cl3.c;
import cl3.e;
import com.revolut.feature.junior_core.api.JuniorCoreApi$Toggles;
import efm.d0;
import efm.r;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ufm.i;
import wl3.h;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl3.a f240700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f240701b;

    public a(cl3.a contactsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f240700a = contactsInteractor;
        this.f240701b = featureToggleInteractor;
    }

    public final r a(String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        String strE = g4i.a.e(searchQuery);
        c[] cVarArr = {c.ON_REVOLUT, c.NOT_REVOLUT};
        e eVar = new e(strE);
        h hVar = (h) this.f240700a;
        d0 d0VarSingleOrError = hVar.l(cVarArr, eVar).take(1L).singleOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarSingleOrError, "singleOrError(...)");
        i iVar = new i(zi0.c.t(d0VarSingleOrError), new pva.c(20, new px0.a(15)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        d0 d0VarSingleOrError2 = (((d) this.f240701b).c(JuniorCoreApi$Toggles.PaymentsWithAllJunior.f76895c) ? hVar.p(searchQuery) : hVar.o(searchQuery)).take(1L).singleOrError();
        pva.c cVar = new pva.c(19, new px0.a(14));
        d0VarSingleOrError2.getClass();
        i iVar2 = new i(d0VarSingleOrError2, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        i iVar3 = new i(w.H0(iVar, iVar2), new pva.c(18, new px0.a(13)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
        r rVarX = iVar3.x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return rVarX;
    }
}
