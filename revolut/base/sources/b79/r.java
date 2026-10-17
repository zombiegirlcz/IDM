package b79;

import com.google.common.collect.ImmutableSet;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.notification_centre.impl.data.retrofit.service.NotificationCentreService;
import efm.d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import wim.z;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements n {

    @NotNull
    public static final q Companion = new q();
    public static final Type f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f12969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotificationCentreService f12970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f12971c;
    public final f79.a d;
    public final ne0.j e;

    static {
        Type type = new TypeToken<List<? extends c79.b>>() { // from class: com.revolut.feature.notification_centre.impl.data.repository.NotificationCentreRepositoryImpl$Companion$NOTIFICATION_ITEMS_HOLDER_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f = type;
        new TypeToken<Set<? extends String>>() { // from class: com.revolut.feature.notification_centre.impl.data.repository.NotificationCentreRepositoryImpl$Companion$SET_OF_STRINGS_TYPE$1
        }.getType();
    }

    public r(ue0.c storage, NotificationCentreService notificationCentreService, ImmutableSet mappers, f79.a unknownItemMapper, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(notificationCentreService, "notificationCentreService");
        Intrinsics.checkNotNullParameter(mappers, "mappers");
        Intrinsics.checkNotNullParameter(unknownItemMapper, "unknownItemMapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f12969a = storage;
        this.f12970b = notificationCentreService;
        this.f12971c = mappers;
        this.d = unknownItemMapper;
        this.e = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: b79.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f12968b;

            {
                this.f12968b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                t69.c cVarA;
                Object next;
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "it");
                        r rVar = this.f12968b;
                        d0<Map<String, List<a79.n>>> notifications = rVar.f12970b.getNotifications();
                        g gVar = new g(new o(rVar, 0), 1);
                        notifications.getClass();
                        ufm.i iVar = new ufm.i(notifications, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        Map value = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f12968b.e.f("NOTIFICATIONS_KEY", value);
                        break;
                    default:
                        Map notifications2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(notifications2, "notifications");
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = notifications2.keySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            r rVar2 = this.f12968b;
                            if (!zHasNext) {
                                ue0.c cVar = rVar2.f12969a;
                                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                                KType kTypeB = o0.b(c79.b.class);
                                companion.getClass();
                                cVar.G(arrayList, "NOTIFICATIONS_KEY", z.d(o0.f186429a.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB)))));
                            } else {
                                String str = (String) it8.next();
                                Iterable<s69.m> iterable = (List) notifications2.get(str);
                                if (iterable == null) {
                                    iterable = f0.f322471a;
                                }
                                ArrayList<t69.c> arrayList2 = new ArrayList();
                                for (s69.m value2 : iterable) {
                                    Iterator it9 = rVar2.f12971c.iterator();
                                    while (true) {
                                        cVarA = null;
                                        if (it9.hasNext()) {
                                            next = it9.next();
                                            f79.a it10 = (f79.a) next;
                                            Intrinsics.checkNotNullParameter(it10, "it");
                                            if (it10.b(value2)) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    f79.a mapper = (f79.a) next;
                                    if (mapper != null) {
                                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        t69.c cVarA2 = mapper.a(value2);
                                        cVarA = cVarA2 == null ? rVar2.d.a(value2) : cVarA2;
                                    }
                                    if (cVarA != null) {
                                        arrayList2.add(cVarA);
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                                for (t69.c cVar2 : arrayList2) {
                                    arrayList3.add(new c79.a(cVar2.getType(), cVar2.getData()));
                                }
                                arrayList.add(new c79.b(str, arrayList3));
                            }
                            break;
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i2 = 1;
        o oVar = new o(this, 1);
        Function2 function22 = new Function2(this) { // from class: b79.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f12968b;

            {
                this.f12968b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                t69.c cVarA;
                Object next;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "it");
                        r rVar = this.f12968b;
                        d0<Map<String, List<a79.n>>> notifications = rVar.f12970b.getNotifications();
                        g gVar = new g(new o(rVar, 0), 1);
                        notifications.getClass();
                        ufm.i iVar = new ufm.i(notifications, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        Map value = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f12968b.e.f("NOTIFICATIONS_KEY", value);
                        break;
                    default:
                        Map notifications2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(notifications2, "notifications");
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = notifications2.keySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            r rVar2 = this.f12968b;
                            if (!zHasNext) {
                                ue0.c cVar = rVar2.f12969a;
                                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                                KType kTypeB = o0.b(c79.b.class);
                                companion.getClass();
                                cVar.G(arrayList, "NOTIFICATIONS_KEY", z.d(o0.f186429a.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB)))));
                            } else {
                                String str = (String) it8.next();
                                Iterable<s69.m> iterable = (List) notifications2.get(str);
                                if (iterable == null) {
                                    iterable = f0.f322471a;
                                }
                                ArrayList<t69.c> arrayList2 = new ArrayList();
                                for (s69.m value2 : iterable) {
                                    Iterator it9 = rVar2.f12971c.iterator();
                                    while (true) {
                                        cVarA = null;
                                        if (it9.hasNext()) {
                                            next = it9.next();
                                            f79.a it10 = (f79.a) next;
                                            Intrinsics.checkNotNullParameter(it10, "it");
                                            if (it10.b(value2)) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    f79.a mapper = (f79.a) next;
                                    if (mapper != null) {
                                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        t69.c cVarA2 = mapper.a(value2);
                                        cVarA = cVarA2 == null ? rVar2.d.a(value2) : cVarA2;
                                    }
                                    if (cVarA != null) {
                                        arrayList2.add(cVarA);
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                                for (t69.c cVar2 : arrayList2) {
                                    arrayList3.add(new c79.a(cVar2.getType(), cVar2.getData()));
                                }
                                arrayList.add(new c79.b(str, arrayList3));
                            }
                            break;
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i3 = 2;
        new w4l.f(function2, oVar, function22, new o(this, 2), new Function2(this) { // from class: b79.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f12968b;

            {
                this.f12968b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                t69.c cVarA;
                Object next;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "it");
                        r rVar = this.f12968b;
                        d0<Map<String, List<a79.n>>> notifications = rVar.f12970b.getNotifications();
                        g gVar = new g(new o(rVar, 0), 1);
                        notifications.getClass();
                        ufm.i iVar = new ufm.i(notifications, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        Map value = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f12968b.e.f("NOTIFICATIONS_KEY", value);
                        break;
                    default:
                        Map notifications2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(notifications2, "notifications");
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = notifications2.keySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            r rVar2 = this.f12968b;
                            if (!zHasNext) {
                                ue0.c cVar = rVar2.f12969a;
                                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                                KType kTypeB = o0.b(c79.b.class);
                                companion.getClass();
                                cVar.G(arrayList, "NOTIFICATIONS_KEY", z.d(o0.f186429a.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB)))));
                            } else {
                                String str = (String) it8.next();
                                Iterable<s69.m> iterable = (List) notifications2.get(str);
                                if (iterable == null) {
                                    iterable = f0.f322471a;
                                }
                                ArrayList<t69.c> arrayList2 = new ArrayList();
                                for (s69.m value2 : iterable) {
                                    Iterator it9 = rVar2.f12971c.iterator();
                                    while (true) {
                                        cVarA = null;
                                        if (it9.hasNext()) {
                                            next = it9.next();
                                            f79.a it10 = (f79.a) next;
                                            Intrinsics.checkNotNullParameter(it10, "it");
                                            if (it10.b(value2)) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    f79.a mapper = (f79.a) next;
                                    if (mapper != null) {
                                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                                        Intrinsics.checkNotNullParameter(value2, "value");
                                        t69.c cVarA2 = mapper.a(value2);
                                        cVarA = cVarA2 == null ? rVar2.d.a(value2) : cVarA2;
                                    }
                                    if (cVarA != null) {
                                        arrayList2.add(cVarA);
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                                for (t69.c cVar2 : arrayList2) {
                                    arrayList3.add(new c79.a(cVar2.getType(), cVar2.getData()));
                                }
                                arrayList.add(new c79.b(str, arrayList3));
                            }
                            break;
                        }
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    @Override // od0.e
    public final void clear() {
        this.f12969a.clear();
        this.e.clear();
    }
}
