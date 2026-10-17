package epd;

import cli.y;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.domain.models.transactions.CategoryColor;
import com.revolut.domain.models.transactions.CategoryImage;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.CategoryManagementCustomController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CategoryManagementCustomController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CategoryManagementCustomController categoryManagementCustomController, Continuation continuation) {
        super(2, continuation);
        this.v = categoryManagementCustomController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((IconSelectorDelegate.SelectableIconModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        f fVarA;
        IconSelectorDelegate.SelectableIconModel model = (IconSelectorDelegate.SelectableIconModel) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c cVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.b bVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.b) cVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        y yVar = bVar.f87654r;
        a aVar2 = (a) ((b) ((j2) yVar.f22677a).getValue()).f128159a.getContent();
        if (aVar2 != null) {
            f fVar = aVar2.f128158c;
            Object obj3 = model.f52505l;
            if (obj3 instanceof CategoryColor) {
                fVarA = f.a(fVar, null, (CategoryColor) obj3, null, 5);
            } else if (obj3 instanceof CategoryImage) {
                fVarA = f.a(fVar, null, null, (CategoryImage) obj3, 3);
            }
            bVar.H2(yVar, new eed.j(aVar2, fVarA, 28));
        }
        return Unit.f186387a;
    }
}
