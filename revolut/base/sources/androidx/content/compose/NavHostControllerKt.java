package androidx.content.compose;

import androidx.compose.runtime.Composer;
import androidx.content.NavDestination;
import androidx.content.NavHostController;
import androidx.content.Navigator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"androidx/navigation/compose/NavHostControllerKt__NavHostController_androidKt"}, d2 = {}, k = 4, mv = {2, 0, 0}, xi = 48)
public abstract class NavHostControllerKt {
    @NotNull
    public static final NavHostController rememberNavController(@NotNull Navigator<? extends NavDestination>[] navigatorArr, Composer composer, int i) {
        return NavHostControllerKt__NavHostController_androidKt.rememberNavController(navigatorArr, composer, i);
    }
}
