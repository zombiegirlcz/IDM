package tnj;

import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.mn0;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f272465a;

    public e(a commonUiProvider) {
        Intrinsics.checkNotNullParameter(commonUiProvider, "commonUiProvider");
        this.f272465a = commonUiProvider;
    }

    public final VaultsProgressDelegate.Model a(Instant instant, int i, int i2, int i3, ImageClause imageClause) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        this.f272465a.getClass();
        return new VaultsProgressDelegate.Model("TRANSFER_PROGRESS_ID", textLocalisedClause, null, new TextLocalisedClause(i2, u.c(a.a(instant)), null, 12), imageClause, null, null, null, false, i3, new mn0(R$attr.uikit_colorAccent, R$attr.uikit_colorStatusSuccess), false, null, null, 8368076);
    }
}
