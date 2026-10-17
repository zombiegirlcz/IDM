package mj1;

import kotlin.jvm.internal.Intrinsics;
import sf0.h;
import v60.e;
import vh1.d;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zi1.d f205896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f205897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f205898c;

    public b(zi1.d addressInteractor, h errorParser, e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(addressInteractor, "addressInteractor");
        Intrinsics.checkNotNullParameter(errorParser, "errorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f205896a = addressInteractor;
        this.f205897b = errorParser;
        this.f205898c = serverErrorsProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // vh1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.address.models.Address r11, com.revolut.feature.address.models.AddressFormat r12, gim.c r13) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r13 instanceof mj1.a
            if (r0 == 0) goto L13
            r0 = r13
            mj1.a r0 = (mj1.a) r0
            int r1 = r0.f205895w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f205895w = r1
            goto L18
        L13:
            mj1.a r0 = new mj1.a
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f205895w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r13)     // Catch: java.lang.Exception -> L27
            goto L5d
        L27:
            r0 = move-exception
            r11 = r0
            goto L60
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            yhm.o.b(r13)
            zi1.d r13 = r10.f205896a     // Catch: java.lang.Exception -> L27
            r0.f205895w = r3     // Catch: java.lang.Exception -> L27
            cj1.k r5 = r13.f322492a     // Catch: java.lang.Exception -> L27
            r5.getClass()     // Catch: java.lang.Exception -> L27
            c34.d r4 = new c34.d     // Catch: java.lang.Exception -> L27
            r9 = 23
            r8 = 0
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L27
            skm.p0 r11 = skm.p0.f264001a     // Catch: java.lang.Exception -> L27
            elm.f r11 = elm.f.f127540b     // Catch: java.lang.Exception -> L27
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)     // Catch: java.lang.Exception -> L27
            if (r11 != r1) goto L53
            goto L55
        L53:
            kotlin.Unit r11 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L27
        L55:
            if (r11 != r1) goto L58
            goto L5a
        L58:
            kotlin.Unit r11 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L27
        L5a:
            if (r11 != r1) goto L5d
            return r1
        L5d:
            vh1.c$a r11 = vh1.c.a.f289268a     // Catch: java.lang.Exception -> L27
            return r11
        L60:
            boolean r12 = r11 instanceof java.util.concurrent.CancellationException
            if (r12 != 0) goto L8e
            sf0.h r12 = r10.f205897b
            com.revolut.core.error.data.model.ServerError r11 = r12.a(r11)
            if (r11 == 0) goto L7f
            int r11 = r11.getF51362a()
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            v60.e r11 = r10.f205898c
            ao0.a r11 = (ao0.a) r11
            v60.c r11 = r11.b(r12)
            if (r11 != 0) goto L84
        L7f:
            v60.b r11 = new v60.b
            r11.<init>()
        L84:
            vh1.a r12 = new vh1.a
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = ofm.q.O(r11)
            r12.<init>(r11)
            return r12
        L8e:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mj1.b.a(com.revolut.feature.address.models.Address, com.revolut.feature.address.models.AddressFormat, gim.c):java.lang.Object");
    }
}
