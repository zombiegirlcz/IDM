package b33;

import com.revolut.core.ui_kit.delegates.EmojiDelegate;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.emoji_picker.CardPersonalisationEmojiPickerController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardPersonalisationEmojiPickerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CardPersonalisationEmojiPickerController cardPersonalisationEmojiPickerController, Continuation continuation) {
        super(2, continuation);
        this.v = cardPersonalisationEmojiPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((EmojiDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        EmojiDelegate.Model model = (EmojiDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.R.getValue();
        int i = model.f52219b;
        fVar.getClass();
        fVar.C2(new d(i));
        return Unit.f186387a;
    }
}
