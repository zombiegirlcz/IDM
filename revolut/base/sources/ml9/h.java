package ml9;

import aw0.m6;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ga;
import com.revolut.core.ui_kit.delegates.ha;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.pay_with_photo.api.PayWithPhotoPreviewControllerDescriptor$InputData;
import com.revolut.feature.pay_with_photo.impl.R$string;
import ip0.qe0;
import ip0.we0;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayWithPhotoPreviewControllerDescriptor$InputData f206655a;

    public h(PayWithPhotoPreviewControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f206655a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        Object we0Var;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = a0.z(lim.o.n(domainState.f206649a), "pdf", true);
        File file = domainState.f206649a;
        if (z) {
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            we0Var = new ga("PDF_DOCUMENT", new ha(absolutePath));
        } else {
            we0Var = new we0("IMAGE_DOCUMENT", new qe0(-2, new FileImage(file, (FileImage.Placeholder) null, new ImageTransformations(null, null, null, gz0.b.FitCenter, null, null, null, LDSFile.EF_SOD_TAG), 10)));
        }
        List listC = u.c(we0Var);
        Clause clause = this.f206655a.f78945b;
        m6 m6Var = n6.Companion;
        return new b(listC, new aw0.g(m6.c(m6Var, new TextLocalisedClause(R$string.payments_pay_with_photo_review_button_discard, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.payments_pay_with_photo_review_button_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), clause, (aw0.f) null, 16), !z);
    }
}
