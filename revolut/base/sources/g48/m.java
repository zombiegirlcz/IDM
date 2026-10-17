package g48;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f140388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f140389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CdnImage f140390c;

    public m(TextLocalisedClause title, TextLocalisedClause description, CdnImage image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f140388a = title;
        this.f140389b = description;
        this.f140390c = image;
    }
}
