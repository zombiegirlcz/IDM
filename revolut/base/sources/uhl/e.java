package uhl;

import com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.trading_events.TradingEventsService;
import io3.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import sgl.g;
import wim.z;
import zhm.d0;
import zhm.h0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f280275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingEventsService f280276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bhl.d f280277c;
    public final o7.d d;
    public final gte.a e;

    public e(ue0.c storage, TradingEventsService eventsService, bhl.d eventsDao, o7.d deprecatedDatabaseInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(eventsService, "eventsService");
        Intrinsics.checkNotNullParameter(eventsDao, "eventsDao");
        Intrinsics.checkNotNullParameter(deprecatedDatabaseInteractor, "deprecatedDatabaseInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f280275a = storage;
        this.f280276b = eventsService;
        this.f280277c = eventsDao;
        this.d = deprecatedDatabaseInteractor;
        this.e = featureToggleInteractor;
    }

    public static String d(Set set) {
        return d0.k0(d0.O0(set), ",", null, null, 0, null, 62);
    }

    public final void a() {
        ue0.c cVar;
        Class cls;
        synchronized (this) {
            try {
                cVar = this.f280275a;
                cls = Boolean.TYPE;
            } catch (Throwable th10) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
            }
            if (pd.b.j((Boolean) cVar.T2("TRADING_EVENTS_DAO_MIGRATED", z.d(o0.b(cls))))) {
                Unit unit = Unit.f186387a;
            } else {
                this.f280275a.G(Boolean.TRUE, "TRADING_EVENTS_DAO_MIGRATED", z.d(o0.b(cls)));
                ArrayList arrayListH = this.d.h();
                ArrayList arrayList = new ArrayList(w.t(arrayListH, 10));
                Iterator it8 = arrayListH.iterator();
                while (it8.hasNext()) {
                    arrayList.add(h.L((g) it8.next()));
                }
                this.f280277c.b(arrayList);
                Unit unit2 = Unit.f186387a;
            }
        }
    }

    public final Map b() {
        Map map = (Map) this.f280275a.T2("TRADING_EVENTS_HISTORY_REFETCH_CURSORS", z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.b(Long.TYPE)))));
        return map == null ? r0.g() : map;
    }

    public final Set c() {
        Set set = (Set) p.a.j(String.class, KTypeProjection.INSTANCE, Set.class, this.f280275a, "TRADING_EVENTS_HISTORY_REFETCHED_PORTFOLIO_IDS");
        return set == null ? h0.f322473a : set;
    }
}
