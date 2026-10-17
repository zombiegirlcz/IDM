package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlowContract$Step;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetFieldDefinitions;
import gim.i;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yhm.o;
import yld.g;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends i implements Function2 {
    public CustomAsset u;
    public CustomAssetCategoryDefinition v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f87993w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f87994x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f87995y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f87995y = fVar;
        this.z = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.f87995y, this.z, continuation);
        dVar.f87994x = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        amd.b bVar;
        Object next;
        CustomAsset customAsset;
        CustomAssetCategoryDefinition customAssetCategoryDefinition;
        CustomAsset customAsset2;
        Object next2;
        Pair pair = (Pair) this.f87994x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f87993w;
        f fVar = this.f87995y;
        if (i == 0) {
            o.b(obj2);
            List list = (List) pair.f186385a;
            CustomAssetFieldDefinitions customAssetFieldDefinitions = (CustomAssetFieldDefinitions) pair.f186386b;
            Iterator it8 = list.iterator();
            while (true) {
                bVar = null;
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((CustomAsset) next).f99216a, this.z)) {
                    break;
                }
            }
            customAsset = (CustomAsset) next;
            if (customAsset != null) {
                Iterator it9 = customAssetFieldDefinitions.f99230a.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it9.next();
                    if (((CustomAssetCategoryDefinition) next2).f99224a == customAsset.f99217b) {
                        break;
                    }
                }
                customAssetCategoryDefinition = (CustomAssetCategoryDefinition) next2;
            } else {
                customAssetCategoryDefinition = null;
            }
            if (!fVar.f88000q.e() || customAsset == null || customAssetCategoryDefinition == null) {
                h.t2(fVar, fVar.u, new TotalWealthFlowContract$Step.TotalWealth(g.ASSET, bVar), false, null, false, 12);
                return Unit.f186387a;
            }
            dj0.d dVar = customAsset.f99218c;
            if (dVar == null || (bVar = dVar.f115083b) == null) {
                ufm.i iVarX = fVar.f88001r.x(AccountId.Personal.f51414a);
                this.f87994x = null;
                this.u = customAsset;
                this.v = customAssetCategoryDefinition;
                this.f87993w = 1;
                Object objB = nim.a.b(iVarX, this);
                if (objB == aVar) {
                    return aVar;
                }
                customAsset2 = customAsset;
                obj2 = objB;
            }
            yki.i iVar = fVar.u;
            Intrinsics.h(bVar);
            h.t2(fVar, iVar, new TotalWealthFlowContract$Step.CustomAssetDetailsV2(customAsset, customAssetCategoryDefinition, bVar), false, null, false, 12);
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        customAssetCategoryDefinition = this.v;
        customAsset2 = this.u;
        o.b(obj2);
        xi0.b bVar2 = (xi0.b) obj2;
        customAsset = customAsset2;
        yki.i iVar2 = fVar.u;
        Intrinsics.h(bVar2);
        h.t2(fVar, iVar2, new TotalWealthFlowContract$Step.CustomAssetDetailsV2(customAsset, customAssetCategoryDefinition, bVar2), false, null, false, 12);
        return Unit.f186387a;
    }
}
