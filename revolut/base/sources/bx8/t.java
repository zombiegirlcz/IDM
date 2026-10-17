package bx8;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreenContract$FormField;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreenContract$InputData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KYCDocumentIdInputScreenContract$InputData f19533a;

    public t(KYCDocumentIdInputScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f19533a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        boolean z;
        Clause clause;
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f19522b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        int i = 0;
        while (true) {
            Clause textClause = null;
            if (!it8.hasNext()) {
                KYCDocumentIdInputScreenContract$InputData kYCDocumentIdInputScreenContract$InputData = this.f19533a;
                TextClause textClause2 = new TextClause(kYCDocumentIdInputScreenContract$InputData.f77864b.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.kyc_document_id_description, u.c(kYCDocumentIdInputScreenContract$InputData.f77864b.e), null, 12);
                List list2 = domainState.f19522b;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    z = true;
                } else {
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        if (!((KYCDocumentIdInputScreenContract$FormField) it9.next()).d) {
                            z = false;
                            break;
                        }
                    }
                    z = true;
                }
                return new o(arrayList, textClause2, textLocalisedClause, z);
            }
            Object next = it8.next();
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            KYCDocumentIdInputScreenContract$FormField formField = (KYCDocumentIdInputScreenContract$FormField) next;
            String str = formField.f77860a.e;
            TextClause textClause3 = new TextClause(formField.f77861b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            my8.b bVar = formField.f77860a;
            TextClause textClause4 = new TextClause(bVar.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Intrinsics.checkNotNullParameter(formField, "formField");
            boolean z3 = formField.d;
            String str2 = formField.f77861b;
            if ((z3 || d0.W(str2)) && (clause = formField.e) != null) {
                textClause = clause;
            } else if (!z3 && !d0.W(str2) && (textClause = formField.f) == null) {
                String str3 = bVar.f210372h;
                if (str3 == null) {
                    str3 = "";
                }
                textClause = new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            InputTextDelegate.Model model = new InputTextDelegate.Model(str, textClause3, textClause4, null, false, textClause, null, null, null, null, null, false, null, null, (z3 || d0.W(str2)) ? false : true, false, 4097, 0, null, false, false, null, false, null, false, false, false, null, null, 0, -2228360, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            if (bVar.f210370c == my8.j.SELECT) {
                model = yp0.r.a(model);
            }
            InputTextDelegate.Model model2 = model;
            yp0.b.l(model2, i == 0 ? R$attr.uikit_dp24 : R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
            arrayList.add(model2);
            i = i2;
        }
    }
}
