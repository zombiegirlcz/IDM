package bic;

import aw0.o9;
import com.revolut.core.ui_kit.gradients.UiKitGradient;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import tx0.q1;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements Function1 {
    public static eic.i a(dgc.h header) {
        Intrinsics.checkNotNullParameter(header, "header");
        q1 q1Var = q1.PLAN;
        TextClause textClause = new TextClause(header.f114630b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        aim.e eVarB = u.b();
        int i = R$drawable.uikit_icn_24_premium;
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorForeground);
        Float fValueOf = Float.valueOf(16.0f);
        eVarB.add(new ImageClause(i, numValueOf, fValueOf, fValueOf, 16));
        ArrayList<dgc.f> arrayList = header.f114631c.f114628b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (dgc.f fVar : arrayList) {
            String str = fVar.f114625a;
            boolean z = fVar.f114626b;
            arrayList2.add(new TextClause(str, new Custom(Integer.valueOf(z ? R$attr.uikit_colorGreyTone50 : R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, z, (o9) null, (List) null, 116));
        }
        eVarB.addAll(arrayList2);
        CompositeClause compositeClause = new CompositeClause(u.a(eVarB), sx4.g.e(1), null, null, 12);
        dgc.e eVar = header.d;
        return new eic.i(new AvatarModel.Default(new UrlImage(header.f114629a, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_DG2_TAG), null, null, false, false, 507902), null, new AvatarModel.Border.StaticGradient(UiKitGradient.b.e, com.revolut.core.ui_kit.models.avatar.c.OVAL), null, null, null, 122), q1Var, textClause, compositeClause, eVar != null ? new CompositeClause(v.k(new TextClause(eVar.f114623a, (Style) null, Integer.valueOf(R$attr.uikit_colorOrange), false, (o9) null, (List) null, 122), new ImageClause(R$drawable.uikit_icn_24_info_legacy, Integer.valueOf(R$attr.uikit_colorOrange), fValueOf, fValueOf, 16)), sx4.g.e(1), null, null, 12) : null);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        return a((dgc.h) obj2);
    }
}
