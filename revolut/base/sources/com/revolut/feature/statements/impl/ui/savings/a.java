package com.revolut.feature.statements.impl.ui.savings;

import ang.f;
import cli.y;
import com.revolut.data.model.Data;
import i0e.e;
import i0e.v;
import iyg.b0;
import jyk.d0;
import k0e.g;
import k0e.n;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import mra.d;
import n0e.b;
import oki.h;
import vkm.q;
import w4l.j;
import yji.l;
import zhm.f0;
import zxd.c;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements g {
    public final SavingsStatementsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f88375p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hk0.a f88376q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ij0.a f88377r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vyd.a f88378s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f88379t;
    public final e u;
    public final elb.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f88380w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f88381x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f88382y;

    public a(SavingsStatementsScreenContract$InputData inputData, c statementsInteractor, hk0.a networkFileRepository, ij0.a coreNetworkConfiguration, vyd.a dialogModelConfigurationFactory, b statementsNaviCommandsFactory, e periodSelector, elb.b savingsConfigInteractor, f userInteractor, k0e.f mapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(coreNetworkConfiguration, "coreNetworkConfiguration");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        Intrinsics.checkNotNullParameter(statementsNaviCommandsFactory, "statementsNaviCommandsFactory");
        Intrinsics.checkNotNullParameter(periodSelector, "periodSelector");
        Intrinsics.checkNotNullParameter(savingsConfigInteractor, "savingsConfigInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = inputData;
        this.f88375p = statementsInteractor;
        this.f88376q = networkFileRepository;
        this.f88377r = coreNetworkConfiguration;
        this.f88378s = dialogModelConfigurationFactory;
        this.f88379t = statementsNaviCommandsFactory;
        this.u = periodSelector;
        this.v = savingsConfigInteractor;
        this.f88380w = userInteractor;
        this.f88381x = d.b(this, new k0e.e("TAB_ID_PDF", inputData.f88372a, new v(f0.f322471a), null, new Data(null, null, true, 3, null), inputData.f88373b.contains(pcd.b.PERSONAL_JOINT), new Data(null, null, true, 3, null)), mapper, null, false, 12);
        this.f88382y = hx7.e.a(this, new jnf.d(this, 27));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.statements.impl.ui.savings.a r8, java.lang.String r9, com.revolut.feature.statements.api.models.StatementsFormat r10, gim.c r11) {
        /*
            boolean r0 = r11 instanceof k0e.l
            if (r0 == 0) goto L14
            r0 = r11
            k0e.l r0 = (k0e.l) r0
            int r1 = r0.f180036w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f180036w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            k0e.l r0 = new k0e.l
            r0.<init>(r8, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f180036w
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            yhm.o.b(r11)
            r1 = r8
            goto L62
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            yhm.o.b(r11)
            int[] r11 = k0e.k.f180034a
            int r10 = r10.ordinal()
            r10 = r11[r10]
            r11 = 0
            if (r10 == r2) goto L6b
            r1 = 2
            if (r10 != r1) goto L65
            ack.n r4 = new ack.n
            r10 = 28
            r4.<init>(r10)
            a3b.h r3 = new a3b.h
            r3.<init>(r8, r10)
            inh.g r5 = new inh.g
            r10 = 27
            r5.<init>(r9, r8, r11, r10)
            r6.f180036w = r2
            r2 = 0
            r7 = 1
            r1 = r8
            java.lang.Object r11 = n14.k.Q(r1, r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L62
            return r0
        L62:
            nii.e r11 = (nii.e) r11
            goto L78
        L65:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L6b:
            r1 = r8
            nii.d r8 = new nii.d
            n0e.b r10 = r1.f88379t
            com.revolut.retail.core.navigation.FeatureCommand r9 = r10.c(r11, r9)
            r8.<init>(r9, r11)
            r11 = r8
        L78:
            boolean r8 = r11 instanceof nii.d
            if (r8 == 0) goto L8a
            nii.d r11 = (nii.d) r11
            java.lang.Object r8 = r11.f216133a
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
            com.revolut.kompot.bridge.navigation.BridgeDestination r8 = zh9.u0.b(r8)
            r1.C1(r8)
        L8a:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.statements.impl.ui.savings.a.I2(com.revolut.feature.statements.impl.ui.savings.a, java.lang.String, com.revolut.feature.statements.api.models.StatementsFormat, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        elb.b bVar = this.v;
        j jVar = j.f294644c;
        Continuation continuation = null;
        l.a1(this, bVar.a(jVar), null, null, new n(this, continuation, 0), 3);
        l.a1(this, q.Q(new b0(this.f88381x.B(new h0() { // from class: k0e.o
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((e) obj2).f180025b;
            }
        }), 11), new jy6.l(continuation, this, 2)), null, null, new n(this, continuation, 1), 3);
        l.a1(this, nim.a.v(this.f88380w.j(jVar), new d0(19)), null, null, new n(this, continuation, 2), 3);
        l.a1(this, ((i0e.q) this.u).f157383p, null, null, new n(this, continuation, 3), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f88382y;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f88381x;
    }
}
