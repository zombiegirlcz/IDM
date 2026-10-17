package oxe;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.flows.cvv.screen.CvvScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import e0f.f1;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CvvScreenContract$InputData f230799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f230800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f230801c;

    public p(CvvScreenContract$InputData inputData, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f230799a = inputData;
        this.f230800b = w.y0(new f1(countryInteractor, 1));
        this.f230801c = w.y0(new ox5.p(19));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (Intrinsics.f(domainState, h.f230790a)) {
            return new l(f0.f322471a, null);
        }
        if (!(domainState instanceof g)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((Boolean) this.f230800b.getValue()).booleanValue() ? "**/**" : ((g) domainState).f230788b;
        TextDelegate.Model model = (TextDelegate.Model) this.f230801c.getValue();
        g gVar = (g) domainState;
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("LIST_ITEM_PAN", new TextClause(gVar.f230787a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R.string.top_up_card_number_placeholder, null, null, 14), new TextLocalisedClause(R$string.top_up_card_number_alternative_placeholder, null, null, 14), false, null, false, null, null, null, null, null, new ResourceImage(gVar.f230789c, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -270352, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
        InputTextDelegate.Model model3 = new InputTextDelegate.Model("LIST_ITEM_EXPIRY", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.top_up_card_expiry_date_2, null, null, 14), new TextLocalisedClause(R$string.top_up_card_expiry_date_2, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -262160, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        InputTextDelegate.Model model4 = new InputTextDelegate.Model("LIST_ITEM_CVV", new TextClause(gVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R.string.top_up_card_CVV, null, null, 14), new TextLocalisedClause(R$string.top_up_card_cvv_hint, null, null, 14), false, null, null, null, null, null, null, false, null, null, false, false, 2, 0, null, false, true, null, false, m72.b.u(3), false, false, false, null, null, 0, -1142947856, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
        return new l(v.k(model, model2, model3, model4), new k(new TextLocalisedClause(this.f230799a.f90775b ? R$string.topup_action_continue : R.string.common_top_up, null, null, 14), gVar.d.length() == 3));
    }
}
