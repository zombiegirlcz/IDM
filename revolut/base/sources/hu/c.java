package hu;

import aw0.n6;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt.a f155471a;

    public c(yt.a documentType) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f155471a = documentType;
    }

    public static aw0.e a() {
        return new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.vision_common_text_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
    }
}
