package rui;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import ip0.a00;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements Function1 {
    public static a00 a(AsftPass pass) {
        Intrinsics.checkNotNullParameter(pass, "pass");
        return new a00(new TextClause(pass.i, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(pass.k, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CountryImage(pass.f98722p.f297794a, (Integer) null, (ez0.e) null, 14));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        return a((AsftPass) obj2);
    }
}
