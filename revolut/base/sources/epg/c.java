package epg;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.username.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zlg.r;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageClause f128177a = new ImageClause(R$drawable.uikit_icn_16_check, new ImageClauseTint.Color(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28);

    public final Clause a(int i, boolean z) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        return z ? new CompositeClause(v.k(this.f128177a, textLocalisedClause), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12) : textLocalisedClause;
    }

    public final Clause b(zlg.r rVar, boolean z) {
        if (Intrinsics.f(rVar, r.h.f323272a)) {
            return a(R$string.payments_payment_profile_current_username, z);
        }
        if (Intrinsics.f(rVar, r.c.f323267a)) {
            return a(R$string.change_username_validation_available, z);
        }
        if (Intrinsics.f(rVar, r.d.f323268a) || Intrinsics.f(rVar, r.a.f323265a)) {
            return new TextLocalisedClause(R$string.change_username_validation_unavailable, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
        }
        if (Intrinsics.f(rVar, r.l.f323276a)) {
            return new TextLocalisedClause(R$string.change_username_validation_too_short, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
        }
        if (Intrinsics.f(rVar, r.b.f323266a)) {
            return new TextLocalisedClause(R$string.change_username_validation_letter_required, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
        }
        if (Intrinsics.f(rVar, r.k.f323275a)) {
            return new TextLocalisedClause(R$string.change_username_validation_invalid_characters, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
        }
        if (Intrinsics.f(rVar, r.j.f323274a)) {
            return new TextLocalisedClause(R$string.change_username_error_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
        }
        if (Intrinsics.f(rVar, r.e.f323269a)) {
            return new TextLocalisedClause(R$string.change_username_validation_consecutive_underscores, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
        }
        if (Intrinsics.f(rVar, r.f.f323270a)) {
            return new TextLocalisedClause(R$string.change_username_validation_end_with_underscore, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
        }
        if (Intrinsics.f(rVar, r.g.f323271a)) {
            return new TextLocalisedClause(R$string.change_username_validation_start_with_underscore, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
        }
        if (Intrinsics.f(rVar, r.i.f323273a) || rVar == null) {
            return new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        throw new NoWhenBranchMatchedException();
    }
}
