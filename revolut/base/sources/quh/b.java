package quh;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.feature.workflow.engine.rfi.impl.ui.text.TextQuestionScreen;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) obj2;
        c cVar = (c) this.receiver;
        int i = TextQuestionScreen.U;
        d dVar = (d) cVar;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(textData, "textData");
        dVar.I2(new Answer.Text(((Question.Text) ((iuh.e) ((j2) dVar.f168616p.f22677a).getValue()).f168606a).f105624a, textData.f52598b.toString()));
        return Unit.f186387a;
    }
}
