package szb;

import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rev_points.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {
    public static RowDelegate.Model a(String str, int i, int i2, int i3, boolean z) {
        boolean z3 = false;
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z3, z3, 6), new TextLocalisedClause(i2, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 0, new TextLocalisedClause(i3, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, 0, new vf(z, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new d(new TextLocalisedClause(R$string.profile_privacy_rev_points_personalisation_title, null, null, 14), new TextLocalisedClause(R$string.profile_privacy_rev_points_personalisation_description, u.c(new TextLocalisedClause(R$string.rev_points_points_expiry_learn_more, null, new Click(30, (Integer) null, (Object) null, "ID_TERMS_LEARN_MORE", false), 10)), null, 12), (List) iii.c.f(t1.u(domainState.f266784a, domainState.f266786c, domainState.e), new g(3), new f(3), new sa5.b(this, domainState, 20)));
    }
}
