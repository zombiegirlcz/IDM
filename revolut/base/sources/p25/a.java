package p25;

import android.net.Uri;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSingleButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.feature.credit.application.api.models.IntendedPricingPlan;
import com.revolut.feature.credit.impl.ui.account.empty_states.events.actions.EmptyStateActionParcel;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import ft3.a1;
import ft3.d1;
import ft3.g;
import ft3.g1;
import ft3.q0;
import ft3.w;
import grl.r2;
import hx7.e;
import ip0.xc;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.a0;
import o25.c;
import oqk.i;
import r25.b;
import sfe.h;
import sfe.j;
import sfe.k;
import sfe.l;
import sfe.n;
import sfe.p;
import sfe.q;
import sfe.r;
import sfe.s;
import sfe.u;
import wli.x;
import yhm.m;
import yhm.o;
import yp3.d;
import yp3.f;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f232074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gz3.a f232075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kw3.b f232076n;

    public a(x deeplinkHandler, gz3.a startCreditApplicationNavigationDestinationProvider, kw3.b creditDiscoverUiStateInteractor) {
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(startCreditApplicationNavigationDestinationProvider, "startCreditApplicationNavigationDestinationProvider");
        Intrinsics.checkNotNullParameter(creditDiscoverUiStateInteractor, "creditDiscoverUiStateInteractor");
        this.f232074l = deeplinkHandler;
        this.f232075m = startCreditApplicationNavigationDestinationProvider;
        this.f232076n = creditDiscoverUiStateInteractor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    @Override // r25.b
    public final Object b3(s sVar, Continuation continuation) throws Throwable {
        Unit unitE3;
        ProductAccountId productAccountIdZ2 = b.Z2(sVar);
        if (productAccountIdZ2 != null) {
            ProductAccountId.Payload payload = productAccountIdZ2.f89730b;
            boolean z = payload instanceof CreditAccountType.EmptyState;
            CreditAccountType.EmptyState emptyState = (CreditAccountType.EmptyState) (!z ? null : payload);
            if (emptyState == null) {
                try {
                    m.Companion companion = m.INSTANCE;
                    throw new IllegalStateException("accountId id=" + productAccountIdZ2.f89729a + " payloadType=" + (payload != null ? payload.getClass().getName() : null) + " must contain " + o0.f186429a.b(CreditAccountType.EmptyState.class) + " payload");
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    Throwable thA = m.a(o.a(th10));
                    if (thA != null) {
                        e.n(thA);
                    }
                    emptyState = null;
                }
            }
            if (emptyState != null) {
                if (sVar instanceof sfe.m) {
                    Object obj2 = ((sfe.m) sVar).f262421c;
                    EmptyStateActionParcel emptyStateActionParcel = obj2 instanceof EmptyStateActionParcel ? (EmptyStateActionParcel) obj2 : null;
                    if (emptyStateActionParcel == null) {
                        e.n(new IllegalArgumentException(v0.a.h(obj2, "CreditEmptyStatesEventHandler: payload = ", " is not supported by CreditDiscoverEventHandler")));
                    } else {
                        q0 q0Var = emptyState.f70627b;
                        if (!(emptyStateActionParcel instanceof EmptyStateActionParcel.Discover)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        A2(ov3.a.b(this.f232075m, r2.DISCOVER, q0Var, wp3.a.OPEN_EXISTING_APPLICATION, ((q0Var instanceof w) || (q0Var instanceof g)) ? d.FORCE_SKIP : d.DEFAULT, null, null, null, 16354));
                    }
                } else {
                    if (sVar instanceof n) {
                        Object obj3 = ((n) sVar).f262423b;
                        if (obj3 instanceof BigTileDelegate.Model) {
                            unitE3 = e3(((BigTileDelegate.Model) obj3).f51742s);
                            if (unitE3 != fim.a.COROUTINE_SUSPENDED) {
                                unitE3 = Unit.f186387a;
                            }
                        } else {
                            if (obj3 instanceof ai) {
                                String tabId = ((ai) obj3).f53687a;
                                kw3.b bVar = this.f232076n;
                                bVar.getClass();
                                Intrinsics.checkNotNullParameter(tabId, "tabId");
                                bVar.f190210a.setValue(tabId);
                            } else if (obj3 instanceof xc) {
                                unitE3 = e3(((xc) obj3).f);
                                if (unitE3 != fim.a.COROUTINE_SUSPENDED) {
                                    unitE3 = Unit.f186387a;
                                }
                            } else if (obj3 instanceof u) {
                                RowDelegate.Model.c cVar = ((u) obj3).f262432a.k;
                                pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                                unitE3 = e3(pfVar != null ? pfVar.f : 0);
                                if (unitE3 != fim.a.COROUTINE_SUSPENDED) {
                                    unitE3 = Unit.f186387a;
                                }
                            } else if (obj3 instanceof ty0.a) {
                                String str = ((ty0.a) obj3).f275445a;
                                if (this.f232074l.y1(str)) {
                                    V2(new i(this, str, lg0.a.IGNORE, obj, 6), new yi5.b(29));
                                } else if (a0.H(str, "https", false) || a0.H(str, "http", false)) {
                                    A2(new ExternalDestination.Browser(str, null));
                                } else {
                                    A2(new BridgeDestination(new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, null, null, Uri.parse(str), 14), null, null, null, 0, null, null, null, null, false, 1022)));
                                }
                            } else if (!(obj3 instanceof CellDetailsSingleButtonDelegate.Model) || (unitE3 = e3(((CellDetailsSingleButtonDelegate.Model) obj3).f)) != fim.a.COROUTINE_SUSPENDED) {
                                unitE3 = Unit.f186387a;
                            }
                            unitE3 = Unit.f186387a;
                        }
                        return unitE3 == fim.a.COROUTINE_SUSPENDED ? unitE3 : Unit.f186387a;
                    }
                    if ((sVar instanceof h) || (sVar instanceof l) || (sVar instanceof sfe.i)) {
                        e.n(new IllegalStateException("CreditEmptyStatesEventHandler: Event = " + sVar + " must be handled by common credit handler"));
                    } else if (!(sVar instanceof p) && !(sVar instanceof r) && !(sVar instanceof sfe.o) && !(sVar instanceof q) && !(sVar instanceof k) && !(sVar instanceof j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f186387a;
            }
        }
        return Unit.f186387a;
    }

    @Override // r25.b
    public final boolean d3(Object model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return false;
    }

    public final Unit e3(Object obj2) {
        if (obj2 instanceof o25.b) {
            String tabId = ((o25.b) obj2).f221488b;
            kw3.b bVar = this.f232076n;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(tabId, "tabId");
            bVar.f190210a.setValue(tabId);
        } else if (obj2 instanceof c) {
            f3(((c) obj2).f221489a);
        } else if (obj2 instanceof o25.a) {
            f3(((o25.a) obj2).f221486a);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f3(vu3.e eVar) {
        d1 d1VarG;
        Object[] objArr = 0;
        if (eVar instanceof vu3.c) {
            V2(new i(this, ((vu3.c) eVar).f292208b, lg0.a.OPEN_BROWSER, objArr == true ? 1 : 0, 6), new yi5.b(29));
            return;
        }
        if (!(eVar instanceof vu3.d)) {
            throw new NoWhenBranchMatchedException();
        }
        vu3.d dVar = (vu3.d) eVar;
        String str = dVar.e;
        String str2 = dVar.d;
        it3.k kVar = dVar.f292211c;
        q0 q0VarD = (str2 == null || (d1VarG = g1.g(str2, str, null)) == null) ? null : g1.d(d1VarG, null, kVar, 1);
        if (q0VarD != null) {
            a1 a1Var = new a1(r2.DISCOVER, null, null, md6.s.A(kVar), null, 22);
            String str3 = dVar.f292210b;
            A2(this.f232075m.c(q0VarD, a1Var, wp3.a.OPEN_EXISTING_APPLICATION, d.DEFAULT, (1916 & 16) != 0 ? null : null, (1916 & 32) != 0 ? f.SHOW_ALL : null, yp3.c.DEFAULT, (1916 & 128) != 0 ? yp3.e.SKIP_ON_TOGGLE_DISABLED : null, yp3.b.DEFAULT, (1916 & 512) != 0 ? null : str3 != null ? new IntendedPricingPlan(dVar.f, str3, dVar.f292212g) : null, null));
        } else {
            StringBuilder sbM = v0.a.m("Cannot recognize product:", str2, ", ", str, ", ");
            sbM.append(kVar);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sbM.toString());
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
    }
}
