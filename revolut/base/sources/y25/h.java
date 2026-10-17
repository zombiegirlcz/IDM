package y25;

import akd.s;
import au.c0;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import cxe.u;
import efm.r;
import ft3.j1;
import g25.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.time.b;
import kotlinx.coroutines.flow.Flow;
import n14.k;
import te0.w;
import tfm.n4;
import ui9.z;
import vi9.g0;
import vi9.l;
import vi9.n;
import vkm.q0;
import vkm.y;
import x15.e0;
import x15.h0;
import y07.m;
import yhm.m;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xh9.a f310596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f310597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f310598c;
    public final gk9.b d;
    public final j e;
    public final ti9.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f310599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f310600h;
    public final xh9.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g0 f310601j;

    public h(xh9.a payLaterInteractor, n payLaterModeItemMapper, l payLaterInstalmentItemMapper, gk9.b payLaterPlanItemMapper, j payLaterProductItemMapper, ti9.h payLaterProductFeatureTogglesInteractor, p creditApplicationAccountMapper, z payLaterCrossSellInteractor, oj9.f payLaterCrossSellItemMapper, xh9.e payLaterTransactionsInteractor, g0 payLaterTransactionsItemMapper) {
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(payLaterModeItemMapper, "payLaterModeItemMapper");
        Intrinsics.checkNotNullParameter(payLaterInstalmentItemMapper, "payLaterInstalmentItemMapper");
        Intrinsics.checkNotNullParameter(payLaterPlanItemMapper, "payLaterPlanItemMapper");
        Intrinsics.checkNotNullParameter(payLaterProductItemMapper, "payLaterProductItemMapper");
        Intrinsics.checkNotNullParameter(payLaterProductFeatureTogglesInteractor, "payLaterProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationAccountMapper, "creditApplicationAccountMapper");
        Intrinsics.checkNotNullParameter(payLaterCrossSellInteractor, "payLaterCrossSellInteractor");
        Intrinsics.checkNotNullParameter(payLaterCrossSellItemMapper, "payLaterCrossSellItemMapper");
        Intrinsics.checkNotNullParameter(payLaterTransactionsInteractor, "payLaterTransactionsInteractor");
        Intrinsics.checkNotNullParameter(payLaterTransactionsItemMapper, "payLaterTransactionsItemMapper");
        this.f310596a = payLaterInteractor;
        this.f310597b = payLaterModeItemMapper;
        this.f310598c = payLaterInstalmentItemMapper;
        this.d = payLaterPlanItemMapper;
        this.e = payLaterProductItemMapper;
        this.f = payLaterProductFeatureTogglesInteractor;
        this.f310599g = creditApplicationAccountMapper;
        this.f310600h = payLaterCrossSellInteractor;
        this.i = payLaterTransactionsInteractor;
        this.f310601j = payLaterTransactionsItemMapper;
    }

    @Override // pfe.b
    public final Flow d(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        xh9.a aVar = this.f310596a;
        ti9.g gVar = (ti9.g) aVar;
        w4l.i iVar = w4l.i.f294643c;
        u uVarK = gVar.k(iVar);
        kotlin.coroutines.g gVar2 = kotlin.coroutines.g.f186406a;
        n4 n4VarE = rd0.e.c(uVarK, gVar2).replay(1).e();
        Intrinsics.checkNotNullExpressionValue(n4VarE, "refCount(...)");
        r rVarSwitchMap = n4VarE.map(new xy7.j(29, new m(29))).distinctUntilChanged().switchMap(new c(new b(this, 0), 0));
        r rVarO = gVar.o(iVar);
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        f0 f0Var = f0.f322471a;
        r rVarR = k.r(nim.a.w(pd.b.r(gVar.i.a(w4l.j.f294644c), new dt6.a(f0Var, new sw6.a(loadingStrategy, gVar, 22))), new xd2.n(23)), f0Var);
        r rVarN = gVar.n();
        Intrinsics.h(rVarSwitchMap);
        r map = w.q(n4VarE, rVarO, rVarR, rVarN, rVarSwitchMap, nim.a.w(gVar.n(), new tfh.a(19)), rd0.e.c(new ahe.i(new y(new wda.l(2, 12, null), this.f310600h.b(ai9.g.f5224a)), 20), gVar2)).map(new c(new b(this, 1), 1));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a35.i
    public final Flow e(List products, List applicationAccounts) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(applicationAccounts, "applicationAccounts");
        aim.e eVarB = zhm.u.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : products) {
            if (obj2 instanceof h0) {
                arrayList.add(obj2);
            }
        }
        h0 h0Var = (h0) d0.K0(arrayList);
        Object obj3 = null;
        if (h0Var instanceof e0) {
            Iterator it8 = applicationAccounts.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (((x15.e) next).f302252a.f14164b == j1.BUY_NOW_PAY_LATER) {
                    obj3 = next;
                    break;
                }
            }
            x15.e eVar = (x15.e) obj3;
            if (eVar != null) {
                eVarB.add(this.f310599g.d(eVar));
            }
        } else if (h0Var instanceof x15.g0) {
            x15.g0 g0Var = (x15.g0) h0Var;
            zh9.h hVar = g0Var.f302274a.f322286b.f;
            String str = hVar != null ? hVar.f322267a : null;
            if (str != null) {
                eVarB.add(this.e.b(g0Var, str));
            }
        } else if (!(h0Var instanceof x15.f0)) {
            throw new NoWhenBranchMatchedException();
        }
        return new go.g(new Data(zhm.u.a(eVarB), null, false, 6, null), 2);
    }

    @Override // a35.i
    public final vkm.f k(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Flow flowH = xam.a.h(new c0((Continuation) null, this, loadingStrategy, 29), this.f.j());
        x18.c cVar = new x18.c(3, 20, null);
        zhm.h0 h0Var = zhm.h0.f322473a;
        q0 q0VarN = rd0.e.n(rd0.e.e(flowH, h0Var, cVar), h0Var);
        x15.f0 f0Var = x15.f0.f302271a;
        jhi.k kVarS = k.s(q0VarN, f0Var);
        Data data = new Data(f0Var, null, false, 6, null);
        b.Companion companion = kotlin.time.b.INSTANCE;
        return zi0.c.M(kVarS, data, kotlin.time.c.h(1000L, pkm.e.MILLISECONDS), "PayLaterProduct");
    }

    @Override // a35.i
    public final Flow l() {
        return this.f.j();
    }

    @Override // pfe.b
    public final Flow m(ProductAccountId accountId) throws Throwable {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ProductAccountId.Payload payload = accountId.f89730b;
        CreditAccountType.PayLater payLater = null;
        if (!(payload instanceof CreditAccountType.PayLater)) {
            payload = null;
        }
        CreditAccountType.PayLater payLater2 = (CreditAccountType.PayLater) payload;
        if (payLater2 == null) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                String str = accountId.f89729a;
                ProductAccountId.Payload payload2 = accountId.f89730b;
                throw new IllegalStateException("accountId id=" + str + " payloadType=" + (payload2 != null ? payload2.getClass().getName() : null) + " must contain " + o0.f186429a.b(CreditAccountType.PayLater.class) + " payload");
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                Throwable thA = yhm.m.a(o.a(th10));
                if (thA != null) {
                    hx7.e.n(thA);
                }
            }
        } else {
            payLater = payLater2;
        }
        if (payLater == null) {
            return new go.g(new Data(null, null, false, 7, null), 2);
        }
        r map = rd0.e.c(k(w4l.i.f294643c), kotlin.coroutines.g.f186406a).map(new vfg.p(new xnd.c(payLater, this, 1)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    @Override // pfe.b
    public final Object n(ProductAccountId productAccountId, gim.c cVar) throws Throwable {
        String str;
        ProductAccountId.Payload payload = productAccountId.f89730b;
        if (!(payload instanceof CreditAccountType.PayLater)) {
            payload = null;
        }
        CreditAccountType.PayLater payLater = (CreditAccountType.PayLater) payload;
        if (payLater == null) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                String str2 = productAccountId.f89729a;
                ProductAccountId.Payload payload2 = productAccountId.f89730b;
                throw new IllegalStateException("accountId id=" + str2 + " payloadType=" + (payload2 != null ? payload2.getClass().getName() : null) + " must contain " + o0.f186429a.b(CreditAccountType.PayLater.class) + " payload");
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                Throwable thA = yhm.m.a(o.a(th10));
                if (thA != null) {
                    hx7.e.n(thA);
                }
                payLater = null;
            }
        }
        if (payLater == null || (str = payLater.f70632b) == null) {
            return null;
        }
        return new SlotContext(s.PAY_LATER, y0.b(str));
    }
}
