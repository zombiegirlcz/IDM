package mx4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.dy;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes22.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f210186a;

    public n(c90.c uiResources) {
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f210186a = uiResources;
    }

    public static ResourceImage a() {
        return new ResourceImage(R$drawable.uikit_pic_602_card_placeholder, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, gz0.b.Undefined, null, null, null, LDSFile.EF_SOD_TAG), (Clause) null, 190);
    }

    public static UrlImage b(String str) {
        return new UrlImage(str, (String) null, (UrlImageDrawable) new UrlImageDrawable.ImagePlaceholder(a()), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, (ImageTransformations) null, (Integer) null, (Integer) null, false, false, (Clause) null, 524282);
    }

    public static dy c() {
        return new dy(a(), a(), -16777216, -16777216, -7829368, -16777216, null, 1084);
    }

    public final o5l.g d() {
        int iB = this.f210186a.b();
        return iB != 160 ? iB != 240 ? iB != 320 ? iB != 480 ? iB != 640 ? o5l.g.XHDPI : o5l.g.XXXHDPI : o5l.g.XXHDPI : o5l.g.XHDPI : o5l.g.HDPI : o5l.g.MDPI;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List e(dx4.l0 r27, p5l.c r28) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx4.n.e(dx4.l0, p5l.c):java.util.List");
    }
}
