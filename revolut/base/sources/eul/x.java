package eul;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x implements e4i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4i.a f129663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f129664b;

    public x(l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f129663a = amountConverter;
        this.f129664b = te0.w.y0(new euf.a(3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final CompositeClause a(TextLocalisedClause textLocalisedClause) {
        return CompositeClause.a(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(textLocalisedClause, (ImageClause) this.f129664b.getValue())), null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 11);
    }

    @Override // e4i.a
    public final l4i.a e() {
        return this.f129663a;
    }
}
