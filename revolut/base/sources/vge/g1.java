package vge;

import com.google.common.collect.ImmutableMap;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class g1 implements c1 {

    @NotNull
    public static final d1 Companion = new d1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f288899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f288900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f288901c;
    public final Map d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;

    public g1(CoroutineScope scope, n0 allAccountsItemDecorator, y accountNotificationDecorator, ImmutableMap productDataSourcesMap) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(allAccountsItemDecorator, "allAccountsItemDecorator");
        Intrinsics.checkNotNullParameter(accountNotificationDecorator, "accountNotificationDecorator");
        Intrinsics.checkNotNullParameter(productDataSourcesMap, "productDataSourcesMap");
        this.f288899a = scope;
        this.f288900b = allAccountsItemDecorator;
        this.f288901c = accountNotificationDecorator;
        this.d = productDataSourcesMap;
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.Map] */
    public final Flow a(ProductContext productContext, sfe.a dataLoadingMode) {
        String str;
        zhm.h0 h0Var;
        String str2;
        long j2;
        Intrinsics.checkNotNullParameter(productContext, "productContext");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        e1 e1Var = new e1(productContext, dataLoadingMode);
        ProductId productId = productContext.f89553a;
        ConcurrentHashMap concurrentHashMap = this.e;
        Object obj2 = concurrentHashMap.get(e1Var);
        if (obj2 == null) {
            Flow flowC = b(productId).c(productContext.f89554b, productContext.f89555c, dataLoadingMode);
            Continuation continuation = null;
            int i = 3;
            Data dataP = zi0.c.P(zhm.f0.f322471a, false, null, 3);
            b.Companion companion = kotlin.time.b.INSTANCE;
            pkm.e eVar = pkm.e.MILLISECONDS;
            vkm.f fVarM = zi0.c.M(flowC, dataP, kotlin.time.c.h(5000L, eVar), j6.a.q("productAccounts:", productId.getId()));
            tc6.d dVar = new tc6.d(i, 29, continuation);
            zhm.h0 h0Var2 = zhm.h0.f322473a;
            Flow originFlow = rd0.e.e(fVarM, h0Var2, dVar);
            q0 q0Var = (q0) this.f288900b;
            q0Var.getClass();
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(originFlow, "originFlow");
            Set set = (Set) q0.f288978c.get(productId);
            Set set2 = (Set) q0.d.get(productId);
            if (set == null && set2 == null) {
                str2 = "getOrPut(...)";
                h0Var = h0Var2;
                j2 = 5000;
            } else {
                h0Var = h0Var2;
                str2 = "getOrPut(...)";
                j2 = 5000;
                originFlow = nim.a.u(new sxe.g(q0Var, set, set2, continuation, 21), originFlow);
            }
            Flow flowA = this.f288901c.a(productId, originFlow);
            ve7.i iVar = new ve7.i(8);
            pfe.g gVarB = b(productId);
            ConcurrentHashMap concurrentHashMap2 = this.f;
            Object obj3 = concurrentHashMap2.get(productId);
            CoroutineScope coroutineScope = this.f288899a;
            if (obj3 == null) {
                vkm.y yVarE = rd0.e.e(zi0.c.M(gVarB.a(), Boolean.FALSE, kotlin.time.c.h(j2, eVar), j6.a.q("Availability:", productId.getId())), h0Var, new f1(i, 0, null));
                vkm.d2.Companion.getClass();
                vkm.t1 t1VarM = vkm.q.M(yVarE, coroutineScope, vkm.c2.f290009c, 1);
                Object objPutIfAbsent = concurrentHashMap2.putIfAbsent(productId, t1VarM);
                obj3 = objPutIfAbsent == null ? t1VarM : objPutIfAbsent;
            }
            str = str2;
            Intrinsics.checkNotNullExpressionValue(obj3, str);
            vkm.t1 t1VarM2 = vkm.q.M(vkm.q.Q((Flow) obj3, new sdi.a(null, flowA, iVar, 22)), coroutineScope, vkm.c2.a(vkm.d2.Companion, 1000L, 2), 1);
            Object objPutIfAbsent2 = concurrentHashMap.putIfAbsent(e1Var, t1VarM2);
            obj2 = objPutIfAbsent2 == null ? t1VarM2 : objPutIfAbsent2;
        } else {
            str = "getOrPut(...)";
        }
        Intrinsics.checkNotNullExpressionValue(obj2, str);
        return (Flow) obj2;
    }

    public final pfe.g b(ProductId productId) {
        Object obj2 = this.d.get(productId);
        if (obj2 != null) {
            return (pfe.g) obj2;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
