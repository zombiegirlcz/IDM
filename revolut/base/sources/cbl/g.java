package cbl;

import aw0.o9;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialogAnswer;
import java.util.ArrayList;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements p {
    @Override // jki.p
    public final m a(i iVar) {
        b domainState = (b) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        SuspiciousTransactionDialog.Question question = domainState.f22891a;
        ArrayList<SuspiciousTransactionDialogAnswer> arrayList = question.f;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (SuspiciousTransactionDialogAnswer suspiciousTransactionDialogAnswer : arrayList) {
            InputDisclosureDelegate.Model model = new InputDisclosureDelegate.Model(suspiciousTransactionDialogAnswer.f104973a, new TextClause(suspiciousTransactionDialogAnswer.f104974b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, suspiciousTransactionDialogAnswer, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            yp0.b.l(model, R$attr.uikit_dp4, R$attr.uikit_dp0, 0, 0, null, false, 60);
            arrayList2.add(model);
        }
        TextClause textClause = new TextClause(question.f104942b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause(question.f104942b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause3 = new TextClause(question.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        boolean z = !d0.W(question.d);
        String str = question.f104943c;
        return new e(arrayList2, new tal.a(textClause, textClause2, textClause3, z, str != null ? new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : null, Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left)));
    }
}
