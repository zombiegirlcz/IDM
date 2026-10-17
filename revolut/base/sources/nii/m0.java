package nii;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import ix0.b2;

/* JADX INFO: loaded from: classes10.dex */
public interface m0 {
    AnalyticsProduct P();

    Parcelable a();

    b2 b();

    Parcelable c();

    Parcelable d();

    default boolean e() {
        return true;
    }

    boolean f();

    StatusDialogDescriptionProgress g();

    m getAnalyticsContext();

    Clause getDescription();

    Clause getTitle();

    default o1 h() {
        return o1.LIMITED;
    }
}
