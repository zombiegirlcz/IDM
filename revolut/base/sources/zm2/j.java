package zm2;

import az0.w1;
import cli.y;
import cli.z;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.backgroundpicker.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends oki.h implements z {

    @NotNull
    public static final h Companion = new h();
    public final bn2.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w1 f323330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f323331q;

    public j(k mapper, e inputData, bn2.f backgroundsCatalogInteractor, w1 backgroundsLoader) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(backgroundsCatalogInteractor, "backgroundsCatalogInteractor");
        Intrinsics.checkNotNullParameter(backgroundsLoader, "backgroundsLoader");
        this.o = backgroundsCatalogInteractor;
        this.f323330p = backgroundsLoader;
        this.f323331q = mra.d.b(this, new d(inputData.f323325a), mapper, null, false, 12);
    }

    public final void I2() {
        X1(new y0(null, new nii.z(new TextLocalisedClause(R$string.image_cropper_upload_error_title, null, null, 14), new TextLocalisedClause(R$string.image_cropper_upload_error_subtilte, null, null, 14), new TextLocalisedClause(R$string.image_cropper_upload_error_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f323331q;
    }
}
