package gc4;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.ak0;
import ip0.g20;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TextLocalisedClause a(String str) {
        return new TextLocalisedClause(R$string.how_it_works_template_title, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f142325a;
        yu3.b bVar = (yu3.b) data.getContent();
        if (bVar == null) {
            if (!data.getLoading()) {
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                TextLocalisedClause textLocalisedClauseA = a("");
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                return new i(u.c(new FullScreenStateDelegate.Model("ID_ERROR_ITEM", new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), false, null, null, false, 0, 0, 32596)), textLocalisedClauseA, textClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false);
            }
            t0 t0Var2 = t0.f186434a;
            m70.a.c(t0Var2);
            TextLocalisedClause textLocalisedClauseA2 = a("");
            Intrinsics.checkNotNullParameter(t0Var2, "<this>");
            TextClause textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Intrinsics.checkNotNullParameter(t0Var2, "<this>");
            TextClause textClause3 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            IntRange intRange = new IntRange(1, 5, 1);
            ArrayList arrayList = new ArrayList(w.t(intRange, 10));
            vim.f it8 = intRange.iterator();
            while (it8.f289625c) {
                pb0 pb0Var = new pb0(a0.d.n("ID_LOADING_ITEM_", it8.nextInt() - 1));
                yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                arrayList.add(pb0Var);
            }
            return new i(arrayList, textLocalisedClauseA2, textClause2, textClause3, false);
        }
        TextLocalisedClause textLocalisedClauseA3 = a(bVar.f316869a);
        String str = bVar.f316870b;
        TextClause textClause4 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.how_it_works_template_action, u.c(new TextClause(bVar.f316871c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        aim.e eVarB = u.b();
        String str2 = bVar.f;
        if (str2 != null) {
            t0 t0Var3 = t0.f186434a;
            m70.a.c(t0Var3);
            TextClause textClause5 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Intrinsics.checkNotNullParameter(t0Var3, "<this>");
            g20 g20Var = new g20("id_image", textClause5, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new UrlImage(str2, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), 16080);
            yp0.b.l(g20Var, 0, 0, 0, 0, null, false, 63);
            eVarB.add(g20Var);
        }
        aim.e eVarB2 = u.b();
        String str3 = bVar.f316872g;
        if (str3 != null) {
            eVarB2.add(new ListSubheaderDelegate.Model("id_header", (Image) null, (Clause) new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        }
        ArrayList<yu3.a> arrayList2 = bVar.e;
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        for (yu3.a aVar : arrayList2) {
            String str4 = aVar.f316866a;
            TextClause textClause6 = new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause7 = new TextClause(aVar.f316867b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Image imageT1 = aVar.f316868c.T1();
            arrayList3.add(new RowDelegate.Model(str4, imageT1 != null ? new RowDelegate.Model.MainImage.Image24(imageT1, false, false, 6) : null, textClause6, null, 0, textClause7, null, null, Integer.MAX_VALUE, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868568));
        }
        eVarB2.addAll(arrayList3);
        aim.e eVarA = u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        int i = R$string.how_it_works_template_disclaimer;
        String str5 = bVar.d;
        eVarB.add(new TextDelegate.Model("ID_DISCLAIMER", new TextLocalisedClause(i, u.c(new HtmlClause(0, 28, (Integer) null, (Object) null, str5 == null ? "" : str5)), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
        return new i(u.a(eVarB), textLocalisedClauseA3, textClause4, textLocalisedClause, true);
    }
}
