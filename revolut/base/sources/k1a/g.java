package k1a;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.bills_chooser.api.splits.MoneySplit;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplitParticipant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.flow.Flow;
import ofm.q;
import org.jetbrains.annotations.NotNull;
import qua.p;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements v0a.a {

    @NotNull
    public static final a Companion = new a();
    public static final long e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1a.d f180184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cl3.a f180185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u71.a f180186c;
    public final e1a.f d;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        e = kotlin.time.c.h(1000L, pkm.e.MILLISECONDS);
    }

    public g(a1a.d repository, cl3.a contactsInteractor, u71.a splitBillRepository, e1a.f splitBillLinkRepository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(splitBillRepository, "splitBillRepository");
        Intrinsics.checkNotNullParameter(splitBillLinkRepository, "splitBillLinkRepository");
        this.f180184a = repository;
        this.f180185b = contactsInteractor;
        this.f180186c = splitBillRepository;
        this.d = splitBillLinkRepository;
    }

    public static ArrayList c(Map map) {
        RecurringSplitParticipant recurringSplitParticipant;
        ArrayList<MoneySplit> arrayListU = w.u(map.values());
        ArrayList arrayList = new ArrayList();
        for (MoneySplit moneySplit : arrayListU) {
            if (!(moneySplit instanceof MoneySplit.Percentage)) {
                if (moneySplit instanceof MoneySplit.Amount) {
                    throw new UnsupportedOperationException("Recurring splits only support MoneySplit.Percentage");
                }
                throw new NoWhenBranchMatchedException();
            }
            MoneySplit.Percentage percentage = (MoneySplit.Percentage) moneySplit;
            SplitMemberType splitMemberType = percentage.f79205a;
            if (splitMemberType instanceof SplitMemberType.SplitMember.ContactMember) {
                recurringSplitParticipant = new RecurringSplitParticipant(xam.a.j(((SplitMemberType.SplitMember.ContactMember) splitMemberType).f79217a), Integer.valueOf(percentage.f79207c));
            } else {
                if (!(splitMemberType instanceof SplitMemberType.GroupMember) && !(splitMemberType instanceof SplitMemberType.SplitMember.UserMember)) {
                    throw new NoWhenBranchMatchedException();
                }
                recurringSplitParticipant = null;
            }
            if (recurringSplitParticipant != null) {
                arrayList.add(recurringSplitParticipant);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((RecurringSplitParticipant) obj2).f79925a)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r6.d.b(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof k1a.b
            if (r0 == 0) goto L13
            r0 = r8
            k1a.b r0 = (k1a.b) r0
            int r1 = r0.f180174w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f180174w = r1
            goto L18
        L13:
            k1a.b r0 = new k1a.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f180174w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            goto L57
        L36:
            yhm.o.b(r8)
            r0.f180174w = r4
            a1a.d r8 = r6.f180184a
            r8.getClass()
            a1a.a r2 = new a1a.a
            r4 = 0
            r5 = 0
            r2.<init>(r8, r7, r5, r4)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)
            if (r7 != r1) goto L52
            goto L54
        L52:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L54:
            if (r7 != r1) goto L57
            goto L61
        L57:
            r0.f180174w = r3
            e1a.f r7 = r6.d
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L62
        L61:
            return r1
        L62:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k1a.g.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(qua.p r9, java.util.LinkedHashMap r10, java.lang.String r11, gim.c r12) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r12 instanceof k1a.c
            if (r0 == 0) goto L13
            r0 = r12
            k1a.c r0 = (k1a.c) r0
            int r1 = r0.f180177y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f180177y = r1
            goto L18
        L13:
            k1a.c r0 = new k1a.c
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.f180175w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f180177y
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit r9 = r0.v
            yhm.o.b(r12)
            return r9
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit r9 = r0.v
            yhm.o.b(r12)
            goto L8f
        L3e:
            java.lang.String r11 = r0.u
            yhm.o.b(r12)
            goto L7d
        L44:
            yhm.o.b(r12)
            java.util.ArrayList r10 = c(r10)
            com.revolut.feature.payments.splitbill.models.recurringsplit.b r12 = new com.revolut.feature.payments.splitbill.models.recurringsplit.b
            com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplitSource r2 = new com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplitSource
            a2a.g r7 = ofm.q.h0(r9)
            if (r7 == 0) goto L9f
            java.lang.String r9 = ofm.q.i0(r9)
            r2.<init>(r7, r9)
            java.util.List r9 = zhm.v.l(r11)
            r12.<init>(r2, r10, r9)
            r0.u = r11
            r0.f180177y = r5
            a1a.d r9 = r8.f180184a
            r9.getClass()
            a1a.b r10 = new a1a.b
            r2 = 0
            r10.<init>(r9, r12, r6, r2)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r9, r10, r0)
            if (r12 != r1) goto L7d
            goto L9d
        L7d:
            r9 = r12
            com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit r9 = (com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit) r9
            if (r11 == 0) goto L9e
            r0.u = r6
            r0.v = r9
            r0.f180177y = r4
            java.lang.Object r10 = r8.e(r11, r0)
            if (r10 != r1) goto L8f
            goto L9d
        L8f:
            r0.u = r6
            r0.v = r9
            r0.f180177y = r3
            e1a.f r10 = r8.d
            java.lang.Object r10 = r10.b(r0)
            if (r10 != r1) goto L9e
        L9d:
            return r1
        L9e:
            return r9
        L9f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Required value was null."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k1a.g.b(qua.p, java.util.LinkedHashMap, java.lang.String, gim.c):java.lang.Object");
    }

    public final Flow d(p recurringPayment) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        a2a.g gVarH0 = q.h0(recurringPayment);
        if (gVarH0 == null) {
            return new go.g(new Data(a2a.b.f715a, null, false, 6, null), 2);
        }
        a1a.d dVar = this.f180184a;
        dVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.q(nim.a.u(new i4g.d(this, recurringPayment, gVarH0, (Continuation) null, 18), dVar.d.b(Unit.f186387a, loadingStrategy)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
    
        if (r3.fetchSplitBillForTransaction(r9, r0) != r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r9, gim.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof k1a.d
            if (r0 == 0) goto L13
            r0 = r10
            k1a.d r0 = (k1a.d) r0
            int r1 = r0.f180179x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f180179x = r1
            goto L18
        L13:
            k1a.d r0 = new k1a.d
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f180179x
            u71.a r3 = r8.f180186c
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L48
            if (r2 == r6) goto L40
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L30
            goto L92
        L30:
            r9 = move-exception
            goto L97
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            java.lang.String r9 = r0.u
            yhm.o.b(r10)
            goto L85
        L40:
            java.lang.String r9 = r0.u
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L46
            goto L58
        L46:
            r10 = move-exception
            goto L5d
        L48:
            yhm.o.b(r10)
            yhm.m$a r10 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L46
            r0.u = r9     // Catch: java.lang.Throwable -> L46
            r0.f180179x = r6     // Catch: java.lang.Throwable -> L46
            java.lang.Object r10 = r3.fetchSplitBillForTransaction(r9, r0)     // Catch: java.lang.Throwable -> L46
            if (r10 != r1) goto L58
            goto L91
        L58:
            kotlin.Unit r10 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L46
            yhm.m$a r2 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L46
            goto L63
        L5d:
            yhm.m$a r2 = yhm.m.INSTANCE
            yhm.n r10 = yhm.o.a(r10)
        L63:
            java.lang.Throwable r2 = yhm.m.a(r10)
            if (r2 == 0) goto L6f
            boolean r6 = r2 instanceof java.util.concurrent.CancellationException
            if (r6 != 0) goto L6e
            goto L6f
        L6e:
            throw r2
        L6f:
            boolean r2 = r10 instanceof yhm.n
            if (r2 != 0) goto L78
            kotlin.Unit r10 = (kotlin.Unit) r10
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L78:
            r0.u = r9
            r0.f180179x = r5
            long r5 = k1a.g.e
            java.lang.Object r10 = skm.k0.c(r5, r0)
            if (r10 != r1) goto L85
            goto L91
        L85:
            yhm.m$a r10 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L30
            r0.u = r7     // Catch: java.lang.Throwable -> L30
            r0.f180179x = r4     // Catch: java.lang.Throwable -> L30
            java.lang.Object r9 = r3.fetchSplitBillForTransaction(r9, r0)     // Catch: java.lang.Throwable -> L30
            if (r9 != r1) goto L92
        L91:
            return r1
        L92:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L30
            yhm.m$a r10 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L30
            goto L9d
        L97:
            yhm.m$a r10 = yhm.m.INSTANCE
            yhm.n r9 = yhm.o.a(r9)
        L9d:
            java.lang.Throwable r9 = yhm.m.a(r9)
            if (r9 == 0) goto Lb2
            boolean r10 = r9 instanceof java.util.concurrent.CancellationException
            if (r10 != 0) goto Lb1
            zhm.h0 r10 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r7, r7, r9, r10)
            goto Lb2
        Lb1:
            throw r9
        Lb2:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k1a.g.e(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit r6, java.util.ArrayList r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof k1a.e
            if (r0 == 0) goto L13
            r0 = r8
            k1a.e r0 = (k1a.e) r0
            int r1 = r0.f180182y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f180182y = r1
            goto L18
        L13:
            k1a.e r0 = new k1a.e
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f180180w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f180182y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.ArrayList r7 = r0.v
            com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit r6 = r0.u
            yhm.o.b(r8)
            goto L4a
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r8)
            k0g.b r8 = new k0g.b
            r2 = 0
            r4 = 2
            r8.<init>(r7, r5, r2, r4)
            r0.u = r6
            r0.v = r7
            r0.f180182y = r3
            java.lang.Object r8 = skm.e0.o(r8, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            java.util.List r8 = (java.util.List) r8
            int r0 = r8.size()
            int r1 = r7.size()
            if (r0 >= r1) goto L71
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            int r7 = r7.size()
            int r8 = r8.size()
            java.lang.String r0 = "Failed to resolve all split participants. Expected: "
            java.lang.String r1 = ", resolved: "
            java.lang.String r7 = a0.d.g(r7, r8, r0, r1)
            r6.<init>(r7)
            hx7.e.h(r6)
            a2a.b r6 = a2a.b.f715a
            return r6
        L71:
            a2a.a r7 = new a2a.a
            r7.<init>(r6, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k1a.g.f(com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit, java.util.ArrayList, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(qua.p r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof k1a.f
            if (r0 == 0) goto L13
            r0 = r6
            k1a.f r0 = (k1a.f) r0
            int r1 = r0.f180183w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f180183w = r1
            goto L18
        L13:
            k1a.f r0 = new k1a.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f180183w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            kotlinx.coroutines.flow.Flow r5 = r4.d(r5)
            jul.c r6 = new jul.c
            r2 = 27
            r6.<init>(r2)
            r2 = 0
            jhi.b r5 = mo3.a.g(r5, r2, r6, r3)
            r0.f180183w = r3
            java.lang.Object r6 = vkm.q.z(r5, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            a2a.d r6 = (a2a.d) r6
            if (r6 != 0) goto L52
            a2a.b r5 = a2a.b.f715a
            return r5
        L52:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k1a.g.g(qua.p, gim.c):java.lang.Object");
    }
}
