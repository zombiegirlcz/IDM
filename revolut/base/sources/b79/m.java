package b79;

import com.revolut.chat.ChatApi$Toggles;
import com.revolut.feature.notification_centre.impl.data.retrofit.service.InboxService;
import efm.d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements c {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u69.d f12959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InboxService f12960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uvl.c f12961c;
    public final ne0.j d;
    public final gte.a e;
    public volatile List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fd0.d f12962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f12963h;
    public final qe0.q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f12964j;
    public final x4l.c k;

    public m(u69.d inboxItemDao, InboxService inboxService, uvl.c itemMapper, ne0.j memoryCache, gte.a featureToggleInteractor, l80.e dateTimeProvider) {
        Intrinsics.checkNotNullParameter(inboxItemDao, "inboxItemDao");
        Intrinsics.checkNotNullParameter(inboxService, "inboxService");
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(dateTimeProvider, "dateTimeProvider");
        this.f12959a = inboxItemDao;
        this.f12960b = inboxService;
        this.f12961c = itemMapper;
        this.d = memoryCache;
        this.e = featureToggleInteractor;
        this.f12962g = new fd0.d(5);
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(...)");
        this.f12963h = setNewSetFromMap;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: b79.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f12943b;

            {
                this.f12943b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        m mVar = this.f12943b;
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        mVar.d.f(key, l2);
                        break;
                    case 1:
                        m mVar2 = this.f12943b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<a79.m> messages = mVar2.f12960b.getMessages(((jte.d) mVar2.e).c(ChatApi$Toggles.SupportNewInbox.f50985c) ? "feed" : null);
                        b0a.h hVar = new b0a.h(28, new d(mVar2, 0));
                        messages.getClass();
                        ufm.i iVar = new ufm.i(messages, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 2:
                        m mVar3 = this.f12943b;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        mVar3.d.f("inbox_items", value);
                        break;
                    case 3:
                        m mVar4 = this.f12943b;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items, "items");
                        gte.a aVar = mVar4.e;
                        uvl.c cVar = mVar4.f12961c;
                        u69.d dVar = mVar4.f12959a;
                        if (t69.a.a(aVar)) {
                            dVar.h(cVar.k(items));
                        } else {
                            dVar.g(cVar.k(items));
                        }
                        break;
                    default:
                        m mVar5 = this.f12943b;
                        s69.j params = (s69.j) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        if (params.f260172a == null) {
                            mVar5.f = value2;
                        } else {
                            mVar5.f12962g.d(params, value2);
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i2 = 1;
        this.i = new qe0.q(function2, new d(this, i2), 60000L, dateTimeProvider);
        Function2 function22 = new Function2(this) { // from class: b79.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f12943b;

            {
                this.f12943b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        m mVar = this.f12943b;
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        mVar.d.f(key, l2);
                        break;
                    case 1:
                        m mVar2 = this.f12943b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<a79.m> messages = mVar2.f12960b.getMessages(((jte.d) mVar2.e).c(ChatApi$Toggles.SupportNewInbox.f50985c) ? "feed" : null);
                        b0a.h hVar = new b0a.h(28, new d(mVar2, 0));
                        messages.getClass();
                        ufm.i iVar = new ufm.i(messages, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 2:
                        m mVar3 = this.f12943b;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        mVar3.d.f("inbox_items", value);
                        break;
                    case 3:
                        m mVar4 = this.f12943b;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items, "items");
                        gte.a aVar = mVar4.e;
                        uvl.c cVar = mVar4.f12961c;
                        u69.d dVar = mVar4.f12959a;
                        if (t69.a.a(aVar)) {
                            dVar.h(cVar.k(items));
                        } else {
                            dVar.g(cVar.k(items));
                        }
                        break;
                    default:
                        m mVar5 = this.f12943b;
                        s69.j params = (s69.j) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        if (params.f260172a == null) {
                            mVar5.f = value2;
                        } else {
                            mVar5.f12962g.d(params, value2);
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i3 = 2;
        d dVar = new d(this, i3);
        Function2 function23 = new Function2(this) { // from class: b79.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f12943b;

            {
                this.f12943b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        m mVar = this.f12943b;
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        mVar.d.f(key, l2);
                        break;
                    case 1:
                        m mVar2 = this.f12943b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<a79.m> messages = mVar2.f12960b.getMessages(((jte.d) mVar2.e).c(ChatApi$Toggles.SupportNewInbox.f50985c) ? "feed" : null);
                        b0a.h hVar = new b0a.h(28, new d(mVar2, 0));
                        messages.getClass();
                        ufm.i iVar = new ufm.i(messages, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 2:
                        m mVar3 = this.f12943b;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        mVar3.d.f("inbox_items", value);
                        break;
                    case 3:
                        m mVar4 = this.f12943b;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items, "items");
                        gte.a aVar = mVar4.e;
                        uvl.c cVar = mVar4.f12961c;
                        u69.d dVar2 = mVar4.f12959a;
                        if (t69.a.a(aVar)) {
                            dVar2.h(cVar.k(items));
                        } else {
                            dVar2.g(cVar.k(items));
                        }
                        break;
                    default:
                        m mVar5 = this.f12943b;
                        s69.j params = (s69.j) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        if (params.f260172a == null) {
                            mVar5.f = value2;
                        } else {
                            mVar5.f12962g.d(params, value2);
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 3;
        this.f12964j = new w4l.f(function22, dVar, function23, new d(this, i5), new Function2(this) { // from class: b79.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f12943b;

            {
                this.f12943b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        m mVar = this.f12943b;
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        mVar.d.f(key, l2);
                        break;
                    case 1:
                        m mVar2 = this.f12943b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<a79.m> messages = mVar2.f12960b.getMessages(((jte.d) mVar2.e).c(ChatApi$Toggles.SupportNewInbox.f50985c) ? "feed" : null);
                        b0a.h hVar = new b0a.h(28, new d(mVar2, 0));
                        messages.getClass();
                        ufm.i iVar = new ufm.i(messages, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 2:
                        m mVar3 = this.f12943b;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        mVar3.d.f("inbox_items", value);
                        break;
                    case 3:
                        m mVar4 = this.f12943b;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items, "items");
                        gte.a aVar = mVar4.e;
                        uvl.c cVar = mVar4.f12961c;
                        u69.d dVar2 = mVar4.f12959a;
                        if (t69.a.a(aVar)) {
                            dVar2.h(cVar.k(items));
                        } else {
                            dVar2.g(cVar.k(items));
                        }
                        break;
                    default:
                        m mVar5 = this.f12943b;
                        s69.j params = (s69.j) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        if (params.f260172a == null) {
                            mVar5.f = value2;
                        } else {
                            mVar5.f12962g.d(params, value2);
                        }
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        Continuation continuation = null;
        final int i6 = 4;
        this.k = new x4l.c(new b6a.d(this, continuation, 2), new d(this, 4), new Function2(this) { // from class: b79.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f12943b;

            {
                this.f12943b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        m mVar = this.f12943b;
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.longValue();
                        Intrinsics.checkNotNullParameter(key, "key");
                        mVar.d.f(key, l2);
                        break;
                    case 1:
                        m mVar2 = this.f12943b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<a79.m> messages = mVar2.f12960b.getMessages(((jte.d) mVar2.e).c(ChatApi$Toggles.SupportNewInbox.f50985c) ? "feed" : null);
                        b0a.h hVar = new b0a.h(28, new d(mVar2, 0));
                        messages.getClass();
                        ufm.i iVar = new ufm.i(messages, hVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 2:
                        m mVar3 = this.f12943b;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        mVar3.d.f("inbox_items", value);
                        break;
                    case 3:
                        m mVar4 = this.f12943b;
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items, "items");
                        gte.a aVar = mVar4.e;
                        uvl.c cVar = mVar4.f12961c;
                        u69.d dVar2 = mVar4.f12959a;
                        if (t69.a.a(aVar)) {
                            dVar2.h(cVar.k(items));
                        } else {
                            dVar2.g(cVar.k(items));
                        }
                        break;
                    default:
                        m mVar5 = this.f12943b;
                        s69.j params = (s69.j) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        if (params.f260172a == null) {
                            mVar5.f = value2;
                        } else {
                            mVar5.f12962g.d(params, value2);
                        }
                        break;
                }
                return Unit.f186387a;
            }
        }, new b74.e(this, continuation, 2), new a0e.o(this, continuation, 22));
    }

    public static a79.d a(String str, String str2, String str3) {
        return new a79.d((str2 == null && str3 == null) ? null : new a79.l(str, str2, str3));
    }

    public static boolean e(s69.d dVar, List list, s69.f fVar) {
        if (list.contains(dVar.f260158a)) {
            return fVar == null || dVar.d == fVar;
        }
        return false;
    }

    public final efm.b b() {
        if (t69.a.a(this.e)) {
            pfm.m mVar = pfm.m.f235744a;
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        efm.b bVarIgnoreElements = mo3.a.n(this.f12964j.f(Unit.f186387a, this.i.a("time_based_cache", true))).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r12, gim.c r13) throws java.lang.Exception {
        /*
            r11 = this;
            boolean r0 = r13 instanceof b79.l
            if (r0 == 0) goto L13
            r0 = r13
            b79.l r0 = (b79.l) r0
            int r1 = r0.f12958x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12958x = r1
            goto L18
        L13:
            b79.l r0 = new b79.l
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12958x
            java.util.Set r3 = r11.f12963h
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.util.LinkedHashSet r12 = r0.u
            yhm.o.b(r13)     // Catch: java.lang.Exception -> L2b
            goto L7e
        L2b:
            r0 = move-exception
            r13 = r0
            goto L89
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            yhm.o.b(r13)
            r13 = r12
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            java.util.Iterator r13 = r13.iterator()
        L45:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r13.next()
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r3.add(r5)
            if (r5 == 0) goto L45
            r6.add(r2)
            goto L45
        L5c:
            boolean r13 = r6.isEmpty()
            if (r13 == 0) goto L65
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L65:
            skm.p0 r13 = skm.p0.f264001a     // Catch: java.lang.Exception -> L85
            elm.f r13 = elm.f.f127540b     // Catch: java.lang.Exception -> L85
            akl.s1 r5 = new akl.s1     // Catch: java.lang.Exception -> L81
            r10 = 28
            r9 = 0
            r7 = r11
            r8 = r12
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L81
            r0.u = r6     // Catch: java.lang.Exception -> L81
            r0.f12958x = r4     // Catch: java.lang.Exception -> L81
            java.lang.Object r12 = skm.e0.J(r13, r5, r0)     // Catch: java.lang.Exception -> L81
            if (r12 != r1) goto L7e
            return r1
        L7e:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L81:
            r0 = move-exception
            r13 = r0
        L83:
            r12 = r6
            goto L89
        L85:
            r0 = move-exception
            r12 = r0
            r13 = r12
            goto L83
        L89:
            r3.removeAll(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: b79.m.c(java.util.List, gim.c):java.lang.Object");
    }

    public final void d(List list, s69.f fVar, s69.f fVar2) {
        int i;
        boolean z;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (this) {
            try {
                String strName = fVar.name();
                if (fVar2 == null) {
                    this.f12959a.l(strName, list);
                } else {
                    this.f12959a.k(strName, fVar2.name(), list);
                }
                List list2 = this.f;
                if (list2 != null) {
                    List<s69.d> list3 = list2;
                    ArrayList arrayList = new ArrayList(w.t(list3, 10));
                    for (s69.d dVarA : list3) {
                        if (e(dVarA, list, fVar2)) {
                            dVarA = s69.d.a(dVarA, fVar);
                        }
                        arrayList.add(dVarA);
                    }
                    this.f = arrayList;
                    ArrayList arrayList2 = new ArrayList();
                    ref$ObjectRef.f186409a = arrayList2;
                    arrayList2.add(new s69.j(null));
                }
                LinkedHashMap linkedHashMapH = this.f12962g.h();
                Intrinsics.checkNotNullExpressionValue(linkedHashMapH, "snapshot(...)");
                for (Map.Entry entry : linkedHashMapH.entrySet()) {
                    s69.j jVar = (s69.j) entry.getKey();
                    List list4 = (List) entry.getValue();
                    Intrinsics.h(list4);
                    List list5 = list4;
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        Iterator it8 = list5.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                break;
                            }
                            if (e((s69.d) it8.next(), list, fVar2)) {
                                List<s69.d> list6 = list4;
                                ArrayList arrayList3 = new ArrayList(w.t(list6, 10));
                                for (s69.d dVarA2 : list6) {
                                    if (e(dVarA2, list, fVar2)) {
                                        dVarA2 = s69.d.a(dVarA2, fVar);
                                    }
                                    arrayList3.add(dVarA2);
                                }
                                this.f12962g.d(jVar, arrayList3);
                                if (ref$ObjectRef.f186409a == null) {
                                    ref$ObjectRef.f186409a = new ArrayList();
                                }
                                ((List) ref$ObjectRef.f186409a).add(jVar);
                            }
                        }
                    }
                }
                List list7 = (List) this.d.get("inbox_items");
                i = 0;
                if (list7 != null) {
                    ne0.j jVar2 = this.d;
                    List<s69.d> list8 = list7;
                    ArrayList arrayList4 = new ArrayList(w.t(list8, 10));
                    z = false;
                    for (s69.d dVarA3 : list8) {
                        if (e(dVarA3, list, fVar2)) {
                            dVarA3 = s69.d.a(dVarA3, fVar);
                            z = true;
                        }
                        arrayList4.add(dVarA3);
                    }
                    jVar2.f("inbox_items", arrayList4);
                } else {
                    z = false;
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (z) {
            this.f12964j.c(null, (1 & 2) == 0, new b73.h(6));
        }
        if (ue0.e.n((List) ref$ObjectRef.f186409a)) {
            return;
        }
        x4l.c.a(this.k, new i(ref$ObjectRef, i));
    }
}
