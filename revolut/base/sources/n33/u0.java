package n33;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.card_order_new.api.BackConfirmationDialog;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.card_order_new.impl.newcard.OrderNewCardContract$Configuration;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.feature.terms.api.model.TermsScope;
import ip0.v7;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class u0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f2 f211839b;

    public /* synthetic */ u0(f2 f2Var, int i) {
        this.f211838a = i;
        this.f211839b = f2Var;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    private final java.lang.Object a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r59v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        pfm.a aVar;
        j7a.j jVar;
        List listL;
        int i = this.f211838a;
        pfm.m mVar = pfm.m.f235744a;
        int i2 = 13;
        int i3 = 0;
        int i5 = 4;
        int i6 = 1;
        f2 f2Var = this.f211839b;
        switch (i) {
            case 0:
                String listId = (String) obj2;
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "LINK_CARD_LIST_ID")) {
                    r2 r2Var = (r2) f2Var.f211713p;
                    t0 t0Var = (t0) r2Var.d;
                    efm.d0 d0VarFirstOrError = m70.a.g(t0Var.k.W(com.revolut.feature.card_order_new.api.a.a((CardOrderAccountWrapper) ((s2) t0Var.i).w0().get())), null, new n0c.v(26), 1).firstOrError();
                    Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                    ufm.i iVar = new ufm.i(ue0.e.t(d0VarFirstOrError, zhm.h0.f322473a), new n30.d(new i0(t0Var, 5), 27), 0);
                    Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                    int i21 = 12;
                    efm.b bVarU = mo3.a.u(hx7.a.L(v7.x(new ufm.f(iVar, new i2(i21, new g2(r2Var, i21)), 3), "ignoreElement(...)"), f2Var.k, false, null, 24), f2Var.f211709j, true);
                    Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress$default(...)");
                    akl.s sVar = f2Var.i;
                    pfm.a aVar2 = new pfm.a(bVarU, new ly7.g(6, new n0c.p(new BreadcrumbException(), 28)), 2);
                    Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
                    ofm.h hVarW = aVar2.w(new n1i.b(1, sVar), new j7a.j(17, n1.f211768a));
                    Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                    te0.w.j0(f2Var.f239031a, hVarW);
                } else if (Intrinsics.f(listId, "LINK_CHILD_CARD_LIST_ID")) {
                    Intrinsics.checkNotNullParameter("An operation is not implemented: PYJL-2441 Show kid selector dialog", "message");
                    throw new NotImplementedError("An operation is not implemented: PYJL-2441 Show kid selector dialog");
                }
                return Unit.f186387a;
            case 1:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                BackConfirmationDialog f64942c = f2Var.f211716s.f65213j.getF64942c();
                if (f64942c != null) {
                    return f2Var.V(f64942c);
                }
                r2 r2Var2 = (r2) f2Var.f211713p;
                r2Var2.getClass();
                pfm.h hVar = new pfm.h(new h2(r2Var2, i6), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 2:
                String tabId = (String) obj2;
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                f2Var.f211714q.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                SelectedTab tab2 = (SelectedTab) le.u1.u(tabId, h0.f211728a);
                t0 t0Var2 = (t0) f2Var.o;
                t0Var2.getClass();
                Intrinsics.checkNotNullParameter(tab2, "tab");
                s2 s2Var = (s2) t0Var2.i;
                return te0.w.z0(s2Var.f211809c.getValue(s2Var, s2.f211807p[1]), tab2);
            case 3:
                ty0.a clickData = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(clickData, "it");
                t0 t0Var3 = (t0) f2Var.o;
                t0Var3.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                CryptoFcaRisksDestination cryptoFcaRisksDestinationD = ((gi5.d) t0Var3.v).d(clickData);
                if (cryptoFcaRisksDestinationD != null) {
                    return zh9.u0.f(cryptoFcaRisksDestinationD);
                }
                return null;
            case 4:
                RowDelegate.Model item = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                opi.d dVar = f2Var.f211717t;
                u uVar = f2Var.f211713p;
                opi.d.c(dVar);
                Iterator<E> it8 = wf8.b.a().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (kotlin.text.a0.H(item.f53228a, ((wf8.b) next).name(), false)) {
                        }
                    } else {
                        next = null;
                    }
                }
                wf8.b bVar = (wf8.b) next;
                int i22 = bVar == null ? -1 : z0.f211858b[bVar.ordinal()];
                if (i22 == 1) {
                    r2 r2Var3 = (r2) uVar;
                    r2Var3.getClass();
                    pfm.h hVar2 = new pfm.h(new h2(r2Var3, i5), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                    return hVar2;
                }
                if (i22 != 2) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Cannot handler click on bottom dialog item with id ", item.f53228a));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                    return mVar;
                }
                Object obj3 = item.u;
                wf8.a aVar3 = obj3 instanceof wf8.a ? (wf8.a) obj3 : null;
                if (aVar3 == null) {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(p.a.p("Cannot handler click on bottom dialog item with id ", item.f53228a, ". RowDelegate.Model.parcel is null"));
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                    return mVar;
                }
                psg.a walletProfile = aVar3.f297021a.f288535a;
                kc8.a juniorCardType = aVar3.f297022b;
                r2 r2Var4 = (r2) uVar;
                r2Var4.getClass();
                Intrinsics.checkNotNullParameter(walletProfile, "walletProfile");
                Intrinsics.checkNotNullParameter(juniorCardType, "juniorCardType");
                return pd.b.n(skm.p0.f264003c, new mp6.j(r2Var4, walletProfile, juniorCardType, (Continuation) null));
            case 5:
                r2 r2Var5 = (r2) f2Var.f211713p;
                r2Var5.getClass();
                pfm.h hVar3 = new pfm.h(new h2(r2Var5, 2), 2);
                Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
                return hVar3;
            case 6:
                u uVar2 = f2Var.f211713p;
                Object obj4 = ((ty0.a) obj2).d;
                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.country.CountryCode");
                wi0.b userCountryCode = (wi0.b) obj4;
                r2 r2Var6 = (r2) uVar2;
                r2Var6.getClass();
                Intrinsics.checkNotNullParameter(userCountryCode, "userCountryCode");
                mre.c cVar = r2Var6.f211799l;
                TermsScope.INSTANCE.getClass();
                int i32 = 13;
                pfm.a aVar4 = new pfm.a(((rre.d) cVar).c(TermsScope.S, userCountryCode), new i2(i32, new g2(r2Var6, i32)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar4, "flatMapCompletable(...)");
                return aVar4;
            case 7:
                u uVar3 = f2Var.f211713p;
                Object obj5 = ((ty0.a) obj2).d;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.country.CountryCode");
                wi0.b userCountryCode2 = (wi0.b) obj5;
                r2 r2Var7 = (r2) uVar3;
                r2Var7.getClass();
                Intrinsics.checkNotNullParameter(userCountryCode2, "userCountryCode");
                mre.c cVar2 = r2Var7.f211799l;
                TermsScope.INSTANCE.getClass();
                pfm.a aVar5 = new pfm.a(((rre.d) cVar2).c(TermsScope.o, userCountryCode2), new i2(6, new g2(r2Var7, 7)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar5, "flatMapCompletable(...)");
                return aVar5;
            case 8:
                akl.s sVar2 = f2Var.i;
                t it9 = (t) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                String str = it9.f211816a;
                Object obj6 = it9.f211817b;
                ifm.b bVar2 = f2Var.f239031a;
                u uVar4 = f2Var.f211713p;
                int i33 = 8;
                switch (str.hashCode()) {
                    case -2079087420:
                        if (str.equals("NEW_JUNIOR_CARD_LIST_ID")) {
                            f2Var.Q(kc8.a.PHYSICAL);
                        }
                        break;
                    case -2056760759:
                        if (str.equals("NEW_VIRTUAL_LIST_ID")) {
                            f2Var.S(e13.a.VIRTUAL);
                        }
                        break;
                    case -1547809081:
                        if (str.equals("NEW_DISPOSABLE_JOINT_LIST_ID")) {
                            aVar = new pfm.a(((r2) uVar4).i(e13.a.DISPOSABLE), new ly7.g(6, new p1(new BreadcrumbException(), i33)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                            jVar = new j7a.j(17, y1.f211856a);
                            m72.b.z(sVar2, aVar, jVar, "subscribe(...)", bVar2);
                        }
                        break;
                    case -1479330975:
                        if (str.equals("NEW_CREDIT_VIRTUAL_LIST_ID")) {
                            r2 r2Var8 = (r2) uVar4;
                            ufm.i iVar2 = new ufm.i(((t0) r2Var8.d).b(), new i2(22, new v0(7)), 1);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                            pfm.a aVar6 = new pfm.a(new ufm.i(ue0.e.I(iVar2, zhm.h0.f322473a, new v0(3)), new j0(28, new g2(r2Var8, i6)), 0), new j0(29, new g2(r2Var8, 2)), 4);
                            Intrinsics.checkNotNullExpressionValue(aVar6, "flatMapCompletable(...)");
                            aVar = new pfm.a(aVar6, new ly7.g(6, new p1(new BreadcrumbException(), 14)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                            jVar = new j7a.j(17, d2.f211698a);
                            m72.b.z(sVar2, aVar, jVar, "subscribe(...)", bVar2);
                        }
                        break;
                    case -1420215932:
                        if (str.equals("NEW_CREDIT_DISPOSABLE_LIST_ID")) {
                            r2 r2Var9 = (r2) uVar4;
                            ufm.b bVarM = efm.d0.m(f73.b.b(r2Var9.f211794b, b93.e.DISPOSABLE, AccountId.Personal.f51414a, xfa.b.CARDS_TAB_FULL_SCREEN, null, false, ((t0) r2Var9.d).c(), null, true, null, null, null, null, 7832));
                            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                            int i43 = 14;
                            pfm.a aVar7 = new pfm.a(bVarM, new i2(i43, new g2(r2Var9, i43)), 4);
                            Intrinsics.checkNotNullExpressionValue(aVar7, "flatMapCompletable(...)");
                            pfm.a aVar8 = new pfm.a(aVar7, new ly7.g(6, new p1(new BreadcrumbException(), i6)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
                            m72.b.z(sVar2, aVar8, new j7a.j(17, q1.f211788a), "subscribe(...)", bVar2);
                        }
                        break;
                    case -1258854978:
                        if (str.equals("NEW_PHYSICAL_JOINT_LIST_ID")) {
                            aVar = new pfm.a(((r2) uVar4).i(e13.a.PHYSICAL), new ly7.g(6, new p1(new BreadcrumbException(), 6)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                            jVar = new j7a.j(17, w1.f211849a);
                            m72.b.z(sVar2, aVar, jVar, "subscribe(...)", bVar2);
                        }
                        break;
                    case -853659158:
                        if (str.equals("NEW_DISPOSABLE_PRO_LIST_ID")) {
                            aVar = new pfm.a(((r2) uVar4).j(e13.a.DISPOSABLE), new ly7.g(6, new p1(new BreadcrumbException(), i5)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                            jVar = new j7a.j(17, t1.f211835a);
                            m72.b.z(sVar2, aVar, jVar, "subscribe(...)", bVar2);
                        }
                        break;
                    case 147757729:
                        if (str.equals("NEW_PHYSICAL_PRO_LIST_ID")) {
                            aVar = new pfm.a(((r2) uVar4).j(e13.a.PHYSICAL), new ly7.g(6, new p1(new BreadcrumbException(), 2)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                            jVar = new j7a.j(17, r1.f211792a);
                            m72.b.z(sVar2, aVar, jVar, "subscribe(...)", bVar2);
                        }
                        break;
                    case 680360088:
                        if (str.equals("DISCOVER_BALANCE_TRANSFER_CREDIT_CARD_LIST_ID")) {
                            r2 r2Var10 = (r2) uVar4;
                            r2Var10.getClass();
                            pfm.h hVar4 = new pfm.h(new h2(r2Var10, i3), 2);
                            Intrinsics.checkNotNullExpressionValue(hVar4, "fromAction(...)");
                            aVar = new pfm.a(hVar4, new ly7.g(6, new p1(new BreadcrumbException(), 12)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                            jVar = new j7a.j(17, b2.f211691a);
                            m72.b.z(sVar2, aVar, jVar, "subscribe(...)", bVar2);
                        }
                        break;
                    case 694933940:
                        if (str.equals("NEW_VIRTUAL_JOINT_LIST_ID")) {
                            aVar = new pfm.a(((r2) uVar4).i(e13.a.VIRTUAL), new ly7.g(6, new p1(new BreadcrumbException(), 7)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                            jVar = new j7a.j(17, x1.f211855a);
                            m72.b.z(sVar2, aVar, jVar, "subscribe(...)", bVar2);
                        }
                        break;
                    case 722979200:
                        if (str.equals("NEW_CRYPTO_VIRTUAL_CARD_LIST_ID")) {
                            r2 r2Var11 = (r2) uVar4;
                            pfm.a aVar9 = new pfm.a(r2Var11.f211794b.e(xfa.b.CARDS_TAB_FULL_SCREEN, ((t0) r2Var11.d).c()), new i2(i6, new g2(r2Var11, i5)), 4);
                            Intrinsics.checkNotNullExpressionValue(aVar9, "flatMapCompletable(...)");
                            aVar = new pfm.a(aVar9, new ly7.g(6, new p1(new BreadcrumbException(), 9)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                            jVar = new j7a.j(17, z1.f211860a);
                            m72.b.z(sVar2, aVar, jVar, "subscribe(...)", bVar2);
                        }
                        break;
                    case 1016828951:
                        if (str.equals("NEW_VIRTUAL_PRO_LIST_ID")) {
                            aVar = new pfm.a(((r2) uVar4).j(e13.a.VIRTUAL), new ly7.g(6, new p1(new BreadcrumbException(), 3)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                            jVar = new j7a.j(17, s1.f211806a);
                            m72.b.z(sVar2, aVar, jVar, "subscribe(...)", bVar2);
                        }
                        break;
                    case 1347826328:
                        if (str.equals("NEW_JUNIOR_VIRTUAL_CARD_LIST_ID")) {
                            f2Var.Q(kc8.a.VIRTUAL);
                        }
                        break;
                    case 1399336403:
                        if (str.equals("NEW_PHYSICAL_LIST_ID")) {
                            f2Var.S(e13.a.PHYSICAL);
                        }
                        break;
                    case 1514352733:
                        if (str.equals("DISCOVER_CREDIT_CARD_LIST_ID")) {
                            r2 r2Var12 = (r2) uVar4;
                            r2Var12.getClass();
                            pfm.h hVar5 = new pfm.h(new h2(r2Var12, 3), 2);
                            Intrinsics.checkNotNullExpressionValue(hVar5, "fromAction(...)");
                            aVar = new pfm.a(hVar5, new ly7.g(6, new p1(new BreadcrumbException(), 10)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                            jVar = new j7a.j(17, v1.f211845a);
                            m72.b.z(sVar2, aVar, jVar, "subscribe(...)", bVar2);
                        }
                        break;
                    case 1542393107:
                        if (str.equals("NEW_PAY_LATER_LIST_ID")) {
                            r2 r2Var13 = (r2) uVar4;
                            int i59 = 5;
                            pfm.a aVar10 = new pfm.a(r2Var13.f211794b.g(xfa.b.CARDS_TAB_FULL_SCREEN, ((t0) r2Var13.d).c()), new i2(3, new g2(r2Var13, i59)), 4);
                            Intrinsics.checkNotNullExpressionValue(aVar10, "flatMapCompletable(...)");
                            aVar = new pfm.a(aVar10, new ly7.g(6, new p1(new BreadcrumbException(), i59)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                            jVar = new j7a.j(17, u1.f211840a);
                            m72.b.z(sVar2, aVar, jVar, "subscribe(...)", bVar2);
                        }
                        break;
                    case 1717980337:
                        if (str.equals("DISCOVER_ADDITIONAL_CREDIT_CARD_LIST_ID")) {
                            ft3.q0 product = obj6 instanceof ft3.q0 ? (ft3.q0) obj6 : null;
                            if (product == null) {
                                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Couldn't open Additional Credit Card application. CreditApplicationProduct is null");
                                zhm.h0 h0Var3 = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var3);
                            } else {
                                r2 r2Var14 = (r2) uVar4;
                                r2Var14.getClass();
                                Intrinsics.checkNotNullParameter(product, "product");
                                pfm.h hVar6 = new pfm.h(new la8.j(r2Var14, product, 22), 2);
                                Intrinsics.checkNotNullExpressionValue(hVar6, "fromAction(...)");
                                aVar = new pfm.a(hVar6, new ly7.g(6, new p1(new BreadcrumbException(), 13)), 2);
                                Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                                jVar = new j7a.j(17, c2.f211695a);
                                m72.b.z(sVar2, aVar, jVar, "subscribe(...)", bVar2);
                            }
                        }
                        break;
                    case 2008076700:
                        if (str.equals("NEW_DISPOSABLE_LIST_ID")) {
                            f2Var.S(e13.a.DISPOSABLE);
                        }
                        break;
                    case 2040843766:
                        if (str.equals("NEW_CRYPTO_PHYSICAL_CARD_LIST_ID")) {
                            r2 r2Var15 = (r2) uVar4;
                            pfm.a aVar11 = new pfm.a(r2Var15.f211794b.d(xfa.b.CARDS_TAB_FULL_SCREEN, ((t0) r2Var15.d).c()), new i2(18, new g2(r2Var15, 15)), 4);
                            Intrinsics.checkNotNullExpressionValue(aVar11, "flatMapCompletable(...)");
                            aVar = new pfm.a(aVar11, new ly7.g(6, new p1(new BreadcrumbException(), 11)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                            jVar = new j7a.j(17, a2.f211685a);
                            m72.b.z(sVar2, aVar, jVar, "subscribe(...)", bVar2);
                        }
                        break;
                    case 2119790523:
                        if (str.equals("NEW_CREDIT_PHYSICAL_LIST_ID")) {
                            r2 r2Var16 = (r2) uVar4;
                            ufm.i iVar3 = new ufm.i(((t0) r2Var16.d).b(), new i2(7, new v0(i5)), 1);
                            Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                            ufm.i iVar4 = new ufm.i(ue0.e.I(iVar3, zhm.h0.f322473a, new v0(5)), new i2(i33, new g2(r2Var16, i33)), 0);
                            int i66 = 9;
                            pfm.a aVar12 = new pfm.a(iVar4, new i2(i66, new g2(r2Var16, i66)), 4);
                            Intrinsics.checkNotNullExpressionValue(aVar12, "flatMapCompletable(...)");
                            aVar = new pfm.a(aVar12, new ly7.g(6, new p1(new BreadcrumbException(), i3)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                            jVar = new j7a.j(17, e2.f211703a);
                            m72.b.z(sVar2, aVar, jVar, "subscribe(...)", bVar2);
                        }
                        break;
                }
                return Unit.f186387a;
            case 9:
                OrderNewCardContract$Configuration orderNewCardContract$Configuration = f2Var.f211716s;
                vf0.x xVar = (vf0.x) obj2;
                Intrinsics.checkNotNullParameter(xVar, "<destruct>");
                boolean zBooleanValue = ((Boolean) xVar.f288487a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) xVar.f288488b).booleanValue();
                boolean zBooleanValue3 = ((Boolean) xVar.f288489c).booleanValue();
                boolean zBooleanValue4 = ((Boolean) xVar.d).booleanValue();
                boolean zBooleanValue5 = ((Boolean) xVar.e).booleanValue();
                boolean zBooleanValue6 = ((Boolean) xVar.f).booleanValue();
                do3.n nVar = (do3.n) xVar.f288490g;
                Intrinsics.h(nVar);
                wi0.b.Companion.getClass();
                if (te0.w.S(nVar, wi0.b.M0)) {
                    SelectedTab[] elements = {zBooleanValue ? SelectedTab.CREDIT : null, SelectedTab.DEBIT, zBooleanValue4 ? SelectedTab.JOINT : null, zBooleanValue2 ? SelectedTab.PAY_LATER : null, zBooleanValue3 ? SelectedTab.FREELANCER : null, zBooleanValue5 ? SelectedTab.JUNIOR : null, zBooleanValue6 ? SelectedTab.CRYPTO : null};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    listL = kotlin.collections.d.L(elements);
                } else {
                    SelectedTab selectedTab = SelectedTab.DEBIT;
                    SelectedTab selectedTab2 = SelectedTab.JOINT;
                    if (!zBooleanValue4) {
                        selectedTab2 = null;
                    }
                    SelectedTab[] elements2 = {selectedTab, selectedTab2, zBooleanValue ? SelectedTab.CREDIT : null, zBooleanValue2 ? SelectedTab.PAY_LATER : null, zBooleanValue3 ? SelectedTab.FREELANCER : null, zBooleanValue5 ? SelectedTab.JUNIOR : null, zBooleanValue6 ? SelectedTab.CRYPTO : null};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    listL = kotlin.collections.d.L(elements2);
                }
                return !orderNewCardContract$Configuration.f65209b ? listL : listL.contains(orderNewCardContract$Configuration.f65208a) ? zhm.u.c(orderNewCardContract$Configuration.f65208a) : zhm.u.c(SelectedTab.DEBIT);
            case 10:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                wi0.b.Companion.getClass();
                if (te0.w.S(user, wi0.b.M0)) {
                    return new pfm.a(new rfm.j(((t0) f2Var.o).e(), new j0(19, new v0(i6)), i3), new j0(20, new u0(f2Var, i2)), 3);
                }
                return mVar;
            case 11:
                Boolean canShow = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(canShow, "canShow");
                if (canShow.booleanValue()) {
                    return mVar;
                }
                r rVar = f2Var.o;
                SelectedTab tab3 = SelectedTab.DEBIT;
                t0 t0Var4 = (t0) rVar;
                t0Var4.getClass();
                Intrinsics.checkNotNullParameter(tab3, "tab");
                s2 s2Var2 = (s2) t0Var4.i;
                return te0.w.z0(s2Var2.f211809c.getValue(s2Var2, s2.f211807p[1]), tab3);
            case 12:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                OrderNewCardContract$Configuration orderNewCardContract$Configuration2 = f2Var.f211716s;
                BackConfirmationDialog f64942c2 = orderNewCardContract$Configuration2.f65213j.getF64942c();
                if (f64942c2 != null) {
                    return f2Var.V(f64942c2);
                }
                CardOrderAccountWrapper cardOrderAccountWrapper = orderNewCardContract$Configuration2.f65210c;
                if (cardOrderAccountWrapper instanceof CardOrderAccountWrapper.Junior) {
                    return f2Var.X();
                }
                if (!(cardOrderAccountWrapper instanceof CardOrderAccountWrapper.Regular)) {
                    throw new NoWhenBranchMatchedException();
                }
                r2 r2Var17 = (r2) f2Var.f211713p;
                r2Var17.getClass();
                pfm.h hVar7 = new pfm.h(new h2(r2Var17, i6), 2);
                Intrinsics.checkNotNullExpressionValue(hVar7, "fromAction(...)");
                return hVar7;
            case 13:
                Intrinsics.checkNotNullParameter((Boolean) obj2, "it");
                r rVar2 = f2Var.o;
                SelectedTab tab4 = SelectedTab.CREDIT;
                t0 t0Var5 = (t0) rVar2;
                t0Var5.getClass();
                Intrinsics.checkNotNullParameter(tab4, "tab");
                s2 s2Var3 = (s2) t0Var5.i;
                return te0.w.z0(s2Var3.f211809c.getValue(s2Var3, s2.f211807p[1]), tab4);
            case 14:
                u uVar5 = f2Var.f211713p;
                p action = (p) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                if (Intrinsics.f(action, l.f211756a)) {
                    r2 r2Var18 = (r2) uVar5;
                    r2Var18.getClass();
                    pfm.h hVar8 = new pfm.h(new h2(r2Var18, i5), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar8, "fromAction(...)");
                    return hVar8;
                }
                if (action instanceof n) {
                    return ((opi.b) f2Var.f211717t).a0(((n) action).f211766a);
                }
                if (!(action instanceof m)) {
                    if (!(action instanceof o)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pfm.h hVar9 = new pfm.h(new la8.j(f2Var, action, 20), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar9, "fromAction(...)");
                    return o70.a.d(hVar9);
                }
                m mVar2 = (m) action;
                psg.a walletProfile2 = mVar2.f211762a;
                kc8.a juniorCardType2 = mVar2.f211763b;
                r2 r2Var19 = (r2) uVar5;
                r2Var19.getClass();
                Intrinsics.checkNotNullParameter(walletProfile2, "walletProfile");
                Intrinsics.checkNotNullParameter(juniorCardType2, "juniorCardType");
                return pd.b.n(skm.p0.f264003c, new mp6.j(r2Var19, walletProfile2, juniorCardType2, (Continuation) null));
            case 15:
                return a(obj2);
            default:
                e parcel = (e) obj2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                opi.d dVar2 = f2Var.f211717t;
                u uVar6 = f2Var.f211713p;
                ((opi.b) dVar2).N().b(true);
                e13.a aVar13 = parcel.f211699a;
                h93.l0 l0Var = parcel.f211700b;
                int i74 = z0.f211857a[aVar13.ordinal()];
                if (i74 == 1) {
                    return ((r2) uVar6).l(l0Var);
                }
                if (i74 == 2) {
                    return ((r2) uVar6).m(l0Var);
                }
                if (i74 == 3) {
                    return ((r2) uVar6).k(l0Var);
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
