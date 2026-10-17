package soj;

import com.revolut.feature.uipersonalisation.api.PrideThemeDeclaration;
import efm.d0;
import ekg.g;
import kotlin.jvm.internal.Intrinsics;
import s8h.j;
import sl3.r;
import toj.b;
import ufm.c;
import ufm.i;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends moj.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f264850c;
    public final g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b regularWelcomeMessageProvider, g uiPersonalisationInteractor) {
        super("ID_EVENT_PRIDE");
        Intrinsics.checkNotNullParameter(regularWelcomeMessageProvider, "regularWelcomeMessageProvider");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        this.f264850c = regularWelcomeMessageProvider;
        this.d = uiPersonalisationInteractor;
    }

    @Override // q7l.b
    public final boolean c(p7l.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        return this.d.j().f94561a instanceof PrideThemeDeclaration;
    }

    @Override // q7l.b
    public final boolean d() {
        return true;
    }

    @Override // q7l.b
    public final d0 e(p7l.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        String str = user.f233790a;
        double dRandom = Math.random();
        b bVar = this.f264850c;
        c cVarB = (dRandom >= 0.33d || str == null) ? bVar.b(user) : new c(new j(str, 2), 2);
        bVar.getClass();
        i iVar = new i(cVarB, new r(new sl5.a(this, b.a(user), 9), 25), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
