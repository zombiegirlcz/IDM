package z20;

import com.revolut.chat.data.db.ChatDatabase;
import kotlin.jvm.internal.Intrinsics;
import r10.w;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f318919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y10.h f318920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uvl.c f318921c;

    public j(d4m.a chatDatabaseLazy, y10.h mapper, uvl.c messagesPersister) {
        Intrinsics.checkNotNullParameter(chatDatabaseLazy, "chatDatabaseLazy");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(messagesPersister, "messagesPersister");
        this.f318919a = chatDatabaseLazy;
        this.f318920b = mapper;
        this.f318921c = messagesPersister;
    }

    public final ChatDatabase a() {
        Object obj2 = this.f318919a.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (ChatDatabase) obj2;
    }

    public final w b() {
        return a().n();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(java.util.List r8, java.util.Set r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof z20.i
            if (r0 == 0) goto L13
            r0 = r10
            z20.i r0 = (z20.i) r0
            int r1 = r0.f318918x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f318918x = r1
            goto L18
        L13:
            z20.i r0 = new z20.i
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f318918x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.util.Set r8 = r0.u
            r9 = r8
            java.util.Set r9 = (java.util.Set) r9
            yhm.o.b(r10)
            goto L68
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            yhm.o.b(r10)
            r10.w r10 = r7.b()
            r2 = r9
            java.util.Set r2 = (java.util.Set) r2
            r0.u = r2
            r0.f318918x = r3
            r10.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "SELECT * FROM pending_uploads WHERE status IN ("
            r2.append(r4)
            java.lang.String r4 = ") ORDER BY createdAt ASC"
            java.lang.String r2 = prk.o.p(r4, r8, r2)
            java.lang.Object r4 = r10.f250865a
            androidx.room.RoomDatabase r4 = (androidx.room.RoomDatabase) r4
            amh.n r5 = new amh.n
            r6 = 13
            r5.<init>(r10, r2, r8, r6)
            r8 = 0
            java.lang.Object r10 = androidx.room.util.DBUtil.performSuspending(r4, r3, r8, r5, r0)
            if (r10 != r1) goto L68
            return r1
        L68:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r10 = r10.iterator()
        L73:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r10.next()
            r1 = r0
            u10.n r1 = (u10.n) r1
            java.util.UUID r1 = r1.f276309a
            boolean r1 = r9.contains(r1)
            if (r1 != 0) goto L73
            r8.add(r0)
            goto L73
        L8c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z20.j.c(java.util.List, java.util.Set, gim.c):java.io.Serializable");
    }
}
