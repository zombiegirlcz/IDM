package i9d;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.help_centre.impl.R$string;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import lde.o;
import yp0.e0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9d.c f159629a;

    public a(p9d.c doneButtonProvider, o sharedTransactionsItemsProvider) {
        Intrinsics.checkNotNullParameter(doneButtonProvider, "doneButtonProvider");
        Intrinsics.checkNotNullParameter(sharedTransactionsItemsProvider, "sharedTransactionsItemsProvider");
        this.f159629a = doneButtonProvider;
    }

    public static List b() {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("NO_TRANSACTION_ITEM_ID", new TextLocalisedClause(R$string.help_center_section_transactions_empty_title, null, null, 14), new TextLocalisedClause(R$string.help_center_section_transactions_empty_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D158", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32752);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(new pb0("TRANSACTIONS_LOADING_ITEM_ID"));
        }
        return yp0.b.g(arrayList, new ListSubheaderDelegate.Model("TRANSACTION_HEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.help_center_section_transactions_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.OUTSIDE_BOX, 0, 0, 124);
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f159632a;
        aim.e eVarB = u.b();
        i1d.b mapContent = new i1d.b(data, this, 9);
        Intrinsics.checkNotNullParameter(mapContent, "mapContent");
        eVarB.addAll((List) mapContent.invoke());
        return new j(u.a(eVarB), ((p9d.d) this.f159629a).a(domainState.f159633b));
    }
}
