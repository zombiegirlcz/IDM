package l58;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f192193a;

    public e(n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f192193a = countryInteractor;
    }

    public static y0 a(TextLocalisedClause textLocalisedClause, String str) {
        return new y0("VALIDATION_ERROR_DIALOG_ID", new z(new TextLocalisedClause(R$string.joint_invite_ineligible_general_title, u.c(str), null, 12), textLocalisedClause, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }
}
