package ft6;

import com.revolut.feature.freelancer.common.models.FreelancerAccountClosure;
import com.revolut.feature.freelancer.common.models.FreelancerAccountClosureState;
import com.revolut.feature.freelancer.common.models.FreelancerAccountDetails;
import com.revolut.feature.freelancer.common.models.FreelancerPermissions;
import com.revolut.feature.freelancer.common.models.FreelancerSettings;
import com.revolut.feature.freelancer.common.models.MerchantDisabledFeature;
import com.revolut.feature.freelancer.common.models.MerchantFeatureEnableStep;
import com.revolut.feature.freelancer.impl.network.models.j0;
import com.revolut.feature.freelancer.impl.network.models.p0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lr6.a0;
import lr6.b0;
import lr6.c0;
import lr6.e0;
import zhm.f0;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q06.d f137938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f137939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f137940c;
    public final Object d;
    public final Object e;
    public final Object f;

    public b(q06.d deeplinkParser) {
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        this.f137938a = deeplinkParser;
        this.f137939b = r0.k(new Pair("APPLE_PAY", a0.APPLE_PAY), new Pair("APPLE_TAP_TO_PAY", a0.APPLE_TAP_TO_PAY), new Pair("BANK_TRANSFER", a0.BANK_TRANSFER), new Pair("CARD", a0.CARD), new Pair("CARD_PRESENT", a0.CARD_PRESENT), new Pair("CLICK_TO_PAY", a0.CLICK_TO_PAY), new Pair("GOOGLE_PAY", a0.GOOGLE_PAY), new Pair("OPEN_BANKING", a0.OPEN_BANKING), new Pair("PAY_WITH_REVOLUT", a0.PAY_WITH_REVOLUT));
        this.f137940c = q0.c(new Pair("ANNUAL_INBOUND_VOLUME", c0.ANNUAL_INBOUND_VOLUME));
        this.d = r0.k(new Pair("ACQUIRING", b0.ACQUIRING), new Pair("OUTBOUND", b0.OUTBOUND));
        this.e = r0.k(new Pair("ACTIVE", lr6.v.ACTIVE), new Pair("INACTIVE", lr6.v.INACTIVE), new Pair("LOCKED", lr6.v.LOCKED), new Pair("DELETED", lr6.v.DELETED));
        this.f = r0.k(new Pair("ANNUAL_INBOUND_VOLUME_NOT_PROVIDED", e0.ANNUAL_INBOUND_VOLUME_NOT_PROVIDED), new Pair("MISSING_URL", e0.MISSING_URL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    public final FreelancerAccountDetails a(com.revolut.feature.freelancer.impl.network.models.b dto) {
        e0 e0Var;
        ?? arrayList;
        ?? arrayList2;
        ArrayList arrayList3;
        b0 b0Var;
        e0 e0Var2;
        String str;
        MerchantFeatureEnableStep action;
        MerchantDisabledFeature merchantDisabledFeature;
        c0 c0Var;
        e0 e0Var3;
        b0 b0Var2;
        a0 a0Var;
        e0 e0Var4;
        String str2 = "dto";
        Intrinsics.checkNotNullParameter(dto, "dto");
        p0 dto2 = dto.getSettings();
        Intrinsics.checkNotNullParameter(dto2, "dto");
        FreelancerSettings freelancerSettings = new FreelancerSettings(dto2.getUrl(), dto2.getBusinessModelDescription());
        j0 dto3 = dto.getPermissions();
        Intrinsics.checkNotNullParameter(dto3, "dto");
        boolean accountEligibility = dto3.getAccountEligibility();
        boolean withdrawing = dto3.getWithdrawing();
        boolean processing = dto3.getProcessing();
        String processingReason = dto3.getProcessingReason();
        if (processingReason != null) {
            e0[] e0VarArrValues = e0.values();
            int length = e0VarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    e0Var4 = null;
                    break;
                }
                e0Var4 = e0VarArrValues[i];
                if (kotlin.text.a0.z(e0Var4.name(), processingReason, true)) {
                    break;
                }
                i++;
            }
            e0Var = e0Var4;
        } else {
            e0Var = null;
        }
        FreelancerPermissions freelancerPermissions = new FreelancerPermissions(accountEligibility, withdrawing, processing, e0Var, dto3.getKym());
        List<String> eligiblePaymentMethods = dto.getEligiblePaymentMethods();
        if (eligiblePaymentMethods != null) {
            arrayList = new ArrayList();
            for (String str3 : eligiblePaymentMethods) {
                a0[] a0VarArrValues = a0.values();
                int length2 = a0VarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        a0Var = null;
                        break;
                    }
                    a0Var = a0VarArrValues[i2];
                    if (kotlin.text.a0.z(a0Var.name(), str3, true)) {
                        break;
                    }
                    i2++;
                }
                if (a0Var != null) {
                    arrayList.add(a0Var);
                }
            }
        } else {
            arrayList = f0.f322471a;
        }
        ?? r62 = arrayList;
        List<String> enabledFeatures = dto.getEnabledFeatures();
        if (enabledFeatures != null) {
            arrayList2 = new ArrayList();
            for (String str4 : enabledFeatures) {
                b0[] b0VarArrValues = b0.values();
                int length3 = b0VarArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length3) {
                        b0Var2 = null;
                        break;
                    }
                    b0Var2 = b0VarArrValues[i3];
                    if (kotlin.text.a0.z(b0Var2.name(), str4, true)) {
                        break;
                    }
                    i3++;
                }
                if (b0Var2 != null) {
                    arrayList2.add(b0Var2);
                }
            }
        } else {
            arrayList2 = f0.f322471a;
        }
        ?? r72 = arrayList2;
        List<com.revolut.feature.freelancer.impl.network.models.m> disabledFeatures = dto.getDisabledFeatures();
        if (disabledFeatures != null) {
            arrayList3 = new ArrayList();
            for (com.revolut.feature.freelancer.impl.network.models.m mVar : disabledFeatures) {
                Intrinsics.checkNotNullParameter(mVar, str2);
                String feature = mVar.getFeature();
                b0[] b0VarArrValues2 = b0.values();
                int length4 = b0VarArrValues2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length4) {
                        b0Var = null;
                        break;
                    }
                    b0 b0Var3 = b0VarArrValues2[i5];
                    if (kotlin.text.a0.z(b0Var3.name(), feature, true)) {
                        b0Var = b0Var3;
                        break;
                    }
                    i5++;
                }
                if (b0Var == null) {
                    str = str2;
                    merchantDisabledFeature = null;
                } else {
                    String reason = mVar.getReason();
                    if (reason != null) {
                        e0[] e0VarArrValues2 = e0.values();
                        int length5 = e0VarArrValues2.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length5) {
                                e0Var3 = null;
                                break;
                            }
                            e0Var3 = e0VarArrValues2[i6];
                            if (kotlin.text.a0.z(e0Var3.name(), reason, true)) {
                                break;
                            }
                            i6++;
                        }
                        e0Var2 = e0Var3;
                    } else {
                        e0Var2 = null;
                    }
                    com.revolut.feature.freelancer.impl.network.models.p enableStep = mVar.getEnableStep();
                    if (enableStep != null) {
                        Intrinsics.checkNotNullParameter(enableStep, str2);
                        String type = enableStep.getType();
                        if (Intrinsics.f(type, a.DEEP_LINK.a())) {
                            jf0.c cVarD = ((s06.c) this.f137938a).d(enableStep.getValue());
                            if (cVarD != null) {
                                action = new MerchantFeatureEnableStep.DeepLink(cVarD);
                                str = str2;
                            }
                        } else {
                            if (Intrinsics.f(type, a.ACTION.a())) {
                                String value = enableStep.getValue();
                                c0[] c0VarArrValues = c0.values();
                                int length6 = c0VarArrValues.length;
                                int i21 = 0;
                                while (true) {
                                    if (i21 >= length6) {
                                        str = str2;
                                        c0Var = null;
                                        break;
                                    }
                                    c0 c0Var2 = c0VarArrValues[i21];
                                    str = str2;
                                    if (kotlin.text.a0.z(c0Var2.name(), value, true)) {
                                        c0Var = c0Var2;
                                        break;
                                    }
                                    i21++;
                                    str2 = str;
                                }
                                if (c0Var != null) {
                                    action = new MerchantFeatureEnableStep.Action(c0Var);
                                }
                            }
                            action = null;
                        }
                        merchantDisabledFeature = new MerchantDisabledFeature(b0Var, e0Var2, action);
                    }
                    str = str2;
                    action = null;
                    merchantDisabledFeature = new MerchantDisabledFeature(b0Var, e0Var2, action);
                }
                if (merchantDisabledFeature != null) {
                    arrayList3.add(merchantDisabledFeature);
                }
                str2 = str;
            }
        } else {
            arrayList3 = null;
        }
        List list = arrayList3;
        if (arrayList3 == null) {
            list = f0.f322471a;
        }
        List list2 = list;
        com.revolut.feature.freelancer.impl.network.models.a accountClosure = dto.getAccountClosure();
        j0 permissionsDto = dto.getPermissions();
        Intrinsics.checkNotNullParameter(permissionsDto, "permissionsDto");
        return new FreelancerAccountDetails(freelancerSettings, freelancerPermissions, r62, r72, list2, new FreelancerAccountClosure(permissionsDto.getAccountEligibility() ? FreelancerAccountClosureState.NotClosed.f73268a : Intrinsics.f(accountClosure != null ? accountClosure.getReason() : null, "MANUALLY_CLOSED") ? FreelancerAccountClosureState.Closed.Manually.f73266a : FreelancerAccountClosureState.Closed.Unknown.f73267a));
    }
}
