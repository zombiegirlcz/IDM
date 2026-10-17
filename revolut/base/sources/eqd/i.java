package eqd;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.data.model.Data;
import ec8.q;
import ep2.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1h.h f128446a;

    public i(d1h.h wealthRemoteDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(wealthRemoteDisclaimersMapper, "wealthRemoteDisclaimersMapper");
        this.f128446a = wealthRemoteDisclaimersMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        a aVar = domainState.f128433a;
        Data data = domainState.f128434b;
        Clause clause = aVar.f128431b;
        GlyphImage glyphImage = aVar.f128430a;
        lw0.a aVar2 = new lw0.a(clause, null, glyphImage != null ? new lw0.c(glyphImage) : null, null, false, 26);
        List list = data != null ? (List) iii.c.f(data, new l(29), new en6.a(11), new q(this, 11)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        return new cii.b(data != null ? (aw0.e) iii.c.f(data, new h(0), new en6.a(12), new q(domainState, 12)) : null, list, aVar2);
    }
}
