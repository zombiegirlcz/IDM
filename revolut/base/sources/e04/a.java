package e04;

import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {
    public static final DropOutConfig.Action a(e eVar) {
        if (eVar instanceof c) {
            c cVar = (c) eVar;
            String deeplink = cVar.getDeeplink();
            e beforeAction = cVar.getBeforeAction();
            return new DropOutConfig.Action.Deeplink(deeplink, beforeAction != null ? a(beforeAction) : null);
        }
        if (eVar instanceof d) {
            d dVar = (d) eVar;
            String postRequestPath = dVar.getPostRequestPath();
            e beforeAction2 = dVar.getBeforeAction();
            return new DropOutConfig.Action.PostRequest(postRequestPath, beforeAction2 != null ? a(beforeAction2) : null);
        }
        if (!(eVar instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        e beforeAction3 = ((b) eVar).getBeforeAction();
        return new DropOutConfig.Action.Close(beforeAction3 != null ? a(beforeAction3) : null);
    }
}
