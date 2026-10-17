package vyd;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.impl.tools.StatementsGenerationException;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import nii.c0;
import nii.g0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y;
import nii.z;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import rd0.d;
import retrofit2.HttpException;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements byd.a {

    @NotNull
    public static final C1624a Companion = new C1624a();

    /* JADX INFO: renamed from: vyd.a$a, reason: collision with other inner class name */
    public static final class C1624a {
        private C1624a() {
        }
    }

    public final j0 a() {
        return new j0((Clause) new TextLocalisedClause(R$string.statement_generation_ready, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) StatusViewContract$Duration.Short.f59734a, (h0) null, (ResourceImage) null, 3582);
    }

    public final g0 b(String str) {
        return str != null ? new g0(new TextLocalisedClause(R$string.statement_generation_email_title, u.c(str), null, 12), new TextLocalisedClause(R$string.statement_generation_email_description, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380) : new g0(new TextLocalisedClause(R$string.account_statement_in_preparation_title, null, null, 14), new TextLocalisedClause(R$string.account_statement_in_preparation_subtitle, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380);
    }

    public final z c(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
        Integer numValueOf = httpException != null ? Integer.valueOf(httpException.code()) : null;
        StatementsGenerationException statementsGenerationException = new StatementsGenerationException("Statement generation failed", throwable);
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.ERROR, null, null, statementsGenerationException, h0Var);
        return (numValueOf != null && numValueOf.intValue() == 404) ? new z(new TextLocalisedClause(R$string.statement_download_error_expired_title, null, null, 14), new TextLocalisedClause(R$string.statement_download_error_expired_subtitle, null, null, 14), null, null, null, null, false, null, null, null, null, new y(1, null, numValueOf), null, 24572) : (numValueOf != null && numValueOf.intValue() == 31004) ? new z(new TextLocalisedClause(R$string.statement_generation_unverified_error_message, null, null, 14), null, null, null, null, null, false, null, null, null, null, new y(1, null, numValueOf), null, 24574) : new z(new TextLocalisedClause(R$string.statement_generation_unexpected_error_title, null, null, 14), new TextLocalisedClause(R$string.statement_generation_unexpected_error_description, null, null, 14), null, null, null, null, false, null, null, null, null, new y(1, null, numValueOf), null, 24572);
    }

    public final c0 d() {
        return new c0(new TextLocalisedClause(R$string.statement_generation_generating, null, null, 14), null, null, false, null, false, false, null, 1918);
    }
}
