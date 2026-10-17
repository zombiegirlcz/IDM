package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow;

import aii.u;
import com.revolut.feature.add.new_product.api.declaration.AddNewProductDestination;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetContract$InputData$Mode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.AddNewOptionsContract$OutputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlowContract$Step;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function2 {
    public f u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AddNewOptionsContract$OutputData f87989w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f87990x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ yki.b f87991y;
    public final /* synthetic */ TotalWealthFlowContract$Step z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AddNewOptionsContract$OutputData addNewOptionsContract$OutputData, f fVar, yki.b bVar, TotalWealthFlowContract$Step totalWealthFlowContract$Step, Continuation continuation) {
        super(2, continuation);
        this.f87989w = addNewOptionsContract$OutputData;
        this.f87990x = fVar;
        this.f87991y = bVar;
        this.z = totalWealthFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.f87989w, this.f87990x, this.f87991y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        f fVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            AddNewOptionsContract$OutputData.RevolutAccount revolutAccount = AddNewOptionsContract$OutputData.RevolutAccount.f87935a;
            AddNewOptionsContract$OutputData addNewOptionsContract$OutputData = this.f87989w;
            boolean zF = Intrinsics.f(addNewOptionsContract$OutputData, revolutAccount);
            f fVar2 = this.f87990x;
            if (zF) {
                return fVar2.C1(new AddNewProductDestination((qf1.c) null, 3));
            }
            if (!Intrinsics.f(addNewOptionsContract$OutputData, AddNewOptionsContract$OutputData.LinkExternalAccount.f87932a)) {
                boolean z = addNewOptionsContract$OutputData instanceof AddNewOptionsContract$OutputData.Property;
                TotalWealthFlowContract$Step totalWealthFlowContract$Step = this.z;
                if (z) {
                    h.t2(fVar2, this.f87991y, new TotalWealthFlowContract$Step.AddEditAsset(new AddEditAssetContract$InputData$Mode.Create(((TotalWealthFlowContract$Step.AddNewOptions) totalWealthFlowContract$Step).f87964a, ((AddNewOptionsContract$OutputData.Property) addNewOptionsContract$OutputData).f87934a)), true, null, false, 12);
                    return Unit.f186387a;
                }
                if (!Intrinsics.f(addNewOptionsContract$OutputData, AddNewOptionsContract$OutputData.OtherAssets.f87933a)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.t2(fVar2, this.f87991y, new TotalWealthFlowContract$Step.AddOtherAsset(((TotalWealthFlowContract$Step.AddNewOptions) totalWealthFlowContract$Step).f87964a), true, null, false, 12);
                return Unit.f186387a;
            }
            frd.i iVar = fVar2.f87999p;
            this.u = fVar2;
            this.v = 1;
            obj2 = iVar.g(this);
            if (obj2 == aVar) {
                return aVar;
            }
            fVar = fVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = this.u;
            o.b(obj2);
        }
        return fVar.C1((u) obj2);
    }
}
