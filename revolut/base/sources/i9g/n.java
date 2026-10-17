package i9g;

import com.revolut.core.model.account.AccountId;
import fag.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f159820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f159821b;

    public n(t0 travelHotelsRepository, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(travelHotelsRepository, "travelHotelsRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f159820a = travelHotelsRepository;
        this.f159821b = walletInteractor;
    }

    public final efm.r a(String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return pd.b.r(osg.b.d(this.f159821b), new m(this, id10, z, 0));
    }

    public final pfm.a b(String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        pfm.a aVar = new pfm.a(this.f159821b.x(AccountId.Personal.f51414a), new i52.j(21, new m(this, id10, z, 1)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
