package u08;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.retail.toast.mediator.ToastViewAction;
import kotlin.jvm.internal.Intrinsics;
import mfm.f;
import pfm.h;
import rzc.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c70.a f276092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4l.a f276093b;

    public a(c70.a clipboard, d4l.a toastViewActionDispatcher) {
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(toastViewActionDispatcher, "toastViewActionDispatcher");
        this.f276092a = clipboard;
        this.f276093b = toastViewActionDispatcher;
    }

    public final pfm.a a(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        pfm.a aVarE = new h(new b(this, text, 21), 2).e(new pfm.a(this.f276093b.c0(new ToastViewAction.Show(new TextLocalisedClause(R$string.pets_common_action_copied_to_clipboard, null, null, 14))), f.f205044g, 1));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }
}
