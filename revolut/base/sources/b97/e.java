package b97;

import c97.m;
import c97.n;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o97.a0;
import o97.c0;
import o97.r;
import o97.t;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        f fVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar = fVar.f13686c;
                Type type = fVar.f;
                Intrinsics.checkNotNullExpressionValue(type, "access$getGlobalSearchPreferenceType$p(...)");
                List list = (List) cVar.T2("global_search_preferences_v2", type);
                if (list != null) {
                    return f.a(fVar, list);
                }
                return null;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar2 = fVar.f13686c;
                Type type2 = new TypeToken<c97.d>() { // from class: com.revolut.feature.globalsearch.impl.data.GlobalSearchPreferencesRepositoryImpl$settingDod$4$entity$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                c97.d entity = (c97.d) cVar2.T2("global_search_setting_v3", type2);
                if (entity == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(entity, "entity");
                c97.l lVar = entity.f22318a;
                c0 c0Var = new c0(lVar.getFirstSearchDelayMs(), lVar.getSubsequentSearchDelayMs(), lVar.getThresholdMs());
                n nVar = entity.f22319b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : nVar.f22337b.entrySet()) {
                    String str = (String) entry.getKey();
                    m mVar = (m) entry.getValue();
                    r rVarA = c97.i.a(str);
                    if (rVarA == null) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "SearchSettingMapper", "Unknown source identifier in stored overrides: ".concat(str), null, h0Var);
                    } else {
                        linkedHashMap.put(rVarA, r39.a.h(mVar));
                    }
                }
                return new a0(c0Var, new t(r39.a.h(nVar.f22336a), linkedHashMap));
        }
    }
}
