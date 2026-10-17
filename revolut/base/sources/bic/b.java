package bic;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RectangularButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import eic.q;
import ip0.xk;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements Function2 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f15467a;

    public b(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f15467a = uiKitResources;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xk invoke(dgc.a faqButton, dgc.a feedbackButton) {
        Intrinsics.checkNotNullParameter(faqButton, "faqButton");
        Intrinsics.checkNotNullParameter(feedbackButton, "feedbackButton");
        aim.e eVarB = u.b();
        TextClause textClause = new TextClause(faqButton.f114613a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = faqButton.f114615c;
        if (str == null) {
            str = "24_question_outline";
        }
        f01.a aVar = this.f15467a;
        eVarB.add(new RectangularButtonDelegate.Model("ID_ACTION_BUTTON_FAQ", textClause, new ResourceImage(aVar.a(str), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new q(faqButton.f114614b), 16));
        TextClause textClause2 = new TextClause(feedbackButton.f114613a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str2 = feedbackButton.f114615c;
        if (str2 == null) {
            str2 = "24_megaphone";
        }
        eVarB.add(new RectangularButtonDelegate.Model("ID_ACTION_BUTTON_FEEDBACK", textClause2, new ResourceImage(aVar.a(str2), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new q(feedbackButton.f114614b), 16));
        aim.e eVarA = u.a(eVarB);
        ArrayList arrayList = new ArrayList(w.t(eVarA, 10));
        ListIterator listIterator = eVarA.listIterator(0);
        while (true) {
            aim.b bVar = (aim.b) listIterator;
            if (!bVar.hasNext()) {
                Integer numValueOf = Integer.valueOf(eVarA.size());
                Float fValueOf = Float.valueOf(8.0f);
                int i = R$attr.uikit_dp8;
                int i2 = R$attr.uikit_dp4;
                return new xk("ID_ACTION_BUTTONS_SECTION", arrayList, numValueOf, fValueOf, null, i, i, i2, i2, 63600);
            }
            RectangularButtonDelegate.Model model = (RectangularButtonDelegate.Model) bVar.next();
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
        }
    }
}
