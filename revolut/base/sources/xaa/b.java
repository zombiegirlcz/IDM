package xaa;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;
import lx1.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LayeredImage f303793b = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_user, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f303794a;

    public b(i recipientMapper) {
        Intrinsics.checkNotNullParameter(recipientMapper, "recipientMapper");
        this.f303794a = recipientMapper;
    }
}
