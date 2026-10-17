package lc0;

import com.revolut.core.backend_flow.photo.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 implements k {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        q qVar;
        int i;
        int i2;
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        h hVar = domainState.f;
        l lVar = domainState.e;
        p pVar = null;
        if (hVar != null) {
            boolean z = domainState.f193760g;
            if (hVar instanceof f) {
                qVar = new q(0);
            } else {
                if (!(hVar instanceof g)) {
                    throw new NoWhenBranchMatchedException();
                }
                g gVar = (g) hVar;
                l lVar2 = l.HIDDEN;
                boolean z3 = lVar == lVar2;
                int i3 = gVar.f193753c ? R$string.cnp_selfie_verification_selfie_taken_accept_button_title : lVar == lVar2 ? R$string.cnp_card_verification_card_photo_take_image_accept_button_title : lVar == l.VISIBLE ? R$string.cnp_card_verification_card_photo_number_hidden_accept_button_title : R$string.common_action_save;
                int i5 = d0.f193748a[lVar.ordinal()];
                qVar = new q(new TextLocalisedClause(i3, null, null, 14), new TextLocalisedClause(i5 != 1 ? i5 != 2 ? R$string.cnp_card_verification_card_photo_take_image_retake_button_title : R$string.common_action_clear : R$string.common_action_edit, null, null, 14), z3 ? new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, z3 ? new ResourceImage(R$drawable.uikit_icn_24_retry, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, true, lVar == l.EDIT ? z : true);
            }
        } else {
            qVar = null;
        }
        h hVar2 = domainState.f;
        if (hVar2 != null) {
            if (hVar2 instanceof f) {
                f fVar = (f) hVar2;
                boolean z4 = fVar.f193749a;
                boolean z6 = fVar.f193750b;
                int i6 = (z6 && z4) ? R$string.cnp_selfie_verification_info_header_title : z6 ? R$string.cnp_photo_verification_selfie_detected_hint_title : R$string.cnp_card_verification_card_photo_title;
                int i21 = (z6 && z4) ? R$string.cnp_selfie_with_card_verification_info_header_description : z6 ? R$string.cnp_selfie_verification_info_header_description : R$string.cnp_card_verification_info_header_description;
                int i22 = R$attr.uikit_colorWhite;
                Custom custom = new Custom(Integer.valueOf(i22), false, null, false, null, 254);
                pVar = new p(new TextLocalisedClause(i6, null, custom, 10), new TextLocalisedClause(i21, null, custom, 10), new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, Integer.valueOf(i22), (List) null, (ImageTransformations) null, (Clause) null, 246));
            } else {
                if (!(hVar2 instanceof g)) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean z11 = ((g) hVar2).f193753c;
                int[] iArr = d0.f193748a;
                int i32 = iArr[lVar.ordinal()];
                if (i32 == 1) {
                    i = R$string.cnp_card_verification_info_preview_number_header_title;
                } else if (i32 == 2) {
                    i = R$string.cnp_card_verification_info_preview_number_edit_header_title;
                } else {
                    if (i32 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = z11 ? R$string.cnp_card_verification_card_photo_take_image_taken_title : R$string.cnp_card_verification_card_photo_take_image_taken_card_title;
                }
                if (z11) {
                    i2 = R$string.cnp_selfie_verification_info_image_taken_header_description;
                } else {
                    int i33 = iArr[lVar.ordinal()];
                    if (i33 == 1) {
                        i2 = R$string.cnp_card_verification_info_preview_number_header_description;
                    } else if (i33 == 2) {
                        i2 = R$string.cnp_card_verification_info_preview_number_edit_header_description;
                    } else {
                        if (i33 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = R$string.cnp_card_verification_card_photo_take_image_taken_card_subtitle_short;
                    }
                }
                int i43 = R$attr.uikit_colorBlack;
                Custom custom2 = new Custom(Integer.valueOf(i43), false, null, false, null, 254);
                pVar = new p(new TextLocalisedClause(i, null, custom2, 10), new TextLocalisedClause(i2, null, custom2, 10), new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, Integer.valueOf(i43), (List) null, (ImageTransformations) null, (Clause) null, 246));
            }
        }
        return new r(hVar, qVar, pVar);
    }
}
