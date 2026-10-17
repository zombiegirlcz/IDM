package n2m;

import android.content.Intent;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u1m.q;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eki.f f211602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f211603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f211604c;
    public final ActivityResultLauncher d;

    public i(ComponentActivity activity, eki.f onActivityResult, Function0 function0) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onActivityResult, "onActivityResult");
        this.f211602a = onActivityResult;
        this.f211603b = function0;
        this.f211604c = new WeakReference(activity);
        this.d = activity.getActivityResultRegistry().register(j6.a.q("CoreEkycActivityLauncher:", String.valueOf((Object) 234000002)), activity, new ActivityResultContracts$StartActivityForResult(), new kp0.b(this, activity, 5));
    }

    public static void a(i iVar, ComponentActivity context, Class activityClass, q params, String processId) {
        iVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityClass, "activityClass");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(processId, "processId");
        h hVar = Companion;
        dam.q qVar = new dam.q(1, 2);
        hVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityClass, "activityClass");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(processId, "processId");
        Intent intent = new Intent(context, (Class<?>) activityClass).putExtra("params", params).putExtra("processId", processId);
        Intrinsics.checkNotNullExpressionValue(intent, "putExtra(...)");
        qVar.invoke(intent);
        Intrinsics.checkNotNullParameter(intent, "intent");
        iVar.f211603b.invoke();
        iVar.d.launch(intent);
    }
}
