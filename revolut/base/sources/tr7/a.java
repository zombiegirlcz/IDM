package tr7;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_common.R$string;
import kotlin.jvm.internal.Intrinsics;
import rp0.g1;
import rp0.k1;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c70.a f273749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f273750b;

    public a(c70.a clipboard, g1 shotDialogDisplayer) {
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        this.f273749a = clipboard;
        this.f273750b = shotDialogDisplayer;
    }

    public static /* synthetic */ void b(a aVar, String str, TextLocalisedClause textLocalisedClause, int i) {
        if ((i & 4) != 0) {
            textLocalisedClause = new TextLocalisedClause(R$string.insurance_common_copied_to_clipboard, null, null, 14);
        }
        aVar.a(textLocalisedClause, str, false);
    }

    public final void a(Clause message, String text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f273749a.a(null, text, z);
        if (c70.a.g()) {
            return;
        }
        ((k1) this.f273750b).d(ShotDialogDisplayer$Configuration.Companion.e(ShotDialogDisplayer$Configuration.INSTANCE, "COPIED_TO_CLIPBOARD_ITEM", message, null, null, null, 60));
    }
}
