package nrd;

import cli.y;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_other_asset.AddOtherAssetController;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AddOtherAssetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(AddOtherAssetController addOtherAssetController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = addOtherAssetController;
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

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        Object next;
        int i = this.u;
        AddOtherAssetController addOtherAssetController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((h) addOtherAssetController.O.getValue()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) addOtherAssetController.O.getValue();
                y yVar = hVar.f218618p;
                vzi.b bVar = ((a) ((j2) yVar.f22677a).getValue()).f218610b;
                if (bVar != null && (list = (List) ((a) ((j2) yVar.f22677a).getValue()).f218609a.getContent()) != null) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (((CustomAssetCategoryDefinition) next).f99224a == bVar) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    CustomAssetCategoryDefinition customAssetCategoryDefinition = (CustomAssetCategoryDefinition) next;
                    if (customAssetCategoryDefinition != null) {
                        hVar.C2(new b(customAssetCategoryDefinition));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
