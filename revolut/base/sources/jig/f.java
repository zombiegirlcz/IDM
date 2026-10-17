package jig;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import hfg.g;
import java.util.List;
import jfb.v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(g gVar, boolean z) {
        String str = gVar.f151836a;
        String str2 = gVar.f151837b;
        String str3 = gVar.f151838c;
        StringBuilder sbM = v0.a.m("airline=", str, "|provider=", str2, "|icon=");
        sbM.append(str3);
        return new RowDelegate.Model(sbM.toString(), new RowDelegate.Model.MainImage.Image40(new UrlImage(gVar.f151838c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, false, null, false, 60), new TextClause(gVar.f151836a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(gVar.f151837b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, z ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a, null, null, null, null, null, null, null, 0, 0, 0, 0, 536852440);
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new d((List) iii.c.f(domainState.f174485a, new jhi.a(this, 29), new v0(14), new jb8.b(this, 9)));
    }
}
