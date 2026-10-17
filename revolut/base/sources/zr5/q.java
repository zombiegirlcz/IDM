package zr5;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.j3;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.crypto_feed.impl.chat_widgets.crypto_tokens.CryptoTokensChatWidgetParcel$SeeAll;
import com.revolut.feature.crypto_feed.impl.chat_widgets.crypto_tokens.CryptoTokensChatWidgetParcel$TokenClicked;
import com.revolut.revolut.feature_fourthline_impl.R;
import gw0.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gw0.i f324602a = new gw0.i(t.SINGLE);

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        o domainState = (o) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        y50.b bVar = domainState.f324601a;
        Object obj2 = bVar.f310975b;
        String str = bVar.f310974a;
        j jVar2 = (j) obj2;
        int i = 0;
        boolean z = jVar2.f324595c.size() > 3;
        List listV0 = d0.V0(jVar2.f324595c, 3);
        ArrayList arrayList = new ArrayList(listV0.size());
        int size = listV0.size();
        while (i < size) {
            i iVar = (i) listV0.get(i);
            String str2 = str + "_" + i + "_" + iVar.f324590a;
            String str3 = iVar.f324590a;
            String str4 = iVar.f324591b;
            f fVar = iVar.f324592c;
            arrayList.add(a.a(str2, str3, str4, fVar.f324587a, fVar.f324588b, iVar.d, new CryptoTokensChatWidgetParcel$TokenClicked(str3)));
            i++;
            z = z;
        }
        return new y50.c(new ChatItemsDelegate.Model(new j3(arrayList, z ? new LargeActionButtonDelegate.Model(a0.d.r(str, "_see_all"), LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R.string.common_action_see_all, null, null, 14), false, null, null, CryptoTokensChatWidgetParcel$SeeAll.f71359a, null, 744) : null), bVar.f310974a, f324602a, new TextClause(jVar2.f324593a, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), null, null, null, 131056));
    }
}
