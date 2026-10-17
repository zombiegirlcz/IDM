package bp2;

import elm.f;
import gim.i;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pn2.d f17545a;

    public c(pn2.d repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f17545a = repository;
    }

    public final Object a(String str, i iVar) throws Throwable {
        pn2.d dVar = this.f17545a;
        dVar.getClass();
        pn2.b bVar = new pn2.b(dVar, str, null, 0);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(f.f127540b, bVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(mn2.a r13, wn2.d r14, com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState r15, java.time.LocalDate r16, wn2.a r17, gim.c r18) {
        /*
            r12 = this;
            r0 = r18
            boolean r1 = r0 instanceof bp2.b
            if (r1 == 0) goto L15
            r1 = r0
            bp2.b r1 = (bp2.b) r1
            int r2 = r1.f17544w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f17544w = r2
            goto L1a
        L15:
            bp2.b r1 = new bp2.b
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f17544w
            r4 = 1
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2e
            yhm.o.b(r0)     // Catch: java.lang.Throwable -> L2a
        L28:
            r14 = r0
            goto L5a
        L2a:
            r0 = move-exception
            r13 = r0
            r2 = r13
            goto L6b
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            yhm.o.b(r0)
            pn2.d r10 = r12.f17545a     // Catch: java.lang.Throwable -> L2a
            r1.f17544w = r4     // Catch: java.lang.Throwable -> L2a
            r10.getClass()     // Catch: java.lang.Throwable -> L2a
            ac8.h r3 = new ac8.h     // Catch: java.lang.Throwable -> L2a
            r11 = 0
            r4 = 23
            r5 = r13
            r6 = r14
            r7 = r15
            r9 = r16
            r8 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L2a
            skm.p0 r13 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L2a
            elm.f r13 = elm.f.f127540b     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r0 = skm.e0.J(r13, r3, r1)     // Catch: java.lang.Throwable -> L2a
            if (r0 != r2) goto L28
            return r2
        L5a:
            com.revolut.data.model.Data r13 = new com.revolut.data.model.Data     // Catch: java.lang.Throwable -> L2a
            r15 = 0
            r0 = 0
            r1 = 6
            r2 = 0
            r16 = r15
            r15 = r0
            r17 = r1
            r18 = r2
            r13.<init>(r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L2a
            return r13
        L6b:
            zhm.h0 r13 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r14 = rd0.d.f253311a
            rd0.c r14 = rd0.c.ERROR
            r15 = 0
            java.lang.String r0 = "BankAccountSwitchingReviewInteractor"
            rd0.d.a(r14, r0, r15, r2, r13)
            com.revolut.data.model.Data r0 = new com.revolut.data.model.Data
            r4 = 5
            r5 = 0
            r1 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bp2.c.b(mn2.a, wn2.d, com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState, java.time.LocalDate, wn2.a, gim.c):java.lang.Object");
    }

    public final Object c(String str, i iVar) throws Throwable {
        pn2.d dVar = this.f17545a;
        dVar.getClass();
        pn2.b bVar = new pn2.b(dVar, str, null, 4);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(f.f127540b, bVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
