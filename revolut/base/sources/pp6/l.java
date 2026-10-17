package pp6;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.d80;
import ip0.n80;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pnh.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static n80 a(int i, int i2) {
        return new n80(new TextLocalisedClause(i, null, null, 14), new d80(new ResourceImage(i2, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, new ImageTransformations(null, null, null, null, null, 42, 42, 31), (Clause) null, 182)));
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (c) iii.c.f(domainState.f238278a, new a0(this, 19), new pof.e(this, 2), new p40.n(this, domainState, 15));
    }
}
