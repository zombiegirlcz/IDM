package rb6;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.donations.impl.R$string;
import java.util.Collection;
import java.util.List;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q87.z;
import r7i.r;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List b() {
        return u.c(new LargeActionButtonDelegate.Model("SUGGESTIONS_CUSTOM_AMOUNT", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.donations_suggested_amounts_button_custom_amount, null, null, 14), false, null, null, null, null, 1000));
    }

    public static List c() {
        return u.c(new ListSubheaderDelegate.Model("SUGGESTIONS_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.donations_suggested_amounts_subtitle_donate_now, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        int i;
        Collection collection;
        String str;
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f252962b;
        Data data2 = domainState.f252963c;
        List list = (List) iii.c.f(data, new r(19), new r6d.h(this, 26), new z(this, domainState, 29));
        ba6.l lVar = (ba6.l) domainState.f252962b.getContent();
        TextClause textClause = (lVar == null || (str = lVar.f13939b) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        boolean z = domainState.d != null || (!data2.getLoading() && ((collection = (Collection) data2.getContent()) == null || collection.isEmpty()));
        int i2 = o.f252973a[domainState.f252961a.ordinal()];
        if (i2 == 1) {
            i = R$drawable.uikit_icn_24_arrow_thin_left;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_cross;
        }
        return new j(list, textClause, z, i);
    }
}
