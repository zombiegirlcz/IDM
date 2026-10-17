package z20;

import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import au0.z5;
import com.revolut.chat.data.network.MessagesApi;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import r10.w;
import skm.e0;
import skm.p0;
import vkm.c2;
import vkm.d2;
import vkm.u1;
import zhm.f0;
import zhm.q0;

/* JADX INFO: loaded from: classes19.dex */
public final class q {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessagesApi f318928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f318929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f318930c;
    public final r d;
    public final j e;
    public final y10.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final phm.a f318931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CoroutineScope f318932h;
    public final i90.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u1 f318933j;

    public q(j30.c chatFeatureToggles, h mimeTypeProvider, t imageFileConverter, MessagesApi messagesApi, u progressTracker, g fileContentUploader, r singleFileUploader, j pendingUploadRepository, y10.h mapper, h30.m workManager, CoroutineScope scope, i90.b uuidUtils) {
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(mimeTypeProvider, "mimeTypeProvider");
        Intrinsics.checkNotNullParameter(imageFileConverter, "imageFileConverter");
        Intrinsics.checkNotNullParameter(messagesApi, "messagesApi");
        Intrinsics.checkNotNullParameter(progressTracker, "progressTracker");
        Intrinsics.checkNotNullParameter(fileContentUploader, "fileContentUploader");
        Intrinsics.checkNotNullParameter(singleFileUploader, "singleFileUploader");
        Intrinsics.checkNotNullParameter(pendingUploadRepository, "pendingUploadRepository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        this.f318928a = messagesApi;
        this.f318929b = progressTracker;
        this.f318930c = fileContentUploader;
        this.d = singleFileUploader;
        this.e = pendingUploadRepository;
        this.f = mapper;
        this.f318931g = workManager;
        this.f318932h = scope;
        this.i = uuidUtils;
        w wVarB = pendingUploadRepository.b();
        this.f318933j = vkm.q.O(FlowUtil.createFlow((RoomDatabase) wVarB.f250865a, false, new String[]{"pending_uploads"}, new r0e.i(wVarB, 8)), scope, c2.a(d2.Companion, 500L, 2), f0.f322471a);
    }

    public static void g(v20.c cVar, List list) {
        List<u10.n> list2 = list;
        int iB = q0.b(zhm.w.t(list2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (u10.n nVar : list2) {
            UUID uuid = nVar.f276309a;
            File file = new File(nVar.e);
            if (!file.exists()) {
                file = null;
            }
            linkedHashMap.put(uuid, file);
        }
        for (v20.a aVar : cVar.getUploads()) {
            aVar.getUpload().i = (File) linkedHashMap.get(aVar.getCorrelationId());
        }
    }

    public final t38.e a(vkm.d messageDataList) {
        Intrinsics.checkNotNullParameter(messageDataList, "messageDataList");
        return new t38.e(messageDataList, 24, this.f318933j, new y69.e(this, null, 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (skm.e0.J(r2, r4, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof z20.l
            if (r0 == 0) goto L13
            r0 = r8
            z20.l r0 = (z20.l) r0
            int r1 = r0.f318922w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f318922w = r1
            goto L18
        L13:
            z20.l r0 = new z20.l
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f318922w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            goto L64
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            yhm.o.b(r8)
            goto L50
        L37:
            yhm.o.b(r8)
            r0.f318922w = r4
            z20.j r8 = r7.e
            com.revolut.chat.data.db.ChatDatabase r2 = r8.a()
            yg5.r r4 = new yg5.r
            r6 = 18
            r4.<init>(r8, r5, r6)
            java.lang.Object r8 = androidx.room.RoomDatabaseKt.withTransaction(r2, r4, r0)
            if (r8 != r1) goto L50
            goto L63
        L50:
            java.util.List r8 = (java.util.List) r8
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            m50.f r4 = new m50.f
            r4.<init>(r8, r3, r5)
            r0.f318922w = r3
            java.lang.Object r8 = skm.e0.J(r2, r4, r0)
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z20.q.b(gim.c):java.lang.Object");
    }

    public final Object c(b bVar) throws Throwable {
        z5 z5Var = new z5(this, (Continuation) null, 4);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, z5Var, bVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof z20.n
            if (r2 == 0) goto L17
            r2 = r1
            z20.n r2 = (z20.n) r2
            int r3 = r2.f318924w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f318924w = r3
            goto L1c
        L17:
            z20.n r2 = new z20.n
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f318924w
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L88
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            yhm.o.b(r1)
            z20.r r1 = r0.d
            vkm.j2 r4 = r1.f
            java.lang.Object r6 = r4.getValue()
            java.util.Map r6 = (java.util.Map) r6
            java.util.Collection r6 = r6.values()
        L44:
            java.lang.Object r7 = r4.getValue()
            r8 = r7
            java.util.Map r8 = (java.util.Map) r8
            java.util.Map r8 = zhm.r0.g()
            boolean r7 = r4.h(r7, r8)
            if (r7 == 0) goto L44
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r4 = r6.iterator()
        L5b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L7f
            java.lang.Object r6 = r4.next()
            r7 = r6
            v20.s0 r7 = (v20.s0) r7
            ihm.f r6 = r1.f318937g
            r16 = 0
            r17 = 523775(0x7fdff, float:7.33965E-40)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            v20.s0 r7 = v20.s0.r(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r6.onNext(r7)
            goto L5b
        L7f:
            r2.f318924w = r5
            java.lang.Object r1 = r0.b(r2)
            if (r1 != r3) goto L88
            return r3
        L88:
            z20.u r1 = r0.f318929b
            java.util.concurrent.ConcurrentHashMap r1 = r1.f318939a
            r1.clear()
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z20.q.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r11 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(z20.d r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof z20.o
            if (r0 == 0) goto L13
            r0 = r11
            z20.o r0 = (z20.o) r0
            int r1 = r0.f318926x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f318926x = r1
            goto L18
        L13:
            z20.o r0 = new z20.o
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f318926x
            r7 = 0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            z20.d r10 = r0.u
            yhm.o.b(r11)
            goto L6e
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            z20.d r10 = r0.u
            yhm.o.b(r11)
            goto L4b
        L3b:
            yhm.o.b(r11)
            r0.u = r10
            r0.f318926x = r4
            z20.g r11 = r9.f318930c
            java.lang.Object r11 = r11.b(r10, r0)
            if (r11 != r1) goto L4b
            goto L6d
        L4b:
            u10.n r11 = r10.f318906a
            java.util.UUID r5 = r11.f276309a
            java.util.UUID r6 = r11.d
            r0.u = r10
            r0.f318926x = r3
            z20.j r4 = r9.e
            com.revolut.chat.data.db.ChatDatabase r11 = r4.a()
            wc2.b r3 = new wc2.b
            r8 = 21
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = androidx.room.RoomDatabaseKt.withTransaction(r11, r3, r0)
            if (r11 != r1) goto L69
            goto L6b
        L69:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L6b:
            if (r11 != r1) goto L6e
        L6d:
            return r1
        L6e:
            u10.n r10 = r10.f318906a
            java.util.UUID r10 = r10.f276309a
            z20.u r11 = r9.f318929b
            r11.getClass()
            java.lang.String r0 = "correlationId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = r11.f318940b
            r0.add(r10)
            kotlinx.coroutines.flow.MutableStateFlow r10 = r11.a(r10)
        L85:
            java.lang.Object r11 = r10.getValue()
            r0 = r11
            java.lang.Float r0 = (java.lang.Float) r0
            boolean r11 = r10.h(r11, r7)
            if (r11 == 0) goto L85
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z20.q.e(z20.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.LinkedHashSet r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof z20.p
            if (r0 == 0) goto L13
            r0 = r7
            z20.p r0 = (z20.p) r0
            int r1 = r0.f318927w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f318927w = r1
            goto L18
        L13:
            z20.p r0 = new z20.p
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f318927w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L4b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            u10.o r7 = u10.o.INITIATED
            u10.o r2 = u10.o.UPLOADING
            u10.o r4 = u10.o.FAILED
            u10.o[] r7 = new u10.o[]{r7, r2, r4}
            java.util.List r7 = zhm.v.k(r7)
            r0.f318927w = r3
            z20.j r2 = r5.e
            java.io.Serializable r7 = r2.c(r7, r6, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = zhm.d0.d0(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z20.q.f(java.util.LinkedHashSet, gim.c):java.lang.Object");
    }
}
