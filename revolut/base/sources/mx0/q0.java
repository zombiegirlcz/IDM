package mx0;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q0 extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f209949a;

    public q0(p0 p0Var) {
        this.f209949a = p0Var;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(item, "item");
        mode.finish();
        int itemId = item.getItemId();
        p0 p0Var = this.f209949a;
        if (itemId == 0) {
            p0Var.getClipboardManager().setPrimaryClip(ClipData.newPlainText(null, p0Var.getTextForCopy()));
            return true;
        }
        if (itemId == 1) {
            ClipboardManager clipboardManager = p0Var.getClipboardManager();
            if (clipboardManager.hasPrimaryClip()) {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                Intrinsics.h(primaryClip);
                p0Var.getArithmeticDelegateCallback().g(primaryClip.getItemAt(0).getText().toString());
            }
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode mode, Menu menu) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.f209949a.I = mode;
        menu.add(0, 0, 0, R.string.copy);
        menu.add(0, 1, 0, R.string.paste);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        p0 p0Var = this.f209949a;
        if (Intrinsics.f(p0Var.I, mode)) {
            p0Var.I = null;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(menu, "menu");
        return false;
    }
}
