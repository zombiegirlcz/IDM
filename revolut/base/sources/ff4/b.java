package ff4;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ConfigurableResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f134706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mx4.z f134707b;

    public b(c90.c uiResources, mx4.z creditScreenConstructorMapper) {
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(creditScreenConstructorMapper, "creditScreenConstructorMapper");
        this.f134706a = uiResources;
        this.f134707b = creditScreenConstructorMapper;
    }

    public final List a(bv3.c offerInfoContent, ax4.b constructorState) {
        Intrinsics.checkNotNullParameter(offerInfoContent, "offerInfoContent");
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        List list = offerInfoContent.i;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            dx4.p pVar = (dx4.p) it8.next();
            arrayList.add(new ip0.z("ID_ACTION_BUTTONS", zhm.u.c(new ActionsView.Item(pVar.f120706a, null, false, null, null, new TextLocalisedClause(R$string.credit_application_offer_action_item, zhm.u.c(new TextClause(pVar.f120707b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new ConfigurableResourceImage(R$drawable.uikit_icn_24_pencil, Integer.valueOf(kli.a.x(R$attr.uikit_colorAccent, this.f134706a.f22265a)), null, null, 1020), null, null, null, false, null, null, pVar.f120708c, null, 24478)), true, R$attr.uikit_dp0, 0, 180));
        }
        ArrayList arrayList2 = offerInfoContent.f18951j;
        mx4.z zVar = this.f134707b;
        List listO = i2b.a.o(arrayList, zVar.b(arrayList2, constructorState));
        String str = offerInfoContent.f18953m;
        return i2b.a.o(listO, zhm.v.l(str != null ? zVar.a(str) : null));
    }
}
