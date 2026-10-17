package d9k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.o;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yof.d f112406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo9.a f112407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w80.b f112408c;
    public final ldd.b d;
    public final kgm.i e;
    public final ResourceImage f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ResourceImage f112409g;

    public f(yof.d transferAmountMapper, vo9.a pocketMapper, o moneyPrefixFormatter, w80.b amountFormatter, ldd.b focusRequesterDelegate, j p2pNoteTypeMapper, kgm.i peerToPeerAmountHintMapper, c amountInputEnabledMapper) {
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(p2pNoteTypeMapper, "p2pNoteTypeMapper");
        Intrinsics.checkNotNullParameter(peerToPeerAmountHintMapper, "peerToPeerAmountHintMapper");
        Intrinsics.checkNotNullParameter(amountInputEnabledMapper, "amountInputEnabledMapper");
        this.f112406a = transferAmountMapper;
        this.f112407b = pocketMapper;
        this.f112408c = amountFormatter;
        this.d = focusRequesterDelegate;
        this.e = peerToPeerAmountHintMapper;
        this.f = new ResourceImage(R$drawable.uikit_icn_20_keyboard_sticker, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        this.f112409g = new ResourceImage(R$drawable.uikit_icn_24_palette, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
    }
}
