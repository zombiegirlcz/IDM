package cea;

import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class z implements cli.n {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je6.h f23467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wda.b f23468b;

    public z(je6.h externalInstitutionLogoMapper, wda.b accountDetailsCommonMapper) {
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        Intrinsics.checkNotNullParameter(accountDetailsCommonMapper, "accountDetailsCommonMapper");
        this.f23467a = externalInstitutionLogoMapper;
        this.f23468b = accountDetailsCommonMapper;
    }

    public static Clause a(io3.d dVar) {
        String str = dVar.f163154p;
        if (str == null) {
            str = "";
        }
        return yoj.b.w(new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), new CompositeClause(zhm.v.k(new DotDividerClause((Integer) null), new TextClause(dVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 10));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        io3.d dVar = domainState.f23442a;
        return (o) iii.c.f(t1.t(domainState.f23443b, domainState.f23444c), new ce9.a(this, 1), new a8a.a(this, dVar, 12), new cab.m(this, dVar, 2));
    }
}
