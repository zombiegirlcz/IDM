package com.revolut.feature.kyc.impl.screens.addressconfirmation;

import ang.f;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import mra.d;
import oki.h;
import skm.a2;
import w39.b;
import wtj.c;
import ww8.i;
import ww8.m;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements i {
    public final AddressConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f77851p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f77852q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f77853r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f77854s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f77855t;

    public a(AddressConfirmationScreenContract$InputData inputData, f userInteractor, b locationInteractor, m stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f77851p = userInteractor;
        this.f77852q = locationInteractor;
        this.f77854s = d.b(this, new ww8.f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f77855t = e.a(this, new c(this, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.kyc.impl.screens.addressconfirmation.a r6, com.revolut.data.model.Data r7, gim.c r8) {
        /*
            cli.y r0 = r6.f77854s
            boolean r1 = r8 instanceof ww8.l
            if (r1 == 0) goto L15
            r1 = r8
            ww8.l r1 = (ww8.l) r1
            int r2 = r1.f300631x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f300631x = r2
            goto L1a
        L15:
            ww8.l r1 = new ww8.l
            r1.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f300631x
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2e
            com.revolut.data.model.Data r7 = r1.u
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2c
            goto L5e
        L2c:
            r8 = move-exception
            goto L79
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            yhm.o.b(r8)
            wug.i r8 = new wug.i
            r3 = 14
            r8.<init>(r7, r3)
            r6.H2(r0, r8)
            java.lang.Object r8 = r7.getContent()     // Catch: java.lang.Throwable -> L2c
            if (r8 == 0) goto L6a
            com.revolut.feature.address.models.Address r8 = (com.revolut.feature.address.models.Address) r8     // Catch: java.lang.Throwable -> L2c
            w39.b r3 = r6.f77852q     // Catch: java.lang.Throwable -> L2c
            z39.b r3 = (z39.b) r3     // Catch: java.lang.Throwable -> L2c
            rfm.w r8 = r3.d(r8)     // Catch: java.lang.Throwable -> L2c
            r1.u = r7     // Catch: java.lang.Throwable -> L2c
            r1.f300631x = r4     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r8 = nim.a.i(r8, r1)     // Catch: java.lang.Throwable -> L2c
            if (r8 != r2) goto L5e
            return r2
        L5e:
            com.revolut.feature.location.api.domain.models.location.LocationDomain r8 = (com.revolut.feature.location.api.domain.models.location.LocationDomain) r8     // Catch: java.lang.Throwable -> L2c
            od0.h r1 = od0.i.Companion     // Catch: java.lang.Throwable -> L2c
            r1.getClass()     // Catch: java.lang.Throwable -> L2c
            od0.i r8 = od0.h.a(r8)     // Catch: java.lang.Throwable -> L2c
            goto L6b
        L6a:
            r8 = r5
        L6b:
            java.lang.Throwable r1 = r7.getError()     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r7.getLoading()     // Catch: java.lang.Throwable -> L2c
            com.revolut.data.model.Data r3 = new com.revolut.data.model.Data     // Catch: java.lang.Throwable -> L2c
            r3.<init>(r8, r1, r2)     // Catch: java.lang.Throwable -> L2c
            goto L82
        L79:
            com.revolut.data.model.Data r3 = new com.revolut.data.model.Data
            boolean r7 = r7.getLoading()
            r3.<init>(r5, r8, r7)
        L82:
            wug.i r7 = new wug.i
            r8 = 15
            r7.<init>(r3, r8)
            r6.H2(r0, r7)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.kyc.impl.screens.addressconfirmation.a.I2(com.revolut.feature.kyc.impl.screens.addressconfirmation.a, com.revolut.data.model.Data, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        J2();
    }

    public final void J2() {
        a2 a2Var = this.f77853r;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f77853r = l.a1(this, nim.a.v(this.f77851p.j(w4l.h.f294642c), new h0() { // from class: ww8.k
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((do3.n) obj2).k;
            }
        }), null, null, new wtj.f(this, continuation, 5), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f77855t;
    }

    @Override // cli.z
    public final g getState() {
        return this.f77854s;
    }
}
