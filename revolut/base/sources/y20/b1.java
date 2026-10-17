package y20;

import androidx.work.WorkManager;
import com.revolut.chat.data.db.ChatDatabase;
import com.revolut.chat.data.network.MessagesApi;
import com.revolut.chat.data.network.TicketsInfoApi;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class b1 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s20.d f310454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4m.a f310455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d30.c f310456c;
    public final y10.h d;
    public final ne0.j e;
    public final f30.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r10.q f310457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MessagesApi f310458h;
    public final uvl.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v10.b f310459j;
    public final f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z20.j f310460l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CoroutineScope f310461m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z20.q f310462n;
    public final xe0.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TicketsInfoApi f310463p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e30.b f310464q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fd0.d f310465r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fd0.d f310466s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ConcurrentHashMap f310467t;
    public final ihm.j u;
    public final x4l.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x4l.c f310468w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x4l.c f310469x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final x4l.c f310470y;
    public final x4l.c z;

    public b1(MessagesApi messagesApi, TicketsInfoApi ticketInfoApi, d30.c fileUrlDataSource, d4m.a chatDatabaseLazy, e30.b webSocketDelegate, f30.b messageSearchEngine, i90.b uuidGenerator, j30.c chatFeatureToggles, kg.o gson, CoroutineScope scope, ne0.j memoryCache, r10.q messageSearchIndexWriter, s20.d agentDataSource, uvl.c messagesPersister, v10.b messagesSettingsStorage, xe0.e storage, y10.h mapper, y10.l structuredMessageMapper, f eagerHistoryLoader, z20.j pendingUploadRepository, z20.q sendFileOrchestrator) {
        Intrinsics.checkNotNullParameter(agentDataSource, "agentDataSource");
        Intrinsics.checkNotNullParameter(chatDatabaseLazy, "chatDatabaseLazy");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(fileUrlDataSource, "fileUrlDataSource");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(messageSearchEngine, "messageSearchEngine");
        Intrinsics.checkNotNullParameter(messageSearchIndexWriter, "messageSearchIndexWriter");
        Intrinsics.checkNotNullParameter(messagesApi, "messagesApi");
        Intrinsics.checkNotNullParameter(messagesPersister, "messagesPersister");
        Intrinsics.checkNotNullParameter(messagesSettingsStorage, "messagesSettingsStorage");
        Intrinsics.checkNotNullParameter(eagerHistoryLoader, "eagerHistoryLoader");
        Intrinsics.checkNotNullParameter(pendingUploadRepository, "pendingUploadRepository");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(sendFileOrchestrator, "sendFileOrchestrator");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(structuredMessageMapper, "structuredMessageMapper");
        Intrinsics.checkNotNullParameter(ticketInfoApi, "ticketInfoApi");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(webSocketDelegate, "webSocketDelegate");
        this.f310454a = agentDataSource;
        this.f310455b = chatDatabaseLazy;
        this.f310456c = fileUrlDataSource;
        this.d = mapper;
        this.e = memoryCache;
        this.f = messageSearchEngine;
        this.f310457g = messageSearchIndexWriter;
        this.f310458h = messagesApi;
        this.i = messagesPersister;
        this.f310459j = messagesSettingsStorage;
        this.k = eagerHistoryLoader;
        this.f310460l = pendingUploadRepository;
        this.f310461m = scope;
        this.f310462n = sendFileOrchestrator;
        this.o = storage;
        this.f310463p = ticketInfoApi;
        this.f310464q = webSocketDelegate;
        this.f310465r = new fd0.d(5);
        this.f310466s = new fd0.d(2);
        this.f310467t = new ConcurrentHashMap();
        this.u = p.a.h("toSerialized(...)");
        Continuation continuation = null;
        final int i = 0;
        this.v = new x4l.c(new wqj.g(this, continuation, 18), new i0(this, 0), new Function2(this) { // from class: y20.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b1 f310513b;

            {
                this.f310513b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        q params = (q) obj2;
                        List messages = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(messages, "messages");
                        if (params.f310536b == null) {
                            this.f310513b.f310465r.d(params, messages);
                        }
                        break;
                    case 1:
                        r params2 = (r) obj2;
                        List messages2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(messages2, "messages");
                        if (params2.f310539a == null) {
                            this.f310513b.f310465r.d(params2, messages2);
                        }
                        break;
                    case 2:
                        s params3 = (s) obj2;
                        List messages3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(messages3, "messages");
                        if (params3.f310544a == null) {
                            this.f310513b.f310465r.d(params3, messages3);
                        }
                        break;
                    case 3:
                        f1 key = (f1) obj2;
                        List messages4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(messages4, "messages");
                        if (key.f310494a.a() == null) {
                            this.f310513b.f310466s.d(key, messages4);
                        }
                        break;
                    default:
                        v30.c0 params4 = (v30.c0) obj2;
                        v50.a data = (v50.a) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f310513b.e.f(b1.j(params4), data);
                        break;
                }
                return Unit.f186387a;
            }
        }, new xnl.f(this, continuation, 28), new x18.e(this, continuation, 23));
        final int i2 = 1;
        this.f310468w = new x4l.c(new wqj.g(this, continuation, 16), new i0(this, 1), new Function2(this) { // from class: y20.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b1 f310513b;

            {
                this.f310513b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        q params = (q) obj2;
                        List messages = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(messages, "messages");
                        if (params.f310536b == null) {
                            this.f310513b.f310465r.d(params, messages);
                        }
                        break;
                    case 1:
                        r params2 = (r) obj2;
                        List messages2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(messages2, "messages");
                        if (params2.f310539a == null) {
                            this.f310513b.f310465r.d(params2, messages2);
                        }
                        break;
                    case 2:
                        s params3 = (s) obj2;
                        List messages3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(messages3, "messages");
                        if (params3.f310544a == null) {
                            this.f310513b.f310465r.d(params3, messages3);
                        }
                        break;
                    case 3:
                        f1 key = (f1) obj2;
                        List messages4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(messages4, "messages");
                        if (key.f310494a.a() == null) {
                            this.f310513b.f310466s.d(key, messages4);
                        }
                        break;
                    default:
                        v30.c0 params4 = (v30.c0) obj2;
                        v50.a data = (v50.a) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f310513b.e.f(b1.j(params4), data);
                        break;
                }
                return Unit.f186387a;
            }
        }, new r0(this, continuation, 0), new x18.e(this, continuation, 22));
        final int i3 = 2;
        this.f310469x = new x4l.c(new wqj.g(this, continuation, 19), new i0(this, 2), new Function2(this) { // from class: y20.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b1 f310513b;

            {
                this.f310513b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        q params = (q) obj2;
                        List messages = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(messages, "messages");
                        if (params.f310536b == null) {
                            this.f310513b.f310465r.d(params, messages);
                        }
                        break;
                    case 1:
                        r params2 = (r) obj2;
                        List messages2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(messages2, "messages");
                        if (params2.f310539a == null) {
                            this.f310513b.f310465r.d(params2, messages2);
                        }
                        break;
                    case 2:
                        s params3 = (s) obj2;
                        List messages3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(messages3, "messages");
                        if (params3.f310544a == null) {
                            this.f310513b.f310465r.d(params3, messages3);
                        }
                        break;
                    case 3:
                        f1 key = (f1) obj2;
                        List messages4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(messages4, "messages");
                        if (key.f310494a.a() == null) {
                            this.f310513b.f310466s.d(key, messages4);
                        }
                        break;
                    default:
                        v30.c0 params4 = (v30.c0) obj2;
                        v50.a data = (v50.a) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f310513b.e.f(b1.j(params4), data);
                        break;
                }
                return Unit.f186387a;
            }
        }, new r0(this, continuation, 1), new x18.e(this, continuation, 24));
        final int i5 = 3;
        this.f310470y = new x4l.c(new wqj.g(this, continuation, 20), new i0(this, 3), new Function2(this) { // from class: y20.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b1 f310513b;

            {
                this.f310513b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        q params = (q) obj2;
                        List messages = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(messages, "messages");
                        if (params.f310536b == null) {
                            this.f310513b.f310465r.d(params, messages);
                        }
                        break;
                    case 1:
                        r params2 = (r) obj2;
                        List messages2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(messages2, "messages");
                        if (params2.f310539a == null) {
                            this.f310513b.f310465r.d(params2, messages2);
                        }
                        break;
                    case 2:
                        s params3 = (s) obj2;
                        List messages3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(messages3, "messages");
                        if (params3.f310544a == null) {
                            this.f310513b.f310465r.d(params3, messages3);
                        }
                        break;
                    case 3:
                        f1 key = (f1) obj2;
                        List messages4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(messages4, "messages");
                        if (key.f310494a.a() == null) {
                            this.f310513b.f310466s.d(key, messages4);
                        }
                        break;
                    default:
                        v30.c0 params4 = (v30.c0) obj2;
                        v50.a data = (v50.a) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f310513b.e.f(b1.j(params4), data);
                        break;
                }
                return Unit.f186387a;
            }
        }, new aie.v(this, (Continuation) null), new wa7.j(this, continuation, 13));
        final int i6 = 4;
        this.z = new x4l.c(new wqj.g(this, continuation, 17), new i0(this, 4), new Function2(this) { // from class: y20.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b1 f310513b;

            {
                this.f310513b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        q params = (q) obj2;
                        List messages = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(messages, "messages");
                        if (params.f310536b == null) {
                            this.f310513b.f310465r.d(params, messages);
                        }
                        break;
                    case 1:
                        r params2 = (r) obj2;
                        List messages2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(messages2, "messages");
                        if (params2.f310539a == null) {
                            this.f310513b.f310465r.d(params2, messages2);
                        }
                        break;
                    case 2:
                        s params3 = (s) obj2;
                        List messages3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(messages3, "messages");
                        if (params3.f310544a == null) {
                            this.f310513b.f310465r.d(params3, messages3);
                        }
                        break;
                    case 3:
                        f1 key = (f1) obj2;
                        List messages4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(messages4, "messages");
                        if (key.f310494a.a() == null) {
                            this.f310513b.f310466s.d(key, messages4);
                        }
                        break;
                    default:
                        v30.c0 params4 = (v30.c0) obj2;
                        v50.a data = (v50.a) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f310513b.e.f(b1.j(params4), data);
                        break;
                }
                return Unit.f186387a;
            }
        }, new xv4.o(this, continuation, 16), new wvg.i(this, continuation, 24));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(y20.b1 r7, p20.b r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y20.b1.a(y20.b1, p20.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r7 == r10) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        if (r7 == r10) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
    
        if (r7 == r10) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(y20.b1 r7, r10.q r8, y20.t r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof y20.s0
            if (r0 == 0) goto L13
            r0 = r10
            y20.s0 r0 = (y20.s0) r0
            int r1 = r0.f310546w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310546w = r1
            goto L18
        L13:
            y20.s0 r0 = new y20.s0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r10 = fim.a.COROUTINE_SUSPENDED
            int r1 = r0.f310546w
            r2 = 3
            r3 = 2
            java.lang.String r4 = "await(...)"
            r5 = 1
            if (r1 == 0) goto L40
            if (r1 == r5) goto L3c
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            yhm.o.b(r7)
            goto Lad
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            yhm.o.b(r7)
            goto L88
        L3c:
            yhm.o.b(r7)
            goto L63
        L40:
            yhm.o.b(r7)
            boolean r7 = r9 instanceof y20.q
            r1 = 0
            if (r7 == 0) goto L69
            y20.q r9 = (y20.q) r9
            java.util.UUID r7 = r9.f310535a
            java.lang.Object r9 = r8.f250849b
            androidx.room.RoomDatabase r9 = (androidx.room.RoomDatabase) r9
            r10.h r2 = new r10.h
            r3 = 3
            r2.<init>(r8, r7, r3)
            efm.d0 r7 = androidx.room.RxRoom.createSingle(r9, r5, r1, r2)
            r0.f310546w = r5
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r10) goto L63
            goto Lac
        L63:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r4)
            java.util.List r7 = (java.util.List) r7
            return r7
        L69:
            boolean r7 = r9 instanceof y20.s
            if (r7 == 0) goto L8e
            y20.s r9 = (y20.s) r9
            v30.c0 r7 = r9.f310545b
            java.lang.Object r9 = r8.f250849b
            androidx.room.RoomDatabase r9 = (androidx.room.RoomDatabase) r9
            r10.j r2 = new r10.j
            r6 = 0
            r2.<init>(r8, r7, r6)
            efm.d0 r7 = androidx.room.RxRoom.createSingle(r9, r5, r1, r2)
            r0.f310546w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r10) goto L88
            goto Lac
        L88:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r4)
            java.util.List r7 = (java.util.List) r7
            return r7
        L8e:
            boolean r7 = r9 instanceof y20.r
            if (r7 == 0) goto Lb3
            y20.r r9 = (y20.r) r9
            java.util.UUID r7 = r9.f310540b
            java.lang.Object r9 = r8.f250849b
            androidx.room.RoomDatabase r9 = (androidx.room.RoomDatabase) r9
            r10.h r3 = new r10.h
            r6 = 2
            r3.<init>(r8, r7, r6)
            efm.d0 r7 = androidx.room.RxRoom.createSingle(r9, r5, r1, r3)
            r0.f310546w = r2
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r10) goto Lad
        Lac:
            return r10
        Lad:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r4)
            java.util.List r7 = (java.util.List) r7
            return r7
        Lb3:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y20.b1.b(y20.b1, r10.q, y20.t, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (r0 == r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f8, code lost:
    
        if (r0 == r8) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(y20.b1 r16, r10.r r17, y20.f1 r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y20.b1.c(y20.b1, r10.r, y20.f1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        if (r0 == r2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0199, code lost:
    
        if (r9.r(r0, null, r10) == r2) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(y20.b1 r16, v20.n r17, gim.c r18) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y20.b1.d(y20.b1, v20.n, gim.c):java.lang.Object");
    }

    public static String j(v30.c0 c0Var) {
        int i = l0.f310522a[c0Var.ordinal()];
        if (i == 1) {
            return "greeting_support";
        }
        if (i == 2) {
            return "greeting_assistant";
        }
        if (i == 3) {
            return "greeting_private_banking";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // od0.e
    public final void clear() {
        ((WorkManager) this.f310462n.f318931g.get()).cancelUniqueWork("bulk_upload_content");
        this.f310459j.f285201a.clear();
        this.f310465r.i(-1);
        this.f310466s.i(-1);
        skm.e0.C(this.f310461m, null, null, new m0(this, null, 0), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:55|56|84|57|(8:60|61|62|63|(0)|81|40|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01bd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01be, code lost:
    
        r14 = r7;
        r11 = r13;
        r15 = r17;
        r13 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01cd, code lost:
    
        if ((r0 instanceof com.revolut.core.error.data.model.ServerErrorException) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d8, code lost:
    
        r8 = r9;
        r7 = r10;
        r0 = r11;
        r6 = r14;
        r14 = null;
        r9 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e1, code lost:
    
        r6 = new java.lang.RuntimeException(prk.o.r(((v20.s0) r12).z(), "Failed to resolve URL for "), r0);
        r0 = zhm.h0.f322473a;
        r7 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, r6, r0);
        r8 = r13;
        r7 = r14;
        r17 = r15;
        r13 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0205, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0217  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x018d -> B:61:0x0192). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01d8 -> B:63:0x01b9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r30, java.util.List r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y20.b1.e(gim.c, java.util.List, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(v20.n r13, gim.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof y20.o0
            if (r0 == 0) goto L13
            r0 = r14
            y20.o0 r0 = (y20.o0) r0
            int r1 = r0.f310531x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310531x = r1
            goto L18
        L13:
            y20.o0 r0 = new y20.o0
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f310531x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            v20.s0 r13 = r0.u
            yhm.o.b(r14)
            goto L64
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L31:
            yhm.o.b(r14)
            boolean r14 = r13 instanceof v20.s0
            if (r14 == 0) goto L9b
            r14 = r13
            v20.s0 r14 = (v20.s0) r14
            boolean r2 = r14.A()
            if (r2 == 0) goto L9b
            com.revolut.chat.data.db.ChatDatabase r2 = r12.i()
            r10.q r2 = r2.m()
            java.util.UUID r4 = r14.getId()
            r0.u = r14
            r0.f310531x = r3
            java.lang.Object r14 = r2.f250849b
            androidx.room.RoomDatabase r14 = (androidx.room.RoomDatabase) r14
            be7.l r5 = new be7.l
            r6 = 17
            r5.<init>(r2, r4, r6)
            r2 = 0
            java.lang.Object r14 = androidx.room.util.DBUtil.performSuspending(r14, r3, r2, r5, r0)
            if (r14 != r1) goto L64
            return r1
        L64:
            u10.h r14 = (u10.h) r14
            if (r14 != 0) goto L69
            goto L9b
        L69:
            y10.h r0 = r12.d
            v20.n r14 = r0.h(r14)
            boolean r0 = r14 instanceof v20.s0
            if (r0 == 0) goto L9b
            v20.s0 r14 = (v20.s0) r14
            boolean r0 = r14.A()
            if (r0 == 0) goto L9b
            r1 = r13
            v20.s0 r1 = (v20.s0) r1
            v20.t0 r6 = r14.getMeta()
            java.lang.String r13 = r14.getFilePath()
            if (r13 != 0) goto L8c
            java.lang.String r13 = r1.getFilePath()
        L8c:
            r5 = r13
            r10 = 0
            r11 = 521727(0x7f5ff, float:7.31095E-40)
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            v20.s0 r13 = v20.s0.r(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L9b:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: y20.b1.g(v20.n, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(i20.w0 r19, java.util.Map r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y20.b1.h(i20.w0, java.util.Map, gim.c):java.lang.Object");
    }

    public final ChatDatabase i() {
        Object obj2 = this.f310455b.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (ChatDatabase) obj2;
    }

    public final void k(t params) throws Throwable {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params instanceof q) {
            if (((q) params).f310536b != null) {
                wp5.y.B("only initial page is allowed");
                return;
            }
        } else if (params instanceof s) {
            if (((s) params).f310544a != null) {
                wp5.y.B("only initial page is allowed");
                return;
            }
        } else {
            if (!(params instanceof r)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((r) params).f310539a != null) {
                wp5.y.B("only initial page is allowed");
                return;
            }
        }
        if (this.f310465r.c(params) != null) {
            return;
        }
        skm.e0.C(this.f310461m, null, null, new xnl.f(this, params, null, 29), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.b l(v20.n r18) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y20.b1.l(v20.n):efm.b");
    }
}
