package androidx.glance.appwidget.action;

import android.content.Intent;
import android.os.Bundle;
import androidx.glance.action.ActionParameters;
import androidx.glance.action.StartActivityAction;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/glance/appwidget/action/StartActivityIntentAction;", "Landroidx/glance/action/StartActivityAction;", "intent", "Landroid/content/Intent;", "parameters", "Landroidx/glance/action/ActionParameters;", "activityOptions", "Landroid/os/Bundle;", "(Landroid/content/Intent;Landroidx/glance/action/ActionParameters;Landroid/os/Bundle;)V", "getActivityOptions", "()Landroid/os/Bundle;", "getIntent", "()Landroid/content/Intent;", "getParameters", "()Landroidx/glance/action/ActionParameters;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StartActivityIntentAction implements StartActivityAction {
    private final Bundle activityOptions;

    @NotNull
    private final Intent intent;

    @NotNull
    private final ActionParameters parameters;

    public StartActivityIntentAction(@NotNull Intent intent, @NotNull ActionParameters actionParameters, Bundle bundle) {
        this.intent = intent;
        this.parameters = actionParameters;
        this.activityOptions = bundle;
    }

    @Override // androidx.glance.action.StartActivityAction
    public Bundle getActivityOptions() {
        return this.activityOptions;
    }

    @NotNull
    public final Intent getIntent() {
        return this.intent;
    }

    @Override // androidx.glance.action.StartActivityAction
    @NotNull
    public ActionParameters getParameters() {
        return this.parameters;
    }
}
