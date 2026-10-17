package jrd;

import cli.y;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.picker.date_picker.DatePickerBottomSheetContract$OutputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.picker.date_picker.DatePickerBottomSheetController;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ DatePickerBottomSheetController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(DatePickerBottomSheetController datePickerBottomSheetController, Continuation continuation) {
        super(2, continuation);
        this.u = datePickerBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVarD3 = this.u.R2();
        y yVar = jVarD3.f178001q;
        LocalDate localDateOf = LocalDate.of(((b) ((j2) yVar.f22677a).getValue()).f177991b, ((b) ((j2) yVar.f22677a).getValue()).f177992c, 1);
        Intrinsics.checkNotNullExpressionValue(localDateOf, "of(...)");
        jVarD3.C2(new DatePickerBottomSheetContract$OutputData(localDateOf, jVarD3.o.f177994b));
        return Unit.f186387a;
    }
}
