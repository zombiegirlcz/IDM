package ge6;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.extension_auth.api.model.AppChallengeDevice;
import com.revolut.feature.extension_auth.api.model.AppChallengeOperation;
import com.revolut.feature.extension_auth.api.model.AppConsentClient;
import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData;
import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestDataAddress;
import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestDataDevice;
import com.revolut.feature.extension_auth.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.sso.api.models.ConsentChallenge;
import ip0.dg;
import ip0.y10;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vil.g f143235a;

    public h(vil.g consentScreenStateMapperHelper) {
        Intrinsics.checkNotNullParameter(consentScreenStateMapperHelper, "consentScreenStateMapperHelper");
        this.f143235a = consentScreenStateMapperHelper;
    }

    public static List a(ExtensionAuthRequestData extensionAuthRequestData, ExtensionAuthRequestDataDevice extensionAuthRequestDataDevice) {
        CellDetailsDelegate.Model modelB;
        CellDetailsDelegate.Model modelB2;
        ExtensionAuthRequestDataAddress extensionAuthRequestDataAddress = extensionAuthRequestDataDevice.d;
        String str = extensionAuthRequestDataDevice.f72194c;
        if (extensionAuthRequestDataAddress != null) {
            int i = R$string.common_word_where;
            String[] elements = {extensionAuthRequestDataAddress.f72189a, extensionAuthRequestDataAddress.f72190b};
            Intrinsics.checkNotNullParameter(elements, "elements");
            modelB = b(i, "details_where_item_id", d0.k0(kotlin.collections.d.L(elements), null, null, null, 0, null, 63));
        } else {
            modelB = null;
        }
        CellDetailsDelegate.Model modelB3 = str != null ? b(R$string.common_word_device, "details_system_item_id", str) : null;
        String str2 = extensionAuthRequestDataDevice.f72193b;
        if (str2 != null) {
            modelB2 = b(((extensionAuthRequestData instanceof ExtensionAuthRequestData.Verification) || str != null) ? R$string.common_word_browser : R$string.common_word_device, "details_browser_item_id", str2);
        } else {
            modelB2 = null;
        }
        String str3 = extensionAuthRequestDataDevice.f72192a;
        CellDetailsDelegate.Model[] elements2 = {modelB, modelB3, modelB2, str3 != null ? b(R$string.common_word_ip, "details_ip_item_id", str3) : null};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return kotlin.collections.d.L(elements2);
    }

    public static CellDetailsDelegate.Model b(int i, String str, String str2) {
        return new CellDetailsDelegate.Model(str, new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new TextClause(str2, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static List c() {
        dg dgVar = new dg("ERROR_ID", new TextLocalisedClause(R$string.revolut_secure_sign_in_error_item_title, null, null, 14), new TextLocalisedClause(R$string.revolut_secure_sign_in_error_item_retry, null, null, 14));
        yp0.b.l(dgVar, 0, 0, 0, 0, null, false, 63);
        return zhm.u.c(dgVar);
    }

    public final AbstractList d(ExtensionAuthRequestData data) {
        Clause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        sa saVar;
        Object obj2;
        AppChallengeOperation appChallengeOperation;
        AppChallengeOperation appChallengeOperation2;
        ConsentChallenge.Operation operation;
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof ExtensionAuthRequestData.AppChallenge) {
            ExtensionAuthRequestData.AppChallenge appChallenge = (ExtensionAuthRequestData.AppChallenge) data;
            String str = appChallenge.f72178a;
            long j2 = appChallenge.f72180c;
            long j3 = appChallenge.d;
            AppChallengeDevice appChallengeDevice = appChallenge.e;
            ConsentChallenge.Device device = new ConsentChallenge.Device(appChallengeDevice.f72164a, appChallengeDevice.f72165b, new ConsentChallenge.Device.Location(null, appChallengeDevice.f72166c.f72168b, null, null));
            AppConsentClient appConsentClient = appChallenge.f;
            ConsentChallenge.Client client = appConsentClient != null ? new ConsentChallenge.Client(appConsentClient.f72177b, appConsentClient.f72176a) : null;
            AppChallengeOperation appChallengeOperation3 = appChallenge.f72182h;
            if (appChallengeOperation3 != null) {
                String str2 = appChallengeOperation3.f72170a;
                String str3 = appChallengeOperation3.f72171b;
                String str4 = appChallengeOperation3.f72172c;
                ArrayList<AppChallengeOperation.Property> arrayList = appChallengeOperation3.d;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (AppChallengeOperation.Property property : arrayList) {
                    arrayList2.add(new ConsentChallenge.Operation.Property(property.f72173a, property.f72174b, property.f72175c));
                }
                operation = new ConsentChallenge.Operation(str2, str3, str4, arrayList2);
            } else {
                operation = null;
            }
            return ((aml.m) this.f143235a).b(new ConsentChallenge.App(str, j2, j3, "", device, client, operation), false);
        }
        if (!(data instanceof ExtensionAuthRequestData.Verification)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList3 = new ArrayList();
        ExtensionAuthRequestData.Verification verification = (ExtensionAuthRequestData.Verification) data;
        long j5 = verification.f72185c;
        long j16 = verification.d;
        boolean z = data instanceof ExtensionAuthRequestData.AppChallenge;
        if (z) {
            AppChallengeOperation appChallengeOperation4 = ((ExtensionAuthRequestData.AppChallenge) data).f72182h;
            textLocalisedClause = appChallengeOperation4 != null ? new TextClause(appChallengeOperation4.f72170a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.common_word_authenticate, null, null, 14);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.common_word_authenticate, null, null, 14);
        }
        arrayList3.add(new np0.b("timer_delegate_id", j5, j16, textLocalisedClause));
        TextDelegate.Model model = (!z || (appChallengeOperation2 = ((ExtensionAuthRequestData.AppChallenge) data).f72182h) == null) ? null : new TextDelegate.Model(R$attr.uikit_dp0, R$attr.uikit_dp24, 828, new TextClause(appChallengeOperation2.f72171b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), "timer_subtitle_id");
        if (model != null) {
            arrayList3.add(model);
        }
        if (z) {
            saVar = new sa("warning_item_id", (Clause) new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_operation_confirmation_about_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_operation_confirmation_about_subtitle, null, null, 14), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_warning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4040);
        } else {
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.rwa_authenticate_request_detail_title, null, null, 14);
            zd6.b bVar = verification.i;
            int i = bVar == null ? -1 : g.f143234b[bVar.ordinal()];
            if (i == -1) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.rwa_authenticate_request_detail_description_fallback, null, null, 14);
            } else if (i == 1) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.rwa_authenticate_request_detail_description_web_client, null, null, 14);
            } else if (i == 2) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.rwa_authenticate_request_detail_description_browser_extension, null, null, 14);
            } else if (i == 3) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.rwa_authenticate_request_detail_description_open_banking, null, null, 14);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                zd6.a aVar = (zd6.a) d0.d0(verification.f72188j);
                int i2 = aVar == null ? -1 : g.f143233a[aVar.ordinal()];
                if (i2 == -1) {
                    textLocalisedClause2 = new TextLocalisedClause(R$string.rwa_authenticate_request_detail_description_fallback, null, null, 14);
                } else if (i2 == 1) {
                    textLocalisedClause2 = new TextLocalisedClause(R$string.rwa_authenticate_request_detail_description_mobile_client_change_password, null, null, 14);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause2 = new TextLocalisedClause(R$string.rwa_authenticate_request_detail_description_mobile_client_change_phone_number, null, null, 14);
                }
            }
            saVar = new sa("warning_item_id", (Clause) textLocalisedClause3, (Clause) textLocalisedClause2, (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_legacy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorPink), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4040);
        }
        yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        arrayList3.add(saVar);
        if (!z || (appChallengeOperation = ((ExtensionAuthRequestData.AppChallenge) data).f72182h) == null) {
            obj2 = f0.f322471a;
        } else {
            ArrayList<AppChallengeOperation.Property> arrayList4 = appChallengeOperation.d;
            ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
            for (AppChallengeOperation.Property property2 : arrayList4) {
                String str5 = property2.f72173a;
                arrayList5.add(new CellDetailsDelegate.Model(str5, new TextClause(str5, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), new TextClause(property2.f72175c, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), 0, null, null, null, null, null, false, 0, 0, 32760));
            }
            yp0.b.k(arrayList5, 0, 0, 0, 0, 31);
            obj2 = arrayList5;
        }
        a0.x((Iterable) obj2, arrayList3);
        ArrayList arrayList6 = new ArrayList();
        long j22 = verification.e;
        arrayList6.add(new RowDelegate.Model("details_date_item_id", null, new TextLocalisedClause(R.string.common_word_date, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new TimeClause(j22, new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867834));
        arrayList6.add(new RowDelegate.Model("details_time_item_id", null, new TextLocalisedClause(R$string.common_word_time, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new TimeClause(j22, TimeClause.Format.TimeDefault.f57977b, null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867834));
        if (z) {
            AppChallengeDevice appChallengeDevice2 = ((ExtensionAuthRequestData.AppChallenge) data).e;
            String str6 = appChallengeDevice2.f72165b;
            String str7 = appChallengeDevice2.f72164a;
            String str8 = appChallengeDevice2.f72166c.f72168b;
            a0.x(a(data, new ExtensionAuthRequestDataDevice(str6, str7, null, str8 != null ? new ExtensionAuthRequestDataAddress(str8, null, null, null) : null)), arrayList6);
        } else {
            ExtensionAuthRequestDataDevice extensionAuthRequestDataDevice = verification.f;
            if (extensionAuthRequestDataDevice != null) {
                a0.x(a(data, extensionAuthRequestDataDevice), arrayList6);
            }
        }
        yp0.b.k(arrayList6, 0, 0, 0, 0, 31);
        return d0.E0(arrayList6, arrayList3);
    }
}
