package zy5;

import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ od0.i f326374b;

    public /* synthetic */ c(int i, od0.i iVar) {
        this.f326373a = i;
        this.f326374b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        kel.m mVar;
        switch (this.f326373a) {
            case 0:
                od0.i it8 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!it8.d()) {
                    return this.f326374b;
                }
                od0.i.Companion.getClass();
                return od0.h.a(AccountWidgetItemModel.EmptyStateStories.DelayedStories.f89488a);
            default:
                wel.e portfolio = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                Iterator it9 = portfolio.e.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        if (Intrinsics.f(((kel.g) next).getId(), this.f326374b.c())) {
                        }
                    } else {
                        next = null;
                    }
                }
                kel.n nVar = next instanceof kel.n ? (kel.n) next : null;
                if (nVar == null || (mVar = nVar.k) == null) {
                    return null;
                }
                return mVar.f183170a.f126703a;
        }
    }
}
