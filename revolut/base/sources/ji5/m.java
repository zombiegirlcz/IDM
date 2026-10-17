package ji5;

import g48.r;
import jfb.v0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import vkm.y;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final li5.f f174370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xh5.a f174371b;

    public m(li5.f cryptoPreferencesRepository, xh5.a cryptoFeatureEnabledInteractor) {
        Intrinsics.checkNotNullParameter(cryptoPreferencesRepository, "cryptoPreferencesRepository");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        this.f174370a = cryptoPreferencesRepository;
        this.f174371b = cryptoFeatureEnabledInteractor;
    }

    public final r a() {
        return new r(mo3.a.g(rd0.e.b(((e) this.f174371b).f()), null, new v0(9), 1), 16);
    }

    public final y b() {
        li5.f fVar = this.f174370a;
        return new y(new l34.a(fVar, null, 24), fVar.f195418a.j(new tk0.b("CRYPTO_TAB_VISIBILITY")));
    }

    public final Object c(boolean z, gim.i iVar) throws Throwable {
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, new af3.f(this.f174370a, z, (Continuation) null, 28), iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
