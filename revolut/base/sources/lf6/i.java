package lf6;

import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ boolean A;
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f194649w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ArrayList f194650x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ OpenBankingBrazilPayment.EditableDateField f194651y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, String str, ArrayList arrayList, OpenBankingBrazilPayment.EditableDateField editableDateField, boolean z, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f194649w = str;
        this.f194650x = arrayList;
        this.f194651y = editableDateField;
        this.z = z;
        this.A = z3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.v, this.f194649w, this.f194650x, this.f194651y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        if (skm.e0.o(r3, r10) == r0) goto L28;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            yhm.o.b(r11)
            goto L9b
        L11:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L19:
            yhm.o.b(r11)
            goto L7e
        L1d:
            yhm.o.b(r11)
            lf6.j r11 = r10.v
            com.revolut.feature.external_accounts.impl.data.open_banking_brazil.OpenBankingBrazilService r11 = r11.f194653b
            java.util.ArrayList r1 = new java.util.ArrayList
            r4 = 10
            java.util.ArrayList r5 = r10.f194650x
            int r4 = zhm.w.t(r5, r4)
            r1.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L35:
            boolean r5 = r4.hasNext()
            r6 = 0
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment$EditableMoneyField r5 = (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment.EditableMoneyField) r5
            mf6.k$b r7 = new mf6.k$b
            java.lang.String r8 = r5.f72402a
            dj0.d r5 = r5.d
            if (r5 == 0) goto L4e
            jo3.a r6 = mo3.a.p(r5)
        L4e:
            r7.<init>(r6, r8)
            r1.add(r7)
            goto L35
        L55:
            com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment$EditableDateField r4 = r10.f194651y
            if (r4 == 0) goto L6e
            mf6.k$a r5 = new mf6.k$a
            java.lang.String r7 = r4.f72400a
            java.time.LocalDate r4 = r4.f72401b
            if (r4 == 0) goto L67
            java.time.format.DateTimeFormatter r6 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE
            java.lang.String r6 = r4.format(r6)
        L67:
            r5.<init>(r7, r6)
            java.util.List r6 = zhm.u.c(r5)
        L6e:
            mf6.k r4 = new mf6.k
            r4.<init>(r1, r6)
            r10.u = r3
            java.lang.String r1 = r10.f194649w
            java.lang.Object r11 = r11.updateConsentDetails(r1, r4, r10)
            if (r11 != r0) goto L7e
            goto L9a
        L7e:
            mf6.f r11 = (mf6.f) r11
            com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c r7 = qf6.b.a(r11)
            lf6.h r3 = new lf6.h
            boolean r8 = r10.A
            r9 = 0
            boolean r4 = r10.z
            lf6.j r5 = r10.v
            java.lang.String r6 = r10.f194649w
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.u = r2
            java.lang.Object r11 = skm.e0.o(r3, r10)
            if (r11 != r0) goto L9b
        L9a:
            return r0
        L9b:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: lf6.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
