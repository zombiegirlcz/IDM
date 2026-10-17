package dl3;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.feature.contacts.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zm3.i;
import zm3.j;
import zm3.l;
import zm3.p;

/* JADX INFO: loaded from: classes13.dex */
public interface f {
    static Clause a(f fVar, zm3.a contact) {
        ((xl3.d) fVar).getClass();
        Intrinsics.checkNotNullParameter(contact, "contact");
        if (!(contact instanceof l)) {
            if (contact instanceof zm3.f) {
                return new TextClause(((zm3.f) contact).getPhone(), (Style) null, (Integer) null, false, (o9) null, (List) null, 124);
            }
            if (contact instanceof zm3.e) {
                return new TextClause(((zm3.e) contact).getEmail(), (Style) null, (Integer) null, false, (o9) null, (List) null, 124);
            }
            if (contact instanceof p) {
                return new TextLocalisedClause(R$string.contact_details_subtitle_virtual, null, null, 10);
            }
            throw new NoWhenBranchMatchedException();
        }
        l lVar = (l) contact;
        if (lVar instanceof i) {
            return new TextClause(j6.a.q("@", ((i) contact).N0()), (Style) null, (Integer) null, false, (o9) null, (List) null, 124);
        }
        if (!(lVar instanceof j)) {
            throw new NoWhenBranchMatchedException();
        }
        j jVar = (j) contact;
        int i = xl3.c.f306931a[jVar.f().ordinal()];
        if (i == 1 || i == 2) {
            return new TextClause(j6.a.q("@", jVar.N0()), (Style) null, (Integer) null, false, (o9) null, (List) null, 124);
        }
        if (i == 3) {
            return new CompositeClause(v.k(new TextClause(j6.a.q("@", jVar.N0()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new DotDividerClause(), new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.revolut_user_kind_business, null, null, 14)), null, null, null, 10);
        }
        throw new NoWhenBranchMatchedException();
    }

    static /* synthetic */ AvatarModel.Default b(f fVar, zm3.a aVar, e eVar, int i) {
        if ((i & 2) != 0) {
            eVar = null;
        }
        return ((xl3.d) fVar).d(aVar, eVar, false);
    }
}
