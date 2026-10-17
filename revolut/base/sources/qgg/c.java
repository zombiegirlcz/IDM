package qgg;

import aw0.o9;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nii.l0;
import nii.y0;
import nii.z;
import retrofit2.HttpException;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf0.h f245830a;

    public c(sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f245830a = serverErrorParser;
    }

    public final y0 a(Throwable error, TravelMilesProvider provider) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(provider, "provider");
        ServerError serverErrorC = error instanceof HttpException ? this.f245830a.c((HttpException) error) : error instanceof ServerErrorException ? ((ServerErrorException) error).f : null;
        Integer numValueOf = serverErrorC != null ? Integer.valueOf(serverErrorC.f51362a) : null;
        if (numValueOf != null && numValueOf.intValue() == 100003) {
            return new y0(null, new l0(new TextLocalisedClause(R$string.miles_account_registration_registration_error_name_mismatch_title, null, null, 14), new TextLocalisedClause(R$string.miles_account_registration_registration_error_name_mismatch_description, u.c(provider.f94104b), null, 12), null, new TextLocalisedClause(R$string.miles_account_registration_registration_error_action_title, null, null, 14), null, null, false, null, 1012), false, 5);
        }
        if (numValueOf == null || numValueOf.intValue() != 100001) {
            return new y0(null, new z(new TextLocalisedClause(R$string.miles_account_registration_registration_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.miles_account_registration_registration_error_account_not_found_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.miles_account_registration_registration_error_account_not_found_description, null, null, 14);
        List listK = v.k(new TextLocalisedClause(R$string.miles_account_registration_sign_up_prompt_title, null, null, 14), new TextLocalisedClause(R$string.miles_account_registration_sign_up_prompt_link_placeholder, null, new Click(30, (Integer) null, (Object) null, "ERROR_DIALOG_SIGN_UP_ITEM_ID", false), 10));
        t0 t0Var = t0.f186434a;
        m70.a.t(t0Var);
        return new y0(null, new l0(textLocalisedClause, new CompositeClause(v.k(textLocalisedClause2, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12)), new TextClause(a0.d.r(m70.a.o(t0Var), m70.a.o(t0Var)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, new TextLocalisedClause(R$string.miles_account_registration_registration_error_action_title, null, null, 14), null, null, false, null, 1012), false, 5);
    }
}
