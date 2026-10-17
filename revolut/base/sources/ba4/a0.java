package ba4;

import aw0.o9;
import ch.qos.logback.core.util.FileSize;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.UploadScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UploadScreenContract$InputData f13897a;

    public a0(UploadScreenContract$InputData inputData, u94.a documentMapper, q74.b creditNavigationIconMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(documentMapper, "documentMapper");
        Intrinsics.checkNotNullParameter(creditNavigationIconMapper, "creditNavigationIconMapper");
        this.f13897a = inputData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        boolean z;
        char c2;
        Clause textLocalisedClause;
        CompositeClause compositeClause;
        TextLocalisedClause textLocalisedClause2;
        ry3.a aVar;
        ResourceImage resourceImage;
        String strP;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        UploadScreenContract$InputData uploadScreenContract$InputData = this.f13897a;
        ny3.f fVar = uploadScreenContract$InputData.f67577b;
        ResourceImage resourceImageA = q74.b.a(uploadScreenContract$InputData.d);
        int i = R$string.credit_application_documents_upload_document_title;
        String str = fVar.f220630b;
        ny3.a aVar2 = fVar.e;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i, zhm.u.c(str), null, 12);
        Clause[] elements = new Clause[2];
        elements[0] = new TextLocalisedClause(R$string.credit_application_documents_upload_document_description, zhm.u.c(fVar.f220631c), null, 12);
        ny3.e eVar = fVar.d;
        if (eVar != null) {
            Float fValueOf = Float.valueOf(16.0f);
            z = false;
            ny3.d dVar = eVar.f220628b;
            c2 = 1;
            String str2 = eVar.f220627a;
            if (dVar != null) {
                List listK = zhm.v.k(new ImageClause(R$drawable.uikit_icn_24_documents_pair, Integer.valueOf(R$attr.uikit_colorAccent), fValueOf, fValueOf, 16), new TextLocalisedClause(R$string.credit_application_documents_upload_document_second_description, zhm.u.c(str2), new Click(28, (Integer) null, (Object) eVar.f220628b, "id-second-description", false), 8));
                m70.a.t(t0.f186434a);
                textLocalisedClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            } else {
                textLocalisedClause = new TextLocalisedClause(R$string.credit_application_documents_upload_document_second_description, zhm.u.c(str2), null, 12);
            }
        } else {
            z = false;
            c2 = 1;
            textLocalisedClause = null;
        }
        elements[c2] = textLocalisedClause;
        Intrinsics.checkNotNullParameter(elements, "elements");
        char c3 = c2;
        boolean z3 = z;
        CompositeClause compositeClause2 = new CompositeClause(kotlin.collections.d.L(elements), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_application_documents_upload_document_button, zhm.u.c(fVar.f220632g), null, 12);
        boolean z4 = (!domainState.f13898a.isEmpty() || uploadScreenContract$InputData.f67578c) ? c3 : z3;
        String str3 = fVar.f;
        if (str3 != null) {
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.credit_application_documents_upload_document_disclaimer, zhm.u.c(str3), null, 12);
            compositeClause = compositeClause2;
            textLocalisedClause2 = textLocalisedClause5;
        } else {
            compositeClause = compositeClause2;
            textLocalisedClause2 = null;
        }
        aim.e eVarB = zhm.u.b();
        RowDelegate.Model model = new RowDelegate.Model("add-document-item-id", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_plus, null, null, 6), null, null, false, null, false, 62), new TextLocalisedClause(R$string.credit_application_documents_upload_document_upload_item_title, zhm.u.c(aVar2.f220623a), new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 8), null, 0, new TextLocalisedClause(R$string.credit_application_documents_upload_document_upload_item_description, zhm.u.c(aVar2.f220624b), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        List list = domainState.f13898a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            ry3.a document = (ry3.a) it8.next();
            int i2 = R$string.credit_application_documents_upload_document_document_item_title;
            int i3 = R$string.credit_application_documents_upload_document_document_item_description;
            Intrinsics.checkNotNullParameter(document, "document");
            File file = document.f258207a;
            String path = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            Iterator it9 = it8;
            CompositeClause compositeClause3 = compositeClause;
            TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(i2, zhm.u.c(file.getName()), null, 12);
            Intrinsics.checkNotNullParameter(file, "file");
            long length = file.length();
            if (length >= FileSize.MB_COEFFICIENT) {
                aVar = document;
                resourceImage = resourceImageA;
                strP = ch.qos.logback.core.util.a.p(length / ((long) PKIFailureInfo.badCertTemplate), " Mb");
            } else {
                aVar = document;
                resourceImage = resourceImageA;
                strP = length >= FileSize.KB_COEFFICIENT ? ch.qos.logback.core.util.a.p(length / ((long) 1024), " Kb") : ch.qos.logback.core.util.a.p(length, " b");
            }
            arrayList.add(new RowDelegate.Model(path, new RowDelegate.Model.MainImage.Image40(new FileImage(file, R.drawable.icon_document_placeholder, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_DG2_TAG)), null, null, false, null, false, 62), textLocalisedClause6, null, 0, new TextLocalisedClause(i3, zhm.u.c(strP), null, 12), null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), true), true, null, false, null, null, null, null, null, null, aVar, null, 0, 0, 0, 0, 532673496));
            compositeClause = compositeClause3;
            it8 = it9;
            resourceImageA = resourceImage;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        return new s(zhm.u.a(eVarB), resourceImageA, textLocalisedClause3, compositeClause, textLocalisedClause4, textLocalisedClause2, z4);
    }
}
