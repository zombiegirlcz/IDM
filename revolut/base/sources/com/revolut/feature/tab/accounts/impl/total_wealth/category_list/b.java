package com.revolut.feature.tab.accounts.impl.total_wealth.category_list;

import aie.c0;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import iii.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd8.f;
import khe.d;
import khe.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import wa7.p;
import zhm.d0;
import zjh.j;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mge.a f89602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f89603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f89604c;
    public final c0 d;

    public b(c0 spaceContentListMapper, mge.a favouritesUiMapper, p hiddenAccountsActionsProvider, j legalEntityDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(favouritesUiMapper, "favouritesUiMapper");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsProvider, "hiddenAccountsActionsProvider");
        Intrinsics.checkNotNullParameter(spaceContentListMapper, "spaceContentListMapper");
        this.f89602a = favouritesUiMapper;
        this.f89603b = legalEntityDisclaimerMapper;
        this.f89604c = hiddenAccountsActionsProvider;
        this.d = spaceContentListMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TotalWealthCategoryListContract$State domainState = (TotalWealthCategoryListContract$State) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) c.f(domainState.f89589b, new kh4.b(9), new f(20), new joa.j(this, domainState, 21));
        List listV = j.v(this.f89603b, domainState.d);
        int i = R$attr.uikit_dp16;
        yp0.b.q(listV, i, i, 0, 0, 12);
        ArrayList arrayListE0 = d0.E0(listV, d0.E0(domainState.f89590c, list));
        khe.c cVar = domainState.f;
        int i2 = -1;
        if (Intrinsics.f(cVar, khe.c.f184097a)) {
            Iterator it8 = arrayListE0.iterator();
            int i3 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                koi.j jVar2 = (koi.j) it8.next();
                ListSubheaderDelegate.Model model = jVar2 instanceof ListSubheaderDelegate.Model ? (ListSubheaderDelegate.Model) jVar2 : null;
                Object obj2 = model != null ? model.f52715m : null;
                if (Intrinsics.f(obj2 instanceof ProductSpaceIdentifier ? (ProductSpaceIdentifier) obj2 : null, ProductSpaceIdentifier.Favourites.f89744c)) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
        } else if (cVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        return new e(arrayListE0, new d(i2, cVar instanceof khe.c));
    }
}
