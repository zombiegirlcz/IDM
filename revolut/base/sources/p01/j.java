package p01;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements k01.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f231436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f231437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k01.c f231438c;

    public j(a0 header, TextLocalisedClause textLocalisedClause, k01.c clickResponse) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(clickResponse, "clickResponse");
        this.f231436a = header;
        this.f231437b = textLocalisedClause;
        this.f231438c = clickResponse;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // k01.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(jid.z r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p01.i
            if (r0 == 0) goto L13
            r0 = r7
            p01.i r0 = (p01.i) r0
            int r1 = r0.f231435x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f231435x = r1
            goto L1a
        L13:
            p01.i r0 = new p01.i
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f231435x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            jid.z r6 = r0.u
            yhm.o.b(r7)
            goto L59
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            jid.z r6 = r0.u
            yhm.o.b(r7)
            goto L4c
        L3c:
            yhm.o.b(r7)
            r0.u = r6
            r0.f231435x = r4
            p01.a0 r7 = r5.f231436a
            p01.z r7 = r7.a(r6)
            if (r7 != r1) goto L4c
            goto L58
        L4c:
            k01.m r7 = (k01.m) r7
            r0.u = r6
            r0.f231435x = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L59
        L58:
            return r1
        L59:
            p01.s r7 = (p01.s) r7
            com.revolut.core.ui_kit.models.Clause r0 = r5.f231437b
            if (r0 == 0) goto L64
            android.text.SpannableStringBuilder r6 = r6.s(r0)
            goto L65
        L64:
            r6 = 0
        L65:
            p01.h r0 = new p01.h
            k01.c r1 = r5.f231438c
            r0.<init>(r7, r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p01.j.a(jid.z, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f231436a.equals(jVar.f231436a) && Intrinsics.f(this.f231437b, jVar.f231437b) && this.f231438c.equals(jVar.f231438c);
    }

    public final int hashCode() {
        int iHashCode = this.f231436a.hashCode() * 31;
        Clause clause = this.f231437b;
        return this.f231438c.f179898a.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
