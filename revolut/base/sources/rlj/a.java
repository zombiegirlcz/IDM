package rlj;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f255088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ynj.e f255089b;

    public a(z80.b phoneToolsProvider, ynj.e commonUiBuilder) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(commonUiBuilder, "commonUiBuilder");
        this.f255088a = phoneToolsProvider;
        this.f255089b = commonUiBuilder;
    }

    public final RowDelegate.Model a(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        z80.b bVar = this.f255088a;
        wi0.b bVarE = bVar.e(phoneNumber);
        if (bVarE == null) {
            return null;
        }
        return new RowDelegate.Model("ID_TRANSFER_PHONE_NUMBER", new RowDelegate.Model.MainImage.Image24(ynj.e.g(this.f255089b, new EsimCoverage.Country(bVarE, null)), false, false, 6), new TextClause(bVar.a(phoneNumber, bVarE.f297794a, yk0.b.INTERNATIONAL), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
    }
}
