package pdk;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ldk.s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements Function1 {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f235264a;

    public f(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f235264a = uiKitResources;
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CenteredContentTileDelegate.Model invoke(xck.a reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        CenteredContentTileDelegate.Model.Companion companion = CenteredContentTileDelegate.Model.INSTANCE;
        String strQ = j6.a.q("LIST_ID_GRID_ITEM_", reward.f304139a);
        GlyphImage glyphImage = new GlyphImage(this.f235264a.a(reward.f304141c), null, null, 6);
        TextClause textClause = new TextClause(reward.f304140b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        s sVar = new s(reward.d);
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp32;
        int i3 = R$attr.uikit_dp12;
        return CenteredContentTileDelegate.Model.Companion.a(companion, strQ, glyphImage, textClause, null, true, sVar, i, i2, i3, i3, 952);
    }
}
