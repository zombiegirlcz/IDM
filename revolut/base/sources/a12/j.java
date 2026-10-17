package a12;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public interface j {

    @NotNull
    public static final i Companion = i.f473a;

    static z a(j jVar, List actions) {
        ((s12.f) jVar).getClass();
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter("ID_ACTIONS_WIDGET", "widgetId");
        List<b> list = actions;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (b bVar : list) {
            String name = bVar.getName();
            Image icon = bVar.getIcon();
            boolean z = false;
            Clause clause = null;
            arrayList.add(new ActionsView.Item(name, mx0.d.ACCENT, z, e4.EnabledClickable, clause, bVar.getTitle(), icon, null, null, null, false, null, null, bVar, null, 24468));
        }
        return new z("ID_ACTIONS_WIDGET", arrayList, null, mx0.l.HEADER_CIRCLE_ACTIONS, 0, 0, 116);
    }
}
