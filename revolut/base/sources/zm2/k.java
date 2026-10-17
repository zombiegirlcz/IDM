package zm2;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g(new UrlImage(domainState.f323324a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286));
    }
}
