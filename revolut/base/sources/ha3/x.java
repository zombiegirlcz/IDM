package ha3;

import akl.w0;
import com.revolut.core.model.account.AccountId;
import f28.b0;
import ghk.a0;
import h93.f0;
import h93.j0;
import h93.l0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import v6l.b1;
import zhm.d0;
import zhm.r0;
import zhm.y0;

/* JADX INFO: loaded from: classes13.dex */
public final class x implements l93.f {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j6l.b f150432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f150433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mg0.a f150434c;
    public final v6l.s d;
    public final ang.f e;
    public final z6l.s f;

    public x(j6l.b repository, wsg.n walletInteractor, mg0.a encryptionInteractor, v6l.s cardRepository, ang.f userInteractor, z6l.s revolutCardsInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(encryptionInteractor, "encryptionInteractor");
        Intrinsics.checkNotNullParameter(cardRepository, "cardRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.f150432a = repository;
        this.f150433b = walletInteractor;
        this.f150434c = encryptionInteractor;
        this.d = cardRepository;
        this.e = userInteractor;
        this.f = revolutCardsInteractor;
    }

    public static f0 r(String str, String str2, i93.c cVar, String str3) {
        b93.b.Companion.getClass();
        b93.j jVar = new b93.j(b93.b.i0, str2);
        h93.r rVar = h93.r.ACTIVE;
        h93.h hVar = new h93.h(h93.g.NONE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, h93.e.UNKNOWN, null, null);
        String label = cVar != null ? cVar.getLabel() : null;
        h93.q qVar = h93.q.ACTIVE;
        return new f0(str, label, true, true, false, rVar, cVar, jVar, hVar, 0L, qVar, qVar, l0.DEBIT, j0.RETAIL, "Disposable", str3, r0.g());
    }

    public final sfm.b A(String cardId, String cardBrand, String str) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
        sfm.b bVar = new sfm.b(new rfm.m(this.e.d.c(), new ha1.s(17, new ha1.k(20)), 1).e(Boolean.FALSE), new ha1.s(18, new dqd.a(this, cardId, cardBrand, str, 21)), 1);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    public final pfm.h B(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return pd.b.n(p0.f264003c, new s(this, cardId, null, 10));
    }

    public final pfm.h C() {
        return pd.b.n(p0.f264003c, new t(this, null, 1));
    }

    public final ufm.b D(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return te0.w.o0(p0.f264003c, new s(this, cardId, null, 11));
    }

    public final pfm.h E() {
        return pd.b.n(p0.f264003c, new t(this, null, 2));
    }

    public final pfm.h F(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return pd.b.n(p0.f264003c, new s(this, id10, null, 12));
    }

    public final pfm.h G(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return pd.b.n(p0.f264003c, new s(this, id10, null, 15));
    }

    public final List H(List orderIds, List cards, Comparator comparator) {
        Intrinsics.checkNotNullParameter(orderIds, "orderIds");
        Intrinsics.checkNotNullParameter(cards, "cards");
        if (comparator != null) {
            cards = d0.P0(cards, comparator);
        }
        return h6l.b.a(cards, orderIds);
    }

    public final pfm.h I(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return pd.b.n(p0.f264003c, new s(this, id10, null, 16));
    }

    public final pfm.a J(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        efm.d0 d0VarFirstOrError = m70.a.e(nim.a.w(((b1) this.f150432a).b(cardId), new ha1.k(21)), new b0(cardId, 3), new h43.q(22)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        pfm.a aVar = new pfm.a(ue0.e.F(d0VarFirstOrError, new Pair(cardId, null)), new ha1.s(21, new p(this, 3)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final ufm.b K(String id10, i93.d dVar, List list) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return te0.w.o0(p0.f264003c, new g0a.e(20, this, id10, dVar, list, null));
    }

    public final pfm.h l(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return pd.b.n(p0.f264003c, new s(this, id10, null, 1));
    }

    public final pfm.h m(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return pd.b.n(p0.f264003c, new s(this, id10, null, 2));
    }

    public final ufm.b n(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return te0.w.o0(p0.f264003c, new s(this, id10, null, 6));
    }

    public final String o(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return this.f.i(cardId);
    }

    public final ufm.b p(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return te0.w.o0(p0.f264003c, new s(this, id10, null, 7));
    }

    public final ufm.b q(l0 subProductType) {
        Intrinsics.checkNotNullParameter(subProductType, "subProductType");
        return te0.w.o0(p0.f264003c, new h54.o(this, subProductType, null, 11));
    }

    public final ufm.i s(boolean z) {
        efm.d0 d0VarFirstOrError = l93.f.i(this).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        ufm.i iVar = new ufm.i(ue0.e.F(d0VarFirstOrError, zhm.f0.f322471a), new ha1.s(14, new g7b.q(z, 8)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final ufm.b t(String str, e93.e virtualCardDesign, String str2, String str3, String str4, i93.d dVar, Set set, e93.b bVar) {
        Intrinsics.checkNotNullParameter(virtualCardDesign, "virtualCardDesign");
        return te0.w.o0(p0.f264003c, new w0(this, str, virtualCardDesign, str2, str3, str4, dVar, set, bVar, null));
    }

    public final a0 u(String pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Set pocketIds = y0.b(pocketId);
        Intrinsics.checkNotNullParameter(pocketIds, "pocketIds");
        return new a0(new a0(rd0.e.b(ue0.e.E(m70.a.g(pd.b.r(this.f150433b.R(), new h8b.b(this, pocketIds, 4)), null, new h43.q(20), 1), zhm.f0.f322471a)), pocketIds, 14), pocketId, 13);
    }

    public final efm.r v(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return rd0.e.c(this.f.u(cardId), kotlin.coroutines.g.f186406a);
    }

    public final sfm.b w(Iterable walletIds, b93.d cardScope, boolean z, b93.k sortType) {
        Intrinsics.checkNotNullParameter(walletIds, "walletIds");
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        ArrayList arrayList = new ArrayList(zhm.w.t(walletIds, 10));
        Iterator it8 = walletIds.iterator();
        while (it8.hasNext()) {
            String str = (String) it8.next();
            arrayList.add(str != null ? efm.d0.m(str) : this.f150433b.E(AccountId.Personal.f51414a));
        }
        sfm.b bVar = new sfm.b(efm.d0.E(arrayList, new ha1.s(25, new ha1.k(22))), new ha1.s(26, new ard.t(this, cardScope, z, sortType, 9)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    public final sfm.b x(String str, b93.d cardScope, boolean z, b93.k sortType) {
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        return w(zhm.u.c(str), cardScope, z, sortType);
    }

    public final efm.r y() {
        return rd0.e.c(this.f.y(), kotlin.coroutines.g.f186406a);
    }

    public final efm.r z(b93.k sortType) {
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        return nim.a.w(kli.a.h(x(null, b93.d.RETAIL, false, sortType), nim.a.w(osg.b.e(this.f150433b, false, io3.l.CURRENT, null, null, null, null, null, 124), new ha1.k(17))), new ha1.k(18));
    }
}
