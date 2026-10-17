package com.revolut.feature.subaccount.impl.ui.create.flow.main;

import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType;
import com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$Step;
import com.revolut.kompot.navigable.vc.ViewController;
import g48.r0;
import g6e.d;
import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import s56.d0;
import t7e.f;
import t7e.k;
import vkm.j2;
import w38.t;
import yki.i;
import zfe.e;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends h implements t7e.b {
    public final CreateSubaccountFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f89036p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zja.a f89037q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f89038r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g6e.b f89039s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l2j.a f89040t;
    public final r7e.c u;
    public final k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r0 f89041w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t f89042x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f89043y;
    public final qki.d z;

    public c(CreateSubaccountFlowContract$InputData inputData, d subaccountInteractor, zja.a productArticleInteractor, e newAccountDestinationResolver, g6e.b subaccountBackgroundInteractor, l2j.a currencyChooserFlowFactory, r7e.c currencyPickerInteractor, k subaccountProductArticleConfigResolver, r0 jointAccountsInteractor, t jointPendingAccountBottomSheetProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(newAccountDestinationResolver, "newAccountDestinationResolver");
        Intrinsics.checkNotNullParameter(subaccountBackgroundInteractor, "subaccountBackgroundInteractor");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(currencyPickerInteractor, "currencyPickerInteractor");
        Intrinsics.checkNotNullParameter(subaccountProductArticleConfigResolver, "subaccountProductArticleConfigResolver");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(jointPendingAccountBottomSheetProvider, "jointPendingAccountBottomSheetProvider");
        this.o = inputData;
        this.f89036p = subaccountInteractor;
        this.f89037q = productArticleInteractor;
        this.f89038r = newAccountDestinationResolver;
        this.f89039s = subaccountBackgroundInteractor;
        this.f89040t = currencyChooserFlowFactory;
        this.u = currencyPickerInteractor;
        this.v = subaccountProductArticleConfigResolver;
        this.f89041w = jointAccountsInteractor;
        this.f89042x = jointPendingAccountBottomSheetProvider;
        this.f89043y = d8l.d.a(this, new suf.a(this, 23));
        this.z = hx7.e.b(this, new CreateSubaccountFlowContract$State(null, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.subaccount.impl.ui.create.flow.main.c r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof t7e.h
            if (r0 == 0) goto L13
            r0 = r6
            t7e.h r0 = (t7e.h) r0
            int r1 = r0.f268647w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268647w = r1
            goto L18
        L13:
            t7e.h r0 = new t7e.h
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f268647w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r6)
            goto L55
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            yhm.o.b(r6)
            g48.r0 r5 = r5.f89041w
            n38.q r6 = n38.q.PENDING
            java.util.Set r6 = zhm.y0.b(r6)
            w4l.h r2 = w4l.h.f294642c
            cxe.u r5 = r5.e(r6, r2)
            t5e.j r6 = new t5e.j
            r2 = 9
            r6.<init>(r2)
            jhi.b r5 = mo3.a.g(r5, r3, r6, r4)
            r0.f268647w = r4
            java.lang.Object r6 = vkm.q.z(r5, r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            od0.i r6 = (od0.i) r6
            if (r6 == 0) goto L5e
            java.lang.Object r5 = r6.f224257a
            r3 = r5
            n38.a r3 = (n38.a) r3
        L5e:
            if (r3 == 0) goto L61
            goto L62
        L61:
            r4 = 0
        L62:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.subaccount.impl.ui.create.flow.main.c.I2(com.revolut.feature.subaccount.impl.ui.create.flow.main.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.subaccount.impl.ui.create.flow.main.c r4, com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig.Config r5, t7e.c r6, sii.a r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof t7e.i
            if (r0 == 0) goto L13
            r0 = r8
            t7e.i r0 = (t7e.i) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            t7e.i r0 = new t7e.i
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f268649x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            sii.a r7 = r0.f268648w
            t7e.c r6 = r0.v
            com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig$Config r5 = r0.u
            yhm.o.b(r8)
            goto L5f
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            yhm.o.b(r8)
            if (r5 != 0) goto L40
            r7.invoke()
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L40:
            com.revolut.feature.product_article.api.models.ProductArticleParams r8 = r5.f88928a
            boolean r2 = r5.f88929b
            if (r2 != 0) goto L4a
            r6.invoke(r8)
            goto L70
        L4a:
            zja.a r4 = r4.f89037q
            r0.u = r5
            r0.v = r6
            r0.f268648w = r7
            r0.z = r3
            kka.h r4 = (kka.h) r4
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r2 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r8 = r4.e(r8, r2, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r4 = r8.booleanValue()
            if (r4 == 0) goto L6d
            com.revolut.feature.product_article.api.models.ProductArticleParams r4 = r5.f88928a
            r6.invoke(r4)
            goto L70
        L6d:
            r7.invoke()
        L70:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.subaccount.impl.ui.create.flow.main.c.J2(com.revolut.feature.subaccount.impl.ui.create.flow.main.c, com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig$Config, t7e.c, sii.a, gim.c):java.lang.Object");
    }

    public final ViewController K2(CreateSubaccountFlowContract$Step.ProductArticle productArticle) {
        ViewController viewControllerE1 = e1(new ProductArticleDescriptor(productArticle.getF89028a(), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
        sx2.h block = new sx2.h(productArticle, this, 29);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerE1.H = block;
        return viewControllerE1;
    }

    public final void L2(ArrayList arrayList) {
        SubaccountType subaccountTypeC;
        SubaccountType subaccountTypeC2;
        boolean z = this.o.f89017c;
        qki.d dVar = this.z;
        if (!z) {
            CreateSubaccountFlowContract$SubaccountInfo createSubaccountFlowContract$SubaccountInfo = ((CreateSubaccountFlowContract$State) ((j2) dVar.f22677a).getValue()).f89018a;
            if (createSubaccountFlowContract$SubaccountInfo == null || (subaccountTypeC = com.revolut.feature.subaccount.api.models.a.c(createSubaccountFlowContract$SubaccountInfo.f89033a)) == null) {
                return;
            }
            l2(new f(this, subaccountTypeC, createSubaccountFlowContract$SubaccountInfo, arrayList, null), new yi5.b(26));
            return;
        }
        t7e.c cVar = new t7e.c(this, 0);
        CreateSubaccountFlowContract$SubaccountInfo createSubaccountFlowContract$SubaccountInfo2 = ((CreateSubaccountFlowContract$State) ((j2) dVar.f22677a).getValue()).f89018a;
        if (createSubaccountFlowContract$SubaccountInfo2 == null || (subaccountTypeC2 = com.revolut.feature.subaccount.api.models.a.c(createSubaccountFlowContract$SubaccountInfo2.f89033a)) == null) {
            return;
        }
        l2(new d0(this, subaccountTypeC2, createSubaccountFlowContract$SubaccountInfo2, arrayList, cVar, (Continuation) null), new yi5.b(26));
    }

    @Override // yki.j
    public final void M0() {
        l2(new b(this, null), new yi5.b(26));
    }

    public final CreateSubaccountFlowContract$Step M2() {
        Set set = this.o.f89015a;
        if (set == null || set.size() != 1) {
            return CreateSubaccountFlowContract$Step.ChooseNewTypeScreen.f89022a;
        }
        CreateSubaccountFlowProvider$CreateSubaccountType createSubaccountFlowProvider$CreateSubaccountType = (CreateSubaccountFlowProvider$CreateSubaccountType) zhm.d0.a0(set);
        SubaccountType subaccountTypeB = v6e.b.b(createSubaccountFlowProvider$CreateSubaccountType);
        if (subaccountTypeB != null) {
            return new CreateSubaccountFlowContract$Step.InfoPickerScreen(subaccountTypeB, createSubaccountFlowProvider$CreateSubaccountType.getF88967a());
        }
        throw new UnsupportedOperationException();
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.z;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f89043y;
    }
}
