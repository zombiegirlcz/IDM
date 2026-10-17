package o22;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.AliasType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o17.x;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f221433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzl.b f221434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f221435c;

    public p(z80.b phoneToolsProvider, zzl.b regexMatcher) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f221433a = phoneToolsProvider;
        this.f221434b = regexMatcher;
        this.f221435c = yhm.j.b(new nwf.b(26));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        boolean zA;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        AliasType aliasType = domainState.f221416a;
        List list = (List) this.f221435c.getValue();
        String str = aliasType.f61891a;
        int i = R$attr.uikit_dp0;
        FixedTabsDelegate.Model model = new FixedTabsDelegate.Model("ID_ITEM_TABS", list, str, null, null, 0, 0, i, i, SyslogConstants.LOG_CLOCK);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        List listC = u.c(model);
        Data data = domainState.f221417b;
        ArrayList arrayListE0 = d0.E0((List) iii.c.f(data, new x(2), new nz7.g(11), new nrd.i(domainState, this)), listC);
        AliasType aliasType2 = domainState.f221416a;
        if (Intrinsics.f(aliasType2, AliasType.PHONE.f61895b)) {
            String str2 = domainState.f221418c;
            b bVar = (b) data.getContent();
            zA = this.f221433a.k(str2, bVar != null ? bVar.f221419a.f297794a : null);
        } else if (Intrinsics.f(aliasType2, AliasType.EMAIL.f61894b) || Intrinsics.f(aliasType2, AliasType.REVTAG_EMAIL.f61896b)) {
            zA = ((zzl.c) this.f221434b).a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", domainState.d);
        } else {
            if (!Intrinsics.f(aliasType2, AliasType.TAX_NUMBER.f61897b) && !Intrinsics.f(aliasType2, AliasType.DOCUMENT_ID.f61893b) && !Intrinsics.f(aliasType2, AliasType.ALPHANUMERIC.f61892b)) {
                throw new NoWhenBranchMatchedException();
            }
            zA = false;
        }
        return new c(arrayListE0, zA);
    }
}
