package ax0;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface j extends l {
    default void c() {
        Iterator it8 = e().iterator();
        while (it8.hasNext()) {
            ((View) it8.next()).bringToFront();
        }
        getNavigationBar().bringToFront();
    }

    List e();

    ConstraintLayout getHostView();

    BasicNavBar getNavigationBar();
}
