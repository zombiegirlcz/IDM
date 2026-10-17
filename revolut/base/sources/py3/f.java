package py3;

import com.revolut.feature.credit.application.plugins.impl.models.error.CreditApplicationException;
import com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException;
import com.revolut.sso.api.exceptions.UserCancelledSSOExceptionLegacy;
import com.revolut.sso.api.exceptions.UserCancelledSsoException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements a {
    @Override // py3.a
    public final boolean a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof CreditApplicationException) {
            throwable = ((CreditApplicationException) throwable).f66910a;
        }
        return (throwable instanceof UserCancelledSsoException) || (throwable instanceof UserCancelledSSOExceptionLegacy) || (throwable instanceof UserDeclinedTwoFaException);
    }
}
