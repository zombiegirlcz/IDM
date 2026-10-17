package eu4;

import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import et6.r1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 implements cli.n {
    public static dc a(int i) {
        return new dc(new GlyphImage(i, null, null, 6));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        n domainState = (n) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (a0) iii.c.f(domainState.f129514a, new r1(this, 21), new b0(this, 1), new et6.a(this, 1));
    }
}
