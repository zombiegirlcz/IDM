package d52;

import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.feature.apm.core.models.recipients.AaniContact;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.feature.apm.core.models.recipients.BlikContact;
import com.revolut.feature.apm.core.models.recipients.BrebContact;
import com.revolut.feature.apm.core.models.recipients.IrisContact;
import com.revolut.feature.apm.core.models.recipients.MultibancoContact;
import com.revolut.feature.apm.core.models.recipients.PixContact;
import com.revolut.feature.apm.core.models.recipients.QvikContact;
import com.revolut.feature.apm.core.models.recipients.SpinContact;
import com.revolut.feature.apm.core.models.recipients.WeroContact;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static final MoneyRequestChannel.APM a(ApmContact apmContact) {
        Intrinsics.checkNotNullParameter(apmContact, "<this>");
        if (apmContact instanceof AaniContact) {
            return MoneyRequestChannel.Aani.f60329b;
        }
        if (apmContact instanceof BizumContact) {
            return MoneyRequestChannel.Bizum.f60331b;
        }
        if (apmContact instanceof MultibancoContact) {
            return MoneyRequestChannel.MBWay.f60332b;
        }
        if (apmContact instanceof QvikContact) {
            return MoneyRequestChannel.Qvik.f60333b;
        }
        if (apmContact instanceof WeroContact) {
            return MoneyRequestChannel.Wero.f60336b;
        }
        if ((apmContact instanceof BlikContact) || (apmContact instanceof BrebContact) || (apmContact instanceof IrisContact) || (apmContact instanceof PixContact) || (apmContact instanceof SpinContact)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
