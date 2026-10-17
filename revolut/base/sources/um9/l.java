package um9;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uk2.w;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final km9.d f281276a;

    public l(km9.d juniorPayeesUiMapper) {
        Intrinsics.checkNotNullParameter(juniorPayeesUiMapper, "juniorPayeesUiMapper");
        this.f281276a = juniorPayeesUiMapper;
    }

    public static ListSubheaderDelegate.Model a(kq8.f fVar) {
        Clause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        ListSubheaderDelegate.Model.a.b bVar;
        if (fVar != null) {
            textLocalisedClause = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.security_hub_payees_section_header_blocked, null, null, 14), new ImageClause(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Float) null, (Float) null, 30)));
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.security_hub_payees_section_header_action, null, null, 14);
            bVar = new ListSubheaderDelegate.Model.a.b(false, true, true, 1);
            textLocalisedClause2 = textLocalisedClause3;
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.security_hub_payees_section_header_blocked, null, null, 14);
            textLocalisedClause2 = null;
            bVar = null;
        }
        return new ListSubheaderDelegate.Model("PAYEES_BLOCKED_SUBHEADER_ITEM_ID", (Image) null, textLocalisedClause, (Image) null, (Clause) textLocalisedClause2, (String) null, (ListSubheaderDelegate.Model.a) bVar, false, false, (Object) fVar, (Parcelable) null, 0, 0, 0, 0, 64426);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i((List) iii.c.f(domainState.f281271a, new uj6.v(this, 28), new uj8.j(16), new w(this, 6)));
    }
}
