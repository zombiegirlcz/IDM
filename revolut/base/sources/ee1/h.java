package ee1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.add_note.AddNoteScreenContract$InputData;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements p {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddNoteScreenContract$InputData f125065a;

    public h(AddNoteScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f125065a = inputData;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextClause textClause = new TextClause(domainState.f125061a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        AddNoteScreenContract$InputData addNoteScreenContract$InputData = this.f125065a;
        Clause clause = addNoteScreenContract$InputData.f60771c;
        int i = addNoteScreenContract$InputData.e;
        String str = domainState.f125061a;
        InputTextDelegate.Model model = new InputTextDelegate.Model("INPUT_TEXT_LIST_ID", textClause, clause, null, str.length() <= addNoteScreenContract$InputData.e ? null : new TextClause(j6.a.l(i, "Enter ", " characters or less"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, true, Integer.valueOf(i), !(str.length() <= addNoteScreenContract$InputData.e), false, 0, false, 0, false, true, true, null, false, false, 0, false, false, null, -1224917128, 131071);
        int i2 = R$attr.uikit_dp16;
        int i3 = R$attr.uikit_dp0;
        yp0.b.l(model, i3, i3, i2, i2, null, false, 48);
        return new f(u.c(model), !str.equals(addNoteScreenContract$InputData.f60770b) && str.length() <= addNoteScreenContract$InputData.e);
    }
}
