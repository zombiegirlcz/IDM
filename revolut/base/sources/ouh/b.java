package ouh;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.feature.workflow.engine.rfi.impl.ui.multi_text.MultiTextQuestionScreen;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Object next;
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) obj2;
        c cVar = (c) this.receiver;
        int i = MultiTextQuestionScreen.U;
        d dVar = (d) cVar;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(textData, "textData");
        y yVar = dVar.f168616p;
        Answer.MultiText multiText = (Answer.MultiText) ((iuh.e) ((j2) yVar.f22677a).getValue()).f168607b;
        if (multiText == null) {
            multiText = new Answer.MultiText(((Question.MultiText) ((iuh.e) ((j2) yVar.f22677a).getValue()).f168606a).f105618a, f0.f322471a);
        }
        List list = multiText.f96523b;
        CharSequence charSequence = textData.f52598b;
        String str = textData.f52597a;
        String value = charSequence.toString();
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((Answer.MultiText.Item) next).f96524a, str)) {
                break;
            }
        }
        Answer.MultiText.Item item = (Answer.MultiText.Item) next;
        if (item == null) {
            item = new Answer.MultiText.Item(str, value);
        }
        String id10 = item.f96524a;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        Answer.MultiText.Item item2 = new Answer.MultiText.Item(id10, value);
        int size = list.size();
        ArrayList items = d0.f1(list);
        Iterator it9 = items.iterator();
        int i2 = 0;
        while (true) {
            if (!it9.hasNext()) {
                i2 = -1;
                break;
            }
            if (Intrinsics.f(((Answer.MultiText.Item) it9.next()).f96524a, item2.f96524a)) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            items.set(i2, item2);
        } else {
            items.add(size, item2);
        }
        String questionId = multiText.f96522a;
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(items, "items");
        dVar.I2(new Answer.MultiText(questionId, items));
        return Unit.f186387a;
    }
}
