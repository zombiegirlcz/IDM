package i9h;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.k10;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.y;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements adh.n {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jbh.b f159849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ adh.o f159850b;

    public d(jbh.b mostTradedAssetsMapper, adh.o wealthMapper) {
        Intrinsics.checkNotNullParameter(mostTradedAssetsMapper, "mostTradedAssetsMapper");
        Intrinsics.checkNotNullParameter(wealthMapper, "wealthMapper");
        this.f159849a = mostTradedAssetsMapper;
        this.f159850b = wealthMapper;
    }

    public static y c(TextLocalisedClause textLocalisedClause, ArrayList arrayList) {
        return new y(arrayList, new rp0.t(textLocalisedClause, null, null, 30), rp0.l.WINDOW, null, null, null, 1016);
    }

    @Override // adh.n
    public final k10 a(Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return this.f159850b.a(title);
    }

    public final RowDelegate.Model d(xzg.v asset, int i, Object obj2) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        return this.f159849a.a(asset, i, obj2);
    }
}
