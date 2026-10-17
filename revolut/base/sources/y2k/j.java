package y2k;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static InputTextDelegate.Model b(String str, TextClause textClause, TextLocalisedClause textLocalisedClause) {
        InputTextDelegate.Model model = new InputTextDelegate.Model(str, textClause, textLocalisedClause, null, new TextLocalisedClause(R$string.transfer_note_new_zealand_optional, null, null, 14), null, null, true, 12, false, false, 1, false, 1, true, false, false, null, false, false, 0, false, false, null, -102944904, 131071);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TransferNote.NewZealandNote newZealandNote = domainState.f310672a;
        List listK = v.k(b("LIST_ID_PARTICULARS", new TextClause(newZealandNote.f101980a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.transfer_note_new_zealand_particulars, null, null, 14)), b("LIST_ID_CODE", new TextClause(newZealandNote.f101981b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.transfer_note_new_zealand_code, null, null, 14)), b("LIST_ID_REFERENCE", new TextClause(newZealandNote.f101982c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.transfer_note_new_zealand_reference, null, null, 14)));
        TransferNote.NewZealandNote newZealandNote2 = domainState.f310672a;
        List listK2 = v.k(newZealandNote2.f101980a, newZealandNote2.f101981b, newZealandNote2.f101982c);
        boolean z = true;
        if (!(listK2 instanceof Collection) || !listK2.isEmpty()) {
            Iterator it8 = listK2.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((String) it8.next()).length() > 12) {
                    z = false;
                    break;
                }
            }
        }
        return new i(listK, z);
    }
}
