package i3e;

import com.revolut.feature.store.impl.ui.home.StoreHomeFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mx0.p6;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ StoreHomeFlow f158184w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(StoreHomeFlow storeHomeFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f158184w = storeHomeFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f158184w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f158184w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((p6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.u
            com.revolut.feature.store.impl.ui.home.StoreHomeFlow r1 = r4.f158184w
            switch(r0) {
                case 0: goto L69;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r4.v
            mx0.p6 r0 = (mx0.p6) r0
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r5)
            i3e.f r5 = r1.e3()
            java.lang.String r0 = r0.f209928b
            com.revolut.feature.store.impl.ui.home.b r5 = (com.revolut.feature.store.impl.ui.home.b) r5
            r5.getClass()
            java.lang.String r1 = "tabId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            int r1 = r0.hashCode()
            switch(r1) {
                case -180545459: goto L4c;
                case 54405220: goto L40;
                case 807888692: goto L34;
                case 2000456965: goto L28;
                default: goto L27;
            }
        L27:
            goto L54
        L28:
            java.lang.String r1 = "HOME_TABS_YOUR_ITEMS_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L31
            goto L54
        L31:
            com.revolut.feature.store.impl.ui.home.StoreHomeFlowContract$PagerItem$YourItems r0 = com.revolut.feature.store.impl.ui.home.StoreHomeFlowContract$PagerItem.YourItems.f88698a
            goto L58
        L34:
            java.lang.String r1 = "HOME_TABS_DEALS_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d
            goto L54
        L3d:
            com.revolut.feature.store.impl.ui.home.StoreHomeFlowContract$PagerItem$Deals r0 = com.revolut.feature.store.impl.ui.home.StoreHomeFlowContract$PagerItem.Deals.f88696a
            goto L58
        L40:
            java.lang.String r1 = "HOME_TABS_EXCLUSIVES_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L49
            goto L54
        L49:
            com.revolut.feature.store.impl.ui.home.StoreHomeFlowContract$PagerItem$Exclusives r0 = com.revolut.feature.store.impl.ui.home.StoreHomeFlowContract$PagerItem.Exclusives.f88697a
            goto L58
        L4c:
            java.lang.String r1 = "HOME_TABS_BRANDS_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L56
        L54:
            r0 = 0
            goto L58
        L56:
            com.revolut.feature.store.impl.ui.home.StoreHomeFlowContract$PagerItem$Brands r0 = com.revolut.feature.store.impl.ui.home.StoreHomeFlowContract$PagerItem.Brands.f88695a
        L58:
            if (r0 != 0) goto L5b
            goto L66
        L5b:
            cli.y r1 = r5.f88706t
            i3e.j r2 = new i3e.j
            r3 = 1
            r2.<init>(r0, r3)
            r5.H2(r1, r2)
        L66:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L69:
            java.lang.Object r0 = r4.v
            java.lang.String r0 = (java.lang.String) r0
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r5)
            i3e.f r5 = r1.e3()
            kotlin.jvm.internal.Intrinsics.h(r0)
            com.revolut.feature.store.impl.ui.home.b r5 = (com.revolut.feature.store.impl.ui.home.b) r5
            r5.getClass()
            java.lang.String r1 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            mub.b r5 = r5.f88704r
            m1c.e0 r1 = m1c.e0.SHOPS
            lzb.a r5 = (lzb.a) r5
            r5.b3(r0, r1)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i3e.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
