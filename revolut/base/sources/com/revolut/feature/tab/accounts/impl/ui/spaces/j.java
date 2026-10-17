package com.revolut.feature.tab.accounts.impl.ui.spaces;

import aie.c0;
import cli.n;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import wa7.p;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zjh.j f89645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f89646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mge.a f89647c;
    public final c0 d;

    public j(c0 spaceContentListMapper, mge.a favouritesUiMapper, p hiddenAccountsActionsProvider, zjh.j legalEntityDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsProvider, "hiddenAccountsActionsProvider");
        Intrinsics.checkNotNullParameter(favouritesUiMapper, "favouritesUiMapper");
        Intrinsics.checkNotNullParameter(spaceContentListMapper, "spaceContentListMapper");
        this.f89645a = legalEntityDisclaimerMapper;
        this.f89646b = hiddenAccountsActionsProvider;
        this.f89647c = favouritesUiMapper;
        this.d = spaceContentListMapper;
    }

    @Override // cli.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aie.g c(AccountSpacesContract$State domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayListD = ((k) this.d).d(domainState.f89607a, true, domainState.f89609c);
        List listV = zjh.j.v(this.f89645a, domainState.f89608b);
        int i = R$attr.uikit_dp16;
        int i2 = 0;
        yp0.b.q(listV, i, i, 0, 0, 12);
        List list = domainState.e;
        aie.e eVar = domainState.d;
        int i3 = -1;
        if (Intrinsics.f(eVar, aie.d.f5236a)) {
            Iterator it8 = arrayListD.iterator();
            int i5 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                koi.j jVar = (koi.j) it8.next();
                RowDelegate.Model model = jVar instanceof RowDelegate.Model ? (RowDelegate.Model) jVar : null;
                if (model == null) {
                    wh whVar = jVar instanceof wh ? (wh) jVar : null;
                    qv0.i iVar = whVar != null ? whVar.f54925b : null;
                    model = iVar instanceof RowDelegate.Model ? (RowDelegate.Model) iVar : null;
                }
                Object obj2 = model != null ? model.u : null;
                if (obj2 instanceof SpaceContentListMapper$ItemParcel.SubspaceValueItem ? ((SpaceContentListMapper$ItemParcel.SubspaceValueItem) obj2).e : obj2 instanceof SpaceContentListMapper$ItemParcel.SubspaceDiscoverItem ? ((SpaceContentListMapper$ItemParcel.SubspaceDiscoverItem) obj2).d : false) {
                    i3 = i5;
                    break;
                }
                i5++;
            }
        } else if (Intrinsics.f(eVar, aie.c.f5235a)) {
            Iterator it9 = arrayListD.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                koi.j jVar2 = (koi.j) it9.next();
                ListSubheaderDelegate.Model model2 = jVar2 instanceof ListSubheaderDelegate.Model ? (ListSubheaderDelegate.Model) jVar2 : null;
                Object obj3 = model2 != null ? model2.f52715m : null;
                if (Intrinsics.f(obj3 instanceof ProductSpaceIdentifier ? (ProductSpaceIdentifier) obj3 : null, ProductSpaceIdentifier.Favourites.f89744c)) {
                    i3 = i2;
                    break;
                }
                i2++;
            }
        } else if (eVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        return new aie.g(new aie.f(i3, eVar instanceof aie.c), d0.E0(listV, d0.E0(list, arrayListD)));
    }
}
