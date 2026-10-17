package rr9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.models.GroupMemberSettleInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mq9.f;
import pfm.r;
import st9.e;
import wsg.n;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f256744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mr9.d f256745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f256746c;
    public final k61.a d;

    public d(f groupsInteractor, mr9.d groupsRemindersInteractor, n walletInteractor, k61.a transferInteractor) {
        Intrinsics.checkNotNullParameter(groupsInteractor, "groupsInteractor");
        Intrinsics.checkNotNullParameter(groupsRemindersInteractor, "groupsRemindersInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        this.f256744a = groupsInteractor;
        this.f256745b = groupsRemindersInteractor;
        this.f256746c = walletInteractor;
        this.d = transferInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.payments.groups.models.GroupMemberSettleInfo r18, gim.c r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof rr9.c
            if (r3 == 0) goto L19
            r3 = r2
            rr9.c r3 = (rr9.c) r3
            int r4 = r3.f256743w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f256743w = r4
            goto L1e
        L19:
            rr9.c r3 = new rr9.c
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.u
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f256743w
            r6 = 1
            if (r5 == 0) goto L35
            if (r5 != r6) goto L2d
            yhm.o.b(r2)
            goto L7c
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            yhm.o.b(r2)
            st9.e r2 = r1.f79504b
            oq9.o r5 = r1.f79503a
            dj0.d r2 = r2.d
            xi0.b r8 = r2.f115083b
            wi0.b r9 = oi0.d.m(r5)
            boolean r2 = oi0.d.C(r5)
            if (r2 == 0) goto L4e
            gk3.i r2 = gk3.i.INTERNAL_TRANSFER
        L4c:
            r10 = r2
            goto L51
        L4e:
            gk3.i r2 = gk3.i.TRANSFER_LINK
            goto L4c
        L51:
            java.lang.String r11 = oi0.d.k(r5)
            st9.e r1 = r1.f79504b
            dj0.d r1 = r1.d
            long r1 = r1.f115082a
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r1)
            r15 = 0
            r16 = 208(0xd0, float:2.91E-43)
            k61.a r7 = r0.d
            r12 = 0
            r14 = 0
            efm.r r1 = k61.a.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2 = 3
            java.lang.String r5 = "firstOrError(...)"
            r7 = 0
            efm.d0 r1 = prk.o.l(r1, r7, r7, r2, r5)
            r3.f256743w = r6
            java.lang.Object r2 = nim.a.b(r1, r3)
            if (r2 != r4) goto L7c
            return r4
        L7c:
            java.lang.String r1 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rr9.d.a(com.revolut.feature.payments.groups.models.GroupMemberSettleInfo, gim.c):java.lang.Object");
    }

    public final r b(PaymentGroup group, List members) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(members, "members");
        String str = group.f79285a;
        List list = members;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            e eVar = ((GroupMemberSettleInfo) it8.next()).f79504b;
            arrayList.add(new qq9.e(eVar.f, eVar.f265545g, eVar.d, qq9.d.MARK_PAID, null, null));
        }
        return ((mr9.a) this.f256744a).b(str, arrayList);
    }

    public final r c(PaymentGroup group, List members, qk.d dVar) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(members, "members");
        String str = group.f79285a;
        List list = members;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            e eVar = ((GroupMemberSettleInfo) it8.next()).f79504b;
            arrayList.add(new qq9.e(eVar.f, eVar.f265545g, eVar.d, qq9.d.TRANSFER, dVar, null));
        }
        return ((mr9.a) this.f256744a).b(str, arrayList);
    }
}
