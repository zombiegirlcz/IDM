package cld;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.dialog.CustomRatingBottomSheetController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CustomRatingBottomSheetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CustomRatingBottomSheetController customRatingBottomSheetController, Continuation continuation) {
        super(2, continuation);
        this.v = customRatingBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.U.getValue();
        String comment = textData.f52598b.toString();
        eVar.getClass();
        Intrinsics.checkNotNullParameter(comment, "comment");
        eVar.H2(eVar.f24976q, new c86.c(comment, 8));
        return Unit.f186387a;
    }
}
