package tp6;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.R$string;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.f90;
import ip0.j90;
import ip0.k90;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(null, u.c(new f90("RATE_ONE_CLICK_LIST_ID", new j90(v.k(new k90(new TextLocalisedClause(R$string.uikit_widget_rating_poor, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_social_dislike, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "RATE_ONE_CLICK_POOR_LIST_ID"), new k90(new TextLocalisedClause(R$string.uikit_widget_rating_ok, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_social_like, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "RATE_ONE_CLICK_OK_LIST_ID"), new k90(new TextLocalisedClause(R$string.uikit_widget_rating_wow, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_double_thumbs, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "RATE_ONE_CLICK_WOW_LIST_ID")), null), null, null, 56)), new lw0.a(new TextLocalisedClause(com.revolut.feature.feedback.impl.R$string.cx_feedback_feedback_ticketor_widget_title, null, null, 14), null, null, null, false, 30));
    }
}
