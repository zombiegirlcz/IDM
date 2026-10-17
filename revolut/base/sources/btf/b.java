package btf;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.dropdown_selection.AdditionalInfoDropdownSelectionScreen;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoFieldOption;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AdditionalInfoDropdownSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AdditionalInfoDropdownSelectionScreen additionalInfoDropdownSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = additionalInfoDropdownSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.T.getValue();
        Object obj3 = model.k;
        eVar.getClass();
        AdditionalInfoFieldOption additionalInfoFieldOption = obj3 instanceof AdditionalInfoFieldOption ? (AdditionalInfoFieldOption) obj3 : null;
        if (additionalInfoFieldOption != null) {
            eVar.C2(new d(additionalInfoFieldOption));
        }
        return Unit.f186387a;
    }
}
