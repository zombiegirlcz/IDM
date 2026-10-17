package zrc;

import akg.n;
import ang.f;
import by9.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import zp5.g;
import zr2.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bsc.b f324674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ay9.b f324675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f324676c;

    public d(bsc.b repository, ay9.b recipientPaymentsSettingsRepository, f userInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(recipientPaymentsSettingsRepository, "recipientPaymentsSettingsRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f324674a = repository;
        this.f324675b = recipientPaymentsSettingsRepository;
        this.f324676c = userInteractor;
    }

    public final Object a(xi0.b bVar, xi0.b bVar2, boolean z, gim.c cVar) {
        return (z && cp5.d.z(bVar) && cp5.d.A(bVar2)) ? c(cVar) : vrc.e.f291574a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof zrc.b
            if (r0 == 0) goto L13
            r0 = r8
            zrc.b r0 = (zrc.b) r0
            int r1 = r0.f324672w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f324672w = r1
            goto L18
        L13:
            zrc.b r0 = new zrc.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f324672w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L70
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            goto L5d
        L36:
            yhm.o.b(r8)
            com.revolut.feature.payments.recipients.settings.models.b r8 = new com.revolut.feature.payments.recipients.settings.models.b
            com.revolut.feature.payments.recipients.settings.models.RecipientsPaymentsSettingsRequest$Recipient r2 = new com.revolut.feature.payments.recipients.settings.models.RecipientsPaymentsSettingsRequest$Recipient
            iy9.d r5 = iy9.d.COMPANY
            r2.<init>(r5, r7)
            java.util.Set r7 = zhm.y0.b(r2)
            iy9.c r2 = iy9.c.TWO_FA_REQUIRED
            com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings$Setting$Value$Binary r5 = new com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings$Setting$Value$Binary
            r5.<init>(r4)
            r8.<init>(r7, r2, r5)
            r0.f324672w = r4
            ay9.b r7 = r6.f324675b
            by9.j r7 = (by9.j) r7
            java.lang.Object r7 = r7.c(r8, r0)
            if (r7 != r1) goto L5d
            goto L6f
        L5d:
            r0.f324672w = r3
            bsc.b r7 = r6.f324674a
            x4l.c r7 = r7.d
            kotlin.Unit r8 = kotlin.Unit.f186387a
            r2 = 0
            java.lang.Object r7 = r7.d(r8, r2, r0)
            if (r7 != r1) goto L6d
            r8 = r7
        L6d:
            if (r8 != r1) goto L70
        L6f:
            return r1
        L70:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zrc.d.b(java.lang.String, gim.c):java.lang.Object");
    }

    public final Object c(Continuation continuation) {
        g gVar = new g(this, null, 4);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, gVar, continuation);
    }

    public final n d() {
        return nim.a.v(rd0.e.b(((j) this.f324675b).a()), new o(4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zrc.c
            if (r0 == 0) goto L13
            r0 = r9
            zrc.c r0 = (zrc.c) r0
            int r1 = r0.f324673w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f324673w = r1
            goto L18
        L13:
            zrc.c r0 = new zrc.c
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f324673w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r9)
            goto L70
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r9)
            goto L5e
        L37:
            yhm.o.b(r9)
            com.revolut.feature.payments.recipients.settings.models.b r9 = new com.revolut.feature.payments.recipients.settings.models.b
            com.revolut.feature.payments.recipients.settings.models.RecipientsPaymentsSettingsRequest$Recipient r2 = new com.revolut.feature.payments.recipients.settings.models.RecipientsPaymentsSettingsRequest$Recipient
            iy9.d r6 = iy9.d.COMPANY
            r2.<init>(r6, r8)
            java.util.Set r8 = zhm.y0.b(r2)
            iy9.c r2 = iy9.c.TWO_FA_REQUIRED
            com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings$Setting$Value$Binary r6 = new com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings$Setting$Value$Binary
            r6.<init>(r3)
            r9.<init>(r8, r2, r6)
            r0.f324673w = r5
            ay9.b r8 = r7.f324675b
            by9.j r8 = (by9.j) r8
            java.lang.Object r8 = r8.c(r9, r0)
            if (r8 != r1) goto L5e
            goto L6f
        L5e:
            r0.f324673w = r4
            bsc.b r8 = r7.f324674a
            x4l.c r8 = r8.d
            kotlin.Unit r9 = kotlin.Unit.f186387a
            java.lang.Object r8 = r8.d(r9, r3, r0)
            if (r8 != r1) goto L6d
            r9 = r8
        L6d:
            if (r9 != r1) goto L70
        L6f:
            return r1
        L70:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zrc.d.e(java.lang.String, gim.c):java.lang.Object");
    }
}
