package qoj;

import com.revolut.feature.uipersonalisation.api.HalloweenThemeDeclaration;
import efm.d0;
import ekg.g;
import kotlin.jvm.internal.Intrinsics;
import no.f2;
import toj.b;
import ufm.c;
import ufm.i;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends moj.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f248225c = 0;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g uiPersonalisationInteractor) {
        super("ID_EVENT_HALLOWEEN");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        this.d = uiPersonalisationInteractor;
    }

    @Override // q7l.b
    public final boolean c(p7l.a user) {
        switch (this.f248225c) {
            case 0:
                Intrinsics.checkNotNullParameter(user, "user");
                return ((g) this.d).j().f94561a instanceof HalloweenThemeDeclaration;
            default:
                Intrinsics.checkNotNullParameter(user, "user");
                return true;
        }
    }

    @Override // q7l.b
    public final boolean d() {
        switch (this.f248225c) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // q7l.b
    public final d0 e(p7l.a user) {
        switch (this.f248225c) {
            case 0:
                Intrinsics.checkNotNullParameter(user, "user");
                c cVar = new c(new ooj.a(user, 1), 2);
                Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                return cVar;
            default:
                Intrinsics.checkNotNullParameter(user, "user");
                b bVar = (b) this.d;
                bVar.getClass();
                i iVar = new i(bVar.b(user), new pv9.b(new f2(this, b.a(user)), 20), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b regularWelcomeMessageProvider) {
        super("ID_EVENT_REGULAR");
        Intrinsics.checkNotNullParameter(regularWelcomeMessageProvider, "regularWelcomeMessageProvider");
        this.d = regularWelcomeMessageProvider;
    }
}
