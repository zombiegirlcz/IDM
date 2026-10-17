package mw4;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    @NotNull
    public static final C1181a Companion = new C1181a();

    /* JADX INFO: renamed from: mw4.a$a, reason: collision with other inner class name */
    public static final class C1181a {
        private C1181a() {
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: mw4.a$b$a, reason: collision with other inner class name */
        public static final class C1182a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1182a f209327a = new C1182a();

            private C1182a() {
            }
        }

        private b() {
        }
    }

    public static LargeActionButtonDelegate.Model a(String str) {
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model(str, LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.l(model, R$attr.uikit_dp24, R$attr.uikit_dp32, 0, 0, null, false, 60);
        return model;
    }

    public static j0 b(b type) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof b.C1182a) {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_topup_successfull_overdue, null, null, 14);
        } else if (type instanceof c) {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_topup_successfull_less_overdue, u.c(c(((c) type).f209329a)), null, 12);
        } else if (type instanceof mw4.b) {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_topup_successfull_message, u.c(c(((mw4.b) type).f209328a)), null, 12);
        } else {
            if (!(type instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.credit_topup_successfull_message, u.c(c(((d) type).f209330a)), null, 12);
        }
        return new j0((Clause) textLocalisedClause, (Clause) (type instanceof d ? new TextLocalisedClause(R$string.credit_topup_successfull_scheduled_payment_reduced, u.c(c(((d) type).f209331b)), null, 12) : null), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
    }

    public static final MoneyClause c(dj0.d dVar) {
        return sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, dVar);
    }
}
