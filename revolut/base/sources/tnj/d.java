package tnj;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.retail.feature.esim.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import th9.t;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f272463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f272464b;

    public d(a commonUiProvider) {
        Intrinsics.checkNotNullParameter(commonUiProvider, "commonUiProvider");
        this.f272463a = commonUiProvider;
        this.f272464b = w.y0(new t(this, 8));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final List a(boolean z) {
        ?? r110 = this.f272464b;
        if (z) {
            return yp0.b.g((List) r110.getValue(), new ListSubheaderDelegate.Model("SUGGESTIONS_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.esim_connectivity_issues_solutions_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        }
        List list = (List) r110.getValue();
        yp0.b.k(list, 0, 0, 0, 0, 31);
        return list;
    }
}
