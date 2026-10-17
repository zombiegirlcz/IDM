package iki;

import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h {
    public static final boolean a(ModalDestination.Style style) {
        if (style instanceof ModalDestination.Style.ExpandableBottomDialog) {
            return false;
        }
        if (style.equals(ModalDestination.Style.FULLSCREEN_FADE.f98307a) || style.equals(ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a) || style.equals(ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a) || style.equals(ModalDestination.Style.POPUP.f98311a) || style.equals(ModalDestination.Style.BOTTOM_DIALOG.f98301a) || style.equals(ModalDestination.Style.FullscreenPaged.f98310a) || (style instanceof ModalDestination.Style.ContextualAlert) || (style instanceof ModalDestination.Style.Custom)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
