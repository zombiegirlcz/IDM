package bbl;

import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    @NotNull
    private static final C0093a Companion = new C0093a();

    /* JADX INFO: renamed from: bbl.a$a, reason: collision with other inner class name */
    public static final class C0093a {
        private C0093a() {
        }
    }

    public static LargeActionButton.ButtonStyle.DefaultFilledButton a(gal.a aVar) {
        int i = aVar == null ? -1 : b.f14350a[aVar.ordinal()];
        if (i != -1 && i != 1) {
            if (i == 2) {
                return LargeActionButton.ButtonStyle.f58726b;
            }
            throw new NoWhenBranchMatchedException();
        }
        return LargeActionButton.ButtonStyle.f58725a;
    }
}
