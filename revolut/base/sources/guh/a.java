package guh;

import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static final ArrayList a(String questionId, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!Intrinsics.f(((Answer) obj2).getF96537a(), questionId)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
