package pk1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import l80.e;
import oqk.i;
import org.jetbrains.annotations.NotNull;
import ukm.q;
import vc.s;
import vkm.d2;
import vkm.h2;
import vkm.u1;
import vkm.v1;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k18.c f236918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f236919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f236920c;
    public final u1 d;

    public d(k18.c qrCodeRepository, e dateProvider, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(qrCodeRepository, "qrCodeRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f236918a = qrCodeRepository;
        this.f236919b = s.a(-1, null, null, 6);
        v1 v1Var = new v1(new i(this, null, 24));
        d2.Companion.getClass();
        this.d = vkm.q.O(v1Var, coroutineScope, new h2(0L, 0L), new Data(null, null, true, 3, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(pk1.d r16, kotlinx.coroutines.flow.FlowCollector r17, gim.c r18) {
        /*
            r1 = r16
            r0 = r18
            boolean r2 = r0 instanceof pk1.c
            if (r2 == 0) goto L17
            r2 = r0
            pk1.c r2 = (pk1.c) r2
            int r3 = r2.z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.z = r3
            goto L1c
        L17:
            pk1.c r2 = new pk1.c
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.f236916x
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.z
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L54
            if (r4 == r7) goto L48
            if (r4 == r6) goto L3e
            if (r4 != r5) goto L36
            java.lang.Object r1 = r2.v
            pk1.a r1 = (pk1.a) r1
            yhm.o.b(r0)
            return r1
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3e:
            java.lang.Object r4 = r2.v
            java.lang.Exception r4 = (java.lang.Exception) r4
            kotlinx.coroutines.flow.FlowCollector r6 = r2.u
            yhm.o.b(r0)
            goto L8f
        L48:
            int r4 = r2.f236915w
            kotlinx.coroutines.flow.FlowCollector r7 = r2.u
            yhm.o.b(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> Lba
            goto L6a
        L50:
            r0 = move-exception
            r12 = r0
            r9 = r7
            goto L75
        L54:
            yhm.o.b(r0)
            r4 = 0
            k18.c r0 = r1.f236918a     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> Lba
            r9 = r17
            r2.u = r9     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> Lba
            r2.f236915w = r4     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> Lba
            r2.z = r7     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> Lba
            java.lang.Object r0 = r0.o(r2)     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> Lba
            if (r0 != r3) goto L69
            goto Lb9
        L69:
            r7 = r9
        L6a:
            pk1.a r0 = (pk1.a) r0     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> Lba
            r10 = r0
            goto L9c
        L6e:
            r0 = move-exception
        L6f:
            r12 = r0
            goto L75
        L71:
            r0 = move-exception
            r9 = r17
            goto L6f
        L75:
            com.revolut.data.model.Data r10 = new com.revolut.data.model.Data
            r14 = 5
            r15 = 0
            r11 = 0
            r13 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            r2.u = r9
            r2.v = r12
            r2.f236915w = r4
            r2.z = r6
            java.lang.Object r0 = r9.emit(r10, r2)
            if (r0 != r3) goto L8d
            goto Lb9
        L8d:
            r6 = r9
            r4 = r12
        L8f:
            if (r4 == 0) goto L9a
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            rd0.d.a(r7, r8, r8, r4, r0)
        L9a:
            r7 = r6
            r10 = r8
        L9c:
            if (r10 != 0) goto La0
            r3 = r8
            goto Lb9
        La0:
            r1.f236920c = r10
            com.revolut.data.model.Data r9 = new com.revolut.data.model.Data
            r13 = 6
            r14 = 0
            r11 = 0
            r12 = 0
            r9.<init>(r10, r11, r12, r13, r14)
            r2.u = r8
            r2.v = r10
            r2.z = r5
            java.lang.Object r0 = r7.emit(r9, r2)
            if (r0 != r3) goto Lb8
            goto Lb9
        Lb8:
            r3 = r10
        Lb9:
            return r3
        Lba:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pk1.d.a(pk1.d, kotlinx.coroutines.flow.FlowCollector, gim.c):java.lang.Object");
    }
}
