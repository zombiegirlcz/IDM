package r3e;

import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q87.z;
import qz9.u;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements cli.n {

    @NotNull
    private static final o Companion = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ImageTransformations f251290b = new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, true, 7), null, null, null, 48, 48, 29);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ImageTransformations f251291c = new ImageTransformations(null, new CircleTransformation(Float.valueOf(1.0f), Integer.valueOf(R$attr.uikit_colorGrey50_5), true, 4), null, null, null, 44, 44, 29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f251292a;

    public p(f01.a uiKitResources, u3e.c tileMapper) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(tileMapper, "tileMapper");
        this.f251292a = uiKitResources;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new l((List) iii.c.f(domainState.f251282b, new r38.m(this, domainState), new u(20), new z(this, domainState, 24)));
    }
}
