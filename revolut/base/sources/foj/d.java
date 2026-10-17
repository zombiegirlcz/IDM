package foj;

import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface d {
    ErrorWidgetDelegate.Model a(String str);

    BaseDraggableWidgetDelegate.Model b(String str, ArrayList arrayList);

    BaseDraggableWidgetDelegate.Model c(String str, ArrayList arrayList, List list);

    BaseDraggableWidgetDelegate.Model d(String str);

    AvatarWidgetDelegate.Model e(String str);
}
