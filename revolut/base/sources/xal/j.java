package xal;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.shared.feature.suspicious_transaction.api.models.Answer;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import ip0.iq;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements p {

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tal.e f303914a;

    public j(tal.e uiModelsMapper) {
        Intrinsics.checkNotNullParameter(uiModelsMapper, "uiModelsMapper");
        this.f303914a = uiModelsMapper;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        List list;
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        SuspiciousTransactionDialog.Screen.Cancel cancel = domainState.f303904a;
        tal.f fVar = (tal.f) this.f303914a;
        tal.a aVarA = fVar.a(cancel);
        SuspiciousTransactionDialog.Screen.Cancel cancel2 = domainState.f303904a;
        RowDelegate.Model modelC = fVar.c(cancel2.f);
        SuspiciousTransactionDialog.Screen.Cancel.Survey survey = cancel2.f104950g;
        String str = domainState.f303905b;
        if (survey != null) {
            ArrayList<Answer> arrayList = survey.f104952b;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            for (Answer answer : arrayList) {
                arrayList2.add(new InputChecklistDelegate.Model(j6.a.q("LIST_ID_ANSWER_", answer.f104906a), new TextClause(answer.f104907b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Intrinsics.f(answer.f104906a, str), false, null, iq.RADIO_BUTTON, null, null, answer.f104906a, null, 0, 0, 0, 523992));
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            list = arrayList2;
        } else {
            list = null;
        }
        if (list == null) {
            list = f0.f322471a;
        }
        return new e(ue0.e.J(modelC, list), fVar.b(cancel2, str != null), aVarA);
    }
}
