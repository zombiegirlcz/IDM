package f2a;

import aw0.i3;
import aw0.s8;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oz0.c;

/* JADX INFO: loaded from: classes5.dex */
public interface b {
    static a a(b bVar, P2pPersonalisation personalisation, boolean z, int i) {
        NavBarWithContainerBackground videoBackground;
        String str;
        Integer numA;
        boolean z3 = (i & 2) == 0;
        boolean z4 = (i & 4) == 0 ? z : false;
        ((r2a.a) bVar).getClass();
        Intrinsics.checkNotNullParameter(personalisation, "personalisation");
        P2pPersonalisation.Content content = personalisation.f79970b;
        if (content instanceof P2pPersonalisation.Content.Image) {
            videoBackground = new NavBarWithContainerBackground.ImageBackground(r2a.a.b(((P2pPersonalisation.Content.Image) content).f79972b, z3), s8.MULTICOLOR, (Color.SolidRes) null, 12);
        } else {
            if (!(content instanceof P2pPersonalisation.Content.Video)) {
                throw new NoWhenBranchMatchedException();
            }
            P2pPersonalisation.Content.Video video = (P2pPersonalisation.Content.Video) content;
            UrlImage urlImageB = r2a.a.b(video.f79976c, z3);
            videoBackground = new NavBarWithContainerBackground.VideoBackground(new UrlVideo(video.f79975b, (String) null, false, oz0.b.CENTER_CROP, false, (c) null, 102), urlImageB, new VideoShutter.Picture(urlImageB), s8.MULTICOLOR, 16);
        }
        P2pPersonalisation.Font e = content.getE();
        i3 i3Var = e != null ? new i3(e.f79979c) : null;
        P2pPersonalisation.Font e2 = content.getE();
        int iIntValue = (e2 == null || (str = e2.f79978b) == null || (numA = c90.a.a(str)) == null) ? -1 : numA.intValue();
        if (z4) {
            iIntValue = io0.a.d(0.6f, iIntValue);
        }
        return new a(videoBackground, i3Var, iIntValue);
    }
}
