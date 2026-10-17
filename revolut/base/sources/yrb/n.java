package yrb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import vkm.q0;
import vkm.t0;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f316227b;

    public /* synthetic */ n(Object obj2, int i) {
        this.f316226a = i;
        this.f316227b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f316226a) {
            case 0:
                List tradeActions = (List) obj2;
                Intrinsics.checkNotNullParameter(tradeActions, "tradeActions");
                if (tradeActions.isEmpty()) {
                    return zi0.c.i(new Pair(r0.g(), tradeActions));
                }
                List list = tradeActions;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((hdh.c) it8.next()).f151434a.n().f214596b);
                }
                return nim.a.v(rd0.e.b(((ael.k) ((s) this.f316227b).f316235p).n(arrayList, w4l.h.f294642c)), new xnd.c(arrayList, tradeActions, 4));
            case 1:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                xi0.b bVar = (xi0.b) hVar.f288433a;
                od0.i iVar = (od0.i) hVar.f288434b;
                List list2 = (List) hVar.f288435c;
                xh9.d dVar = (xh9.d) hVar.d;
                gsd.c cVar = (gsd.c) this.f316227b;
                ppk.f fVar = (ppk.f) cVar.d;
                List list3 = list2;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(((zh9.r0) it9.next()).o);
                }
                return nim.a.v(cp5.c.D(fVar, arrayList2, bVar), new a5k.s(list2, bVar, cVar, iVar, dVar, 8));
            case 2:
                Map productsMap = (Map) obj2;
                Intrinsics.checkNotNullParameter(productsMap, "productsMap");
                zge.i iVar2 = (zge.i) this.f316227b;
                return new q0(iVar2.f322117a.o(), new xkl.e(iVar2, productsMap, (Continuation) null, 9), 1);
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new zhf.i(((zhf.g) this.f316227b).c3().f310974a);
            case 4:
                PrimitiveType primitiveType = (PrimitiveType) this.f316227b;
                ModuleDescriptor it10 = (ModuleDescriptor) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                SimpleType primitiveArrayKotlinType = it10.getBuiltIns().getPrimitiveArrayKotlinType(primitiveType);
                Intrinsics.checkNotNullExpressionValue(primitiveArrayKotlinType, "getPrimitiveArrayKotlinType(...)");
                return primitiveArrayKotlinType;
            case 5:
                KotlinType kotlinType = (KotlinType) this.f316227b;
                Intrinsics.checkNotNullParameter((ModuleDescriptor) obj2, "it");
                return kotlinType;
            case 6:
                zkk.i billingPicker = (zkk.i) obj2;
                Intrinsics.checkNotNullParameter(billingPicker, "billingPicker");
                hha.d dVar2 = ((zkk.q) this.f316227b).f323078b;
                String planId = billingPicker.f323066a;
                String str = billingPicker.f323068c;
                String str2 = billingPicker.d;
                List options = billingPicker.e;
                Intrinsics.checkNotNullParameter(planId, "planId");
                Intrinsics.checkNotNullParameter(options, "options");
                return new zkk.i(planId, dVar2, str, str2, options);
            case 7:
                List bestAvailableProductsPerTypeData = (List) obj2;
                Intrinsics.checkNotNullParameter(bestAvailableProductsPerTypeData, "bestAvailableProductsPerTypeData");
                return nim.a.v(ijb.a.f(((zlb.o) this.f316227b).o), new zlb.l(bestAvailableProductsPerTypeData, 0));
            default:
                Intrinsics.checkNotNullParameter((List) obj2, "it");
                return new t0(((com.revolut.trading.orders.ui.screens.investment_plan.projection.a) this.f316227b).C.B(zul.b0.f325522a), 1);
        }
    }
}
