package tu8;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.kyc.api.R$string;
import cu8.w0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import my8.k;
import org.jetbrains.annotations.NotNull;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements os8.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mre.c f274535a;

    public d(mre.c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.f274535a = termsNavigationFactory;
    }

    public static TextLocalisedClause a(k kVar, wi0.b bVar) {
        if (kVar == k.AML_DATA_COLLECTION) {
            wi0.b.Companion.getClass();
            if (Intrinsics.f(bVar, wi0.b.h2)) {
                return new TextLocalisedClause(R$string.kyc_video_selfie_consent_action_acknowledgement, null, null, 14);
            }
        }
        return new TextLocalisedClause(R$string.common_action_agree_and_continue, null, null, 14);
    }

    public static Clause b(k kVar, wi0.b bVar, w0 w0Var) {
        int i = b.f274533a[kVar.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.kyc_onfido_consent_subtitle, v.k(new TextLocalisedClause(R$string.kyc_onfido_consent_facial_scan_policy, null, new Click(28, (Integer) null, (Object) w0Var, "FACIAL_SCAN_POLICY_ID", false), 10), new TextLocalisedClause(R$string.kyc_onfido_consent_privacy_policy, null, new Click(28, (Integer) null, (Object) w0Var, "PRIVACY_POLICY_ID", false), 10), new TextLocalisedClause(R$string.kyc_onfido_consent_terms_of_service, null, new Click(28, (Integer) null, (Object) w0Var, "TERMS_OF_SERVICE_ID", false), 10)), null, 12);
        }
        if (i == 2) {
            wi0.b.Companion.getClass();
            wi0.b bVar2 = wi0.b.f297770q3;
            return new TextLocalisedClause(Intrinsics.f(bVar, bVar2) ? R$string.kyc_video_selfie_consent_us_description : Intrinsics.f(bVar, wi0.b.h2) ? R$string.kyc_video_selfie_consent_description_acknowledgement : Intrinsics.f(bVar, wi0.b.O) ? R$string.kyc_video_selfie_consent_co_description_v2 : R$string.kyc_video_selfie_consent_description, Intrinsics.f(bVar, bVar2) ? u.c(new TextLocalisedClause(R$string.kyc_video_selfie_consent_link_read_more, null, new Click(28, (Integer) null, (Object) w0Var, "BIOMETRIC_INFO_ID", false), 10)) : Intrinsics.f(bVar, wi0.b.O) ? v.k(new TextLocalisedClause(R$string.kyc_video_selfie_consent_co_link_revolut_bank_colombia, null, new Click(28, (Integer) null, (Object) w0Var, "CO_DATA_PROCESSING_ID", false), 10), new TextLocalisedClause(R$string.kyc_video_selfie_consent_co_link_revolut_ltd, null, new Click(28, (Integer) null, (Object) w0Var, "REVOLUT_PRIVACY_POLICY_ID", false), 10)) : u.c(new TextLocalisedClause(R$string.kyc_video_selfie_consent_link_read_more, null, new Click(28, (Integer) null, (Object) w0Var, "READ_MORE_CLICK_ID", false), 10)), null, 12);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.kyc_onfido_processing_and_sharing_consent_description, v.k(new TextLocalisedClause(R$string.common_action_agree_and_continue, null, null, 14), new TextLocalisedClause(R$string.kyc_video_selfie_consent_link_read_more, null, new Click(28, (Integer) null, (Object) w0Var, "READ_MORE_CLICK_ID", false), 10)), null, 12);
        }
        if (i != 4) {
            if (i == 5) {
                return new TextLocalisedClause(R$string.kyc_incode_mexico_user_consent_content, null, null, 14);
            }
            throw new NoWhenBranchMatchedException();
        }
        IllegalStateException illegalStateException = new IllegalStateException("Invalid consent type for bottom sheet description " + kVar);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static TextLocalisedClause c(k kVar, wi0.b bVar) {
        if (kVar == k.AML_DATA_COLLECTION) {
            wi0.b.Companion.getClass();
            if (Intrinsics.f(bVar, wi0.b.h2)) {
                return new TextLocalisedClause(R$string.kyc_video_selfie_consent_title_acknowledgement, null, null, 14);
            }
        }
        return new TextLocalisedClause(R$string.kyc_onfido_consent_title, null, null, 14);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        if (r13 == r1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e5, code lost:
    
        if (r13 == r1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0145, code lost:
    
        if (r13 == r1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016e, code lost:
    
        if (r13 == r1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0170, code lost:
    
        return r1;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r9, my8.k r10, wi0.b r11, java.lang.String r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tu8.d.d(java.lang.String, my8.k, wi0.b, java.lang.String, gim.c):java.lang.Object");
    }
}
