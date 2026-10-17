package a89;

import akd.s;
import akg.n;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import d89.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ne0.k;
import oji.e;
import skm.p0;
import ssi.o;
import vkm.q;
import w4l.h;
import wkm.l;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements pfe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x79.a f2135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f2136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f2137c;

    public a(x79.a onHoldAccountInteractor, b mapper, o transactionsWidgetUiModel, d seeAllNaviCommandProvider) {
        Intrinsics.checkNotNullParameter(onHoldAccountInteractor, "onHoldAccountInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(transactionsWidgetUiModel, "transactionsWidgetUiModel");
        Intrinsics.checkNotNullParameter(seeAllNaviCommandProvider, "seeAllNaviCommandProvider");
        this.f2135a = onHoldAccountInteractor;
        this.f2136b = mapper;
        this.f2137c = transactionsWidgetUiModel;
    }

    @Override // pfe.b
    public final Flow d(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        l lVarQ = q.Q(((g) this.f2135a).d(accountId), new a32.b((Continuation) null, this, accountId, 2));
        Intrinsics.checkNotNullParameter(p0.f264001a, "<this>");
        return q.C(lVarQ, e.f225788b);
    }

    @Override // pfe.b
    public final Flow m(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        g gVar = (g) this.f2135a;
        k kVar = gVar.f;
        h hVar = h.f294642c;
        n nVarV = nim.a.v(u0.m(rd0.e.b(kVar.a(hVar)), rd0.e.b(gVar.e.a(hVar))), new a08.o(accountId, this, 18));
        Intrinsics.checkNotNullParameter(p0.f264001a, "<this>");
        return q.C(nVarV, e.f225788b);
    }

    @Override // pfe.b
    public final Object n(ProductAccountId productAccountId, gim.c cVar) {
        return new SlotContext(s.BLOCKING);
    }
}
