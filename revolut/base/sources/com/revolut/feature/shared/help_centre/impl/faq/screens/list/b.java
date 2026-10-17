package com.revolut.feature.shared.help_centre.impl.faq.screens.list;

import aii.r;
import aw0.o9;
import b8d.l0;
import boh.f;
import com.revolut.core.model.faq.FaqNode;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.model.faq.PigeonNode;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.shared.help_centre.api.faq.model.DisplayableFaqItem;
import com.revolut.feature.shared.help_centre.impl.faq.screens.list.FaqListScreenContract$InputData;
import com.revolut.feature.support.api.navigation.InboundTransferTrackerDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import im9.h;
import java.util.ArrayList;
import java.util.List;
import jki.g;
import jki.p;
import jv.o;
import k18.c;
import k5e.k;
import k8d.i;
import k8d.j;
import k8d.l;
import k8d.n;
import k8d.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import lde.m;
import mde.e;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import vkm.q0;
import wli.x;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends g implements l {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f86273p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l0 f86274q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f86275r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f86276s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final FaqListScreenContract$InputData f86277t;
    public final lde.c u;
    public final lde.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f86278w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final wde.c f86279x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ude.a f86280y;
    public final k8d.g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p stateMapper, x deeplinkHandler, l0 deeplinkModifier, c faqProvider, e helpDestinationProvider, FaqListScreenContract$InputData inputData, lde.c sharedHelpFaqListTransactionsProvider, lde.n sharedHelpWidgetsInteractor, m transactionItemsDelegate, wde.c inboundTransferItemsProvider, ude.a inboundTransferLocatorDestinationProvider) {
        k8d.g gVar;
        ArrayList arrayListZ2;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(deeplinkModifier, "deeplinkModifier");
        Intrinsics.checkNotNullParameter(faqProvider, "faqProvider");
        Intrinsics.checkNotNullParameter(helpDestinationProvider, "helpDestinationProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sharedHelpFaqListTransactionsProvider, "sharedHelpFaqListTransactionsProvider");
        Intrinsics.checkNotNullParameter(sharedHelpWidgetsInteractor, "sharedHelpWidgetsInteractor");
        Intrinsics.checkNotNullParameter(transactionItemsDelegate, "transactionItemsDelegate");
        Intrinsics.checkNotNullParameter(inboundTransferItemsProvider, "inboundTransferItemsProvider");
        Intrinsics.checkNotNullParameter(inboundTransferLocatorDestinationProvider, "inboundTransferLocatorDestinationProvider");
        this.f86273p = deeplinkHandler;
        this.f86274q = deeplinkModifier;
        this.f86275r = faqProvider;
        this.f86276s = helpDestinationProvider;
        this.f86277t = inputData;
        this.u = sharedHelpFaqListTransactionsProvider;
        this.v = sharedHelpWidgetsInteractor;
        this.f86278w = transactionItemsDelegate;
        this.f86279x = inboundTransferItemsProvider;
        this.f86280y = inboundTransferLocatorDestinationProvider;
        if (inputData instanceof FaqListScreenContract$InputData.OpenByFaqKey) {
            Data data = new Data(null, null, true, 3, null);
            Data data2 = new Data(null, null, true, 3, null);
            Data data3 = new Data(null, null, true, 3, null);
            Data data4 = new Data(null, null, true, 3, null);
            Data data5 = new Data(null, null, true, 3, null);
            FaqListScreenContract$InputData.OpenByFaqKey openByFaqKey = (FaqListScreenContract$InputData.OpenByFaqKey) inputData;
            String categoryKey = openByFaqKey.f86266a;
            Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
            boolean z = openByFaqKey.d;
            Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
            gVar = new k8d.g(data, data2, data3, data4, data5, z);
        } else if (inputData instanceof FaqListScreenContract$InputData.OpenByFaqNode) {
            FaqListScreenContract$InputData.OpenByFaqNode openByFaqNode = (FaqListScreenContract$InputData.OpenByFaqNode) inputData;
            FaqNodeBase faqNodeBase = openByFaqNode.f86269a;
            Data dataP = zi0.c.P(new TextClause(faqNodeBase.getF51435b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, 3);
            Data data6 = new Data(openByFaqNode.f86269a, null, false, 6, null);
            Data data7 = new Data(null, null, true, 3, null);
            if (faqNodeBase instanceof PigeonNode) {
                List list = ((PigeonNode) faqNodeBase).f51438h;
                arrayListZ2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!((PigeonNode) obj2).d) {
                        arrayListZ2.add(obj2);
                    }
                }
            } else if (faqNodeBase instanceof FaqNode.Category) {
                arrayListZ2 = z2(((FaqNode.Category) faqNodeBase).d);
            } else if (faqNodeBase instanceof FaqNode.Topic) {
                arrayListZ2 = z2(((FaqNode.Topic) faqNodeBase).e);
            } else {
                if (!(faqNodeBase instanceof FaqNode.Article) && !(faqNodeBase instanceof FaqNode.Deeplink)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayListZ2 = null;
            }
            Data data8 = new Data(arrayListZ2 != null ? l8d.a.a(arrayListZ2) : null, null, true, 2, null);
            Data data9 = new Data(null, null, true, 3, null);
            String categoryKey2 = faqNodeBase.getF51434a();
            Intrinsics.checkNotNullParameter(categoryKey2, "categoryKey");
            boolean z3 = openByFaqNode.f86270b;
            String categoryKey3 = faqNodeBase.getF51434a();
            this.f86279x.getClass();
            Intrinsics.checkNotNullParameter(categoryKey3, "categoryKey");
            gVar = new k8d.g(dataP, data6, data7, data8, data9, z3);
        } else {
            if (!(inputData instanceof FaqListScreenContract$InputData.OpenByDisplayableItems)) {
                throw new NoWhenBranchMatchedException();
            }
            FaqListScreenContract$InputData.OpenByDisplayableItems openByDisplayableItems = (FaqListScreenContract$InputData.OpenByDisplayableItems) inputData;
            gVar = new k8d.g(zi0.c.P(openByDisplayableItems.f86263a, false, null, 3), new Data(null, null, false, 3, null), new Data(null, null, false, 3, null), zi0.c.P(openByDisplayableItems.f86264b, false, null, 3), zi0.c.P(Boolean.FALSE, false, null, 3), openByDisplayableItems.f86265c);
        }
        this.z = gVar;
    }

    public static String A2(FaqListScreenContract$InputData faqListScreenContract$InputData) {
        if (faqListScreenContract$InputData instanceof FaqListScreenContract$InputData.OpenByFaqKey) {
            return ((FaqListScreenContract$InputData.OpenByFaqKey) faqListScreenContract$InputData).f86266a;
        }
        if (faqListScreenContract$InputData instanceof FaqListScreenContract$InputData.OpenByFaqNode) {
            return ((FaqListScreenContract$InputData.OpenByFaqNode) faqListScreenContract$InputData).f86269a.getF51434a();
        }
        if (faqListScreenContract$InputData instanceof FaqListScreenContract$InputData.OpenByDisplayableItems) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(com.revolut.feature.shared.help_centre.impl.faq.screens.list.b r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof k8d.r
            if (r0 == 0) goto L13
            r0 = r6
            k8d.r r0 = (k8d.r) r0
            int r1 = r0.f182125w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f182125w = r1
            goto L18
        L13:
            k8d.r r0 = new k8d.r
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f182125w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r6)
            goto L48
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            yhm.o.b(r6)
            com.revolut.feature.shared.help_centre.impl.faq.screens.list.FaqListScreenContract$InputData r6 = r5.f86277t
            java.lang.String r6 = A2(r6)
            if (r6 != 0) goto L3d
            r6 = r4
            goto L4a
        L3d:
            k18.c r2 = r5.f86275r
            r0.f182125w = r3
            java.lang.Object r6 = r2.p(r6, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            n7d.a r6 = (n7d.a) r6
        L4a:
            k8d.h r0 = new k8d.h
            if (r6 == 0) goto L51
            java.lang.String r1 = r6.f213067a
            goto L52
        L51:
            r1 = r4
        L52:
            if (r6 == 0) goto L57
            java.util.List r2 = r6.f213069c
            goto L58
        L57:
            r2 = r4
        L58:
            if (r6 == 0) goto L5c
            java.util.List r4 = r6.f213068b
        L5c:
            r0.<init>(r1, r2, r4)
            r5.v2(r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shared.help_centre.impl.faq.screens.list.b.y2(com.revolut.feature.shared.help_centre.impl.faq.screens.list.b, gim.c):java.lang.Object");
    }

    public static ArrayList z2(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            hg0.b.Companion.getClass();
            if (hg0.a.f152042b.contains(((FaqNode) obj2).getF51432c())) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final void B2(String str, boolean z) {
        c cVar = this.f86275r;
        int i = 4;
        int i2 = 2;
        yji.l.b1(this, f.e(new q0(cVar.z(str, z), new h(str, this, null), 1), new k(this, 11)), new jl6.b(i2, this, b.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", i, 8), new jl6.b(i2, this, b.class, "handleChildren", "handleChildren(Lcom/revolut/data/model/Data;)V", i, 7), 2);
        yji.l.b1(this, cVar.A(str), null, new o(this, null, 25), 3);
    }

    public final void C2(Object obj2, String itemId) throws Throwable {
        r iVar;
        r jVar;
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (Intrinsics.f(itemId, "INBOUND_TRANSFER_ITEM_ID")) {
            this.f86280y.getClass();
            C1(InboundTransferTrackerDestination.f89356a);
            return;
        }
        if (obj2 instanceof DisplayableFaqItem) {
            DisplayableFaqItem displayableFaqItem = (DisplayableFaqItem) obj2;
            if (displayableFaqItem instanceof DisplayableFaqItem.DeepLink) {
                D2(((DisplayableFaqItem.DeepLink) obj2).f86137b);
                return;
            }
            if (!(displayableFaqItem instanceof DisplayableFaqItem.Node)) {
                throw new NoWhenBranchMatchedException();
            }
            FaqNodeBase faqNodeBase = ((DisplayableFaqItem.Node) obj2).f86139a;
            boolean z = faqNodeBase instanceof FaqNode;
            lde.n nVar = this.v;
            if (z) {
                FaqNode faqNode = (FaqNode) faqNodeBase;
                if (faqNode instanceof FaqNode.Deeplink) {
                    D2(((FaqNode.Deeplink) faqNode).d);
                    return;
                }
                if (faqNode instanceof FaqNode.Article) {
                    jVar = new i(faqNode);
                } else {
                    if (!(faqNode instanceof FaqNode.Category) && !(faqNode instanceof FaqNode.Topic)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String key = faqNode.getF51434a();
                    nVar.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    jVar = new j(faqNode);
                }
                v2(jVar);
                return;
            }
            if (!(faqNodeBase instanceof PigeonNode)) {
                throw new NoWhenBranchMatchedException();
            }
            PigeonNode pigeonNode = (PigeonNode) faqNodeBase;
            int i = k8d.o.f182121a[pigeonNode.f51436c.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    iVar = new i(pigeonNode);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String key2 = pigeonNode.f51434a;
                    nVar.getClass();
                    Intrinsics.checkNotNullParameter(key2, "key");
                    iVar = new j(pigeonNode);
                }
                v2(iVar);
                return;
            }
            String str = pigeonNode.f;
            if (str != null) {
                D2(str);
            }
        } else {
            boolean zF = Intrinsics.f(itemId, "HELP_BUTTON_ITEM_ID");
            FaqListScreenContract$InputData faqListScreenContract$InputData = this.f86277t;
            Continuation continuation = null;
            if (zF) {
                String strA2 = A2(faqListScreenContract$InputData);
                if (strA2 != null) {
                    n2(new k8d.p(this, strA2, continuation, 0), new whi.b(6));
                }
            } else {
                if (!Intrinsics.f(itemId, "ALL_TRANSACTIONS_LIST_ID")) {
                    m mVar = this.f86278w;
                    mVar.getClass();
                    if (obj2 instanceof a3) {
                        n2(new k3k.q0(obj2, this, continuation, 29), new whi.b(6));
                        return;
                    }
                    mVar.getClass();
                    if (!(obj2 instanceof ExchangeOrder)) {
                        if (Intrinsics.f(itemId, "SEARCH_ITEM_ID")) {
                            n2(new q(this, continuation, 1), new whi.b(6));
                            return;
                        }
                        return;
                    } else {
                        BridgeDestination bridgeDestinationB = this.f86276s.b(obj2);
                        if (bridgeDestinationB != null) {
                            C1(bridgeDestinationB);
                            return;
                        }
                        return;
                    }
                }
                String strA22 = A2(faqListScreenContract$InputData);
                if (strA22 != null) {
                    n2(new k0g.b((Object) this, (Object) strA22, false, continuation, 19), new whi.b(6));
                }
            }
        }
    }

    public final void D2(String str) {
        Continuation continuation = null;
        if (this.f86273p.y1(str) && a0.y(str, "chat", false)) {
            n2(new q(this, continuation, 0), new whi.b(6));
        } else {
            n2(new k8d.p(this, str, continuation, 1), new whi.b(6));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        FaqListScreenContract$InputData faqListScreenContract$InputData = this.f86277t;
        if (faqListScreenContract$InputData instanceof FaqListScreenContract$InputData.OpenByDisplayableItems) {
            return;
        }
        boolean z = faqListScreenContract$InputData instanceof FaqListScreenContract$InputData.OpenByFaqKey;
        lde.c cVar = this.u;
        if (z) {
            FaqListScreenContract$InputData.OpenByFaqKey openByFaqKey = (FaqListScreenContract$InputData.OpenByFaqKey) faqListScreenContract$InputData;
            B2(openByFaqKey.f86266a, openByFaqKey.f86268c);
            String categoryKey = A2(faqListScreenContract$InputData);
            if (categoryKey == null) {
                return;
            }
            cVar.getClass();
            Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
            return;
        }
        if (!(faqListScreenContract$InputData instanceof FaqListScreenContract$InputData.OpenByFaqNode)) {
            throw new NoWhenBranchMatchedException();
        }
        FaqListScreenContract$InputData.OpenByFaqNode openByFaqNode = (FaqListScreenContract$InputData.OpenByFaqNode) faqListScreenContract$InputData;
        B2(openByFaqNode.f86269a.getF51434a(), openByFaqNode.f86271c);
        String categoryKey2 = A2(faqListScreenContract$InputData);
        if (categoryKey2 == null) {
            return;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(categoryKey2, "categoryKey");
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.z;
    }
}
