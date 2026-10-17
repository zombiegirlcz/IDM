package wq4;

import cm4.p;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import ip0.q6;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.o;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f299408a;

    public e(p paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        this.f299408a = paymentData;
    }

    public static q6 i(TextLocalisedClause textLocalisedClause, String str) {
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_management_paid, null, new Custom(Integer.valueOf(R$attr.uikit_colorBackground), false, null, false, null, 254), 10);
        int i = R$attr.uikit_colorAccent;
        return new q6(str, textLocalisedClause, new TagViewData(resourceImage, textLocalisedClause2, i, null, i, null, 1000), null, null, 0, 0, 2040);
    }

    @Override // wq4.i
    public final List a() {
        o oVarI;
        ArrayList arrayList = new ArrayList();
        p pVar = this.f299408a;
        long j2 = pVar.f25134c;
        if (j2 > 0) {
            arrayList.add(h.e(pVar));
        }
        qv0.i iVarC = h.c(pVar);
        if (iVarC != null) {
            arrayList.add(iVarC);
        }
        arrayList.add(i(new TextLocalisedClause(R$string.credit_management_minimum, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), "id_cc_minimum"));
        if (j2 > 0) {
            oVarI = h.f(pVar);
        } else {
            int i = R$string.credit_management_statement_dot_value;
            Long l2 = pVar.d;
            oVarI = i(new TextLocalisedClause(i, u.c(h.h(Instant.ofEpochMilli(l2 != null ? l2.longValue() : pVar.f25132a).minus((TemporalAmount) Duration.ofDays(1L)).toEpochMilli())), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), "id_cc_statement");
        }
        arrayList.add(oVarI);
        return arrayList;
    }
}
