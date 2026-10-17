package sg7;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.incentive_reward.impl.R$string;
import grl.k9;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    @NotNull
    public static final C1460a Companion = new C1460a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsProduct.Retail f262599a;

    /* JADX INFO: renamed from: sg7.a$a, reason: collision with other inner class name */
    public static final class C1460a {
        private C1460a() {
        }
    }

    public a() {
        k9 k9Var = k9.Salary;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.f262599a = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
    }

    public final y0 a(int i) {
        return new y0(null, new z(new TextLocalisedClause(R$string.lottery_draw_error_accounts_navigation_title, null, null, 14), new TextLocalisedClause(R$string.lottery_draw_error_accounts_navigation_description, null, null, 14), new TextLocalisedClause(i, null, null, 14), null, null, null, false, this.f262599a, null, null, null, null, null, 32244), false, 5);
    }
}
