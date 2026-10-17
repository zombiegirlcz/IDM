package b97;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.globalsearch.impl.data.GlobalSearchService;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.globalsearch.models.RetailGlobalSearchContext;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o97.a0;
import o97.r;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.z0;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlobalSearchService f13684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f13685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f13686c;
    public final e97.a d;
    public final r39.a e;
    public final Type f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f13687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f13688h;

    public f(GlobalSearchService service, ne0.d memoryCache, ue0.c storage, e97.a globalSearchPreferencesMapper, r39.a searchSettingMapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(globalSearchPreferencesMapper, "globalSearchPreferencesMapper");
        Intrinsics.checkNotNullParameter(searchSettingMapper, "searchSettingMapper");
        this.f13684a = service;
        this.f13685b = memoryCache;
        this.f13686c = storage;
        this.d = globalSearchPreferencesMapper;
        this.e = searchSettingMapper;
        this.f = new TypeToken<List<? extends c97.c>>() { // from class: com.revolut.feature.globalsearch.impl.data.GlobalSearchPreferencesRepositoryImpl$globalSearchPreferenceType$1
        }.getType();
        Continuation continuation = null;
        b6a.d dVar = new b6a.d(this, continuation, 4);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: b97.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f13680b;

            {
                this.f13680b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (Map) this.f13680b.f13685b.get("global_search_preferences_v2");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (a0) this.f13680b.f13685b.get("global_search_setting_v3");
                }
            }
        };
        Function2 function2 = new Function2(this) { // from class: b97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f13682b;

            {
                this.f13682b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i) {
                    case 0:
                        Map value = (Map) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f13682b.f13685b.f("global_search_preferences_v2", value);
                        break;
                    default:
                        a0 value2 = (a0) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f13682b.f13685b.f("global_search_setting_v3", value2);
                        break;
                }
                return Unit.f186387a;
            }
        };
        e eVar = new e(this, continuation, i);
        int i2 = 5;
        this.f13687g = new x4l.c(dVar, function1, function2, eVar, new awd.b(this, continuation, i2));
        b6a.d dVar2 = new b6a.d(this, continuation, i2);
        final int i3 = 1;
        this.f13688h = new x4l.c(dVar2, new Function1(this) { // from class: b97.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f13680b;

            {
                this.f13680b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (Map) this.f13680b.f13685b.get("global_search_preferences_v2");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (a0) this.f13680b.f13685b.get("global_search_setting_v3");
                }
            }
        }, new Function2(this) { // from class: b97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f13682b;

            {
                this.f13682b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i3) {
                    case 0:
                        Map value = (Map) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f13682b.f13685b.f("global_search_preferences_v2", value);
                        break;
                    default:
                        a0 value2 = (a0) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f13682b.f13685b.f("global_search_setting_v3", value2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e(this, continuation, i3), new awd.b(this, continuation, 6));
    }

    public static final Map a(f fVar, List list) {
        Set set;
        Pair pair;
        fVar.getClass();
        e97.a aVar = fVar.d;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            c97.c dto = (c97.c) it8.next();
            aVar.getClass();
            Intrinsics.checkNotNullParameter(dto, "dto");
            String name = dto.getContext();
            Intrinsics.checkNotNullParameter(name, "name");
            RetailGlobalSearchContext.INSTANCE.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            RetailGlobalSearchContext retailGlobalSearchContext = (RetailGlobalSearchContext) RetailGlobalSearchContext.valuesByName.get(name);
            if (retailGlobalSearchContext == null) {
                pair = null;
            } else {
                if (dto.getPlaceholderBlocks() == null || !(!r3.isEmpty())) {
                    set = h0.f322473a;
                } else {
                    List placeholderBlocks = dto.getPlaceholderBlocks();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it9 = placeholderBlocks.iterator();
                    while (it9.hasNext()) {
                        r rVarA = c97.i.a((String) it9.next());
                        if (rVarA != null) {
                            arrayList2.add(rVarA);
                        }
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    d0.Z0(arrayList2, linkedHashSet);
                    set = linkedHashSet;
                }
                List searchableBlocks = dto.getSearchableBlocks();
                ArrayList arrayList3 = new ArrayList();
                Iterator it10 = searchableBlocks.iterator();
                while (it10.hasNext()) {
                    r rVarA2 = c97.i.a((String) it10.next());
                    if (rVarA2 != null) {
                        arrayList3.add(rVarA2);
                    }
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                d0.Z0(arrayList3, linkedHashSet2);
                pair = new Pair(retailGlobalSearchContext, new o97.i(dto.getHints(), set, linkedHashSet2));
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return r0.t(arrayList);
    }

    public static o97.i b(GlobalSearchContext globalSearchContext) {
        LinkedHashSet linkedHashSetF;
        RetailGlobalSearchContext retailGlobalSearchContext = RetailGlobalSearchContext.WEALTH_HOME;
        LinkedHashSet linkedHashSetF2 = globalSearchContext == retailGlobalSearchContext ? z0.f(r.SUGGESTIONS_INVEST) : z0.f(r.SUGGESTIONS);
        if (globalSearchContext == RetailGlobalSearchContext.REVX_HOME) {
            linkedHashSetF = z0.f(r.SMART_TILES, r.YOUR_CRYPTOCURRENCIES, r.YOUR_FIAT_ACCOUNTS, r.SPOT_MARKETS, r.CRYPTO_TRANSACTIONS, r.HELPCENTRE, r.PRODUCTS, r.TRAVEL_STATUS_PARTNERS);
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(r.SECRET_ACCOUNTS_PHRASE_MATCH);
            if (globalSearchContext == RetailGlobalSearchContext.MAIN_HOME || globalSearchContext == retailGlobalSearchContext || globalSearchContext == RetailGlobalSearchContext.CRYPTO_HOME || globalSearchContext == RetailGlobalSearchContext.LIFESTYLE_HOME) {
                linkedHashSet.add(r.PRODUCTS);
            }
            linkedHashSet.add(r.TRANSACTIONS);
            linkedHashSet.add(r.YOUR_FIAT_ACCOUNTS);
            linkedHashSet.add(r.FIAT_ACCOUNTS);
            linkedHashSet.add(r.JOINT_TRANSACTIONS);
            linkedHashSet.add(r.JOINT_ACCOUNTS);
            linkedHashSet.add(r.YOUR_JOINT_ACCOUNTS);
            linkedHashSet.add(r.JUNIOR_ACCOUNTS);
            linkedHashSet.add(r.POCKETS);
            linkedHashSet.add(r.JOINT_POCKETS);
            linkedHashSet.add(r.JOINT_SAVINGS);
            linkedHashSet.add(r.SHOPS_BRANDS);
            linkedHashSet.add(r.GIFT_CARDS);
            linkedHashSet.add(r.PLAN_SUBSCRIPTIONS);
            linkedHashSet.add(r.EXPERIENCES);
            linkedHashSet.add(r.ESIM);
            linkedHashSet.add(r.TRAVEL_STATUS_PARTNERS);
            linkedHashSet.add(r.TRANSFER_VENDORS);
            linkedHashSetF = linkedHashSet;
        }
        return new o97.i(f0.f322471a, linkedHashSetF2, linkedHashSetF);
    }
}
