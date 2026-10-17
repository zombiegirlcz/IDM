package fz6;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.freelancer.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final had.b f139133a;

    public u(had.b languageClauseFactory, had.c languageImageFactory, az6.c templateDetailsItemMapper) {
        Intrinsics.checkNotNullParameter(languageClauseFactory, "languageClauseFactory");
        Intrinsics.checkNotNullParameter(languageImageFactory, "languageImageFactory");
        Intrinsics.checkNotNullParameter(templateDetailsItemMapper, "templateDetailsItemMapper");
        this.f139133a = languageClauseFactory;
    }

    public static TextLocalisedClause a(String str) {
        int i = R$string.freelancer_sale_invoice_setup_template_override_revert;
        int i2 = R$attr.uikit_colorAccent;
        return new TextLocalisedClause(i, null, new Click(12, Integer.valueOf(i2), (Object) new r(str), str, false), 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x034a  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r80) {
        /*
            Method dump skipped, instruction units count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fz6.u.c(cli.j):cli.o");
    }
}
