package qh4;

import com.revolut.feature.credit.application.plugins.api.models.rollee.RolleeSession;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeScreen;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements mc4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RolleeScreen f246473a;

    public r(RolleeScreen rolleeScreen) {
        this.f246473a = rolleeScreen;
    }

    @Override // mc4.a
    public final void b(String str) {
        if (str == null) {
            str = "";
        }
        if (kotlin.text.a0.y(str, "rollee_script_v2.html", false) || kotlin.text.a0.y(str, "success_test_rollee_script_v2.html", false) || kotlin.text.a0.y(str, "failure_test_rollee_script_v2.html", false) || kotlin.text.a0.y(str, "rollee_script_v4.html", false)) {
            RolleeScreen rolleeScreen = this.f246473a;
            s sVar = (s) ((j2) rolleeScreen.R2().f246454r.f22677a).getValue();
            RolleeSession rolleeSession = sVar.f246474a;
            String str2 = rolleeSession.f66498a;
            String str3 = rolleeSession.f66499b;
            od0.a aVar = od0.a.f224253a;
            boolean z = !od0.a.g();
            boolean z3 = sVar.f246475b;
            boolean zG = od0.a.g();
            String str4 = z3 ? "dark" : "light";
            StringBuilder sbM = v0.a.m("\n            javascript:initRollee(\"", str2, "\", \"", str3, "\", \"");
            sbM.append(str4);
            sbM.append("\", ");
            sbM.append(z);
            sbM.append(", ");
            sbM.append(zG);
            sbM.append(")\n        ");
            rolleeScreen.f3().evaluateJavascript(kotlin.text.t.e(sbM.toString()), null);
        }
    }
}
