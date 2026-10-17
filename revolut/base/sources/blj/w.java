package blj;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$string;
import java.util.List;
import nii.z;

/* JADX INFO: loaded from: classes11.dex */
public final class w {
    public static z a(pfj.g gVar) {
        return gVar != null ? new z(new TextClause(gVar.f235613b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(gVar.f235614c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, false, null, null, null, null, null, null, 32764) : b();
    }

    public static z b() {
        return new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
    }
}
