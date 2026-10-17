package ps9;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.ImageWithAnimatedBackgroundView;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 implements cli.n {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ts9.b f239430a;

    public b0(ts9.b itemsProvider) {
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        this.f239430a = itemsProvider;
    }

    public static q a(p pVar) {
        CompositeClause compositeClause;
        st9.f fVar;
        String strO;
        TextClause textClause = new TextClause(pVar.f239437a.f79286b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        qs9.a aVar = (qs9.a) pVar.f239438b.getContent();
        if (aVar == null || (fVar = aVar.f) == null || (strO = fVar.f265548b) == null) {
            compositeClause = null;
        } else {
            Intrinsics.checkNotNullParameter(strO, "<this>");
            int iY = d0.Y(strO, "/", 0, 6);
            if (iY != -1 && iY != strO.length() - 1) {
                int i = iY + 1;
                String strSubstring = strO.substring(0, i);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strSubstring2 = strO.substring(i);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                if (strSubstring2.length() > 4) {
                    strO = com.google.android.gms.internal.mlkit_vision_face.a.o(strSubstring, "...", f0.V0(4, strSubstring2));
                }
            }
            List listK = zhm.v.k(new TextClause(strO, (Style) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), false, (o9) null, (List) null, 122), new ImageClause(R$drawable.uikit_icn_24_scan_qr, new ImageClauseTint.Color(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28));
            m70.a.t(t0.f186434a);
            compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        String str = pVar.f239437a.f79287c;
        return new q(textClause, compositeClause, new ImageWithAnimatedBackgroundView.Model(str != null ? new UrlImage(str, null, null, null, 0L, null, null, null, null, lq9.a.f199212a, true, new ImageTransformations(new CircleTransformation((Float) null, (Integer) null, false, 15), true, false, (Integer) null, (Integer) null, (Integer) null, 505), null, null, false, false, 502782) : lq9.a.f199213b, null));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        p domainState = (p) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (s) iii.c.f(domainState.f239438b, new pp5.d(this, domainState), new plb.g(this, domainState, 25), new ox2.d(this, domainState, 19));
    }
}
