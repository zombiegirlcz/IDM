package a5e;

import a2f.q;
import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.structured_note.details.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ListSubheaderDelegate.Model f1376a = new ListSubheaderDelegate.Model("underlying_assets_header", (Image) null, (Clause) new TextLocalisedClause(R$string.trading_structured_notes_instrument_details_overview_screen_thesis_widget_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);

    public static final class a {
        private a() {
        }
    }

    public final List a(f domainState) {
        List list;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f1366a;
        return (data == null || (list = (List) iii.c.f(data, new a35.b(29), new a08.n(29), new q(this, domainState, 2))) == null) ? f0.f322471a : list;
    }
}
