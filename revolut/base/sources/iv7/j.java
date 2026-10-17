package iv7;

import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import i6j.q;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LayeredImage f168773a = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_document, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final tf f168774b = new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false);

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(ti7.j jVar, String str, Clause clause) {
        return new RowDelegate.Model(j6.a.q("ID_DOCUMENT_", str), f168773a, null, null, clause, null, null, null, 0, f168774b, false, false, null, null, null, null, null, jVar, null, 0, 0, 0, 0, 1056962540);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new f((Clause) iii.c.f(domainState.f168765b, new iui.a(12), new iui.b(11), new q(21)), (List) iii.c.f(t1.t(domainState.f168765b, domainState.f168764a), new iui.a(11), new iui.b(10), new q(this, 20)));
    }
}
