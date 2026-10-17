package x74;

import android.content.Intent;
import com.revolut.retail.core.navigation.FinishCommand;
import fsi.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends c {

    @NotNull
    public static final a Companion = new a();
    public static final fsi.b i = new fsi.b("CREDIT_CANCEL_APPLICATION_ACTIVITY_DELEGATE");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ln.a f303142h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ln.a navigationCommandsDispatcher) {
        super(i);
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        this.f303142h = navigationCommandsDispatcher;
    }

    @Override // fsi.a
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i3 == -1 && i2 == 4213) {
            this.f303142h.b(new FinishCommand(null, null, null, 7));
        }
    }
}
