package j50;

import com.revolut.chat.ui.messagefeedback.MessageFeedbackController;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.ModalDestination;
import et0.q0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import vkm.u1;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dp6.a f171448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p f171449m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u1 f171450n;
    public final LinkedHashMap o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a2 f171451p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f171452q;

    public o(dp6.a feedbackRepository, p messageFeedbackSessionCache) {
        Intrinsics.checkNotNullParameter(feedbackRepository, "feedbackRepository");
        Intrinsics.checkNotNullParameter(messageFeedbackSessionCache, "messageFeedbackSessionCache");
        this.f171448l = feedbackRepository;
        this.f171449m = messageFeedbackSessionCache;
        this.f171450n = messageFeedbackSessionCache.f171454b;
        this.o = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e3(j50.o r10, java.util.UUID r11, long r12, gim.c r14) {
        /*
            r10.getClass()
            boolean r0 = r14 instanceof j50.m
            if (r0 == 0) goto L16
            r0 = r14
            j50.m r0 = (j50.m) r0
            int r1 = r0.f171445y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f171445y = r1
            goto L1b
        L16:
            j50.m r0 = new j50.m
            r0.<init>(r10, r14)
        L1b:
            java.lang.Object r14 = r0.f171443w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f171445y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            long r12 = r0.v
            java.util.UUID r11 = r0.u
            yhm.o.b(r14)     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L7b
            goto L57
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            yhm.o.b(r14)
            kotlin.time.b$a r14 = kotlin.time.b.INSTANCE     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L7b
            pkm.e r14 = pkm.e.SECONDS     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L7b
            r2 = 2
            long r5 = kotlin.time.c.g(r2, r14)     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L7b
            imk.p0 r14 = new imk.p0     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L7b
            r2 = 15
            r14.<init>(r10, r3, r2)     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L7b
            r0.u = r11     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L7b
            r0.v = r12     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L7b
            r0.f171445y = r4     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L7b
            java.lang.Object r14 = skm.h2.e(r5, r14, r0)     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L7b
            if (r14 != r1) goto L57
            return r1
        L57:
            java.util.List r14 = (java.util.List) r14     // Catch: java.lang.Exception -> L5a java.util.concurrent.CancellationException -> L7b
            r3 = r14
        L5a:
            r5 = r11
            r8 = r12
            if (r3 != 0) goto L60
            zhm.f0 r3 = zhm.f0.f322471a
        L60:
            r7 = r3
            vkm.u1 r11 = r10.f171450n
            kotlinx.coroutines.flow.StateFlow r11 = r11.f290128a
            java.lang.Object r11 = r11.getValue()
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r11 = r11.get(r5)
            k50.d r12 = k50.d.DISLIKE
            if (r11 != r12) goto L78
            r6 = 0
            r4 = r10
            r4.g3(r5, r6, r7, r8)
        L78:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L7b:
            r0 = move-exception
            r10 = r0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j50.o.e3(j50.o, java.util.UUID, long, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void E2() {
        this.o.clear();
    }

    @Override // j50.l
    public final u1 Z2() {
        return this.f171450n;
    }

    @Override // j50.l
    public final void b3(UUID messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        long j2 = this.f171452q + 1;
        this.f171452q = j2;
        a2 a2Var = this.f171451p;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f171451p = null;
        this.f171449m.a(messageId, k50.d.DISLIKE);
        this.f171451p = T2(new chj.p(this, messageId, j2, (Continuation) null, 3), new yi5.b(27));
        f3(messageId).e(new b(messageId, false));
    }

    @Override // j50.l
    public final void c3(UUID messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        long j2 = 1 + this.f171452q;
        this.f171452q = j2;
        a2 a2Var = this.f171451p;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f171451p = null;
        this.f171449m.a(messageId, k50.d.LIKE);
        f3(messageId).e(new b(messageId, true));
        yji.n.j2(this, L2(new mii.k(prk.o.r(messageId, "air_message_like_"), new TextLocalisedClause(R$string.chat_subtitle_open, null, null, 14), new TextLocalisedClause(R$string.chat_rate_submitted_tooltip_action_title, null, null, 14), null, null, 24)), null, new n(this, messageId, j2, null), 3);
    }

    @Override // j50.l
    public final void d3(UUID messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.f171452q++;
        a2 a2Var = this.f171451p;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f171451p = null;
        f3(messageId).e(a.f171423a);
        this.f171449m.a(messageId, null);
    }

    public final k f3(UUID uuid) {
        LinkedHashMap linkedHashMap = this.o;
        Object kVar = linkedHashMap.get(uuid);
        if (kVar == null) {
            kVar = new k(this.f171448l, new iyi.i(this, 18), new iz1.g(2, 2, null));
            linkedHashMap.put(uuid, kVar);
        }
        return (k) kVar;
    }

    public final void g3(UUID uuid, boolean z, List list, long j2) {
        if (j2 != this.f171452q) {
            return;
        }
        MessageFeedbackController messageFeedbackController = new MessageFeedbackController(new h50.a(uuid, z, list));
        messageFeedbackController.l2(new q0(z, this, uuid, 2));
        N2(messageFeedbackController, ModalDestination.Style.BOTTOM_DIALOG.f98301a, new g48.h(this, uuid, z, 15));
    }

    public final void h3(UUID uuid) {
        L2(new mii.k(prk.o.r(uuid, "air_message_thanks_"), new TextLocalisedClause(R$string.chat_rate_success_tooltip_title, null, null, 14), null, null, null, 28));
    }
}
