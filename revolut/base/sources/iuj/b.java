package iuj;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.retail.feature.api.rewards_hub.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vtj.c f168629a;

    public b(vtj.c challengeMapper) {
        Intrinsics.checkNotNullParameter(challengeMapper, "challengeMapper");
        this.f168629a = challengeMapper;
    }

    public static ListSubheaderDelegate.Model a() {
        return new ListSubheaderDelegate.Model("CHALLENGES_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.rewards_hub_home_challenges_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }
}
