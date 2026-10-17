package wm9;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final km9.g f298623a;

    public m(km9.g paymentRecipientMapper) {
        Intrinsics.checkNotNullParameter(paymentRecipientMapper, "paymentRecipientMapper");
        this.f298623a = paymentRecipientMapper;
    }

    public static LargeActionButtonDelegate.Model a(String str) {
        return new LargeActionButtonDelegate.Model(str, LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.security_hub_payees_section_action, null, null, 14), false, null, null, null, null, 1000);
    }

    public static ListSubheaderDelegate.Model b(int i, String str) {
        return new ListSubheaderDelegate.Model(str, (Image) null, (Clause) yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(i, null, null, 14), new ImageClause(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Float) null, (Float) null, 30))), (Image) null, (Clause) new TextLocalisedClause(R$string.security_hub_payees_section_header_action, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, true, true, 1), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new j((List) iii.c.f(domainState.f298620a, new wl3.d(this, 18), new k(1), new vjh.c(this, 28)));
    }
}
