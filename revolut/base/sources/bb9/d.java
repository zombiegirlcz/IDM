package bb9;

import android.os.Parcelable;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.onboarding.impl.R$string;
import ip0.yt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements n {
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listK = v.k(Integer.valueOf(R$string.signup_registration_play_store_revolut_india_app_instruction_step1), Integer.valueOf(R$string.signup_registration_play_store_revolut_india_app_instruction_step2), Integer.valueOf(R$string.signup_registration_play_store_revolut_india_app_instruction_step3), Integer.valueOf(R$string.signup_registration_play_store_revolut_india_app_instruction_step4), Integer.valueOf(R$string.signup_registration_play_store_revolut_india_app_instruction_step5));
        ArrayList arrayList = new ArrayList(w.t(listK, 10));
        int i = 0;
        for (Object obj2 : listK) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList.add(new ListCellDelegate.Model(a0.d.n("step_", i2), new j8(com.revolut.core.ui_kit_core.displayers.image.models.a.b(i2, Integer.valueOf(R$attr.uikit_colorBlack), Integer.valueOf(R$attr.uikit_colorWhite), null, 24), yt.TOP), new TextLocalisedClause(((Number) obj2).intValue(), null, null, 14), null, false, null, null, 0, 0, 0, 0, 4088));
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new b(new TextLocalisedClause(R$string.signup_registration_app_store_revolut_india_app_instruction_prompt_title, null, null, 14), new TextLocalisedClause(R$string.signup_registration_app_store_revolut_india_app_instruction_prompt_play_store_subtitle, null, null, 14), i2b.a.q(new ListSubheaderDelegate.Model("subheader", (Image) null, (Clause) new TextLocalisedClause(R$string.signup_registration_app_store_revolut_india_app_instruction_prompt_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), arrayList));
    }
}
