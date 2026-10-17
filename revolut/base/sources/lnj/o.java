package lnj;

import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.RawAccentCircleBadge;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import com.revolut.retail.feature.esim.impl.R$string;
import dej.p3;
import dej.t1;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ynj.e f197284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1j.b f197285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wnj.a f197286c;

    public o(ynj.e commonUiBuilder, t1j.b bytesAllowanceFormatter, fhj.h refundItemMapper, wnj.a descriptorApplier) {
        Intrinsics.checkNotNullParameter(commonUiBuilder, "commonUiBuilder");
        Intrinsics.checkNotNullParameter(bytesAllowanceFormatter, "bytesAllowanceFormatter");
        Intrinsics.checkNotNullParameter(refundItemMapper, "refundItemMapper");
        Intrinsics.checkNotNullParameter(descriptorApplier, "descriptorApplier");
        this.f197284a = commonUiBuilder;
        this.f197285b = bytesAllowanceFormatter;
        this.f197286c = descriptorApplier;
    }

    public static TextLocalisedClause a(t1 t1Var) {
        Instant instant = t1Var.f113664w;
        if (instant != null) {
            return new TextLocalisedClause(R$string.esim_subscriptions_item_subtitle_expires, u.c(new TimeClause(instant.toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.FULL), null, null, 12)), null, 12);
        }
        return null;
    }

    public final g b(p3 p3Var, boolean z) {
        Clause clauseC = null;
        String str = p3Var != null ? p3Var.f113618b : null;
        TextLocalisedClause textLocalisedClause = str == null ? new TextLocalisedClause(R$string.esim_refund_title_placeholder, u.c(new TextLocalisedClause(R$string.esim_refund_title, null, null, 14)), null, 12) : d0.W(str) ? null : new TextLocalisedClause(R$string.esim_refund_title_placeholder, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        EsimHyperText esimHyperText = p3Var != null ? p3Var.f113619c : null;
        if (esimHyperText == null) {
            clauseC = new TextLocalisedClause(R$string.esim_refund_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10);
        } else if (!d0.W(esimHyperText.f100276a)) {
            clauseC = wnj.a.c(this.f197286c, esimHyperText, Integer.valueOf(R$attr.uikit_colorGrey50), 2);
        }
        return new g(clauseC, textLocalisedClause, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02bb  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r47) {
        /*
            Method dump skipped, instruction units count: 1191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lnj.o.c(cli.j):cli.o");
    }

    public final RowDelegate.Model.MainImage.Image40 d(t1 t1Var) {
        return new RowDelegate.Model.MainImage.Image40(ynj.e.i(this.f197284a, t1Var), t1Var.z ? new RawAccentCircleBadge(R$drawable.uikit_icn_24_unlimited) : null, null, false, null, false, 60);
    }
}
