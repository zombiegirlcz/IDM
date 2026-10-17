package k8k;

import cli.n;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements n {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LayeredImage f182176b = LayeredImage.Companion.p(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_logo_revolut, Integer.valueOf(R$attr.uikit_colorBlack), R$attr.uikit_colorWhite, 2.0f, 24.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkg.a f182177a;

    public e(fkg.a qrCodeGenerator) {
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        this.f182177a = qrCodeGenerator;
    }

    public static ImageClause a() {
        int i = R$drawable.uikit_icn_24_pencil;
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorAccent);
        Float fValueOf = Float.valueOf(16.0f);
        return new ImageClause(i, numValueOf, fValueOf, fValueOf, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0272  */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r35) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k8k.e.c(cli.j):cli.o");
    }
}
