package ezk;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.spinner_picker.SpinnerPickerItemDelegateModel;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import ewh.x;
import ewh.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ArrayList a(int i, List list) {
        List<nel.n> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (nel.n nVar : list2) {
            arrayList.add(new SpinnerPickerItemDelegateModel(new AvatarModel.Default(new InstrumentImage(nVar.f214596b, 30, null, null), null, null, null, null, null, 126), new TextClause(nVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), j6.a.l(i, "SPINNER_PICKER_ITEM_LOADED_", nVar.f214596b), nVar, 100));
        }
        return arrayList;
    }

    @Override // cli.n
    public final o c(j jVar) {
        Data data;
        ezk.a domainState = (ezk.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f130975b, new x(23), new y(7), new et6.a(9));
        Data data2 = domainState.f130974a;
        try {
            Object content = data2.getContent();
            data = new Data(content != null ? ((yzg.d) content).f318106b : null, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        ArrayList arrayListE0 = d0.E0((List) iii.c.f(data, new x(24), new y(8), new et6.a(10)), list);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_action_continue, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        List list2 = domainState.f130976c;
        boolean z = false;
        if (list2 != null && list2.size() == 3) {
            z = true;
        }
        return new c(arrayListE0, new aw0.e(false, null, null, new n6(textLocalisedClause, defaultFilledButton, null, "CONTINUE_BUTTON_TAG", z, null, null, 972), null, null, 55), (com.revolut.core.ui_kit.views.spinnerPicker.c) iii.c.f(domainState.f130975b, new x(this, 25), new y(9), new et6.a(this, 11)));
    }
}
