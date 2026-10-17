package wz1;

import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements gx1.e {

    @NotNull
    public static final C1667a Companion = new C1667a();

    /* JADX INFO: renamed from: wz1.a$a, reason: collision with other inner class name */
    public static final class C1667a {
        private C1667a() {
        }
    }

    public final MoneyClause a(p02.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new MoneyClause(request.d, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12);
    }

    public final TextLocalisedClause b(p02.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (b.f301339a[request.f231468b.ordinal()] == 1) {
            return ApmMultibanco.f61815c.e();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ContactImage c(p02.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, request.f231469c.f231471b, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
    }

    public final TextClause d(p02.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new TextClause(request.f231469c.f231471b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
