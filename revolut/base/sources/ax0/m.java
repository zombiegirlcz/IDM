package ax0;

import android.content.Context;
import aw0.o9;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public abstract class m {
    public static final UIKitTextView a(yw0.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        UIKitTextView uIKitTextViewM0 = fVar.m0();
        jb3.l.e(uIKitTextViewM0, R$attr.internal_textAppearanceEmphasis1);
        Context context = uIKitTextViewM0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        uIKitTextViewM0.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        uIKitTextViewM0.setGravity(1);
        return uIKitTextViewM0;
    }

    public static final UIKitTextView b(yw0.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        UIKitTextView uIKitTextViewM0 = fVar.m0();
        jb3.l.e(uIKitTextViewM0, R$attr.internal_textAppearanceMarketingDisplay3_noXmlUsage);
        Context context = uIKitTextViewM0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        uIKitTextViewM0.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        uIKitTextViewM0.setGravity(1);
        return uIKitTextViewM0;
    }

    public static final Clause c(yw0.e eVar) {
        Float fValueOf = Float.valueOf(16.0f);
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Integer num = eVar.f317257b;
        TextLocalisedClause textLocalisedClause = eVar.f317256a;
        if (num.intValue() == 0) {
            return textLocalisedClause;
        }
        List listK = v.k(new ImageClause(eVar.f317257b.intValue(), Integer.valueOf(R$attr.uikit_colorGreyTone50), fValueOf, fValueOf, 16), textLocalisedClause);
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), custom, null, 8);
    }

    public static final TagViewData d(yw0.e eVar, Context context) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        TagViewData.Companion companion = TagViewData.INSTANCE;
        TextLocalisedClause textLocalisedClause = eVar.f317256a;
        Integer num = eVar.f317257b;
        if (num.intValue() == 0) {
            num = null;
        }
        Intrinsics.checkNotNullParameter(context, "<this>");
        int i = kli.a.q(context) ? R$attr.uikit_colorWhite_10 : R$attr.uikit_colorAccentNeutral_10;
        Intrinsics.checkNotNullParameter(context, "<this>");
        int i2 = kli.a.q(context) ? R$attr.uikit_colorWhite : R$attr.uikit_colorAccentNeutral;
        companion.getClass();
        return TagViewData.Companion.b(i, i2, textLocalisedClause, num);
    }
}
