package com.revolut.feature.security_hub.impl.ui.linked_wallets.host;

import ali.b;
import ang.f;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.security_hub.api.models.DigitizedCard;
import com.revolut.feature.security_hub.api.models.DigitizedCards;
import com.revolut.feature.security_hub.api.models.DigitizedCardsFlags;
import com.revolut.feature.security_hub.api.models.Enrollment;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.host.LinkedWalletsScreenContract$Step;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.host.LinkedWalletsScreenContract$TabItem;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.common_linked_wallets_tab.CommonLinkedWalletsTabScreen;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.common_linked_wallets_tab.CommonLinkedWalletsTabScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.linked_wallets_tab_revamp.LinkedWalletsTabRevampScreen;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.linked_wallets_tab_revamp.LinkedWalletsTabRevampScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.linked_wallets_learn_more.LinkedWalletsLearnMoreScreen;
import h93.f0;
import hx7.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import knd.g0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import v60.g;
import vdl.c1;
import vge.z1;
import vkm.j2;
import vkm.q;
import vmf.k;
import vrl.i0;
import vuc.i;
import vuc.l;
import vuc.m;
import vuc.r;
import vuc.t;
import wtc.q0;
import zhm.a0;
import zhm.d0;
import zhm.u;
import zhm.w;
import zhm.z0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements l {

    @NotNull
    public static final r Companion = new r();
    public final LinkedWalletsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wtc.h f85617p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f85618q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f85619r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q0 f85620s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f85621t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f85622w;

    public a(n stateMapper, LinkedWalletsScreenContract$InputData inputData, wtc.h linkedWalletsInteractor, g linkedWalletsSectionsInteractor, f userInteractor, q0 userCountryInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(linkedWalletsInteractor, "linkedWalletsInteractor");
        Intrinsics.checkNotNullParameter(linkedWalletsSectionsInteractor, "linkedWalletsSectionsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userCountryInteractor, "userCountryInteractor");
        this.o = inputData;
        this.f85617p = linkedWalletsInteractor;
        this.f85618q = linkedWalletsSectionsInteractor;
        this.f85619r = userInteractor;
        this.f85620s = userCountryInteractor;
        this.u = d.b(this, new vuc.f(u.c(J2(m.WALLETS, new Data(null, null, true, 3, null))), 14), stateMapper, null, false, 12);
        final int i = 0;
        this.v = e.a(this, new Function2(this) { // from class: vuc.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a f292336b;

            {
                this.f292336b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        LinkedWalletsScreenContract$Step step = (LinkedWalletsScreenContract$Step) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (!Intrinsics.f(step, LinkedWalletsScreenContract$Step.LearnMore.f85605a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f292336b.getClass();
                        return new LinkedWalletsLearnMoreScreen();
                    default:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        LinkedWalletsScreenContract$TabItem item = (LinkedWalletsScreenContract$TabItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(item, "item");
                        boolean z = item instanceof LinkedWalletsScreenContract$TabItem.CommonTabItem;
                        final com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a aVar = this.f292336b;
                        if (z) {
                            LinkedWalletsScreenContract$TabItem.CommonTabItem commonTabItem = (LinkedWalletsScreenContract$TabItem.CommonTabItem) item;
                            CommonLinkedWalletsTabScreen commonLinkedWalletsTabScreen = new CommonLinkedWalletsTabScreen(new CommonLinkedWalletsTabScreenContract$InputData(commonTabItem.f85606a, commonTabItem.f85607b, commonTabItem.f85608c));
                            final int i2 = 0;
                            Function1 block = new Function1() { // from class: vuc.q
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i2) {
                                        case 0:
                                            xuc.i result = (xuc.i) obj4;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            boolean z3 = result instanceof xuc.g;
                                            com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a aVar2 = aVar;
                                            if (z3) {
                                                aVar2.K2(((xuc.g) result).f309014a);
                                            } else {
                                                if (!(result instanceof xuc.h)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                aVar2.I2();
                                            }
                                            return Unit.f186387a;
                                        default:
                                            yuc.m result2 = (yuc.m) obj4;
                                            Intrinsics.checkNotNullParameter(result2, "result");
                                            boolean z4 = result2 instanceof yuc.k;
                                            com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a aVar3 = aVar;
                                            if (z4) {
                                                aVar3.K2(((yuc.k) result2).f316983a);
                                            } else if (result2 instanceof yuc.l) {
                                                aVar3.I2();
                                            } else {
                                                if (!(result2 instanceof yuc.j)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                yuc.j jVar = (yuc.j) result2;
                                                aVar3.C2(new h(jVar.f316981a, jVar.f316982b));
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block, "block");
                            commonLinkedWalletsTabScreen.H = block;
                            return commonLinkedWalletsTabScreen;
                        }
                        if (!(item instanceof LinkedWalletsScreenContract$TabItem.WalletsTabItem)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        LinkedWalletsScreenContract$TabItem.WalletsTabItem walletsTabItem = (LinkedWalletsScreenContract$TabItem.WalletsTabItem) item;
                        LinkedWalletsTabRevampScreen linkedWalletsTabRevampScreen = new LinkedWalletsTabRevampScreen(new LinkedWalletsTabRevampScreenContract$InputData(walletsTabItem.f85609a, walletsTabItem.f85610b, walletsTabItem.f85611c, walletsTabItem.d));
                        final int i3 = 1;
                        Function1 block2 = new Function1() { // from class: vuc.q
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i3) {
                                    case 0:
                                        xuc.i result = (xuc.i) obj4;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        boolean z3 = result instanceof xuc.g;
                                        com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a aVar2 = aVar;
                                        if (z3) {
                                            aVar2.K2(((xuc.g) result).f309014a);
                                        } else {
                                            if (!(result instanceof xuc.h)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar2.I2();
                                        }
                                        return Unit.f186387a;
                                    default:
                                        yuc.m result2 = (yuc.m) obj4;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        boolean z4 = result2 instanceof yuc.k;
                                        com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a aVar3 = aVar;
                                        if (z4) {
                                            aVar3.K2(((yuc.k) result2).f316983a);
                                        } else if (result2 instanceof yuc.l) {
                                            aVar3.I2();
                                        } else {
                                            if (!(result2 instanceof yuc.j)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            yuc.j jVar = (yuc.j) result2;
                                            aVar3.C2(new h(jVar.f316981a, jVar.f316982b));
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block2, "block");
                        linkedWalletsTabRevampScreen.H = block2;
                        return linkedWalletsTabRevampScreen;
                }
            }
        });
        final int i2 = 1;
        this.f85622w = s.b(this, new Function2(this) { // from class: vuc.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a f292336b;

            {
                this.f292336b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        LinkedWalletsScreenContract$Step step = (LinkedWalletsScreenContract$Step) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (!Intrinsics.f(step, LinkedWalletsScreenContract$Step.LearnMore.f85605a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f292336b.getClass();
                        return new LinkedWalletsLearnMoreScreen();
                    default:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        LinkedWalletsScreenContract$TabItem item = (LinkedWalletsScreenContract$TabItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(item, "item");
                        boolean z = item instanceof LinkedWalletsScreenContract$TabItem.CommonTabItem;
                        final com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a aVar = this.f292336b;
                        if (z) {
                            LinkedWalletsScreenContract$TabItem.CommonTabItem commonTabItem = (LinkedWalletsScreenContract$TabItem.CommonTabItem) item;
                            CommonLinkedWalletsTabScreen commonLinkedWalletsTabScreen = new CommonLinkedWalletsTabScreen(new CommonLinkedWalletsTabScreenContract$InputData(commonTabItem.f85606a, commonTabItem.f85607b, commonTabItem.f85608c));
                            final int i22 = 0;
                            Function1 block = new Function1() { // from class: vuc.q
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i22) {
                                        case 0:
                                            xuc.i result = (xuc.i) obj4;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            boolean z3 = result instanceof xuc.g;
                                            com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a aVar2 = aVar;
                                            if (z3) {
                                                aVar2.K2(((xuc.g) result).f309014a);
                                            } else {
                                                if (!(result instanceof xuc.h)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                aVar2.I2();
                                            }
                                            return Unit.f186387a;
                                        default:
                                            yuc.m result2 = (yuc.m) obj4;
                                            Intrinsics.checkNotNullParameter(result2, "result");
                                            boolean z4 = result2 instanceof yuc.k;
                                            com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a aVar3 = aVar;
                                            if (z4) {
                                                aVar3.K2(((yuc.k) result2).f316983a);
                                            } else if (result2 instanceof yuc.l) {
                                                aVar3.I2();
                                            } else {
                                                if (!(result2 instanceof yuc.j)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                yuc.j jVar = (yuc.j) result2;
                                                aVar3.C2(new h(jVar.f316981a, jVar.f316982b));
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block, "block");
                            commonLinkedWalletsTabScreen.H = block;
                            return commonLinkedWalletsTabScreen;
                        }
                        if (!(item instanceof LinkedWalletsScreenContract$TabItem.WalletsTabItem)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        LinkedWalletsScreenContract$TabItem.WalletsTabItem walletsTabItem = (LinkedWalletsScreenContract$TabItem.WalletsTabItem) item;
                        LinkedWalletsTabRevampScreen linkedWalletsTabRevampScreen = new LinkedWalletsTabRevampScreen(new LinkedWalletsTabRevampScreenContract$InputData(walletsTabItem.f85609a, walletsTabItem.f85610b, walletsTabItem.f85611c, walletsTabItem.d));
                        final int i3 = 1;
                        Function1 block2 = new Function1() { // from class: vuc.q
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i3) {
                                    case 0:
                                        xuc.i result = (xuc.i) obj4;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        boolean z3 = result instanceof xuc.g;
                                        com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a aVar2 = aVar;
                                        if (z3) {
                                            aVar2.K2(((xuc.g) result).f309014a);
                                        } else {
                                            if (!(result instanceof xuc.h)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar2.I2();
                                        }
                                        return Unit.f186387a;
                                    default:
                                        yuc.m result2 = (yuc.m) obj4;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        boolean z4 = result2 instanceof yuc.k;
                                        com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a aVar3 = aVar;
                                        if (z4) {
                                            aVar3.K2(((yuc.k) result2).f316983a);
                                        } else if (result2 instanceof yuc.l) {
                                            aVar3.I2();
                                        } else {
                                            if (!(result2 instanceof yuc.j)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            yuc.j jVar = (yuc.j) result2;
                                            aVar3.C2(new h(jVar.f316981a, jVar.f316982b));
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block2, "block");
                        linkedWalletsTabRevampScreen.H = block2;
                        return linkedWalletsTabRevampScreen;
                }
            }
        });
    }

    @Override // ali.h
    public final b I0() {
        return this.f85622w;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(m70.a.g(this.f85619r.k(false), null, null, 3)), null, null, new t(this, continuation, 1), 3);
        I2();
        l2(new k(this, continuation, 7), new i0(17));
    }

    public final void I2() {
        a2 a2Var = this.f85621t;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f85621t = yji.l.a1(this, q.Q(new g0(ta6.a.I(500L, TimeUnit.MILLISECONDS), new z1(this, continuation, 18), 1), new c1(continuation, this, 22)), null, null, new t(this, continuation, 0), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v6, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.ArrayList] */
    public final LinkedWalletsScreenContract$TabItem J2(m mVar, Data data) {
        qtc.d type;
        Data data2;
        ArrayList arrayList;
        Iterable iterable;
        Data data3;
        vuc.d dVar;
        List list;
        DigitizedCards digitizedCards;
        DigitizedCardsFlags digitizedCardsFlags;
        aim.e eVarA;
        ?? arrayList2;
        ?? arrayList3;
        m mVar2 = m.WALLETS;
        int i = 16;
        g gVar = this.f85618q;
        f0 f0Var = null;
        Object obj2 = null;
        f0Var = null;
        f0Var = null;
        if (mVar != mVar2) {
            int i2 = vuc.s.f292339a[mVar.ordinal()];
            if (i2 == 1) {
                type = qtc.d.WALLET;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                type = qtc.d.MERCHANT;
            }
            gVar.getClass();
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(type, "type");
            try {
                Object content = data.getContent();
                if (content != null) {
                    vuc.d dVar2 = (vuc.d) content;
                    List list2 = dVar2.f292313a;
                    int iB = zhm.q0.b(w.t(list2, 10));
                    if (iB >= 16) {
                        i = iB;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                    for (Object obj3 : list2) {
                        linkedHashMap.put(((f0) obj3).f150110a, obj3);
                    }
                    List list3 = dVar2.f292314b.f85404a;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : list3) {
                        if (((DigitizedCard) obj4).i == type) {
                            arrayList4.add(obj4);
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj5 : arrayList4) {
                        String str = ((DigitizedCard) obj5).f85396b;
                        ?? arrayList5 = linkedHashMap2.get(str);
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                            linkedHashMap2.put(str, arrayList5);
                        }
                        ((List) arrayList5).add(obj5);
                    }
                    arrayList = new ArrayList();
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        String str2 = (String) entry.getKey();
                        List list4 = (List) entry.getValue();
                        f0 f0Var2 = (f0) linkedHashMap.get(str2);
                        if (f0Var2 == null) {
                            iterable = zhm.f0.f322471a;
                        } else {
                            List<DigitizedCard> list5 = list4;
                            ArrayList arrayList6 = new ArrayList(w.t(list5, 10));
                            for (DigitizedCard digitizedCard : list5) {
                                arrayList6.add(new LinkedWalletsScreenContract$CardConnectionSection(f0Var2, list4));
                            }
                            iterable = arrayList6;
                        }
                        a0.x(iterable, arrayList);
                    }
                } else {
                    arrayList = null;
                }
                data2 = new Data(arrayList, data.getError(), data.getLoading());
            } catch (Throwable th10) {
                data2 = new Data(null, th10, data.getLoading());
            }
            return new LinkedWalletsScreenContract$TabItem.CommonTabItem(mVar, (List) data2.getContent(), data2.getError());
        }
        LinkedWalletsScreenContract$InputData linkedWalletsScreenContract$InputData = this.o;
        String str3 = linkedWalletsScreenContract$InputData.f85604b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Object content2 = data.getContent();
            if (content2 != null) {
                vuc.d dVar3 = (vuc.d) content2;
                DigitizedCards digitizedCards2 = dVar3.f292314b;
                LinkedHashSet linkedHashSetF = z0.f(qtc.f.ANDROID_PAY, qtc.f.APPLE_PAY, qtc.f.FITBIT_PAY, qtc.f.GARMIN_PAY, qtc.f.SAMSUNG_PAY, qtc.f.CLICK_TO_PAY);
                List list6 = dVar3.f292313a;
                int iB2 = zhm.q0.b(w.t(list6, 10));
                if (iB2 >= 16) {
                    i = iB2;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i);
                for (Object obj6 : list6) {
                    linkedHashMap3.put(((f0) obj6).f150110a, obj6);
                }
                List list7 = digitizedCards2.f85404a;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj7 : list7) {
                    if (linkedHashSetF.contains(((DigitizedCard) obj7).f85400j)) {
                        arrayList7.add(obj7);
                    }
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj8 : arrayList7) {
                    DigitizedCard digitizedCard2 = (DigitizedCard) obj8;
                    if (str3 == null || str3.equals(digitizedCard2.f85396b)) {
                        arrayList8.add(obj8);
                    }
                }
                ?? linkedHashMap4 = new LinkedHashMap();
                for (Object obj9 : arrayList8) {
                    qtc.f fVar = ((DigitizedCard) obj9).f85400j;
                    ?? arrayList9 = linkedHashMap4.get(fVar);
                    if (arrayList9 == null) {
                        arrayList9 = new ArrayList();
                        linkedHashMap4.put(fVar, arrayList9);
                    }
                    ((List) arrayList9).add(obj9);
                }
                List list8 = digitizedCards2.f85405b;
                ArrayList arrayList10 = new ArrayList();
                for (Object obj10 : list8) {
                    if (linkedHashSetF.contains(((Enrollment) obj10).f85410c)) {
                        arrayList10.add(obj10);
                    }
                }
                ArrayList arrayList11 = new ArrayList();
                for (Object obj11 : arrayList10) {
                    Enrollment enrollment = (Enrollment) obj11;
                    if (str3 == null || str3.equals(enrollment.f85409b)) {
                        arrayList11.add(obj11);
                    }
                }
                ?? linkedHashMap5 = new LinkedHashMap();
                for (Object obj12 : arrayList11) {
                    qtc.f fVar2 = ((Enrollment) obj12).f85410c;
                    ?? arrayList12 = linkedHashMap5.get(fVar2);
                    if (arrayList12 == null) {
                        arrayList12 = new ArrayList();
                        linkedHashMap5.put(fVar2, arrayList12);
                    }
                    ((List) arrayList12).add(obj12);
                }
                aim.e eVarB = u.b();
                Iterator it8 = linkedHashSetF.iterator();
                Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
                while (it8.hasNext()) {
                    Object next = it8.next();
                    Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                    qtc.f fVar3 = (qtc.f) next;
                    List<DigitizedCard> list9 = (List) linkedHashMap4.get(fVar3);
                    if (list9 != null) {
                        arrayList2 = new ArrayList();
                        for (DigitizedCard digitizedCard3 : list9) {
                            f0 f0Var3 = (f0) linkedHashMap3.get(digitizedCard3.f85396b);
                            LinkedWalletsScreenContract$WalletConnection linkedWalletsScreenContract$WalletConnection = f0Var3 == null ? null : new LinkedWalletsScreenContract$WalletConnection(f0Var3, digitizedCard3, null);
                            if (linkedWalletsScreenContract$WalletConnection != null) {
                                arrayList2.add(linkedWalletsScreenContract$WalletConnection);
                            }
                        }
                    } else {
                        arrayList2 = zhm.f0.f322471a;
                    }
                    List<Enrollment> list10 = (List) linkedHashMap5.get(fVar3);
                    if (list10 != null) {
                        arrayList3 = new ArrayList();
                        for (Enrollment enrollment2 : list10) {
                            f0 f0Var4 = (f0) linkedHashMap3.get(enrollment2.f85409b);
                            LinkedWalletsScreenContract$WalletConnection linkedWalletsScreenContract$WalletConnection2 = f0Var4 == null ? null : new LinkedWalletsScreenContract$WalletConnection(f0Var4, null, enrollment2);
                            if (linkedWalletsScreenContract$WalletConnection2 != null) {
                                arrayList3.add(linkedWalletsScreenContract$WalletConnection2);
                            }
                        }
                    } else {
                        arrayList3 = zhm.f0.f322471a;
                    }
                    ArrayList arrayListE0 = d0.E0((Iterable) arrayList3, (Collection) arrayList2);
                    if (!arrayListE0.isEmpty()) {
                        eVarB.add(new LinkedWalletsScreenContract$WalletConnectionSection(fVar3, arrayListE0));
                    }
                }
                eVarA = u.a(eVarB);
            } else {
                eVarA = null;
            }
            data3 = new Data(eVarA, data.getError(), data.getLoading());
        } catch (Throwable th11) {
            data3 = new Data(null, th11, data.getLoading());
        }
        vuc.d dVar4 = (vuc.d) data.getContent();
        Boolean bool = (dVar4 == null || (digitizedCards = dVar4.f292314b) == null || (digitizedCardsFlags = digitizedCards.f85406c) == null) ? null : digitizedCardsFlags.f85407a;
        String str4 = linkedWalletsScreenContract$InputData.f85604b;
        if (str4 != null && (dVar = (vuc.d) data.getContent()) != null && (list = dVar.f292313a) != null) {
            Iterator it9 = list.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                Object next2 = it9.next();
                if (Intrinsics.f(((f0) next2).f150110a, str4)) {
                    obj2 = next2;
                    break;
                }
            }
            f0Var = (f0) obj2;
        }
        return new LinkedWalletsScreenContract$TabItem.WalletsTabItem(f0Var, (List) data3.getContent(), data3.getError(), bool);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    public final void K2(vuc.e eVar) {
        tuc.m mVar;
        f0 f0Var = eVar.f292316a;
        DigitizedCard digitizedCard = eVar.f292317b;
        vuc.g gVar = this.o.f85603a;
        int i = vuc.s.f292339a[((vuc.f) ((j2) this.u.f22677a).getValue()).f292320c.ordinal()];
        if (i == 1) {
            mVar = tuc.m.LINKED_WALLETS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            mVar = tuc.m.LINKED_MERCHANTS;
        }
        C2(new i(f0Var, digitizedCard, gVar, mVar));
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.u;
    }
}
