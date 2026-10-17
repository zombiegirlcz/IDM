package av8;

import android.os.Parcelable;
import aqd.h1;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.document_collection.document_selection.DocumentSelectionControllerContract$InputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f9961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DocumentSelectionControllerContract$InputData f9962b;

    public r(n8b.a countryInteractor, DocumentSelectionControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f9961a = countryInteractor;
        this.f9962b = inputData;
    }

    public static ListSubheaderDelegate.Model b() {
        return new ListSubheaderDelegate.Model("document_list_sub_header_list_id", (Image) null, (Clause) new TextLocalisedClause(R$string.kyc_select_document_simplified_supported_documents, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp24, 0, 0, 0, 61434);
    }

    public final InputTextDelegate.Model a(wi0.b bVar) {
        String str = bVar.f297794a;
        qd0.b.Companion.getClass();
        String lowerCase = str.toLowerCase(qd0.a.f244819b);
        InputTextDelegate.Model model = new InputTextDelegate.Model("citizenship_drop_down_list_id", new TextLocalisedClause(t61.a.p(lowerCase, "toLowerCase(...)", "nationality.", lowerCase), (List) null, (Clause) new TextClause(((o8b.c) this.f9961a).b(bVar.f297794a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 22), new TextLocalisedClause(R$string.kyc_select_document_simplified_citizenship, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return yp0.r.a(model);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f9949b, new as9.a(this, domainState, 11), new h1(20), new a15.n(this, domainState, 26));
        wi0.b bVar = domainState.f9948a;
        DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData = this.f9962b;
        List list2 = documentSelectionControllerContract$InputData.f77621g;
        my8.r rVar = documentSelectionControllerContract$InputData.f77620c;
        boolean zIsEmpty = list2.isEmpty();
        n8b.a aVar = this.f9961a;
        if (zIsEmpty) {
            switch (q.f9960a[rVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_title, u.c(new TextLocalisedClause(R$string.kyc_select_document_right_to_remain_short_title, null, null, 14)), null, 12);
                    break;
                case 4:
                    textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_my_number_title, null, null, 14);
                    break;
                case 5:
                    textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_right_to_remain_short_title_document_id, null, null, 14);
                    break;
                case 6:
                    textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_proof_of_address_title, null, null, 14);
                    break;
                case 7:
                    textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_tax_residency_title, null, null, 14);
                    break;
                case 8:
                    textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_name_verification_title, null, null, 14);
                    break;
                case 9:
                    textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_tin_absence_student_title, null, null, 14);
                    break;
                case 10:
                    textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_tin_absence_diplomat_id_title, null, null, 14);
                    break;
                case 11:
                    textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_tin_absence_diplomat_card_title, null, null, 14);
                    break;
                case 12:
                    textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_tin_absence_residence_title, u.c(new TextClause(((o8b.c) aVar).b(bVar.f297794a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.kyc_select_document_additional_documents_short_title, null, null, 14);
        }
        switch (q.f9960a[rVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
                textLocalisedClause2 = new TextLocalisedClause(R$string.kyc_select_document_right_to_remain_short_subtitle, u.c(((o8b.c) aVar).b(bVar.f297794a)), null, 12);
                break;
            case 4:
                textLocalisedClause2 = new TextLocalisedClause(R$string.kyc_select_document_my_number_description_text, null, null, 14);
                break;
            case 6:
                textLocalisedClause2 = new TextLocalisedClause(R$string.kyc_select_document_proof_of_address_description_text, null, null, 14);
                break;
            case 7:
                textLocalisedClause2 = new TextLocalisedClause(R$string.kyc_select_document_tax_residency_description_text, null, null, 14);
                break;
            case 8:
                textLocalisedClause2 = new TextLocalisedClause(R$string.kyc_select_document_name_verification_subtitle, null, null, 14);
                break;
            case 9:
                textLocalisedClause2 = new TextLocalisedClause(R$string.kyc_select_document_tin_absence_student_description, null, null, 14);
                break;
            case 10:
                textLocalisedClause2 = new TextLocalisedClause(R$string.kyc_select_document_tin_absence_diplomat_id_description, null, null, 14);
                break;
            case 11:
                textLocalisedClause2 = new TextLocalisedClause(R$string.kyc_select_document_tin_absence_diplomat_card_description, null, null, 14);
                break;
            case 12:
                textLocalisedClause2 = new TextLocalisedClause(R$string.kyc_select_document_tin_absence_residence_description, u.c(new TextClause(((o8b.c) aVar).b(bVar.f297794a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new m(textLocalisedClause, textLocalisedClause2, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), list, (domainState.f9949b.getLoading() || domainState.f9950c == null) ? false : true);
    }
}
