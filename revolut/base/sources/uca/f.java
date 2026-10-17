package uca;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.api.qr.QrCodeHandlingException;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.l0;
import nii.m0;
import nii.y0;
import nii.z;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements i8a.e {
    public static y0 a() {
        return new y0("ERROR_DIALOG_ID", new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4);
    }

    public final y0 b(Throwable throwable) {
        m0 l0Var;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!(throwable instanceof QrCodeHandlingException)) {
            return a();
        }
        xo9.e eVar = ((QrCodeHandlingException) throwable).f79172a;
        Integer num = eVar.f307742a;
        xo9.c cVar = eVar.f307744c;
        if (num == null) {
            return a();
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(num.intValue(), null, null, 14);
        Integer num2 = eVar.f307743b;
        TextLocalisedClause textLocalisedClause2 = num2 != null ? new TextLocalisedClause(num2.intValue(), null, null, 14) : null;
        TextLocalisedClause textLocalisedClause3 = cVar != null ? new TextLocalisedClause(cVar.f307740a, null, null, 14) : null;
        NaviCommand naviCommand = cVar != null ? cVar.f307741b : null;
        int i = e.f279016a[eVar.d.ordinal()];
        if (i == 1) {
            l0Var = new l0(textLocalisedClause, textLocalisedClause2, null, textLocalisedClause3, null, naviCommand, false, null, 980);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            l0Var = new z(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, null, null, naviCommand, false, null, null, null, null, null, null, 32628);
        }
        return new y0("ERROR_DIALOG_ID", l0Var, false, 4);
    }
}
