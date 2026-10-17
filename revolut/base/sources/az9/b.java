package az9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.send_from_clipboard.api.R$string;
import com.revolut.feature.payments.send_from_clipboard.api.SendFromClipboardApi$Toggles$TransferFromClipboard;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements ty9.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f11407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c70.a f11408b;

    public b(gte.a featureToggleInteractor, c70.a clipboard) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        this.f11407a = featureToggleInteractor;
        this.f11408b = clipboard;
    }

    public final RowDelegate.Model b(int i, int i2) {
        Object objA;
        c70.a aVar = this.f11408b;
        if (!this.f11407a.a(SendFromClipboardApi$Toggles$TransferFromClipboard.f79687c)) {
            try {
                m.Companion companion = m.INSTANCE;
                objA = Boolean.valueOf(aVar.f("text/plain") || aVar.f("text/html"));
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            Object obj2 = Boolean.FALSE;
            if (objA instanceof n) {
                objA = obj2;
            }
            if (((Boolean) objA).booleanValue()) {
                RowDelegate.Model model = new RowDelegate.Model("ITEM_SEND_FROM_CLIPBOARD", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_clipboard, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextLocalisedClause(R$string.pay_with_clipboard_cell_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.pay_with_clipboard_cell_subtitle, null, null, 14), null, null, 0, null, true, null, false, null, null, null, null, null, null, ty9.a.f275531a, null, 0, 0, 0, 0, 532674520);
                yp0.b.l(model, i, i2, 0, 0, null, false, 60);
                return model;
            }
        }
        return null;
    }
}
