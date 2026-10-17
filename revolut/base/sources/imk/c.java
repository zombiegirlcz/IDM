package imk;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.CustomContentDescriptionClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenHeader;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dnk.l f162500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dok.e f162501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f162502c;

    public c(dnk.l iconMapper, dok.e backgroundMapper, k descriptionStateMapper) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(backgroundMapper, "backgroundMapper");
        Intrinsics.checkNotNullParameter(descriptionStateMapper, "descriptionStateMapper");
        this.f162500a = iconMapper;
        this.f162501b = backgroundMapper;
        this.f162502c = descriptionStateMapper;
    }

    public static TextClause c(PlanHubScreenHeader.Standard header) {
        Intrinsics.checkNotNullParameter(header, "header");
        return new TextClause(header.f102664a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static Clause d(PlanHubScreenHeader.Standard header) {
        Parcelable textClause;
        Intrinsics.checkNotNullParameter(header, "header");
        List list = header.f102665b;
        if (list != null) {
            List<PlanHubScreenHeader.Standard.TitleContent> list2 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            for (PlanHubScreenHeader.Standard.TitleContent titleContent : list2) {
                if (Intrinsics.f(titleContent, PlanHubScreenHeader.Standard.TitleContent.RevolutLogo.f102689a)) {
                    textClause = new ImageClause(R$drawable.uikit_icn_revolut_logo, ImageClauseTint.TextColor.f57790a, Float.valueOf(106.0f), Float.valueOf(24.0f), 16);
                } else {
                    if (!(titleContent instanceof PlanHubScreenHeader.Standard.TitleContent.PlainText)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textClause = new TextClause(((PlanHubScreenHeader.Standard.TitleContent.PlainText) titleContent).f102688a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                arrayList.add(textClause);
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2 != null) {
                return new CustomContentDescriptionClause(new CompositeClause(arrayList2, null, null, null, 14), c(header));
            }
        }
        return c(header);
    }

    public final Clause a(PlanHubScreenHeader.Standard header) {
        Clause compositeClause;
        String str;
        String str2;
        Integer numA;
        Integer numA2;
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(header, "header");
        PlanHubScreenHeader.Standard.Description description = header.e;
        if (description != null) {
            k kVar = this.f162502c;
            dnk.l lVar = kVar.f162522a;
            c7b.a aVar = kVar.f162523b;
            Float fValueOf = Float.valueOf(16.0f);
            String str3 = description.f102683c;
            int iIntValue = (str3 == null || (numA2 = aVar.a(str3)) == null) ? R$attr.uikit_colorGreyTone50 : numA2.intValue();
            String str4 = description.e;
            int iIntValue2 = (str4 == null || (numA = aVar.a(str4)) == null) ? iIntValue : numA.intValue();
            PlanScreenElementView.Icon icon = description.f102681a;
            ImageClause imageClause = (icon == null || (str2 = icon.f81076a) == null) ? null : new ImageClause(lVar.a(str2), Integer.valueOf(iIntValue), fValueOf, fValueOf, 16);
            String str5 = description.f102682b;
            Clause textClause = str5 != null ? new TextClause(str5, (Style) new Custom(Integer.valueOf(iIntValue), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124) : null;
            String str6 = description.d;
            Clause textClause2 = str6 != null ? new TextClause(str6, (Style) new Custom(Integer.valueOf(iIntValue2), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124) : null;
            PlanScreenElementView.Icon icon2 = description.f;
            ImageClause imageClause2 = (icon2 == null || (str = icon2.f81076a) == null) ? null : new ImageClause(lVar.a(str), Integer.valueOf(iIntValue2), fValueOf, fValueOf, 16);
            if (imageClause != null && textClause != null) {
                List listK = zhm.v.k(imageClause, textClause);
                m70.a.t(t0.f186434a);
                textClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            } else if (textClause == null) {
                textClause = null;
            }
            if (textClause != null && textClause2 != null) {
                List listK2 = zhm.v.k(textClause, textClause2);
                m70.a.a(t0.f186434a);
                textClause2 = new CompositeClause(listK2, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Custom(Integer.valueOf(iIntValue), false, null, false, null, 254), null, 8);
            } else if (textClause != null) {
                textClause2 = textClause;
            }
            if (textClause2 == null || imageClause2 == null) {
                compositeClause = textClause2;
            } else {
                List listK3 = zhm.v.k(textClause2, imageClause2);
                m70.a.t(t0.f186434a);
                compositeClause = new CompositeClause(listK3, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            }
        } else {
            compositeClause = null;
        }
        if (compositeClause != null) {
            return compositeClause;
        }
        String str7 = header.f102666c;
        if (str7 != null) {
            return new TextClause(str7, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenHeader.Standard r23) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: imk.c.b(com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenHeader$Standard):java.util.ArrayList");
    }
}
