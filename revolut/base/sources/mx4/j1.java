package mx4;

import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import dx4.j5;
import dx4.k2;
import ip0.xk;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f210183a;

    public j1(u contentImageMapper) {
        Intrinsics.checkNotNullParameter(contentImageMapper, "contentImageMapper");
        this.f210183a = contentImageMapper;
    }

    public final List a(j5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f120641a.f120649b;
        k2 k2Var = item.f120642b;
        String str2 = k2Var.f120649b;
        String strR = a0.d.r(str, str2);
        int i = R$attr.uikit_dp0;
        int i2 = R$attr.uikit_dp8;
        int i3 = R$attr.uikit_dp4;
        CenteredContentTileDelegate.Model.Companion companion = CenteredContentTileDelegate.Model.INSTANCE;
        k2 k2Var2 = item.f120641a;
        String str3 = k2Var2.f120648a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_constructor_image_tile_title, zhm.u.c(k2Var2.f120649b), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_constructor_image_tile_description, zhm.u.c(k2Var2.f120650c), null, 12);
        dx4.d1 d1Var = k2Var2.d;
        u uVar = this.f210183a;
        Image imageA = uVar.a(d1Var);
        dx4.l lVar = k2Var2.e;
        CenteredContentTileDelegate.Model modelB = CenteredContentTileDelegate.Model.Companion.b(companion, str3, imageA, textLocalisedClause, textLocalisedClause2, null, lVar != null, null, null, lVar, 62896);
        String str4 = k2Var.f120648a;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_application_constructor_image_tile_title, zhm.u.c(str2), null, 12);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_application_constructor_image_tile_description, zhm.u.c(k2Var.f120650c), null, 12);
        Image imageA2 = uVar.a(k2Var.d);
        dx4.l lVar2 = k2Var.e;
        return zhm.u.c(new xk(strR, zhm.v.k(modelB, CenteredContentTileDelegate.Model.Companion.b(companion, str4, imageA2, textLocalisedClause3, textLocalisedClause4, null, lVar2 != null, null, null, lVar2, 62896)), null, Float.valueOf(16.0f), null, i, i2, i3, i3, 63604));
    }
}
