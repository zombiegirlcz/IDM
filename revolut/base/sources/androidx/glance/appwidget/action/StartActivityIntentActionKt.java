package androidx.glance.appwidget.action;

import android.content.Intent;
import androidx.glance.action.Action;
import androidx.glance.action.ActionParameters;
import androidx.glance.action.ActionParametersKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Intent;", "intent", "Landroidx/glance/action/ActionParameters;", "parameters", "Landroidx/glance/action/Action;", "actionStartActivity", "(Landroid/content/Intent;Landroidx/glance/action/ActionParameters;)Landroidx/glance/action/Action;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class StartActivityIntentActionKt {
    @NotNull
    public static final Action actionStartActivity(@NotNull Intent intent, @NotNull ActionParameters actionParameters) {
        return new StartActivityIntentAction(intent, actionParameters, null);
    }

    public static /* synthetic */ Action actionStartActivity$default(Intent intent, ActionParameters actionParameters, int i, Object obj2) {
        if ((i & 2) != 0) {
            actionParameters = ActionParametersKt.actionParametersOf(new ActionParameters.Pair[0]);
        }
        return actionStartActivity(intent, actionParameters);
    }
}
