package lrd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.AddNewOptionsContract$OutputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.AddNewOptionsController;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddNewOptionsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AddNewOptionsController addNewOptionsController, Continuation continuation) {
        super(2, continuation);
        this.v = addNewOptionsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.u;
        a aVar2 = obj3 instanceof a ? (a) obj3 : null;
        int i = aVar2 == null ? -1 : f.f199499a[aVar2.ordinal()];
        if (i != -1) {
            AddNewOptionsController addNewOptionsController = this.v;
            if (i == 1) {
                ((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.a) addNewOptionsController.d()).C2(AddNewOptionsContract$OutputData.RevolutAccount.f87935a);
            } else if (i == 2) {
                ((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.a) addNewOptionsController.d()).C2(AddNewOptionsContract$OutputData.LinkExternalAccount.f87932a);
            } else if (i == 3) {
                com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.a aVar3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.a) addNewOptionsController.d();
                CustomAssetCategoryDefinition customAssetCategoryDefinition = ((b) ((j2) aVar3.f87937q.f22677a).getValue()).f199495b;
                if (customAssetCategoryDefinition != null) {
                    aVar3.C2(new AddNewOptionsContract$OutputData.Property(customAssetCategoryDefinition));
                }
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                ((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.a) addNewOptionsController.d()).C2(AddNewOptionsContract$OutputData.OtherAssets.f87933a);
            }
        }
        return Unit.f186387a;
    }
}
