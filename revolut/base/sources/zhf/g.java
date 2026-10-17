package zhf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.feature.transactions.impl.chat_widget.TransactionChatWidgetInput;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import vkm.j2;
import vkm.q;
import yji.n;
import zfd.s;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends y50.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f322411m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f322412n;
    public final g8i.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nhf.a f322413p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Json f322414q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f322415r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Lazy f322416s;

    public g(com.revolut.domain.interactors.transactions.a transactionsInteractor, d mapper, g8i.a modalChecker, nhf.a unitedWalletInteractor, Json json) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(modalChecker, "modalChecker");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f322411m = transactionsInteractor;
        this.f322412n = mapper;
        this.o = modalChecker;
        this.f322413p = unitedWalletInteractor;
        this.f322414q = json;
        this.f322415r = new vii.b();
        this.f322416s = yhm.j.b(new zh0.b(this, 1));
    }

    @Override // yji.n
    public final void H2() {
        Continuation continuation = null;
        n.l2(this, q.Q(this.f322415r, new z6e.g(continuation, this, 12)), null, new s(this, continuation, 7), 3);
    }

    @Override // y50.d
    public final y50.a Z2() {
        return new c(this);
    }

    @Override // y50.d
    public final gw0.q b3(Clause primaryText, Clause clause, boolean z) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        k domainState = (k) ((j2) d3().f22677a).getValue();
        d dVar = this.f322412n;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        if ((domainState instanceof h) || (domainState instanceof i)) {
            return null;
        }
        if (!(domainState instanceof j)) {
            throw new NoWhenBranchMatchedException();
        }
        j jVar = (j) domainState;
        return new gw0.n(primaryText, clause, new AvatarModel.Default(dVar.f322406b.b(jVar.f322420b, jVar.f322421c), null, null, null, null, null, 126), z);
    }

    @Override // y50.d
    public final cli.g d3() {
        return (cli.g) this.f322416s.getValue();
    }

    @Override // y50.d
    public final Object e3(String rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        Json json = this.f322414q;
        json.getClass();
        return (TransactionChatWidgetInput) json.b(TransactionChatWidgetInput.INSTANCE.serializer(), rawData);
    }
}
