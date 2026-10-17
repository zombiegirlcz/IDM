package ax0;

import android.content.Context;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.Iterator;
import java.util.List;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public interface l {
    default void a(Integer num) {
        if (num == null) {
            Context context = getParent().getHostView().getContext();
            num = context != null ? Integer.valueOf(kli.a.s(R$attr.uikit_colorForeground, context)) : null;
            if (num == null) {
                return;
            }
        }
        int iIntValue = num.intValue();
        Iterator it8 = b().iterator();
        while (it8.hasNext()) {
            ((UIKitTextView) it8.next()).setTextColor(iIntValue);
        }
    }

    default List b() {
        return f0.f322471a;
    }

    default void d(Context context) {
    }

    k getParent();

    void recycle();
}
