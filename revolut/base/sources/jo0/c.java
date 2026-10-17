package jo0;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {
    static {
        new LinkedList();
    }

    private c() {
    }

    public static void a(ShotDialogDisplayer$Configuration configuration, rgf.m showShot) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(showShot, "showShot");
        showShot.invoke(configuration);
    }
}
