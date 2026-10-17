package n30;

import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j30.c f211667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f211668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tf3.b f211669c;

    public v(j30.c chatFeatureToggles, n chatInteractor, tf3.b chatAuthorizationStatus) {
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        Intrinsics.checkNotNullParameter(chatAuthorizationStatus, "chatAuthorizationStatus");
        this.f211667a = chatFeatureToggles;
        this.f211668b = chatInteractor;
        this.f211669c = chatAuthorizationStatus;
    }

    public final Object a(ChatFeed chatFeed, gim.c cVar) {
        if (chatFeed instanceof ChatFeed.Support) {
            return d((ChatFeed.Support) chatFeed, cVar);
        }
        if (chatFeed instanceof ChatFeed.Assistant) {
            return b((ChatFeed.Assistant) chatFeed, cVar);
        }
        if (chatFeed instanceof ChatFeed.PrivateBanking) {
            return new q(new ChatMode.Feed(((ChatFeed.PrivateBanking) chatFeed).f51032a));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.chat.domain.model.ChatFeed.Assistant r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof n30.s
            if (r0 == 0) goto L13
            r0 = r6
            n30.s r0 = (n30.s) r0
            int r1 = r0.f211663w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f211663w = r1
            goto L18
        L13:
            n30.s r0 = new n30.s
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f211663w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L67
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            j30.c r6 = r4.f211667a
            rf3.d r6 = (rf3.d) r6
            j30.b r6 = r6.b()
            int[] r2 = n30.r.f211662a
            int r6 = r6.ordinal()
            r6 = r2[r6]
            if (r6 == r3) goto L58
            r2 = 2
            if (r6 == r2) goto L58
            r5 = 3
            if (r6 != r5) goto L52
            n30.q r5 = new n30.q
            com.revolut.chat.domain.model.ChatMode$SingleFeed r6 = com.revolut.chat.domain.model.ChatMode.SingleFeed.f51045a
            r5.<init>(r6)
            return r5
        L52:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L58:
            java.util.UUID r5 = r5.f51029a
            if (r5 != 0) goto L6a
            v30.c0 r5 = v30.c0.ASSISTANT
            r0.f211663w = r3
            java.lang.Object r6 = r4.c(r5, r0)
            if (r6 != r1) goto L67
            return r1
        L67:
            r5 = r6
            java.util.UUID r5 = (java.util.UUID) r5
        L6a:
            if (r5 == 0) goto L77
            n30.q r6 = new n30.q
            com.revolut.chat.domain.model.ChatMode$Feed r0 = new com.revolut.chat.domain.model.ChatMode$Feed
            r0.<init>(r5)
            r6.<init>(r0)
            return r6
        L77:
            n30.o r5 = new n30.o
            v30.c0 r6 = v30.c0.ASSISTANT
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n30.v.b(com.revolut.chat.domain.model.ChatFeed$Assistant, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(v30.c0 r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof n30.t
            if (r0 == 0) goto L13
            r0 = r9
            n30.t r0 = (n30.t) r0
            int r1 = r0.f211665x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f211665x = r1
            goto L18
        L13:
            n30.t r0 = new n30.t
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f211665x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            v30.c0 r8 = r0.u
            yhm.o.b(r9)
            goto L4f
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            yhm.o.b(r9)
            n30.n r9 = r7.f211668b
            w4l.h r2 = w4l.h.f294642c
            jhi.k r9 = r9.i(r2)
            m84.c r2 = new m84.c
            r5 = 2
            r6 = 4
            r2.<init>(r5, r6, r4)
            r0.u = r8
            r0.f211665x = r3
            java.lang.Object r9 = vkm.q.A(r9, r2, r0)
            if (r9 != r1) goto L4f
            return r1
        L4f:
            com.revolut.data.model.Data r9 = (com.revolut.data.model.Data) r9
            if (r9 == 0) goto L5a
            java.lang.Object r9 = r9.getContent()
            java.util.List r9 = (java.util.List) r9
            goto L5b
        L5a:
            r9 = r4
        L5b:
            if (r9 == 0) goto L7d
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L63:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r9.next()
            r1 = r0
            v30.y r1 = (v30.y) r1
            v30.c0 r1 = r1.f285834b
            if (r1 != r8) goto L63
            goto L76
        L75:
            r0 = r4
        L76:
            v30.y r0 = (v30.y) r0
            if (r0 == 0) goto L7d
            java.util.UUID r8 = r0.f285833a
            return r8
        L7d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n30.v.c(v30.c0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.chat.domain.model.ChatFeed.Support r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof n30.u
            if (r0 == 0) goto L13
            r0 = r8
            n30.u r0 = (n30.u) r0
            int r1 = r0.f211666w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f211666w = r1
            goto L18
        L13:
            n30.u r0 = new n30.u
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f211666w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            goto L7b
        L36:
            yhm.o.b(r8)
            tf3.b r8 = r6.f211669c
            boolean r8 = r8.b()
            com.revolut.chat.domain.model.ChatMode$SingleFeed r2 = com.revolut.chat.domain.model.ChatMode.SingleFeed.f51045a
            if (r8 != 0) goto L49
            n30.q r7 = new n30.q
            r7.<init>(r2)
            return r7
        L49:
            j30.c r8 = r6.f211667a
            rf3.d r8 = (rf3.d) r8
            j30.b r8 = r8.b()
            int[] r5 = n30.r.f211662a
            int r8 = r8.ordinal()
            r8 = r5[r8]
            if (r8 == r4) goto L6c
            if (r8 == r3) goto L6c
            r7 = 3
            if (r8 != r7) goto L66
            n30.q r7 = new n30.q
            r7.<init>(r2)
            return r7
        L66:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L6c:
            java.util.UUID r7 = r7.f51034b
            if (r7 != 0) goto L7e
            v30.c0 r7 = v30.c0.SUPPORT
            r0.f211666w = r4
            java.lang.Object r8 = r6.c(r7, r0)
            if (r8 != r1) goto L7b
            return r1
        L7b:
            r7 = r8
            java.util.UUID r7 = (java.util.UUID) r7
        L7e:
            if (r7 == 0) goto L8b
            n30.q r8 = new n30.q
            com.revolut.chat.domain.model.ChatMode$Feed r0 = new com.revolut.chat.domain.model.ChatMode$Feed
            r0.<init>(r7)
            r8.<init>(r0)
            return r8
        L8b:
            n30.o r7 = new n30.o
            v30.c0 r8 = v30.c0.SUPPORT
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n30.v.d(com.revolut.chat.domain.model.ChatFeed$Support, gim.c):java.lang.Object");
    }
}
