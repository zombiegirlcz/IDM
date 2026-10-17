package k50;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import org.joda.time.ReadableInstant;

/* JADX INFO: loaded from: classes19.dex */
public final class x4 extends m4 {

    @NotNull
    public static final u4 Companion = new u4();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final l4 f181286p;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final df0.b f181287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vkm.j2 f181288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vkm.j2 f181289n;
    public l4 o;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        pkm.e eVar = pkm.e.MINUTES;
        f181286p = new l4(false, kotlin.time.c.g(3, eVar), kotlin.time.c.g(2, eVar), new a4(1));
    }

    public x4(df0.b dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f181287l = dateProvider;
        this.f181288m = vkm.q.c(null);
        this.f181289n = vkm.q.c(null);
        this.o = f181286p;
    }

    public static s4 g3(v4 v4Var, long j2) {
        String str = v4Var.f181265c;
        long j3 = v4Var.f181264b;
        v20.i1 i1Var = v4Var.f181263a;
        if (str != null && j2 < j3) {
            return new s4(str, j3 - j2);
        }
        long validityDurationMs = i1Var.getValidityDurationMs() + i1Var.getTime().getMillis();
        if (j2 >= validityDurationMs) {
            return null;
        }
        List<v20.j1> thoughts = i1Var.getThoughts();
        if (thoughts.isEmpty()) {
            return null;
        }
        Iterator it8 = thoughts.iterator();
        long j5 = 0;
        while (it8.hasNext()) {
            long durationMs = ((v20.j1) it8.next()).getDurationMs();
            if (durationMs < 0) {
                durationMs = 0;
            }
            j5 += durationMs;
        }
        if (j5 == 0) {
            return null;
        }
        long j16 = j2 - j3;
        if (j16 < 0) {
            j16 = 0;
        }
        long j22 = j16 % j5;
        long j42 = 0;
        for (v20.j1 j1Var : thoughts) {
            long durationMs2 = j1Var.getDurationMs();
            if (durationMs2 < 0) {
                durationMs2 = 0;
            }
            j42 += durationMs2;
            if (j42 > j22) {
                return new s4(j1Var.getText(), Math.min(j42 - j22, validityDurationMs - j2));
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    @Override // k50.m4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k50.h0 Z2(k50.h0 r28, v20.n r29) {
        /*
            r27 = this;
            r1 = r28
            r0 = r29
            java.lang.String r2 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            k50.f1 r2 = r1.f181082g
            if (r2 != 0) goto L16
        L12:
            r0 = r27
            goto L94
        L16:
            boolean r3 = r2.a()
            if (r3 == 0) goto L52
            boolean r3 = r0 instanceof v20.k1
            if (r3 == 0) goto L52
            com.revolut.chat.data.repository.chat.MessageAuthor r0 = r0.getAuthor()
            boolean r0 = r0 instanceof com.revolut.chat.data.repository.chat.User
            if (r0 != 0) goto L52
            r25 = 0
            r26 = 268435391(0xfffffbf, float:2.5243451E-29)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            k50.h0 r0 = k50.h0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        L52:
            boolean r0 = r2.a()
            if (r0 != 0) goto L12
            r0 = r27
            k50.l4 r2 = r0.o
            kotlin.jvm.functions.Function1 r2 = r2.d
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L94
            r25 = 0
            r26 = 268435391(0xfffffbf, float:2.5243451E-29)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            k50.h0 r1 = k50.h0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r1
        L94:
            return r28
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.x4.Z2(k50.h0, v20.n):k50.h0");
    }

    @Override // k50.m4
    public final h0 b3(h0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        f1 f1Var = state.f181082g;
        return (f1Var != null && f1Var.a()) ? h0.a(state, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435391) : state;
    }

    @Override // k50.m4
    public final h0 c3(h0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        v30.j jVar = (v30.j) state.f181080b.getContent();
        return (jVar == null || v30.r.c(jVar)) ? state : h0.a(state, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435391);
    }

    @Override // k50.m4
    public final wkm.l d3(Flow domainStateStream, l4 config) {
        Intrinsics.checkNotNullParameter(domainStateStream, "domainStateStream");
        Intrinsics.checkNotNullParameter(config, "config");
        this.o = config;
        Continuation continuation = null;
        return vkm.q.Q(vkm.q.q(ta6.a.h(domainStateStream, this.f181288m, this.f181289n, new ate.b(this, continuation, 5))), new jy6.l(continuation, this, 8));
    }

    @Override // k50.m4
    public final void e3(v20.r2 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        long millis = message.getMessageDuration().toStandardDuration().getMillis();
        Instant eventTimestamp = message.getEventTimestamp();
        t4 t4Var = new t4(message.getAuthor(), (eventTimestamp != null ? eventTimestamp.getMillis() : this.f181287l.a().toEpochMilli()) + millis, message.getPreviousMessageId());
        vkm.j2 j2Var = this.f181288m;
        j2Var.getClass();
        j2Var.g(null, t4Var);
    }

    @Override // k50.m4
    public final void f3(v20.i1 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        long epochMilli = this.f181287l.a().toEpochMilli();
        vkm.j2 j2Var = this.f181289n;
        v4 v4Var = (v4) j2Var.getValue();
        if (v4Var == null) {
            v4 v4Var2 = new v4(message, message.getTime().getMillis(), null);
            j2Var.getClass();
            j2Var.g(null, v4Var2);
            return;
        }
        v20.i1 i1Var = v4Var.f181263a;
        if (message.getTime().compareTo((ReadableInstant) i1Var.getTime()) <= 0) {
            return;
        }
        if (!Intrinsics.f(message.getPreviousMessageId(), i1Var.getPreviousMessageId())) {
            v4 v4Var3 = new v4(message, message.getTime().getMillis(), null);
            j2Var.getClass();
            j2Var.g(null, v4Var3);
            return;
        }
        s4 s4VarG3 = g3(v4Var, epochMilli);
        if (s4VarG3 != null) {
            v4 v4Var4 = new v4(message, epochMilli + s4VarG3.f181243b, s4VarG3.f181242a);
            j2Var.getClass();
            j2Var.g(null, v4Var4);
        } else {
            v4 v4Var5 = new v4(message, message.getTime().getMillis(), null);
            j2Var.getClass();
            j2Var.g(null, v4Var5);
        }
    }
}
