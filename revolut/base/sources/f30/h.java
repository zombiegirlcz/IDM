package f30;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r10.q;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f131867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y10.h f131868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4m.a f131869c;
    public final hlm.c d;

    public h(q messageSearchIndexWriter, y10.h mapper, d4m.a chatDatabaseLazy) {
        Intrinsics.checkNotNullParameter(messageSearchIndexWriter, "messageSearchIndexWriter");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(chatDatabaseLazy, "chatDatabaseLazy");
        this.f131867a = messageSearchIndexWriter;
        this.f131868b = mapper;
        this.f131869c = chatDatabaseLazy;
        this.d = hlm.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(f30.h r4, v30.c0 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof f30.f
            if (r0 == 0) goto L16
            r0 = r6
            f30.f r0 = (f30.f) r0
            int r1 = r0.f131863w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f131863w = r1
            goto L1b
        L16:
            f30.f r0 = new f30.f
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f131863w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L41
            goto L3e
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r6)
            r0.f131863w = r3     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L41
            java.lang.Object r4 = r4.c(r5, r0)     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L41
            if (r4 != r1) goto L3e
            return r1
        L3e:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L41:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f30.h.a(f30.h, v30.c0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d3, code lost:
    
        if (r1 == r3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0137, code lost:
    
        if (androidx.room.util.DBUtil.performSuspending((androidx.room.RoomDatabase) r4.f250863b, false, true, new r10.b(r4, r1, 9), r2) != r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff A[PHI: r0 r4
      0x00ff: PHI (r0v11 java.lang.String) = (r0v8 java.lang.String), (r0v20 java.lang.String) binds: [B:45:0x00fc, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r4v9 r10.v) = (r4v7 r10.v), (r4v13 r10.v) binds: [B:45:0x00fc, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c A[PHI: r0 r4
      0x011c: PHI (r0v12 java.lang.String) = (r0v11 java.lang.String), (r0v21 java.lang.String) binds: [B:48:0x0119, B:18:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r4v10 r10.v) = (r4v9 r10.v), (r4v14 r10.v) binds: [B:48:0x0119, B:18:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(f30.h r17, gim.c r18) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f30.h.b(f30.h, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|62|(1:(1:(1:(1:(4:14|15|54|(3:56|57|58)(4:59|33|(1:35)(4:36|(3:38|39|40)(5:41|(2:44|42)|66|47|(1:49)(2:50|51))|60|61)|53))(2:19|20))(3:21|22|51))(6:24|25|36|(0)(0)|60|61))(1:27))(3:28|(1:31)|53)|64|32|33|(0)(0)|53) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fc, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013c, code lost:
    
        if (do3.q.J(r2) != r3) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7 A[Catch: all -> 0x00fb, PHI: r0 r4 r6 r10 r11 r12 r13 r14
      0x00c7: PHI (r0v9 java.lang.Object) = (r0v14 java.lang.Object), (r0v1 java.lang.Object) binds: [B:34:0x00c3, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r4v6 int) = (r4v7 int), (r4v10 int) binds: [B:34:0x00c3, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r6v1 int) = (r6v4 int), (r6v0 int) binds: [B:34:0x00c3, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r10v2 java.util.List) = (r10v10 java.util.List), (r10v0 java.util.List) binds: [B:34:0x00c3, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r11v7 int) = (r11v8 int), (r11v11 int) binds: [B:34:0x00c3, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r12v2 r10.v) = (r12v4 r10.v), (r12v8 r10.v) binds: [B:34:0x00c3, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r13v2 v30.c0) = (r13v4 v30.c0), (r13v7 v30.c0) binds: [B:34:0x00c3, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r14v5 hlm.a) = (r14v6 hlm.a), (r14v10 hlm.a) binds: [B:34:0x00c3, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x00fb, blocks: (B:54:0x013f, B:56:0x0147, B:33:0x00a7, B:36:0x00c7, B:41:0x00d5, B:42:0x00e7, B:44:0x00ed, B:47:0x00fe, B:51:0x0127, B:32:0x0097), top: B:64:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf A[Catch: all -> 0x0045, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0045, blocks: (B:15:0x0040, B:38:0x00cf, B:22:0x005f, B:25:0x006e), top: B:62:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5 A[Catch: all -> 0x00fb, TRY_ENTER, TryCatch #1 {all -> 0x00fb, blocks: (B:54:0x013f, B:56:0x0147, B:33:0x00a7, B:36:0x00c7, B:41:0x00d5, B:42:0x00e7, B:44:0x00ed, B:47:0x00fe, B:51:0x0127, B:32:0x0097), top: B:64:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x013c -> B:54:0x013f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(v30.c0 r17, gim.c r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f30.h.c(v30.c0, gim.c):java.lang.Object");
    }

    public final u10.l d(u10.h hVar) {
        Object objA;
        try {
            m.Companion companion = m.INSTANCE;
            objA = this.f131867a.u0(this.f131868b.h(hVar));
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        u10.l lVar = (u10.l) objA;
        return lVar == null ? new u10.l(hVar.f276282a, hVar.f276284c, hVar.f276285g, hVar.e, hVar.f, hVar.f276283b, null) : lVar;
    }
}
