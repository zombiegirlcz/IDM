package s06;

import android.content.Intent;
import android.net.Uri;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.IntentCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import grl.za;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class j implements q06.l {

    @NotNull
    public static final f Companion = new f(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f258857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uli.b f258858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uli.d f258859c;
    public final q06.d d;
    public final sri.m e;
    public final com.revolut.analytics.tracking.v3.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f80.a f258860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d4m.a f258861h;
    public final r10.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f258862j;

    public j(a actionPerformerProvider, uli.b legacyDeeplinkActionPerformer, uli.d deeplinkMainScreenBlackListHandler, q06.d deeplinkParser, uli.e deeplinkMainScreenCommandProvider, sri.m navigator, com.revolut.analytics.tracking.v3.c deeplinkEventsTracker, f80.a uriHelper, d4m.a featureGateways, wri.b singleActivityStateChecker, r10.a deeplinkRestrictionsChecker, c51.i deeplinkRestrictionsStateProvider) {
        Intrinsics.checkNotNullParameter(actionPerformerProvider, "actionPerformerProvider");
        Intrinsics.checkNotNullParameter(legacyDeeplinkActionPerformer, "legacyDeeplinkActionPerformer");
        Intrinsics.checkNotNullParameter(deeplinkMainScreenBlackListHandler, "deeplinkMainScreenBlackListHandler");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(deeplinkMainScreenCommandProvider, "deeplinkMainScreenCommandProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(deeplinkEventsTracker, "deeplinkEventsTracker");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(featureGateways, "featureGateways");
        Intrinsics.checkNotNullParameter(singleActivityStateChecker, "singleActivityStateChecker");
        Intrinsics.checkNotNullParameter(deeplinkRestrictionsChecker, "deeplinkRestrictionsChecker");
        Intrinsics.checkNotNullParameter(deeplinkRestrictionsStateProvider, "deeplinkRestrictionsStateProvider");
        this.f258857a = actionPerformerProvider;
        this.f258858b = legacyDeeplinkActionPerformer;
        this.f258859c = deeplinkMainScreenBlackListHandler;
        this.d = deeplinkParser;
        this.e = navigator;
        this.f = deeplinkEventsTracker;
        this.f258860g = uriHelper;
        this.f258861h = featureGateways;
        this.i = deeplinkRestrictionsChecker;
        this.f258862j = new CopyOnWriteArrayList();
    }

    public static LinkedHashSet b(NaviCommand naviCommand) {
        List listB = com.revolut.retail.core.navigation.a.b(naviCommand);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listB) {
            if (obj2 instanceof FeatureCommand) {
                arrayList.add(obj2);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            linkedHashSet.add(((FeatureCommand) it8.next()).f98638a.getClass());
        }
        return linkedHashSet;
    }

    public static void e(jf0.c cVar) {
        if (cVar.f() == null) {
            Regex regex = d0m.b.f110450a;
            String strK = cVar.k();
            if (strK == null) {
                strK = "";
            }
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("No legacy deeplink pattern found for ", d0m.b.a(strK)));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "DeeplinkRouterImpl", null, illegalStateException, h0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // lg0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L1(java.lang.String r5, lg0.a r6, java.lang.Boolean r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof s06.i
            if (r0 == 0) goto L13
            r0 = r8
            s06.i r0 = (s06.i) r0
            int r1 = r0.f258856w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f258856w = r1
            goto L18
        L13:
            s06.i r0 = new s06.i
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f258856w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r8)
            efm.d0 r5 = r4.Z0(r5, r6, r7)
            r0.f258856w = r3
            java.lang.Object r8 = nim.a.b(r5, r0)
            if (r8 != r1) goto L3f
            return r1
        L3f:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s06.j.L1(java.lang.String, lg0.a, java.lang.Boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // lg0.b
    public final d0 Z0(String url2, lg0.a fallbackStrategy, Boolean bool) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(fallbackStrategy, "fallbackStrategy");
        return c(url2, bool != null ? bool.booleanValue() : a(url2), fallbackStrategy);
    }

    public final boolean a(String deeplink) {
        if (a0m.a.a(deeplink)) {
            return true;
        }
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (kotlin.text.d0.J(deeplink, "form", false)) {
            return true;
        }
        List list = this.f258859c.f281029a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (kotlin.text.d0.J(deeplink, (String) it8.next(), false)) {
                return false;
            }
        }
        return true;
    }

    public final d0 c(String url2, boolean z, lg0.a fallbackStrategy) {
        Continuation continuation;
        g gVar;
        Set<xii.b> setH;
        ParcelableDestination parcelableDestinationE;
        g gVar2;
        String strF;
        ParcelableDestination parcelableDestinationE2;
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(fallbackStrategy, "fallbackStrategy");
        jf0.c cVarD = ((c) this.d).d(url2);
        if (cVarD == null) {
            ufm.b bVarM = d0.m(Boolean.valueOf(d(url2, fallbackStrategy)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return w.i0(bVarM);
        }
        Iterator it8 = this.f258862j.iterator();
        loop0: while (true) {
            continuation = null;
            if (it8.hasNext()) {
                xii.b bVar = (xii.b) it8.next();
                for (String str : bVar.a()) {
                    lg0.e eVarG = pw5.a.G(str, cVarD);
                    if (eVarG != null && (parcelableDestinationE2 = bVar.e(eVarG)) != null) {
                        gVar2 = new g(parcelableDestinationE2, str);
                        break loop0;
                    }
                }
            } else {
                loop2: for (nhi.f fVar : ((yhi.a) this.f258861h.get()).a()) {
                    aii.p pVar = fVar instanceof aii.p ? (aii.p) fVar : null;
                    if (pVar != null && (setH = pVar.h()) != null) {
                        for (xii.b bVar2 : setH) {
                            for (String str2 : bVar2.a()) {
                                lg0.e eVarG2 = pw5.a.G(str2, cVarD);
                                if (eVarG2 != null && (parcelableDestinationE = bVar2.e(eVarG2)) != null) {
                                    gVar2 = new g(parcelableDestinationE, str2);
                                }
                            }
                        }
                    }
                }
                gVar = null;
            }
        }
        gVar = gVar2;
        if (gVar == null || (strF = gVar.a()) == null) {
            strF = cVarD.f();
        }
        this.f.a(strF, cVarD.c(), za.Opened, false);
        ufm.i iVar = new ufm.i(ue0.e.F(w.o0(kotlin.coroutines.g.f186406a, new rm6.c(this, cVarD, continuation, 28)), y06.d.f310152a), new ryd.j(new ael.s(this, cVarD, z, fallbackStrategy, gVar, 9), 20), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final boolean d(String str, lg0.a aVar) {
        if (aVar != lg0.a.OPEN_BROWSER) {
            return false;
        }
        Uri uriF = ((f80.b) this.f258860g).f(str);
        if (!a0.z(uriF.getScheme(), "http", true) && !a0.z(uriF.getScheme(), "https", true)) {
            return false;
        }
        Intent intentAddFlags = new Intent("android.intent.action.VIEW", uriF).addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
        this.e.c(new IntentCommand(intentAddFlags));
        return true;
    }

    public final void f(jf0.c cVar, NaviCommand naviCommand, lg0.a aVar) {
        if (zhm.d0.A0(com.revolut.retail.core.navigation.a.b(naviCommand), uli.e.a()).isEmpty() && d(cVar.c(), aVar)) {
            return;
        }
        this.e.c(naviCommand);
    }

    @Override // lg0.b
    public final boolean y1(String url2) {
        Set<xii.b> setH;
        Intrinsics.checkNotNullParameter(url2, "url");
        jf0.c deeplink = ((c) this.d).d(url2);
        if (deeplink != null) {
            CopyOnWriteArrayList<xii.b> copyOnWriteArrayList = this.f258862j;
            for (xii.b bVar : copyOnWriteArrayList) {
                Iterator it8 = bVar.a().iterator();
                while (it8.hasNext()) {
                    if (pw5.a.v((String) it8.next(), deeplink)) {
                        if (copyOnWriteArrayList.size() >= 5) {
                            copyOnWriteArrayList.remove(zhm.v.j(copyOnWriteArrayList));
                        }
                        copyOnWriteArrayList.add(0, bVar);
                        return true;
                    }
                }
            }
            for (nhi.f fVar : ((yhi.a) this.f258861h.get()).a()) {
                aii.p pVar = fVar instanceof aii.p ? (aii.p) fVar : null;
                if (pVar != null && (setH = pVar.h()) != null) {
                    for (xii.b bVar2 : setH) {
                        Iterator it9 = bVar2.a().iterator();
                        while (it9.hasNext()) {
                            if (pw5.a.v((String) it9.next(), deeplink)) {
                                if (copyOnWriteArrayList.size() >= 5) {
                                    copyOnWriteArrayList.remove(zhm.v.j(copyOnWriteArrayList));
                                }
                                copyOnWriteArrayList.add(0, bVar2);
                                return true;
                            }
                        }
                    }
                }
            }
            if (!(this.f258857a.a(deeplink) instanceof p)) {
                return true;
            }
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            uli.b bVar3 = this.f258858b;
            if (!Intrinsics.f(bVar3.c(deeplink), bVar3.f281028j)) {
                return true;
            }
        }
        return false;
    }
}
