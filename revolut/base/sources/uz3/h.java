package uz3;

import com.revolut.feature.credit.application.plugins.api.models.action_button.Action;
import com.revolut.feature.credit.application.plugins.api.models.action_button.Button;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class h {
    public static final Action a(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof c) {
            c cVar = (c) gVar;
            String deeplink = cVar.getDeeplink();
            g beforeAction = cVar.getBeforeAction();
            return new Action.Deeplink(deeplink, beforeAction != null ? a(beforeAction) : null);
        }
        if (gVar instanceof d) {
            d dVar = (d) gVar;
            String postRequestPath = dVar.getPostRequestPath();
            g beforeAction2 = dVar.getBeforeAction();
            return new Action.PostRequest(postRequestPath, beforeAction2 != null ? a(beforeAction2) : null);
        }
        if (gVar instanceof b) {
            g beforeAction3 = ((b) gVar).getBeforeAction();
            return new Action.Close(beforeAction3 != null ? a(beforeAction3) : null);
        }
        if (gVar instanceof e) {
            e eVar = (e) gVar;
            String postRequestPath2 = eVar.getPostRequestPath();
            g beforeAction4 = eVar.getBeforeAction();
            return new Action.ProceedApplication(postRequestPath2, beforeAction4 != null ? a(beforeAction4) : null);
        }
        if (gVar instanceof a) {
            g beforeAction5 = ((a) gVar).getBeforeAction();
            return new Action.Accept(beforeAction5 != null ? a(beforeAction5) : null);
        }
        if (!(gVar instanceof f)) {
            throw new NoWhenBranchMatchedException();
        }
        g beforeAction6 = ((f) gVar).getBeforeAction();
        return new Action.Upgrade(beforeAction6 != null ? a(beforeAction6) : null);
    }

    public static final Button b(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return new Button(iVar.getText(), a(iVar.getAction()));
    }
}
