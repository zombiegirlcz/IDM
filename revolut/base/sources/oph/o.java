package oph;

import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.ScreenerAllCollectionsRedesignContract$CollectionsPagerItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ocb.u;
import op0.v3;
import org.jetbrains.annotations.NotNull;
import z0h.q1;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements cli.n {

    @NotNull
    private static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ooh.d f227676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hph.c f227677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hph.a f227678c;
    public final q1 d;

    public o(ooh.d instrumentGroupMapper, hph.c collectionItemMapper, hph.a collectionAvatarMapper, nph.d tabTitleMapper, q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(instrumentGroupMapper, "instrumentGroupMapper");
        Intrinsics.checkNotNullParameter(collectionItemMapper, "collectionItemMapper");
        Intrinsics.checkNotNullParameter(collectionAvatarMapper, "collectionAvatarMapper");
        Intrinsics.checkNotNullParameter(tabTitleMapper, "tabTitleMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f227676a = instrumentGroupMapper;
        this.f227677b = collectionItemMapper;
        this.f227678c = collectionAvatarMapper;
        this.d = wealthDisclaimersMapper;
    }

    public static List a(ArrayList arrayList, boolean z) {
        if (!z) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            qv0.i iVar = (qv0.i) obj2;
            boolean z3 = i % 2 == 0;
            yp0.b.l(iVar, 0, 0, z3 ? R$attr.uikit_dp16 : R$attr.uikit_dp4, z3 ? R$attr.uikit_dp4 : R$attr.uikit_dp16, null, false, 51);
            arrayList2.add(iVar);
            i = i2;
        }
        return arrayList2;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f227658a instanceof ScreenerAllCollectionsRedesignContract$CollectionsPagerItem.Custom;
        return new c((List) iii.c.f(domainState.f227659b, new u(this, z, 5), new v3(29), new a4b.i(this, domainState, z, 14)));
    }
}
