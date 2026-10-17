package pch;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.impl.ui.screens.pocket_picker.PocketPickerScreenContract$Input;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import p40.n;
import yp0.e0;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PocketPickerScreenContract$Input f234914a;

    public g(PocketPickerScreenContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f234914a = input;
    }

    public static ArrayList b(ArrayList arrayList) {
        return yp0.b.g(arrayList, new ListSubheaderDelegate.Model("pocket-picker-header", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_robo_add_money_pocket_picker_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.OUTSIDE_BOX, 0, 0, 124);
    }

    @Override // jki.p
    public final m a(i iVar) {
        List list;
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f234910a;
        if (data == null || (list = (List) iii.c.f(data, new pb2.a(this, 9), new f(0), new n(this, 5))) == null) {
            list = f0.f322471a;
        }
        return new e(list);
    }
}
