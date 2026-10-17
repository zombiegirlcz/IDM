package zqc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.common.ui.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l extends q implements Function0 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f) {
            case 0:
                ((j) this.receiver).getClass();
                return u.c(new IconNavBarMenuItem("SALARY_REQUEST_MENU_HELP_ID", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.common_action_help, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
            default:
                ((kyh.c) this.receiver).Z();
                return Unit.f186387a;
        }
    }
}
