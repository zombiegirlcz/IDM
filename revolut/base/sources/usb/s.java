package usb;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.f3;
import org.jetbrains.annotations.NotNull;
import urd.y;

/* JADX INFO: loaded from: classes6.dex */
public final class s {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f282885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f282886b;

    public s(w80.b amountFormatter, p hintMapper) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(hintMapper, "hintMapper");
        this.f282885a = amountFormatter;
        this.f282886b = hintMapper;
    }

    public final CenteredAmountDelegate.Model a(f input) {
        Intrinsics.checkNotNullParameter(input, "input");
        dj0.d amount = input.f282870a;
        String strE = this.f282885a.e(amount);
        xi0.b bVar = amount.f115083b;
        String strJ = cp5.d.J(bVar);
        boolean z = !amount.k();
        boolean z3 = input.f;
        bw0.h hVar = new bw0.h(strE, strJ, (TextClause) null, z, (List) null, z3 ? Boolean.TRUE : null, input.f282874h, false, !input.f282873g, z3, false, bw0.e.SuggestionsElseCalculator, (Clause) null, false, 29844);
        Data data = input.f282872c;
        Data data2 = input.f282871b;
        e eVar = input.e;
        Intrinsics.checkNotNullParameter(amount, "amount");
        Data dataT = (data2 == null || data == null) ? null : t1.t(data2, data);
        return new CenteredAmountDelegate.Model("CONTRIBUTION_SELECTION_WIDGET_LIST_ID", null, hVar, (f3) iii.c.f(input.d, new y(10), new up5.k(28), new u3b.h(this, 26)), dataT != null ? (bw0.m) iii.c.f(dataT, new y(9), new up5.k(27), new soc.f(this.f282886b, 6, amount, eVar)) : null, null, null, false, false, new a(bVar), null, 1506);
    }
}
