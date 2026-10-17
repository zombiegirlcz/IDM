package o92;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.label.EnrollmentLabelScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EnrollmentLabelScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EnrollmentLabelScreen enrollmentLabelScreen, Continuation continuation) {
        super(2, continuation);
        this.v = enrollmentLabelScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.R.getValue();
        String text = textData.f52598b.toString();
        hVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        hVar.H2(hVar.f223068q, new a31.i(text, 3 <= length && length < 21 && !text.equals(hVar.f223069r), 9));
        return Unit.f186387a;
    }
}
