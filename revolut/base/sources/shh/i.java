package shh;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements chh.e {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpj.f f263483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z80.b f263484b;

    public i(kpj.f wealthAccountHeaderUiMapper, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f263483a = wealthAccountHeaderUiMapper;
        this.f263484b = phoneToolsProvider;
    }

    public static ListSubheaderDelegate.Model a(TextLocalisedClause textLocalisedClause) {
        return new ListSubheaderDelegate.Model("TAA_SETTINGS_HEADER_LIST_ID", (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp16, 0, 0, 57338);
    }
}
