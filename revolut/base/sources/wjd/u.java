package wjd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.sso.api.signin_social.LinkSocialAccountControllerModelExtension$SocialAccount;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements cli.n {

    @NotNull
    public static final r Companion = new r();

    public static RowDelegate.Model a(u uVar, String str, int i, int i2, boolean z, Integer num, LinkSocialAccountControllerModelExtension$SocialAccount linkSocialAccountControllerModelExtension$SocialAccount, int i3) {
        Integer num2 = (i3 & 16) != 0 ? null : num;
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, num2 != null ? num2 : null, (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(i2, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 0, null, null, null, 0, new vf(z, true), false, null, false, null, null, null, null, null, null, (i3 & 32) != 0 ? null : linkSocialAccountControllerModelExtension$SocialAccount, null, 0, 0, 0, 0, 532673528);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r42) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wjd.u.c(cli.j):cli.o");
    }
}
