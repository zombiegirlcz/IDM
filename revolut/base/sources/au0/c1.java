package au0;

import aw0.s8;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public interface c1 {
    static /* synthetic */ void S(c1 c1Var, List list, f2 f2Var, v0 v0Var, int i) {
        if ((i & 2) != 0) {
            f2Var = f2.LINE_INDICATOR;
        }
        if ((i & 4) != 0) {
            v0Var = v0.MEDIUM;
        }
        c1Var.setPages(list, f2Var, v0Var);
    }

    void setAvatar(AvatarModel avatarModel, r0 r0Var);

    void setAvatarGroup(List list, boolean z);

    default void setBackgroundImage(Image image) {
        if (image != null) {
            setPages(zhm.u.c(new u0(new NavBarWithContainerBackground.ImageBackground(image, (s8) null, (Color.SolidRes) null, 14), null, null, null)), f2.LINE_INDICATOR, v0.NONE);
        }
    }

    default void setBackgroundImages(List images, f2 previewMode, boolean z) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(previewMode, "previewMode");
        List list = images;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new u0(new NavBarWithContainerBackground.ImageBackground((Image) it8.next(), (s8) null, (Color.SolidRes) null, 14), null, null, null));
        }
        setPages(arrayList, previewMode, z ? v0.MEDIUM : v0.NONE);
    }

    void setDuoAvatar(q0 q0Var, r0 r0Var);

    void setIcon(Image image, r0 r0Var);

    void setPages(List list, f2 f2Var, v0 v0Var);
}
