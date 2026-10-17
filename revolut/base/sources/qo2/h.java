package qo2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pn2.d f247991a;

    public h(pn2.d repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f247991a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof qo2.g
            if (r0 == 0) goto L13
            r0 = r13
            qo2.g r0 = (qo2.g) r0
            int r1 = r0.f247990w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f247990w = r1
            goto L18
        L13:
            qo2.g r0 = new qo2.g
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f247990w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L28
            goto L50
        L28:
            r0 = move-exception
            r12 = r0
            r7 = r12
            goto Lac
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            yhm.o.b(r13)
            pn2.d r13 = r11.f247991a     // Catch: java.lang.Throwable -> L28
            r0.f247990w = r3     // Catch: java.lang.Throwable -> L28
            r13.getClass()     // Catch: java.lang.Throwable -> L28
            pn2.b r2 = new pn2.b     // Catch: java.lang.Throwable -> L28
            r5 = 2
            r2.<init>(r13, r12, r4, r5)     // Catch: java.lang.Throwable -> L28
            skm.p0 r12 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L28
            elm.f r12 = elm.f.f127540b     // Catch: java.lang.Throwable -> L28
            java.lang.Object r13 = skm.e0.J(r12, r2, r0)     // Catch: java.lang.Throwable -> L28
            if (r13 != r1) goto L50
            return r1
        L50:
            qo2.j r13 = (qo2.j) r13     // Catch: java.lang.Throwable -> L28
            java.lang.String r12 = r13.f247994a     // Catch: java.lang.Throwable -> L28
            com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.domain.DatePickerConfig r0 = r13.f247996c     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L61
            com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.domain.DatePickerConfig r0 = new com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.domain.DatePickerConfig     // Catch: java.lang.Throwable -> L28
            java.time.LocalDate r1 = r13.d     // Catch: java.lang.Throwable -> L28
            zhm.h0 r2 = zhm.h0.f322473a     // Catch: java.lang.Throwable -> L28
            r0.<init>(r4, r1, r4, r2)     // Catch: java.lang.Throwable -> L28
        L61:
            java.util.ArrayList r13 = r13.f247995b     // Catch: java.lang.Throwable -> L28
            r1 = 10
            int r1 = zhm.w.t(r13, r1)     // Catch: java.lang.Throwable -> L28
            int r1 = zhm.q0.b(r1)     // Catch: java.lang.Throwable -> L28
            r2 = 16
            if (r1 >= r2) goto L72
            r1 = r2
        L72:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L28
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L28
        L7b:
            boolean r1 = r13.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L9d
            java.lang.Object r1 = r13.next()     // Catch: java.lang.Throwable -> L28
            qo2.b r1 = (qo2.b) r1     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r1.f247981a     // Catch: java.lang.Throwable -> L28
            qo2.i r6 = new qo2.i     // Catch: java.lang.Throwable -> L28
            boolean r7 = r1.f247984g     // Catch: java.lang.Throwable -> L28
            if (r7 == 0) goto L95
            boolean r7 = r1.f247987l     // Catch: java.lang.Throwable -> L28
            if (r7 == 0) goto L95
            r7 = r3
            goto L96
        L95:
            r7 = 0
        L96:
            r6.<init>(r1, r7)     // Catch: java.lang.Throwable -> L28
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L28
            goto L7b
        L9d:
            qo2.k r6 = new qo2.k     // Catch: java.lang.Throwable -> L28
            r6.<init>(r12, r2, r0)     // Catch: java.lang.Throwable -> L28
            com.revolut.data.model.Data r5 = new com.revolut.data.model.Data     // Catch: java.lang.Throwable -> L28
            r9 = 6
            r10 = 0
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L28
            return r5
        Lac:
            zhm.h0 r12 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r13 = rd0.d.f253311a
            rd0.c r13 = rd0.c.ERROR
            java.lang.String r0 = "PaymentReviewInteractor"
            rd0.d.a(r13, r0, r4, r7, r12)
            com.revolut.data.model.Data r5 = new com.revolut.data.model.Data
            r9 = 5
            r10 = 0
            r6 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qo2.h.a(java.lang.String, gim.c):java.lang.Object");
    }
}
