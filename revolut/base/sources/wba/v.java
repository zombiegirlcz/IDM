package wba;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.domain.error.PixError;
import com.revolut.retail.core.ui.error.ErrorNotHandledException;
import com.revolut.revolut.feature_fourthline_impl.R;
import io.reactivex.exceptions.CompositeException;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes5.dex */
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf0.h f296091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v60.e f296092b;

    public v(sf0.h serverErrorParser, v60.e serverErrorsProvider, com.revolut.feature.pix.impl.domain.error.a pixErrorDialogProvider) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(pixErrorDialogProvider, "pixErrorDialogProvider");
        this.f296091a = serverErrorParser;
        this.f296092b = serverErrorsProvider;
    }

    public static nii.z c(TextLocalisedClause textLocalisedClause) {
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14);
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R.string.error_generic, null, null, 14);
        }
        return new nii.z(textLocalisedClause2, textLocalisedClause, null, null, null, null, false, null, null, null, null, null, null, 32764);
    }

    public final nii.z a(ServerError serverError) {
        if (serverError == null) {
            return c(null);
        }
        v60.c cVarB = ((ao0.a) this.f296092b).b(Integer.valueOf(serverError.f51362a));
        return c(cVarB != null ? ofm.q.O(cVarB) : null);
    }

    public final nii.z b(Throwable throwable) {
        Object next;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof PixError) {
            PixError pixError = (PixError) throwable;
            Intrinsics.checkNotNullParameter(pixError, "pixError");
            if (pixError instanceof PixError.InsufficientBalance) {
                return new nii.z(new TextLocalisedClause(R$string.pix_qr_payment_insufficient_balance_title, null, null, 14), new TextLocalisedClause(R$string.pix_qr_payment_insufficient_balance_description, zhm.u.c(new MoneyClause(((PixError.InsufficientBalance) pixError).f80538a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.pix_qr_payment_insufficient_balance_cta, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (throwable instanceof ErrorNotHandledException) {
            return c(null);
        }
        boolean z = throwable instanceof CompositeException;
        sf0.h hVar = this.f296091a;
        if (!z) {
            return throwable instanceof HttpException ? a(hVar.c((HttpException) throwable)) : c(null);
        }
        List list = ((CompositeException) throwable).f163108a;
        Intrinsics.checkNotNullExpressionValue(list, "getExceptions(...)");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (next instanceof HttpException) {
                break;
            }
        }
        if (!(next instanceof HttpException)) {
            next = null;
        }
        HttpException httpException = (HttpException) next;
        return a(httpException != null ? hVar.c(httpException) : null);
    }
}
