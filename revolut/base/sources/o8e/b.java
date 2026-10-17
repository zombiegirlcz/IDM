package o8e;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.vaults.R$string;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import l8e.d;
import l8e.h;
import njj.c1;
import org.jetbrains.annotations.NotNull;
import pcd.v;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements p {

    @NotNull
    public static final a Companion = new a();

    @Override // jki.p
    public final m a(i iVar) {
        v vVar;
        v vVar2;
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f192961b;
        l8e.a aVar = (l8e.a) data.getContent();
        String strB = (aVar == null || (vVar2 = aVar.f192957a) == null) ? null : q8e.b.b(vVar2.d);
        String str = strB == null ? "" : strB;
        l8e.a aVar2 = (l8e.a) data.getContent();
        String str2 = (aVar2 == null || (vVar = aVar2.f192957a) == null) ? null : vVar.f234900b;
        String str3 = str2 != null ? str2 : "";
        List list = (List) iii.c.f(data, new o69.b(this, 26), new o4a.a(19), new c1(this, 14, str, domainState));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.group_pockets_invitation_screen_header_title, u.c(str3), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.group_pockets_invitation_screen_subtitle, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        l8e.a aVar3 = (l8e.a) data.getContent();
        return new h(textLocalisedClause, textLocalisedClause2, aVar3 != null ? aVar3.f192959c : com.revolut.core.ui_kit_core.displayers.image.models.b.c("EMPTY_IMAGE_ID", null, null, null, 30), list);
    }
}
