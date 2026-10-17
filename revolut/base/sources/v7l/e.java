package v7l;

import com.google.gson.reflect.TypeToken;
import com.revolut.shared.feature.event_appearance.api.models.EventAppearance;
import com.youTransactor.uCube.rpc.Constants;
import java.lang.reflect.Type;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import od0.h;
import od0.i;
import org.jetbrains.annotations.NotNull;
import w4l.f;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f286683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f286684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f286685c;
    public final f d;

    public e(j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f286683a = storage;
        this.f286684b = memoryCache;
        final int i = 1;
        Function2 function2 = new Function2(this) { // from class: v7l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f286680b;

            {
                this.f286680b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        i domain = (i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f286680b.f286684b.f("HOLIDAY_APPEARANCE_ENABLED_KEY", domain);
                        return Unit.f186387a;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        final int i2 = 1;
                        final e eVar = this.f286680b;
                        ufm.c cVar = new ufm.c(new Callable() { // from class: v7l.a
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                EventAppearance eventAppearance;
                                switch (i2) {
                                    case 0:
                                        ue0.c cVar2 = eVar.f286683a;
                                        e.Companion.getClass();
                                        Type type = new TypeToken<Boolean>() { // from class: com.revolut.shared.feature.event_appearance.impl.repositories.EventAppearanceRepositoryImpl$Companion$HOLIDAY_APPEARANCE_ENABLED_TYPE$1
                                        }.getType();
                                        Intrinsics.checkNotNullExpressionValue(type, "<get-HOLIDAY_APPEARANCE_ENABLED_TYPE>(...)");
                                        Boolean bool = (Boolean) cVar2.T2("HOLIDAY_APPEARANCE_ENABLED_KEY", type);
                                        i.Companion.getClass();
                                        return h.a(bool);
                                    default:
                                        ue0.c cVar3 = eVar.f286683a;
                                        e.Companion.getClass();
                                        Type type2 = new TypeToken<t7l.a>() { // from class: com.revolut.shared.feature.event_appearance.impl.repositories.EventAppearanceRepositoryImpl$Companion$EVENT_APPEARANCE_TYPE$1
                                        }.getType();
                                        Intrinsics.checkNotNullExpressionValue(type2, "<get-EVENT_APPEARANCE_TYPE>(...)");
                                        t7l.a aVar = (t7l.a) cVar3.T2("EVENT_APPEARANCE_KEY", type2);
                                        h hVar = i.Companion;
                                        if (aVar != null) {
                                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                                            eventAppearance = new EventAppearance(aVar.getId());
                                        } else {
                                            eventAppearance = null;
                                        }
                                        hVar.getClass();
                                        return h.a(eventAppearance);
                                }
                            }
                        }, 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 2:
                        i domain2 = (i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f286680b.f286684b.f("EVENT_APPEARANCE_KEY", domain2);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        final int i3 = 0;
                        final e eVar2 = this.f286680b;
                        ufm.c cVar2 = new ufm.c(new Callable() { // from class: v7l.a
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                EventAppearance eventAppearance;
                                switch (i3) {
                                    case 0:
                                        ue0.c cVar22 = eVar2.f286683a;
                                        e.Companion.getClass();
                                        Type type = new TypeToken<Boolean>() { // from class: com.revolut.shared.feature.event_appearance.impl.repositories.EventAppearanceRepositoryImpl$Companion$HOLIDAY_APPEARANCE_ENABLED_TYPE$1
                                        }.getType();
                                        Intrinsics.checkNotNullExpressionValue(type, "<get-HOLIDAY_APPEARANCE_ENABLED_TYPE>(...)");
                                        Boolean bool = (Boolean) cVar22.T2("HOLIDAY_APPEARANCE_ENABLED_KEY", type);
                                        i.Companion.getClass();
                                        return h.a(bool);
                                    default:
                                        ue0.c cVar3 = eVar2.f286683a;
                                        e.Companion.getClass();
                                        Type type2 = new TypeToken<t7l.a>() { // from class: com.revolut.shared.feature.event_appearance.impl.repositories.EventAppearanceRepositoryImpl$Companion$EVENT_APPEARANCE_TYPE$1
                                        }.getType();
                                        Intrinsics.checkNotNullExpressionValue(type2, "<get-EVENT_APPEARANCE_TYPE>(...)");
                                        t7l.a aVar = (t7l.a) cVar3.T2("EVENT_APPEARANCE_KEY", type2);
                                        h hVar = i.Companion;
                                        if (aVar != null) {
                                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                                            eventAppearance = new EventAppearance(aVar.getId());
                                        } else {
                                            eventAppearance = null;
                                        }
                                        hVar.getClass();
                                        return h.a(eventAppearance);
                                }
                            }
                        }, 2);
                        Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                        return cVar2;
                }
            }
        };
        final int i2 = 0;
        Function1 function1 = new Function1(this) { // from class: v7l.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f286682b;

            {
                this.f286682b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (i) this.f286682b.f286684b.get("EVENT_APPEARANCE_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (i) this.f286682b.f286684b.get("HOLIDAY_APPEARANCE_ENABLED_KEY");
                }
            }
        };
        final int i3 = 2;
        this.f286685c = new f(function2, function1, new Function2(this) { // from class: v7l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f286680b;

            {
                this.f286680b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        i domain = (i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f286680b.f286684b.f("HOLIDAY_APPEARANCE_ENABLED_KEY", domain);
                        return Unit.f186387a;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        final int i22 = 1;
                        final e eVar = this.f286680b;
                        ufm.c cVar = new ufm.c(new Callable() { // from class: v7l.a
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                EventAppearance eventAppearance;
                                switch (i22) {
                                    case 0:
                                        ue0.c cVar22 = eVar.f286683a;
                                        e.Companion.getClass();
                                        Type type = new TypeToken<Boolean>() { // from class: com.revolut.shared.feature.event_appearance.impl.repositories.EventAppearanceRepositoryImpl$Companion$HOLIDAY_APPEARANCE_ENABLED_TYPE$1
                                        }.getType();
                                        Intrinsics.checkNotNullExpressionValue(type, "<get-HOLIDAY_APPEARANCE_ENABLED_TYPE>(...)");
                                        Boolean bool = (Boolean) cVar22.T2("HOLIDAY_APPEARANCE_ENABLED_KEY", type);
                                        i.Companion.getClass();
                                        return h.a(bool);
                                    default:
                                        ue0.c cVar3 = eVar.f286683a;
                                        e.Companion.getClass();
                                        Type type2 = new TypeToken<t7l.a>() { // from class: com.revolut.shared.feature.event_appearance.impl.repositories.EventAppearanceRepositoryImpl$Companion$EVENT_APPEARANCE_TYPE$1
                                        }.getType();
                                        Intrinsics.checkNotNullExpressionValue(type2, "<get-EVENT_APPEARANCE_TYPE>(...)");
                                        t7l.a aVar = (t7l.a) cVar3.T2("EVENT_APPEARANCE_KEY", type2);
                                        h hVar = i.Companion;
                                        if (aVar != null) {
                                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                                            eventAppearance = new EventAppearance(aVar.getId());
                                        } else {
                                            eventAppearance = null;
                                        }
                                        hVar.getClass();
                                        return h.a(eventAppearance);
                                }
                            }
                        }, 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 2:
                        i domain2 = (i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f286680b.f286684b.f("EVENT_APPEARANCE_KEY", domain2);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        final int i32 = 0;
                        final e eVar2 = this.f286680b;
                        ufm.c cVar2 = new ufm.c(new Callable() { // from class: v7l.a
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                EventAppearance eventAppearance;
                                switch (i32) {
                                    case 0:
                                        ue0.c cVar22 = eVar2.f286683a;
                                        e.Companion.getClass();
                                        Type type = new TypeToken<Boolean>() { // from class: com.revolut.shared.feature.event_appearance.impl.repositories.EventAppearanceRepositoryImpl$Companion$HOLIDAY_APPEARANCE_ENABLED_TYPE$1
                                        }.getType();
                                        Intrinsics.checkNotNullExpressionValue(type, "<get-HOLIDAY_APPEARANCE_ENABLED_TYPE>(...)");
                                        Boolean bool = (Boolean) cVar22.T2("HOLIDAY_APPEARANCE_ENABLED_KEY", type);
                                        i.Companion.getClass();
                                        return h.a(bool);
                                    default:
                                        ue0.c cVar3 = eVar2.f286683a;
                                        e.Companion.getClass();
                                        Type type2 = new TypeToken<t7l.a>() { // from class: com.revolut.shared.feature.event_appearance.impl.repositories.EventAppearanceRepositoryImpl$Companion$EVENT_APPEARANCE_TYPE$1
                                        }.getType();
                                        Intrinsics.checkNotNullExpressionValue(type2, "<get-EVENT_APPEARANCE_TYPE>(...)");
                                        t7l.a aVar = (t7l.a) cVar3.T2("EVENT_APPEARANCE_KEY", type2);
                                        h hVar = i.Companion;
                                        if (aVar != null) {
                                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                                            eventAppearance = new EventAppearance(aVar.getId());
                                        } else {
                                            eventAppearance = null;
                                        }
                                        hVar.getClass();
                                        return h.a(eventAppearance);
                                }
                            }
                        }, 2);
                        Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                        return cVar2;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i5 = 3;
        Function2 function22 = new Function2(this) { // from class: v7l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f286680b;

            {
                this.f286680b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        i domain = (i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f286680b.f286684b.f("HOLIDAY_APPEARANCE_ENABLED_KEY", domain);
                        return Unit.f186387a;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        final int i22 = 1;
                        final e eVar = this.f286680b;
                        ufm.c cVar = new ufm.c(new Callable() { // from class: v7l.a
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                EventAppearance eventAppearance;
                                switch (i22) {
                                    case 0:
                                        ue0.c cVar22 = eVar.f286683a;
                                        e.Companion.getClass();
                                        Type type = new TypeToken<Boolean>() { // from class: com.revolut.shared.feature.event_appearance.impl.repositories.EventAppearanceRepositoryImpl$Companion$HOLIDAY_APPEARANCE_ENABLED_TYPE$1
                                        }.getType();
                                        Intrinsics.checkNotNullExpressionValue(type, "<get-HOLIDAY_APPEARANCE_ENABLED_TYPE>(...)");
                                        Boolean bool = (Boolean) cVar22.T2("HOLIDAY_APPEARANCE_ENABLED_KEY", type);
                                        i.Companion.getClass();
                                        return h.a(bool);
                                    default:
                                        ue0.c cVar3 = eVar.f286683a;
                                        e.Companion.getClass();
                                        Type type2 = new TypeToken<t7l.a>() { // from class: com.revolut.shared.feature.event_appearance.impl.repositories.EventAppearanceRepositoryImpl$Companion$EVENT_APPEARANCE_TYPE$1
                                        }.getType();
                                        Intrinsics.checkNotNullExpressionValue(type2, "<get-EVENT_APPEARANCE_TYPE>(...)");
                                        t7l.a aVar = (t7l.a) cVar3.T2("EVENT_APPEARANCE_KEY", type2);
                                        h hVar = i.Companion;
                                        if (aVar != null) {
                                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                                            eventAppearance = new EventAppearance(aVar.getId());
                                        } else {
                                            eventAppearance = null;
                                        }
                                        hVar.getClass();
                                        return h.a(eventAppearance);
                                }
                            }
                        }, 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 2:
                        i domain2 = (i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f286680b.f286684b.f("EVENT_APPEARANCE_KEY", domain2);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        final int i32 = 0;
                        final e eVar2 = this.f286680b;
                        ufm.c cVar2 = new ufm.c(new Callable() { // from class: v7l.a
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                EventAppearance eventAppearance;
                                switch (i32) {
                                    case 0:
                                        ue0.c cVar22 = eVar2.f286683a;
                                        e.Companion.getClass();
                                        Type type = new TypeToken<Boolean>() { // from class: com.revolut.shared.feature.event_appearance.impl.repositories.EventAppearanceRepositoryImpl$Companion$HOLIDAY_APPEARANCE_ENABLED_TYPE$1
                                        }.getType();
                                        Intrinsics.checkNotNullExpressionValue(type, "<get-HOLIDAY_APPEARANCE_ENABLED_TYPE>(...)");
                                        Boolean bool = (Boolean) cVar22.T2("HOLIDAY_APPEARANCE_ENABLED_KEY", type);
                                        i.Companion.getClass();
                                        return h.a(bool);
                                    default:
                                        ue0.c cVar3 = eVar2.f286683a;
                                        e.Companion.getClass();
                                        Type type2 = new TypeToken<t7l.a>() { // from class: com.revolut.shared.feature.event_appearance.impl.repositories.EventAppearanceRepositoryImpl$Companion$EVENT_APPEARANCE_TYPE$1
                                        }.getType();
                                        Intrinsics.checkNotNullExpressionValue(type2, "<get-EVENT_APPEARANCE_TYPE>(...)");
                                        t7l.a aVar = (t7l.a) cVar3.T2("EVENT_APPEARANCE_KEY", type2);
                                        h hVar = i.Companion;
                                        if (aVar != null) {
                                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                                            eventAppearance = new EventAppearance(aVar.getId());
                                        } else {
                                            eventAppearance = null;
                                        }
                                        hVar.getClass();
                                        return h.a(eventAppearance);
                                }
                            }
                        }, 2);
                        Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                        return cVar2;
                }
            }
        };
        final int i6 = 1;
        Function1 function12 = new Function1(this) { // from class: v7l.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f286682b;

            {
                this.f286682b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (i) this.f286682b.f286684b.get("EVENT_APPEARANCE_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (i) this.f286682b.f286684b.get("HOLIDAY_APPEARANCE_ENABLED_KEY");
                }
            }
        };
        final int i21 = 0;
        this.d = new f(function22, function12, new Function2(this) { // from class: v7l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f286680b;

            {
                this.f286680b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        i domain = (i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f286680b.f286684b.f("HOLIDAY_APPEARANCE_ENABLED_KEY", domain);
                        return Unit.f186387a;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        final int i22 = 1;
                        final e eVar = this.f286680b;
                        ufm.c cVar = new ufm.c(new Callable() { // from class: v7l.a
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                EventAppearance eventAppearance;
                                switch (i22) {
                                    case 0:
                                        ue0.c cVar22 = eVar.f286683a;
                                        e.Companion.getClass();
                                        Type type = new TypeToken<Boolean>() { // from class: com.revolut.shared.feature.event_appearance.impl.repositories.EventAppearanceRepositoryImpl$Companion$HOLIDAY_APPEARANCE_ENABLED_TYPE$1
                                        }.getType();
                                        Intrinsics.checkNotNullExpressionValue(type, "<get-HOLIDAY_APPEARANCE_ENABLED_TYPE>(...)");
                                        Boolean bool = (Boolean) cVar22.T2("HOLIDAY_APPEARANCE_ENABLED_KEY", type);
                                        i.Companion.getClass();
                                        return h.a(bool);
                                    default:
                                        ue0.c cVar3 = eVar.f286683a;
                                        e.Companion.getClass();
                                        Type type2 = new TypeToken<t7l.a>() { // from class: com.revolut.shared.feature.event_appearance.impl.repositories.EventAppearanceRepositoryImpl$Companion$EVENT_APPEARANCE_TYPE$1
                                        }.getType();
                                        Intrinsics.checkNotNullExpressionValue(type2, "<get-EVENT_APPEARANCE_TYPE>(...)");
                                        t7l.a aVar = (t7l.a) cVar3.T2("EVENT_APPEARANCE_KEY", type2);
                                        h hVar = i.Companion;
                                        if (aVar != null) {
                                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                                            eventAppearance = new EventAppearance(aVar.getId());
                                        } else {
                                            eventAppearance = null;
                                        }
                                        hVar.getClass();
                                        return h.a(eventAppearance);
                                }
                            }
                        }, 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 2:
                        i domain2 = (i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f286680b.f286684b.f("EVENT_APPEARANCE_KEY", domain2);
                        return Unit.f186387a;
                    default:
                        f DataObservableDelegate2 = (f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        final int i32 = 0;
                        final e eVar2 = this.f286680b;
                        ufm.c cVar2 = new ufm.c(new Callable() { // from class: v7l.a
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                EventAppearance eventAppearance;
                                switch (i32) {
                                    case 0:
                                        ue0.c cVar22 = eVar2.f286683a;
                                        e.Companion.getClass();
                                        Type type = new TypeToken<Boolean>() { // from class: com.revolut.shared.feature.event_appearance.impl.repositories.EventAppearanceRepositoryImpl$Companion$HOLIDAY_APPEARANCE_ENABLED_TYPE$1
                                        }.getType();
                                        Intrinsics.checkNotNullExpressionValue(type, "<get-HOLIDAY_APPEARANCE_ENABLED_TYPE>(...)");
                                        Boolean bool = (Boolean) cVar22.T2("HOLIDAY_APPEARANCE_ENABLED_KEY", type);
                                        i.Companion.getClass();
                                        return h.a(bool);
                                    default:
                                        ue0.c cVar3 = eVar2.f286683a;
                                        e.Companion.getClass();
                                        Type type2 = new TypeToken<t7l.a>() { // from class: com.revolut.shared.feature.event_appearance.impl.repositories.EventAppearanceRepositoryImpl$Companion$EVENT_APPEARANCE_TYPE$1
                                        }.getType();
                                        Intrinsics.checkNotNullExpressionValue(type2, "<get-EVENT_APPEARANCE_TYPE>(...)");
                                        t7l.a aVar = (t7l.a) cVar3.T2("EVENT_APPEARANCE_KEY", type2);
                                        h hVar = i.Companion;
                                        if (aVar != null) {
                                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                                            eventAppearance = new EventAppearance(aVar.getId());
                                        } else {
                                            eventAppearance = null;
                                        }
                                        hVar.getClass();
                                        return h.a(eventAppearance);
                                }
                            }
                        }, 2);
                        Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                        return cVar2;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
