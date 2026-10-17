package t0e;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ResourceImage f267015a = new ResourceImage(R$drawable.uikit_icn_24_statement, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ResourceImage f267016b = new ResourceImage(R$drawable.uikit_icn_24_download, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new h((List) iii.c.f(domainState.f267006b, new szb.g(this, 12), new szb.f(this, 8), new sr8.a(this, 5)));
    }
}
