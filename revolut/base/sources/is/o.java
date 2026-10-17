package is;

import android.net.Uri;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UriVideo;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ue0;
import ip0.we0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
public final class o implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Uri uri2 = Uri.parse("https://assets.revolut.com/mobile/camera/face_scan_dark.mp4");
        Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
        List listC = u.c(new we0("active_liveness_intro_image", new ue0(new UriVideo(uri2, (Uri) null, true, (oz0.b) null, Boolean.TRUE, (oz0.c) null, 74), Constants.TAG_ATMEL_SERIAL)));
        List listK = v.k(new RowDelegate.Model("active_liveness_intro_step_0", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_microphone, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.selfie_active_liveness_intro_hint_digits, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856), new RowDelegate.Model("active_liveness_intro_step_1", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_sound_off, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.selfie_active_liveness_intro_hint1, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856), new RowDelegate.Model("active_liveness_intro_step_2", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_lightbulb, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.selfie_active_liveness_intro_hint2, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        i26.l.E(listK);
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new m(d0.E0(listK, listC));
    }
}
