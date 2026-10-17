package vzl;

import android.content.Intent;
import androidx.appcompat.view.ContextThemeWrapper;
import b90.f;
import cn0.g;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import ipa.j;
import kotlin.jvm.internal.Intrinsics;
import mm0.n;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements mpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm0.c f293577a;

    public a(zm0.c sessionProvider) {
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        this.f293577a = sessionProvider;
    }

    @Override // mpa.a
    public final Intent a(ContextThemeWrapper context, j message, f action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        return !(((g) this.f293577a).d() instanceof n) ? gc0.c.j(new MainScreenFeatureConfig.StartFromOutside(t49.a.b()), context) : gc0.c.j(new MainScreenFeatureConfig.JustShow(s49.a.AS_TOP), context);
    }

    @Override // mpa.a
    public final boolean b(j message, f action) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        return action.c() == b90.b.DASHBOARD;
    }
}
