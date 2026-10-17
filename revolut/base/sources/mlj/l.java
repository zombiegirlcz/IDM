package mlj;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingAttribute;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingAttributesValidation;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.business_details.EsimMobilePlanPowerOfAttorneyBusinessDetailsScreenContract$InputData;
import dej.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanPowerOfAttorneyBusinessDetailsScreenContract$InputData f206993a;

    public l(EsimMobilePlanPowerOfAttorneyBusinessDetailsScreenContract$InputData inputData, olj.a phoneNumberPortingUserInputMasker) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneNumberPortingUserInputMasker, "phoneNumberPortingUserInputMasker");
        this.f206993a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        boolean z;
        i iVar;
        String rawInput;
        TextClause textClause;
        InputTextDelegate.Model model;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<EsimPhoneNumberPortingAttribute> list = this.f206993a.f101339b;
        ArrayList arrayList = new ArrayList();
        for (EsimPhoneNumberPortingAttribute esimPhoneNumberPortingAttribute : list) {
            u0 u0Var = esimPhoneNumberPortingAttribute.e;
            String str = esimPhoneNumberPortingAttribute.f100338a;
            switch (k.f206992a[u0Var.ordinal()]) {
                case 1:
                case 2:
                    i iVar2 = (i) domainState.f206982a.get(str);
                    boolean zJ = pd.b.j(iVar2 != null ? Boolean.valueOf(iVar2.d) : null);
                    String str2 = esimPhoneNumberPortingAttribute.f100338a;
                    TextClause textClause2 = new TextClause(esimPhoneNumberPortingAttribute.f100339b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String mask = esimPhoneNumberPortingAttribute.f;
                    if (mask == null || (iVar = (i) domainState.f206982a.get(str)) == null || (rawInput = iVar.f206986a) == null) {
                        textClause = null;
                    } else {
                        Intrinsics.checkNotNullParameter(mask, "mask");
                        Intrinsics.checkNotNullParameter(rawInput, "rawInput");
                        StringBuilder sb6 = new StringBuilder();
                        int length = rawInput.length();
                        for (int i = 0; i < length; i++) {
                            char cCharAt = rawInput.charAt(i);
                            if (Character.isLetterOrDigit(cCharAt)) {
                                sb6.append(cCharAt);
                            }
                        }
                        String string = sb6.toString();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            char c2 = '#';
                            if (i2 < mask.length()) {
                                if (mask.charAt(i2) == '#') {
                                    i3++;
                                }
                                i2++;
                            } else {
                                if (string.length() <= i3) {
                                    StringBuilder sb9 = new StringBuilder();
                                    int length2 = mask.length();
                                    int i5 = 0;
                                    int i6 = 0;
                                    while (i6 < length2) {
                                        char cCharAt2 = mask.charAt(i6);
                                        if (cCharAt2 == c2) {
                                            if (i5 < string.length()) {
                                                sb9.append(string.charAt(i5));
                                                i5++;
                                                i6++;
                                                c2 = '#';
                                            } else {
                                                string = sb9.toString();
                                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                            }
                                        } else if (i5 < string.length()) {
                                            sb9.append(cCharAt2);
                                            i6++;
                                            c2 = '#';
                                        } else {
                                            string = sb9.toString();
                                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                        }
                                    }
                                    string = sb9.toString();
                                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                }
                                textClause = new TextClause(string, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            }
                        }
                    }
                    InputTextDelegate.Model model2 = new InputTextDelegate.Model(str2, textClause, textClause2, null, false, null, false, zJ ? new TextLocalisedClause(R$string.esim_mobile_plans_portability_attribute_invalid, u.c(new TextClause(esimPhoneNumberPortingAttribute.f100339b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null, null, null, null, null, null, false, null, null, zJ, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -67240072, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                    yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                    model = model2;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    model = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (model != null) {
                arrayList.add(model);
            }
        }
        Collection collectionValues = domainState.f206982a.values();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : collectionValues) {
            EsimPhoneNumberPortingAttributesValidation esimPhoneNumberPortingAttributesValidation = ((i) obj2).f206988c;
            if (esimPhoneNumberPortingAttributesValidation != null && esimPhoneNumberPortingAttributesValidation.d) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            z = true;
        } else {
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                if (d0.F0(((i) it8.next()).f206986a).toString().length() <= 0) {
                    z = false;
                }
            }
            z = true;
        }
        return new h(arrayList, z);
    }
}
