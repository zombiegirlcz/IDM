package fgb;

import com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$SwitchAssistant;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lg0.g;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f135027a = y0.b("salary-switch-assistant/{path}");

    public static final class a {
        private a() {
        }
    }

    public static String b(lg0.e eVar) {
        String strA = g.a("requestId", eVar.f195041c);
        if (strA == null || d0.W(strA)) {
            return null;
        }
        return strA;
    }

    @Override // xii.b
    public final Set a() {
        return this.f135027a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        String strB;
        String strB2;
        String strB3;
        String strB4;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String str = (String) deeplink.f195040b.get("path");
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1822482064:
                if (str.equals("mark-as-completed") && (strB = b(deeplink)) != null) {
                    return new SalaryAccountDestination$SwitchAssistant(new SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.MarkCompleted(strB));
                }
                return null;
            case -1619458209:
                if (str.equals("start-over") && (strB2 = b(deeplink)) != null) {
                    return new SalaryAccountDestination$SwitchAssistant(new SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.StartOver(strB2));
                }
                return null;
            case -1156431699:
                if (str.equals("open-email-app")) {
                    return new SalaryAccountDestination$SwitchAssistant(SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.OpenEmailApp.f82958a);
                }
                return null;
            case -1067395272:
                if (str.equals("tracker")) {
                    return new SalaryAccountDestination$SwitchAssistant(SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.Tracker.f82962a);
                }
                return null;
            case -620801829:
                if (str.equals("send-again")) {
                    return new SalaryAccountDestination$SwitchAssistant(SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.PayrollManagerInput.f82959a);
                }
                return null;
            case 646773298:
                if (str.equals("send-follow-up") && (strB3 = b(deeplink)) != null) {
                    return new SalaryAccountDestination$SwitchAssistant(new SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.SendFollowUp(strB3));
                }
                return null;
            case 791741429:
                if (str.equals("enter-work-email") && (strB4 = b(deeplink)) != null) {
                    return new SalaryAccountDestination$SwitchAssistant(new SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.EnterWorkEmail(strB4));
                }
                return null;
            case 1136058401:
                if (str.equals("update-payroll")) {
                    return new SalaryAccountDestination$SwitchAssistant(SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.UpdatePayroll.f82963a);
                }
                return null;
            default:
                return null;
        }
    }
}
