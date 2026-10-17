package d3i;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.SmartTileAssetViewDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileExchangeDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.MoneyDetails;
import ip0.ag0;
import ip0.gg0;
import ip0.ig0;
import ip0.jg0;
import ip0.kg0;
import ip0.zf0;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import skm.e0;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends a97.k {
    public final /* synthetic */ n d;

    public m(n nVar) {
        this.d = nVar;
    }

    public static ExchangeFeatureConfig.Sell g(ExchangeOrderDraft exchangeOrderDraft) {
        MoneyDetails moneyDetails = exchangeOrderDraft.f96879a;
        return new ExchangeFeatureConfig.Sell(moneyDetails.f96897a, exchangeOrderDraft.f96880b.f96897a, moneyDetails.f96898b, null, null, null, null, 4056);
    }

    @Override // a97.k
    public final koi.j a() {
        return z.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0172  */
    @Override // a97.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(o97.y r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d3i.m.b(o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // a97.k
    public final koi.j c(Object obj2, o97.y payload) {
        BigDecimal bigDecimalAbs;
        c state = (c) obj2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payload, "payload");
        z zVar = this.d.f111184h;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payload, "payload");
        int i = 3;
        Object objInvoke = null;
        boolean z = false;
        if (state instanceof a) {
            a aVar = (a) state;
            ExchangeOrderDraft exchangeOrderDraft = aVar.f111158a;
            q1i.b bVar = zVar.f111208a;
            r1i.h hVar = r1i.h.TOP;
            String strC = bVar.c(exchangeOrderDraft, hVar);
            r1i.h hVar2 = r1i.h.BOTTOM;
            String strC2 = bVar.c(exchangeOrderDraft, hVar2);
            gg0 gg0VarC = zVar.c(exchangeOrderDraft, hVar, q1i.b.e(strC, strC2), strC, aVar.d);
            gg0 gg0VarC2 = zVar.c(exchangeOrderDraft, hVar2, q1i.b.e(strC2, strC), strC2, aVar.d);
            Long l2 = r1i.d.g(exchangeOrderDraft, exchangeOrderDraft.f96882g).f96898b;
            if (l2 != null) {
                z = l2.longValue() != 0;
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rates_exchange_input_review_exchange, null, null, 14);
            Data data = aVar.f111159b;
            k kVar = new k(zVar, aVar, i);
            qta.d dVar = (qta.d) data.getContent();
            SmartTileExchangeDelegate.Model model = new SmartTileExchangeDelegate.Model(gg0VarC, gg0VarC2, textLocalisedClause, z, (kg0) (dVar != null ? kVar.invoke(dVar) : data.getError() != null ? jg0.f164834a : ig0.f164692a), payload);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return model;
        }
        if (!(state instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        b bVar2 = (b) state;
        qta.c cVar = bVar2.d;
        a97.c cVar2 = bVar2.f111162b;
        a97.c cVar3 = bVar2.f111161a;
        if (cVar == null) {
            return z.d();
        }
        BigDecimal bigDecimal = cVar3.f2367b;
        xi0.b bVar3 = cVar3.f2366a;
        if (bigDecimal == null || (bigDecimalAbs = bigDecimal.abs()) == null) {
            bigDecimalAbs = BigDecimal.ONE;
        }
        Intrinsics.h(bigDecimalAbs);
        BigDecimal bigDecimalMultiply = bigDecimalAbs.multiply(cVar.f249048c);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        z.b(bigDecimalAbs, bVar3);
        z.b(bigDecimalMultiply, cVar2.f2366a);
        int i2 = 2;
        CompositeClause compositeClause = new CompositeClause(zhm.v.k(z.a(bigDecimalAbs, bVar3, false), sx4.g.e(1), new TextClause("=", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14);
        Clause clauseA = z.a(bigDecimalMultiply, cVar2.f2366a, true);
        BigDecimal bigDecimalM = ofm.q.m(cVar);
        CompositeClause compositeClauseC = bigDecimalM != null ? xqi.a.c(bigDecimalM, false, false, false, false, false, CertificateBody.profileType) : null;
        CompositeClause compositeClauseF = compositeClauseC != null ? v1.c.f(zhm.v.k(compositeClauseC, new TextLocalisedClause(R$string.rates_exchange_chart_title_one_day, null, null, 14)), null) : null;
        Data data2 = bVar2.f111163c;
        k kVar2 = new k(zVar, cVar, i2);
        qta.d dVar2 = (qta.d) data2.getContent();
        if (dVar2 != null) {
            objInvoke = kVar2.invoke(dVar2);
        } else if (data2.getError() == null) {
            objInvoke = zf0.f167457a;
        }
        SmartTileAssetViewDelegate.Model model2 = new SmartTileAssetViewDelegate.Model("EXCHANGE_TILE_ID", compositeClause, null, clauseA, compositeClauseF, (ag0) objInvoke, payload);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return model2;
    }

    @Override // a97.k
    public final Object d(a97.j jVar) {
        Object objO = e0.o(new g(this, null, 0), jVar);
        return objO == fim.a.COROUTINE_SUSPENDED ? objO : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // a97.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.List r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof d3i.h
            if (r0 == 0) goto L13
            r0 = r7
            d3i.h r0 = (d3i.h) r0
            int r1 = r0.f111170x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111170x = r1
            goto L18
        L13:
            d3i.h r0 = new d3i.h
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111170x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            d3i.m r6 = r0.u
            yhm.o.b(r7)
            goto L6b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L3a:
            boolean r7 = r6.hasNext()
            r2 = 0
            if (r7 == 0) goto L51
            java.lang.Object r7 = r6.next()
            a97.f r7 = (a97.f) r7
            boolean r4 = r7 instanceof a97.d
            if (r4 == 0) goto L4e
            r2 = r7
            a97.d r2 = (a97.d) r2
        L4e:
            if (r2 != 0) goto L51
            goto L3a
        L51:
            if (r2 == 0) goto L73
            d3i.n r6 = r5.d
            a5h.g r6 = r6.d
            vkm.j2 r7 = r5.f2376a
            java.lang.Object r7 = r7.getValue()
            d3i.c r7 = (d3i.c) r7
            r0.u = r5
            r0.f111170x = r3
            java.lang.Object r7 = r6.V(r7, r2, r0)
            if (r7 != r1) goto L6a
            return r1
        L6a:
            r6 = r5
        L6b:
            vkm.j2 r6 = r6.f2376a
            r6.setValue(r7)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L73:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "No element of the collection was transformed to a non-null value."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d3i.m.e(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
