package androidx.content;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.navigation.NavControllerKt__NavController_androidKt, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/content/Intent;", "intent", "Landroidx/navigation/NavDeepLinkRequest;", "NavDeepLinkRequest", "(Landroid/content/Intent;)Landroidx/navigation/NavDeepLinkRequest;", "navigation-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/NavControllerKt")
abstract /* synthetic */ class Intent {
    @NotNull
    public static final NavDeepLinkRequest NavDeepLinkRequest(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return new NavDeepLinkRequest(intent.getData(), intent.getAction(), intent.getType());
    }
}
