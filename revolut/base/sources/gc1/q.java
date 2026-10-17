package gc1;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends jki.g implements l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ma1.o f142307p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dfc.a f142308q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f142309r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cfc.a f142310s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f142311t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(jki.p stateMapper, ma1.o settingsScreenInteractor, cfc.b cardReaderUiMerchantInteractor, dfc.a cardReaderUiRouter, n listItemFactory, cfc.a uiListItemsInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(settingsScreenInteractor, "settingsScreenInteractor");
        Intrinsics.checkNotNullParameter(cardReaderUiMerchantInteractor, "cardReaderUiMerchantInteractor");
        Intrinsics.checkNotNullParameter(cardReaderUiRouter, "cardReaderUiRouter");
        Intrinsics.checkNotNullParameter(listItemFactory, "listItemFactory");
        Intrinsics.checkNotNullParameter(uiListItemsInteractor, "uiListItemsInteractor");
        this.f142307p = settingsScreenInteractor;
        this.f142308q = cardReaderUiRouter;
        this.f142309r = listItemFactory;
        this.f142310s = uiListItemsInteractor;
        f0 f0Var = f0.f322471a;
        this.f142311t = new j(f0Var, f0Var);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new cam.q(3, continuation, this), new yi5.b(26));
        l2(new g85.f(this, continuation, 4), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f142311t;
    }
}
