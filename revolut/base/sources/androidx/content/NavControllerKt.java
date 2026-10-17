package androidx.content;

import android.content.Intent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"androidx/navigation/NavControllerKt__NavController_androidKt"}, d2 = {}, k = 4, mv = {2, 0, 0}, xi = 48)
public abstract class NavControllerKt {
    @NotNull
    public static final NavDeepLinkRequest NavDeepLinkRequest(@NotNull Intent intent) {
        return Intent.NavDeepLinkRequest(intent);
    }
}
