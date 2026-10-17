package wl8;

import android.os.Parcelable;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_remote_login.impl.R$string;
import d9.t0;
import hx7.q;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f298458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zl8.a f298459b;

    public p(z80.b phoneToolsProvider, zl8.a suggestedContactsDataProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(suggestedContactsDataProvider, "suggestedContactsDataProvider");
        this.f298458a = phoneToolsProvider;
        this.f298459b = suggestedContactsDataProvider;
    }

    public static List b(boolean z) {
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("SEARCH_CONTACTS_ITEMS_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.junior_child_phone_picker_section_all_contacts, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        model.u = z ? R$attr.uikit_dp0 : R$attr.uikit_dp16;
        model.v = R$attr.uikit_dp12;
        return u.c(model);
    }

    public final RowDelegate.Model a(String str, zm3.f fVar, zm3.f fVar2) {
        String strB;
        String strB2;
        boolean zL = t0.l(fVar, fVar2);
        String str2 = fVar.f323345a;
        int length = q.v(fVar).length();
        z80.b bVar = this.f298458a;
        if (length == 0) {
            strB2 = z80.b.b(bVar, str2, null, null, 6);
            strB = null;
        } else {
            String strV = q.v(fVar);
            strB = z80.b.b(bVar, str2, null, null, 6);
            strB2 = strV;
        }
        String strV2 = q.v(fVar);
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(strV2.length() == 0 ? new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4095) : new ContactImage((String) null, (String) null, (String) null, fVar.f323345a, (String) null, strV2, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4055), zL ? new AccentCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60), new TextLocalisedClause(R$string.junior_child_phone_picker_item_name, u.c(strB2), null, 12), null, 0, strB != null ? new TextLocalisedClause(R$string.junior_child_phone_picker_item_phone, u.c(strB), null, 12) : null, null, null, 0, null, false, null, zL, null, null, null, null, null, null, fVar, null, 0, 0, 0, 0, 532668376);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        aim.e eVarA;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data suggestedContactsData = domainState.f298447b;
        zm3.f fVar = domainState.e;
        this.f298459b.getClass();
        Intrinsics.checkNotNullParameter(suggestedContactsData, "suggestedContactsData");
        Throwable error = suggestedContactsData.getError();
        if (suggestedContactsData.getContent() == null && error != null) {
            try {
                suggestedContactsData = new Data(f0.f322471a, null, suggestedContactsData.getLoading());
            } catch (Throwable th10) {
                suggestedContactsData = new Data(null, th10, suggestedContactsData.getLoading());
            }
        }
        if (fVar != null) {
            try {
                Object content = suggestedContactsData.getContent();
                if (content != null) {
                    aim.e eVarB = u.b();
                    eVarB.add(fVar);
                    for (zm3.f fVar2 : (List) content) {
                        if (!t0.l(fVar2, fVar)) {
                            eVarB.add(fVar2);
                        }
                    }
                    eVarA = u.a(eVarB);
                } else {
                    eVarA = null;
                }
                suggestedContactsData = new Data(eVarA, suggestedContactsData.getError(), suggestedContactsData.getLoading());
            } catch (Throwable th11) {
                suggestedContactsData = new Data(null, th11, suggestedContactsData.getLoading());
            }
        }
        Data data = domainState.f298448c;
        if (data.getError() != null) {
            try {
                data = new Data(f0.f322471a, null, data.getLoading());
            } catch (Throwable th12) {
                data = new Data(null, th12, data.getLoading());
            }
        }
        return new j((List) iii.c.f(t1.t(suggestedContactsData, data), new wl3.d(this, 6), new wf0.b(this, 25), new vh2.o(this, domainState, 18)), domainState.d != null, (ue0.e.n((List) suggestedContactsData.getContent()) && ue0.e.n((List) data.getContent())) ? false : true);
    }
}
