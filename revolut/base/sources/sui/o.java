package sui;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.tg;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nd.p;
import org.jetbrains.annotations.NotNull;
import ss4.a0;
import ss4.z;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f265788a;

    public o(p priceIconMapper) {
        Intrinsics.checkNotNullParameter(priceIconMapper, "priceIconMapper");
        this.f265788a = w.y0(new sq5.j(12));
    }

    public static tg a(int i, ResourceImage resourceImage) {
        return new tg(new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), resourceImage);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new k((List) iii.c.f(t1.t(domainState.f265777a, domainState.f265778b), new z(this, 9), new a0(4), new sa5.b(this, 14)), (NavBarMenuItem) iii.c.f(domainState.f265779c, new z(10), new a0(5), new sr8.a(this, 2)));
    }
}
