package mu8;

import cli.o;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.choosedocument.review.DocumentReviewScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.qe0;
import ip0.we0;
import ip0.y10;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import maa.r;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentReviewScreenContract$InputData f209014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f209015b;

    public n(DocumentReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f209014a = inputData;
        this.f209015b = w.y0(new r(this, 20));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        File file = domainState.f209003a;
        ?? r2 = this.f209015b;
        we0 we0Var = new we0("image.list.item.id", new qe0(-2, file != null ? new FileImage(file, (FileImage.Placeholder) null, (ImageTransformations) r2.getValue(), 10) : new ResourceImage(R.drawable.mask_passport, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) r2.getValue(), (Clause) null, 190)));
        yp0.b.l(we0Var, 0, 0, 0, 0, null, false, 63);
        sa saVar = new sa("warning.list.item.id", (Clause) new TextLocalisedClause(R$string.kyc_document_review_info_default_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.kyc_document_review_info_default_description, null, null, 14), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4056);
        yp0.b.l(saVar, R$attr.uikit_dp16, R$attr.uikit_two_button_margin, 0, 0, null, false, 60);
        return new g(v.k(we0Var, saVar));
    }
}
