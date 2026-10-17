package dnk;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit.delegates.gh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ggk.n0;
import ggk.o0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f116355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f116356b;

    public a(c descriptionMapper, d idsMapper, l iconMapper) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(idsMapper, "idsMapper");
        Intrinsics.checkNotNullParameter(descriptionMapper, "descriptionMapper");
        this.f116355a = iconMapper;
        this.f116356b = descriptionMapper;
    }

    public final ArrayList a(List benefitCategories) {
        Intrinsics.checkNotNullParameter(benefitCategories, "benefitCategories");
        List list = benefitCategories;
        int i = 10;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            o0 o0Var = (o0) obj2;
            ArrayList arrayList2 = o0Var.d;
            String str = o0Var.f143763a;
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, i));
            int i5 = 0;
            for (Object obj3 : arrayList2) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    v.s();
                    throw null;
                }
                n0 n0Var = (n0) obj3;
                SplitColumnCellDelegate.Model.a aVarA = this.f116356b.a(n0Var.f143758c);
                boolean z = (aVarA instanceof gh) && i5 == 0;
                String categoryId = str.length() > 0 ? str : null;
                if (categoryId == null) {
                    categoryId = String.valueOf(i2);
                }
                Intrinsics.checkNotNullParameter(categoryId, "categoryId");
                String str2 = "benefit---" + categoryId + "---" + i5;
                TextClause textClause = new TextClause(n0Var.f143756a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str3 = n0Var.f143757b;
                UrlImage urlImageA = str3 != null ? n.a(str3) : null;
                String str4 = n0Var.d;
                arrayList3.add(new SplitColumnCellDelegate.Model(str2, textClause, aVarA, str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, n0Var.e, n0Var.f != null, urlImageA, !z, z, null, 512800));
                i5 = i6;
            }
            int length = str.length();
            Object objValueOf = str;
            if (length <= 0) {
                objValueOf = null;
            }
            if (objValueOf == null) {
                objValueOf = Integer.valueOf(i2);
            }
            String strM = a0.d.m(objValueOf, "benefit_category_header_");
            String str5 = o0Var.f143765c;
            arrayList.add(yp0.b.g(arrayList3, new ListSubheaderDelegate.Model(strM, (Image) (str5 != null ? this.f116355a.c(str5) : null), (Clause) new TextClause(o0Var.f143764b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65528), null, 0, R$attr.uikit_dp16, LDSFile.EF_DG4_TAG));
            i2 = i3;
            i = 10;
        }
        return w.u(arrayList);
    }
}
