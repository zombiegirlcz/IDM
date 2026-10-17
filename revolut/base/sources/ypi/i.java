package ypi;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import efm.r;
import kotlin.NotImplementedError;

/* JADX INFO: loaded from: classes13.dex */
public interface i {
    r a();

    void d(boolean z);

    r e();

    void f(Clause clause);

    void g();

    r s();

    void setAnalyticsContext(Parcelable parcelable);

    void setEnabled(boolean z);

    default void setLoading(boolean z) {
        throw new NotImplementedError(null, 1, null);
    }

    void setVisible(boolean z);

    void t(k kVar);

    void v(LargeActionButton.ButtonStyle buttonStyle);
}
