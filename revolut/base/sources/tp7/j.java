package tp7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.binary_questions.BinaryQuestionInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jki.m;
import jki.p;
import kl7.p1;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements p {
    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = domainState.f273300a;
        List<BinaryQuestionInfo> list = domainState.f273302c;
        Map map = domainState.d;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        Integer num = domainState.f273301b;
        TextLocalisedClause textLocalisedClause2 = num != null ? new TextLocalisedClause(num.intValue(), null, null, 14) : null;
        boolean z = map.size() == list.size();
        ArrayList arrayList = new ArrayList();
        for (BinaryQuestionInfo binaryQuestionInfo : list) {
            p1 p1Var = binaryQuestionInfo.f75629a;
            List listB = xl7.f.b(binaryQuestionInfo.f75630b, binaryQuestionInfo.f75631c, p1Var, (Boolean) map.get(p1Var), null, 16);
            yp0.b.k(listB, 0, 0, 0, 0, 31);
            a0.x(listB, arrayList);
        }
        return new h(textLocalisedClause, textLocalisedClause2, arrayList, z);
    }
}
