package xx9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hx9.c f309449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f309450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wif.a f309451c;
    public final y45.g d;
    public final wx9.d e;
    public final ufm.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wx9.a f309452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qm.e f309453h;

    public r(hx9.c recentTypeMapper, ang.f userInteractor, wif.a messagesLoader, y45.g groupsUpdateLoader, wx9.d transactionsLoader, ufm.g moneyRequestLoader, wx9.a paymentLinksLoader, qm.e newlyJoinedContactsLoader) {
        Intrinsics.checkNotNullParameter(recentTypeMapper, "recentTypeMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(messagesLoader, "messagesLoader");
        Intrinsics.checkNotNullParameter(groupsUpdateLoader, "groupsUpdateLoader");
        Intrinsics.checkNotNullParameter(transactionsLoader, "transactionsLoader");
        Intrinsics.checkNotNullParameter(moneyRequestLoader, "moneyRequestLoader");
        Intrinsics.checkNotNullParameter(paymentLinksLoader, "paymentLinksLoader");
        Intrinsics.checkNotNullParameter(newlyJoinedContactsLoader, "newlyJoinedContactsLoader");
        this.f309449a = recentTypeMapper;
        this.f309450b = userInteractor;
        this.f309451c = messagesLoader;
        this.d = groupsUpdateLoader;
        this.e = transactionsLoader;
        this.f = moneyRequestLoader;
        this.f309452g = paymentLinksLoader;
        this.f309453h = newlyJoinedContactsLoader;
    }
}
