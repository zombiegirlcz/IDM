package kp2;

import a0.d;
import aim.e;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.bank_account_switching.impl.domain.DetailsSection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f188163a;

    public c(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f188163a = uiKitResources;
    }

    public final ArrayList a(List sections) {
        TextClause textClause;
        Intrinsics.checkNotNullParameter(sections, "sections");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : sections) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            DetailsSection detailsSection = (DetailsSection) obj2;
            e eVarB = u.b();
            String str = detailsSection.f63896a;
            if (str != null && !d0.W(str)) {
                eVarB.add(new ListSubheaderDelegate.Model(d.v(new Object[]{Integer.valueOf(i)}, 1, "ID_SECTION_HEADER_%d", "format(...)"), (Image) null, (Clause) new TextClause(detailsSection.f63896a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            }
            ArrayList arrayList2 = detailsSection.f63897b;
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
            int i3 = 0;
            for (Object obj3 : arrayList2) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    v.s();
                    throw null;
                }
                DetailsSection.Item item = (DetailsSection.Item) obj3;
                String str2 = item.e;
                f01.c cVar = this.f188163a;
                Integer numValueOf = str2 != null ? Integer.valueOf(cVar.a(str2)) : null;
                String str3 = item.f;
                Integer numValueOf2 = str3 != null ? Integer.valueOf(cVar.d(str3)) : null;
                String strV = d.v(new Object[]{Integer.valueOf(i), Integer.valueOf(i3)}, 2, "ID_SECTION_ITEM_%d_%d", "format(...)");
                TextClause textClause2 = new TextClause(item.f63898a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str4 = item.f63899b;
                TextClause textClause3 = str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                String str5 = item.f63900c;
                if (str5 != null) {
                    wn2.b bVar = item.d;
                    textClause = new TextClause(str5, (Style) (bVar == null ? null : new Click(28, (Integer) null, (Object) bVar, d.v(new Object[]{Integer.valueOf(i), Integer.valueOf(i3)}, 2, "ID_SECTION_ITEM_ACTION_%d_%d", "format(...)"), false)), (Integer) null, false, (o9) null, (List) null, 124);
                } else {
                    textClause = null;
                }
                arrayList3.add(new RowDelegate.Model(strV, numValueOf != null ? new RowDelegate.Model.MainImage.Image24(new ResourceImage(numValueOf.intValue(), (Integer) null, (Integer) null, numValueOf2, (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6) : null, textClause2, null, 0, textClause3, textClause, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868760));
                i3 = i5;
            }
            yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
            eVarB.addAll(arrayList3);
            a0.x(u.a(eVarB), arrayList);
            i = i2;
        }
        return arrayList;
    }
}
