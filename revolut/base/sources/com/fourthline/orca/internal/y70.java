package com.fourthline.orca.internal;

import android.os.SystemClock;
import com.fourthline.orca.internal.ab0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes23.dex */
public final class y70 implements CoroutineScope {
    public static final b e = new b(null);
    public static final int f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f35178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f35179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ib0 f35180c;
    private final List d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f35181b = new a("NewAnalytics", 0, "/newanalytics");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f35182c;
        private static final /* synthetic */ EnumEntries d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f35183a;

        static {
            a[] aVarArrA = a();
            f35182c = aVarArrA;
            d = vc.s.n(aVarArrA);
        }

        private a(String str, int i, String str2) {
            this.f35183a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f35181b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f35182c.clone();
        }

        public final String b() {
            return this.f35183a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ib0 f35185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f35186c;
        final /* synthetic */ x70 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ib0 ib0Var, a aVar, x70 x70Var, Continuation continuation) {
            super(2, continuation);
            this.f35185b = ib0Var;
            this.f35186c = aVar;
            this.d = x70Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new c(this.f35185b, this.f35186c, this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f35184a;
            if (i == 0) {
                yhm.o.b(obj2);
                ib0 ib0Var = this.f35185b;
                ab0.b bVar = ab0.b.f26760b;
                String strB = this.f35186c.b();
                Json jsonA = s40.a();
                x70 x70Var = this.d;
                jsonA.getClass();
                ab0.a aVar2 = new ab0.a("mock_analytics", bVar, strB, null, null, tc.a(jsonA.c(x70.INSTANCE.serializer(), x70Var)), 24, null);
                this.f35184a = 1;
                if (ib0Var.a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                ((yhm.m) obj2).getClass();
            }
            return Unit.f186387a;
        }
    }

    public y70(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f35178a = coroutineScope;
        this.f35179b = new ConcurrentHashMap();
        this.d = new ArrayList();
    }

    public final void a(ib0 ib0Var) {
        this.f35180c = ib0Var;
        if (ib0Var != null) {
            Iterator it8 = this.d.iterator();
            while (it8.hasNext()) {
                a(ib0Var, a.f35181b, (x70) it8.next());
            }
            this.d.clear();
        }
    }

    public void clearContext(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f35179b.remove(identifier);
    }

    public ib.b getContext(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return (ib.b) this.f35179b.get(identifier);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f35178a.getF74819h();
    }

    public void log(ib.e level, String message, Map attributes, Throwable th10) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
    }

    public void registerContext(ib.b context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35179b.put(context.getIdentifier(), context);
    }

    public void setEventOrigin(String str) {
    }

    public void setSessionAttribute(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public void setTenant(String str, String str2) {
    }

    public void setTrackingConsent(hb.b consent) {
        Intrinsics.checkNotNullParameter(consent, "consent");
    }

    public void trackNew(ib.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String eventName = event.getEventName();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        Map attributes = event.getAttributes();
        Collection<ib.b> collectionValues = this.f35179b.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        ArrayList arrayList = new ArrayList(zhm.w.t(collectionValues, 10));
        for (ib.b bVar : collectionValues) {
            arrayList.add(new uc(bVar.getIdentifier(), bVar.getData()));
        }
        x70 x70Var = new x70(eventName, attributes, jElapsedRealtimeNanos, arrayList);
        x70Var.getEvent();
        Map attributes2 = x70Var.getAttributes();
        List context = x70Var.getContext();
        Objects.toString(attributes2);
        Objects.toString(context);
        ib0 ib0Var = this.f35180c;
        if (ib0Var != null) {
            a(ib0Var, a.f35181b, x70Var);
        } else {
            this.d.add(x70Var);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y70(CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            skm.p0 p0Var = skm.p0.f264001a;
            coroutineScope = skm.e0.c(elm.f.f127540b);
        }
        this(coroutineScope);
    }

    private final void a(ib0 ib0Var, a aVar, x70 x70Var) {
        skm.e0.C(this, null, null, new c(ib0Var, aVar, x70Var, null), 3);
    }
}
