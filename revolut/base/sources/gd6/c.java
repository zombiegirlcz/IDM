package gd6;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.entity.provider.models.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hd6.a f143073a;

    public c(hd6.a legalEntityConfiguration) {
        Intrinsics.checkNotNullParameter(legalEntityConfiguration, "legalEntityConfiguration");
        this.f143073a = legalEntityConfiguration;
    }

    @Override // cli.n
    public final o c(j jVar) {
        List listK;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = b.f143072a[this.f143073a.f151384a.ordinal()];
        if (i == 1) {
            PlainTextDelegate.Model model = new PlainTextDelegate.Model("REVOLUT_BANK_ID", (UrlImage) null, ld6.b.REVOLUT_BANK_COLOMBIA.c(), new TextLocalisedClause(R$string.legal_entity_disclaimer_revolut_bank_colombia, null, null, 14), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            PlainTextDelegate.Model model2 = new PlainTextDelegate.Model("REVOLUT_LTD_ID", (UrlImage) null, ld6.b.REVOLUT_LTD.c(), new TextLocalisedClause(R$string.legal_entity_disclaimer_revolut_ltd_colombia, null, null, 14), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            PlainTextDelegate.Model model3 = new PlainTextDelegate.Model("REVOLUT_TECHNOLOGIES_SINGAPORE_ID", (UrlImage) null, new TextLocalisedClause(R$string.legal_entity_representative_office_of, u.c(ld6.b.REVOLUT_TECHNOLOGIES_SINGAPORE.c()), null, 12), new TextLocalisedClause(R$string.legal_entity_disclaimer_revolut_technologies_singapore_colombia, null, null, 14), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            PlainTextDelegate.Model model4 = new PlainTextDelegate.Model("REVOLUT_SECURITIES_SINGAPORE_ID", (UrlImage) null, new TextLocalisedClause(R$string.legal_entity_representative_office_of, u.c(ld6.b.REVOLUT_SECURITIES_SINGAPORE.c()), null, 12), new TextLocalisedClause(R$string.legal_entity_disclaimer_revolut_securities_singapore_colombia, null, null, 14), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
            yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
            listK = v.k(model, model2, model3, model4);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            PlainTextDelegate.Model model5 = new PlainTextDelegate.Model("REVOLUT_BANK_ID", (UrlImage) null, ld6.b.REVOLUT_BANK_COLOMBIA.c(), new TextLocalisedClause(R$string.legal_entity_disclaimer_revolut_bank_colombia_youth, null, null, 14), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
            yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
            listK = u.c(model5);
        }
        return new cii.b(null, listK, null);
    }
}
