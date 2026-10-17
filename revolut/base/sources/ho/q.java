package ho;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public abstract class q {
    public static final String a(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        if (nVar instanceof a) {
            return "ButtonClickEvent";
        }
        if (nVar instanceof b) {
            return "Deeplink";
        }
        if (nVar instanceof c) {
            return "Diagnostic";
        }
        if (nVar instanceof d) {
            return "ImpressionTracking";
        }
        if (nVar instanceof e) {
            return "intent";
        }
        if (nVar instanceof f) {
            return "Nudge";
        }
        if (nVar instanceof g) {
            return "PushNotification";
        }
        if (nVar instanceof h) {
            return "ScreenDisappear";
        }
        if (nVar instanceof i) {
            return "ScreenViewEvent";
        }
        if (nVar instanceof j) {
            return "ScreenshotCapture";
        }
        if (nVar instanceof k) {
            return "Search";
        }
        if (nVar instanceof l) {
            return "Settings";
        }
        if (nVar instanceof m) {
            return "ViewableRecordTracking";
        }
        if (!(nVar instanceof o)) {
            if (nVar instanceof p) {
                return ((p) nVar).f154190a;
            }
            throw new NoWhenBranchMatchedException();
        }
        o oVar = (o) nVar;
        return oVar.f154187a.name() + "->" + oVar.f154188b + "->" + oVar.f154189c;
    }
}
