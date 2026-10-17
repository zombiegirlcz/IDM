package xk7;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.api.models.CFACClaimExpense;
import com.revolut.feature.insurance.impl.R$string;
import ik7.j;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements p {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f306618a;

    public i(j expenseItemMapper) {
        Intrinsics.checkNotNullParameter(expenseItemMapper, "expenseItemMapper");
        this.f306618a = expenseItemMapper;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        Iterable iterableG;
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayListA = this.f306618a.a(u.c(domainState.f306615a), false);
        yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cfac_my_claims_expense_details_expense_info_trip_event_purpose, null, null, 14);
        CFACClaimExpense cFACClaimExpense = domainState.f306615a;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("TRIP OR EVENT PURPOSE", textLocalisedClause, ik7.b.b(cFACClaimExpense.f74928c), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.cfac_my_claims_expense_details_expense_info_start_date, null, null, 14);
        long j2 = cFACClaimExpense.d;
        TimeClause.Format.INSTANCE.getClass();
        TimeClause.Format.DateMedium dateMedium = TimeClause.Format.f57959a;
        CellDetailsDelegate.Model[] elements = {model, new CellDetailsDelegate.Model("EXPENSE START DATE", textLocalisedClause2, new TimeClause(j2, dateMedium, null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("EXPENSE CANCELLATION DATE", new TextLocalisedClause(R$string.cfac_my_claims_expense_details_expense_info_cancellation_date, null, null, 14), new TimeClause(cFACClaimExpense.e, dateMedium, null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("EXPENSE CANCELLED BY", new TextLocalisedClause(R$string.cfac_my_claims_expense_details_expense_info_canceled_by, null, null, 14), ik7.b.a(cFACClaimExpense.f), 0, null, null, null, null, null, false, 0, 0, 32760)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        ArrayList arrayListE0 = d0.E0(listL, arrayListA);
        List list = cFACClaimExpense.f74929g;
        if (list.isEmpty()) {
            iterableG = f0.f322471a;
        } else {
            ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("UPLOADED DOCUMENTS SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.cfac_my_claims_expense_details_uploaded_documents, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            List<File> list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            for (File file : list2) {
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                arrayList.add(new RowDelegate.Model(absolutePath, new RowDelegate.Model.MainImage.Image40(new FileImage(file, R$drawable.uikit_icn_24_document, new ImageTransformations((CircleTransformation) null, true, false, (Integer) 8, (Integer) null, (Integer) null, 443)), null, null, false, null, false, 62), new TextClause(name, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, true, null, false, null, null, null, null, null, null, file, null, 0, 0, 0, 0, 532674552));
            }
            iterableG = yp0.b.g(arrayList, model2, null, 0, 0, 126);
        }
        return new f(d0.E0(iterableG, arrayListE0));
    }
}
