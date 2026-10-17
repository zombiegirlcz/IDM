package xx9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hx9.c f309454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f309455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wif.a f309456c;
    public final y45.g d;
    public final wx9.d e;
    public final ufm.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wx9.a f309457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qm.e f309458h;

    public s(hx9.c recentTypeMapper, ang.f userInteractor, wif.a messagesLoader, y45.g groupsUpdateLoader, wx9.d transactionsLoader, ufm.g moneyRequestLoader, wx9.a paymentLinksLoader, qm.e newlyJoinedContactsLoader) {
        Intrinsics.checkNotNullParameter(recentTypeMapper, "recentTypeMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(messagesLoader, "messagesLoader");
        Intrinsics.checkNotNullParameter(groupsUpdateLoader, "groupsUpdateLoader");
        Intrinsics.checkNotNullParameter(transactionsLoader, "transactionsLoader");
        Intrinsics.checkNotNullParameter(moneyRequestLoader, "moneyRequestLoader");
        Intrinsics.checkNotNullParameter(paymentLinksLoader, "paymentLinksLoader");
        Intrinsics.checkNotNullParameter(newlyJoinedContactsLoader, "newlyJoinedContactsLoader");
        this.f309454a = recentTypeMapper;
        this.f309455b = userInteractor;
        this.f309456c = messagesLoader;
        this.d = groupsUpdateLoader;
        this.e = transactionsLoader;
        this.f = moneyRequestLoader;
        this.f309457g = paymentLinksLoader;
        this.f309458h = newlyJoinedContactsLoader;
    }
}
