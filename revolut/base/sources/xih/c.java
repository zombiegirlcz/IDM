package xih;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.account_closure.api.navigation.backend_reason.AccountClosureBackendReasonDestination;
import com.revolut.feature.wealth.account_closure.api.navigation.progress.AccountClosureProgressDestination;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureBackendRequestedDetails;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus;
import com.revolut.rxdata.core.CompositeException;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tzg.m;
import vkm.q0;
import whh.h;
import whh.j;
import whh.l;
import whh.n;
import whh.r;
import whh.s;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ktg.a f306402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f306403n;
    public final zih.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final whh.g f306404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f306405q;

    public c(ktg.a accountClosureInteractor, m wealthAccountsInteractor, zih.a accountClosureWidgetCommandProvider, whh.g taaAccountClosureActionHandler) {
        Intrinsics.checkNotNullParameter(accountClosureInteractor, "accountClosureInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(accountClosureWidgetCommandProvider, "accountClosureWidgetCommandProvider");
        Intrinsics.checkNotNullParameter(taaAccountClosureActionHandler, "taaAccountClosureActionHandler");
        this.f306402m = accountClosureInteractor;
        this.f306403n = wealthAccountsInteractor;
        this.o = accountClosureWidgetCommandProvider;
        this.f306404p = taaAccountClosureActionHandler;
        this.f306405q = new j(0);
    }

    public static final Data g3(c cVar, List list) {
        Throwable compositeException;
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        List<Data> list2 = list;
        loop0: while (true) {
            compositeException = null;
            for (Data data : list2) {
                Object content = data.getContent();
                if (content != null) {
                    arrayList.add(content);
                }
                Throwable error = data.getError();
                if (compositeException != null && error != null) {
                    compositeException = new CompositeException(v.k(compositeException, error));
                } else if (compositeException != null) {
                    continue;
                } else {
                    if (error == null) {
                        break;
                    }
                    compositeException = error;
                }
            }
        }
        boolean z = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((Data) it8.next()).getLoading()) {
                    z = true;
                    break;
                }
            }
        }
        return new Data(arrayList, compositeException, z);
    }

    @Override // cki.a
    public final Object Z2() {
        return this.f306405q;
    }

    @Override // whh.h
    public final q0 e3() {
        return new q0(rd0.e.n(boh.f.e(nim.a.v(m.c(this.f306403n, null, null, 3), new xif.c(4)), new xe7.a(this, 11)), h0.f322473a), new x64.b(this, null, 27), 1);
    }

    @Override // whh.h
    public final void f3(t clickData) {
        List list;
        AccountClosureBackendRequestedDetails details;
        whh.c cVar;
        AccountClosureStatus accountClosureStatus;
        AccountClosureBackendRequestedDetails details2;
        AccountClosureBackendRequestedDetails details3;
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj2 = clickData.f54722b.f51596l;
        Object obj3 = null;
        whh.d dVar = null;
        Object obj4 = null;
        whh.a aVar = null;
        s sVar = obj2 instanceof s ? (s) obj2 : null;
        if (sVar != null) {
            boolean z = sVar instanceof n;
            zih.a aVar2 = this.o;
            if (z) {
                List list2 = (List) ((j) b3()).f297665a.getContent();
                if (list2 != null) {
                    Iterator it8 = list2.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        whh.f fVar = (whh.f) it8.next();
                        whh.d dVar2 = fVar instanceof whh.d ? (whh.d) fVar : null;
                        if (dVar2 != null) {
                            dVar = dVar2;
                            break;
                        }
                    }
                    if (dVar != null) {
                        String portfolioId = dVar.f297661a;
                        AccountClosureStatus accountClosureStatus2 = dVar.f297662b;
                        if (!(accountClosureStatus2 instanceof AccountClosureStatus.AccountClosureInProgress) && !(accountClosureStatus2 instanceof AccountClosureStatus.AccountClosureProgressBlocked)) {
                            if (!(accountClosureStatus2 instanceof AccountClosureStatus.BackendRequestedAccountClosure) || (details3 = ((AccountClosureStatus.BackendRequestedAccountClosure) accountClosureStatus2).f104505a) == null) {
                                return;
                            }
                            ((zih.b) aVar2).getClass();
                            Intrinsics.checkNotNullParameter(details3, "details");
                            A2(new AccountClosureBackendReasonDestination(details3));
                            return;
                        }
                        ActionWidgetDelegate.a aVar3 = clickData.f54721a;
                        if (Intrinsics.f(aVar3, ActionWidgetDelegate.a.b.f51608a) || Intrinsics.f(aVar3, ActionWidgetDelegate.a.c.f51609a)) {
                            ((zih.b) aVar2).getClass();
                            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                            A2(new AccountClosureProgressDestination(portfolioId));
                            return;
                        } else if (!Intrinsics.f(aVar3, ActionWidgetDelegate.a.d.f51610a)) {
                            if (!(aVar3 instanceof com.revolut.core.ui_kit.delegates.h) && !Intrinsics.f(aVar3, ActionWidgetDelegate.a.C0395a.f51607a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return;
                        } else {
                            kel.b bVar = ((AccountClosureStatus.AccountClosureProgressBlocked) accountClosureStatus2).f104503b;
                            if (bVar != null) {
                                A2(((zih.b) aVar2).a(portfolioId, WealthAccountType.SECURITIES, bVar, Long.valueOf(Math.abs(bVar.f183149b.f115082a))));
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (sVar instanceof whh.m) {
                List list3 = (List) ((j) b3()).f297665a.getContent();
                if (list3 != null) {
                    Iterator it9 = list3.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            cVar = null;
                            break;
                        }
                        whh.f fVar2 = (whh.f) it9.next();
                        cVar = fVar2 instanceof whh.c ? (whh.c) fVar2 : null;
                        if (cVar != null) {
                            break;
                        }
                    }
                    if (cVar != null) {
                        Iterator it10 = cVar.f297660a.iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                                break;
                            }
                            Object next = it10.next();
                            if (Intrinsics.f(((whh.b) next).f297658a, ((whh.m) sVar).f297667a)) {
                                obj4 = next;
                                break;
                            }
                        }
                        whh.b bVar2 = (whh.b) obj4;
                        if (bVar2 == null || (accountClosureStatus = bVar2.f297659b) == null) {
                            return;
                        }
                        if ((accountClosureStatus instanceof AccountClosureStatus.AccountClosureInProgress) || (accountClosureStatus instanceof AccountClosureStatus.AccountClosureProgressBlocked)) {
                            String portfolioId2 = ((whh.m) sVar).f297667a;
                            ((zih.b) aVar2).getClass();
                            Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                            A2(new AccountClosureProgressDestination(portfolioId2));
                            return;
                        }
                        if (!(accountClosureStatus instanceof AccountClosureStatus.BackendRequestedAccountClosure) || (details2 = ((AccountClosureStatus.BackendRequestedAccountClosure) accountClosureStatus).f104505a) == null) {
                            return;
                        }
                        ((zih.b) aVar2).getClass();
                        Intrinsics.checkNotNullParameter(details2, "details");
                        A2(new AccountClosureBackendReasonDestination(details2));
                        return;
                    }
                    return;
                }
                return;
            }
            if (!sVar.equals(l.f297666a)) {
                if (!(sVar instanceof r)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object obj5 = clickData.f54722b.f51596l;
                r rVar = obj5 instanceof r ? (r) obj5 : null;
                if (rVar == null || (list = (List) ((j) b3()).f297665a.getContent()) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : list) {
                    if (obj6 instanceof whh.e) {
                        arrayList.add(obj6);
                    }
                }
                Iterator it11 = arrayList.iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        break;
                    }
                    Object next2 = it11.next();
                    if (Intrinsics.f(((whh.e) next2).f297663a.getF95253a(), rVar.getAccountId())) {
                        obj3 = next2;
                        break;
                    }
                }
                whh.e eVar = (whh.e) obj3;
                if (eVar != null) {
                    this.f306404p.Z2(eVar, clickData);
                    return;
                }
                return;
            }
            List list4 = (List) ((j) b3()).f297665a.getContent();
            if (list4 != null) {
                Iterator it12 = list4.iterator();
                while (true) {
                    if (!it12.hasNext()) {
                        break;
                    }
                    whh.f fVar3 = (whh.f) it12.next();
                    whh.a aVar4 = fVar3 instanceof whh.a ? (whh.a) fVar3 : null;
                    if (aVar4 != null) {
                        aVar = aVar4;
                        break;
                    }
                }
                if (aVar != null) {
                    AccountClosureStatus accountClosureStatus3 = aVar.f297657b;
                    if ((accountClosureStatus3 instanceof AccountClosureStatus.AccountClosureInProgress) || (accountClosureStatus3 instanceof AccountClosureStatus.AccountClosureProgressBlocked)) {
                        String portfolioId3 = aVar.f297656a;
                        ((zih.b) aVar2).getClass();
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        A2(new AccountClosureProgressDestination(portfolioId3));
                        return;
                    }
                    if (!(accountClosureStatus3 instanceof AccountClosureStatus.BackendRequestedAccountClosure) || (details = ((AccountClosureStatus.BackendRequestedAccountClosure) accountClosureStatus3).f104505a) == null) {
                        return;
                    }
                    ((zih.b) aVar2).getClass();
                    Intrinsics.checkNotNullParameter(details, "details");
                    A2(new AccountClosureBackendReasonDestination(details));
                }
            }
        }
    }
}
