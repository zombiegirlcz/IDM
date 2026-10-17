package z50;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f319406a = v.k(Integer.valueOf(R$attr.uikit_colorBlue), Integer.valueOf(R$attr.uikit_colorPink), Integer.valueOf(R$attr.uikit_colorGreen), Integer.valueOf(R$attr.uikit_colorOrange), Integer.valueOf(R$attr.uikit_colorDeepPink), Integer.valueOf(R$attr.uikit_colorTerracotta), Integer.valueOf(R$attr.uikit_colorYellow), Integer.valueOf(R$attr.uikit_colorLime), Integer.valueOf(R$attr.uikit_colorLightGreen), Integer.valueOf(R$attr.uikit_colorTeal), Integer.valueOf(R$attr.uikit_colorCyan), Integer.valueOf(R$attr.uikit_colorLightBlue), Integer.valueOf(R$attr.uikit_colorIndigo), Integer.valueOf(R$attr.uikit_colorDeepPurple), Integer.valueOf(R$attr.uikit_colorPurple), Integer.valueOf(R$attr.uikit_colorBrown));

    public static final class a {
        private a() {
        }
    }

    public static LayeredImage b(f fVar) {
        Float fValueOf = Float.valueOf(32.0f);
        int i = h.f319407a[fVar.ordinal()];
        if (i == 1) {
            return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_revolut, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorAccentNeutral_10, 8.0f, fValueOf, null, 32);
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z = fVar == f.CALL_FAILED;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i2 = z ? R$drawable.uikit_icn_24_no_call : R$drawable.uikit_icn_24_call;
        int i3 = R$attr.uikit_colorAccent;
        int i5 = R$attr.uikit_colorAccentNeutral_10;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.uikit_common_accessibility_custom_action_open_profile, null, null, 14);
        companion.getClass();
        Color.Solid solid = new Color.Solid(i3);
        Color.Solid backgroundColor = new Color.Solid(i5);
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return LayeredImage.Companion.m(i2, solid, backgroundColor, 8.0f, 8.0f, 8.0f, 8.0f, fValueOf, textLocalisedClause);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit_core.displayers.image.Image a(com.revolut.chat.data.repository.chat.MessageAuthor r34) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z50.g.a(com.revolut.chat.data.repository.chat.MessageAuthor):com.revolut.core.ui_kit_core.displayers.image.Image");
    }
}
