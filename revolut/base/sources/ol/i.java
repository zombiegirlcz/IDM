package ol;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.BiometricTokenEvents;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes17.dex */
public final class i implements igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f226267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f226268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sl.k f226269c;

    public i(l lVar, String str, sl.k kVar) {
        this.f226267a = lVar;
        this.f226268b = str;
        this.f226269c = kVar;
    }

    @Override // igm.o
    public final Object apply(Object obj2) {
        String token = (String) obj2;
        Intrinsics.checkNotNullParameter(token, "token");
        l lVar = this.f226267a;
        lVar.e.track(new BiometricTokenEvents.BiometricTokenRetrievalCompleted(this.f226268b));
        sl.f fVar = lVar.f226274b;
        String string = new kotlinx.serialization.json.a(u.c(new JsonObject(r0.k(new Pair("value", rlm.j.c(token)), new Pair("type", rlm.j.c("encrypted_biometric_token")))))).toString();
        sl.k kVar = this.f226269c;
        Completable completableB = fVar.b(kVar, string);
        k kVar2 = new k(kVar);
        completableB.getClass();
        ogm.a aVar = new ogm.a(completableB, kVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorComplete(...)");
        ks0.n nVar = new ks0.n(lVar, 20);
        he2.b bVar = kgm.j.d;
        kgm.b bVar2 = kgm.j.f184027c;
        return new ogm.m(aVar, nVar, bVar, bVar2, bVar2).d(Observable.just(Unit.f186387a));
    }
}
