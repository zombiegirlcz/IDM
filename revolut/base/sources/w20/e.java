package w20;

import com.revolut.chat.data.db.ChatDatabase;
import com.revolut.chat.domain.model.draft.DraftRoutingKey;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import r10.f;
import th6.p;
import uyd.e0;
import vnl.o;
import vvc.s;
import y10.h;
import yhm.m;
import yhm.n;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements o30.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f293912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f293913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f293914c;
    public final x4l.c d;

    public e(d4m.a chatDatabase, l80.e dateProvider, h chatDataMapper, j memoryCache) {
        Intrinsics.checkNotNullParameter(chatDatabase, "chatDatabase");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(chatDataMapper, "chatDataMapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f293912a = chatDatabase;
        this.f293913b = chatDataMapper;
        this.f293914c = memoryCache;
        int i = 23;
        Continuation continuation = null;
        this.d = new x4l.c(new p(this, continuation, i), new vx9.b(this, i), new s(this, 11), new rp1.c(2, 22, null), new e0(3, 8, continuation), new o(this, continuation, 22));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(w20.e r17, com.revolut.chat.domain.model.draft.DraftRoutingKey r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w20.e.a(w20.e, com.revolut.chat.domain.model.draft.DraftRoutingKey, gim.c):java.lang.Object");
    }

    public static String b(DraftRoutingKey draftRoutingKey) {
        Pair pairC = c(draftRoutingKey);
        return a0.d.s("chat_draft_", (String) pairC.f186385a, ":", (String) pairC.f186386b);
    }

    public static Pair c(DraftRoutingKey draftRoutingKey) {
        if (draftRoutingKey instanceof DraftRoutingKey.Assistant) {
            return new Pair("assistant", ((DraftRoutingKey.Assistant) draftRoutingKey).f51097a.toString());
        }
        if (draftRoutingKey instanceof DraftRoutingKey.Support) {
            return new Pair("support_feed", ((DraftRoutingKey.Support) draftRoutingKey).f51099a.toString());
        }
        if (draftRoutingKey instanceof DraftRoutingKey.PrivateBanking) {
            return new Pair("pb", ((DraftRoutingKey.PrivateBanking) draftRoutingKey).f51098a.toString());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static UUID g(String str) {
        Object objA;
        try {
            m.Companion companion = m.INSTANCE;
            objA = UUID.fromString(str);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        return (UUID) objA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        if (androidx.room.util.DBUtil.performSuspending((androidx.room.RoomDatabase) r13.b, false, true, new k50.i2(r13, r2, r3), r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof w20.b
            if (r0 == 0) goto L13
            r0 = r13
            w20.b r0 = (w20.b) r0
            int r1 = r0.f293906x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f293906x = r1
            goto L18
        L13:
            w20.b r0 = new w20.b
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f293906x
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L44
            if (r2 == r6) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            yhm.o.b(r13)
            goto La1
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L38:
            org.joda.time.Instant r2 = r0.u
            yhm.o.b(r13)
            goto L86
        L3e:
            org.joda.time.Instant r2 = r0.u
            yhm.o.b(r13)
            goto L6e
        L44:
            yhm.o.b(r13)
            long r8 = java.lang.System.currentTimeMillis()
            org.joda.time.Instant r13 = org.joda.time.Instant.ofEpochMilli(r8)
            r10.f r2 = r12.e()
            kotlin.jvm.internal.Intrinsics.h(r13)
            r0.u = r13
            r0.f293906x = r6
            java.lang.Object r8 = r2.b
            androidx.room.RoomDatabase r8 = (androidx.room.RoomDatabase) r8
            k50.i2 r9 = new k50.i2
            r10 = 4
            r9.<init>(r2, r13, r10)
            java.lang.Object r2 = androidx.room.util.DBUtil.performSuspending(r8, r6, r5, r9, r0)
            if (r2 != r1) goto L6b
            goto La0
        L6b:
            r11 = r2
            r2 = r13
            r13 = r11
        L6e:
            java.util.List r13 = (java.util.List) r13
            u29.c r8 = new u29.c
            r9 = 23
            r8.<init>(r13, r12, r7, r9)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            r0.u = r2
            r0.f293906x = r4
            java.lang.Object r13 = skm.e0.J(r13, r8, r0)
            if (r13 != r1) goto L86
            goto La0
        L86:
            r10.f r13 = r12.e()
            kotlin.jvm.internal.Intrinsics.h(r2)
            r0.u = r7
            r0.f293906x = r3
            java.lang.Object r4 = r13.b
            androidx.room.RoomDatabase r4 = (androidx.room.RoomDatabase) r4
            k50.i2 r7 = new k50.i2
            r7.<init>(r13, r2, r3)
            java.lang.Object r13 = androidx.room.util.DBUtil.performSuspending(r4, r5, r6, r7, r0)
            if (r13 != r1) goto La1
        La0:
            return r1
        La1:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: w20.e.d(gim.c):java.lang.Object");
    }

    public final f e() {
        return ((ChatDatabase) this.f293912a.get()).i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fe, code lost:
    
        if (androidx.room.util.DBUtil.performSuspending((androidx.room.RoomDatabase) r2.b, false, true, new r10.b(r2, r13, 3), r4) == r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010f, code lost:
    
        if (r7.e(r1, r4) == r5) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.chat.domain.model.draft.DraftRoutingKey r27, o30.c r28, kotlin.coroutines.Continuation r29) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w20.e.f(com.revolut.chat.domain.model.draft.DraftRoutingKey, o30.c, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
