package fs0;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.youTransactor.uCube.rpc.Constants;
import et0.w0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f137529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ty0.c f137530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fnk.o f137531c;
    public final List d;
    public Context e;
    public List f;

    public j(p textSelectionController, ty0.c clauseDisplayer, fnk.o onClick, List customItems) {
        Intrinsics.checkNotNullParameter(textSelectionController, "textSelectionController");
        Intrinsics.checkNotNullParameter(clauseDisplayer, "clauseDisplayer");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(customItems, "customItems");
        this.f137529a = textSelectionController;
        this.f137530b = clauseDisplayer;
        this.f137531c = onClick;
        this.d = customItems;
    }

    public final void a(Menu menu) {
        Context context = this.e;
        if (context == null) {
            return;
        }
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            pw0.b bVar = (pw0.b) list.get(i);
            menu.add(0, bVar.f240314a, bVar.f240316c, ty0.c.a(this.f137530b, bVar.f240315b, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        w0 w0Var;
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        p pVar = this.f137529a;
        if (itemId == 16908321) {
            Context context = this.e;
            if (context != null && (w0Var = pVar.f137538c) != null) {
                String string = w0Var.f129139b.subSequence(Math.min(w0Var.f129141g, w0Var.f129142h), Math.max(w0Var.f129141g, w0Var.f129142h)).toString();
                Object systemService = context.getSystemService("clipboard");
                Intrinsics.i(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, string));
            }
            mode.finish();
            return true;
        }
        List list = this.d;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (((pw0.b) list.get(i)).f240314a == item.getItemId()) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return false;
        }
        w0 w0Var2 = pVar.f137538c;
        String string2 = w0Var2 != null ? w0Var2.f129139b.subSequence(Math.min(w0Var2.f129141g, w0Var2.f129142h), Math.max(w0Var2.f129141g, w0Var2.f129142h)).toString() : "";
        w0 w0Var3 = pVar.f137538c;
        if (w0Var3 != null) {
            int iMin = Math.min(w0Var3.f129141g, w0Var3.f129142h);
            int iMax = Math.max(w0Var3.f129141g, w0Var3.f129142h);
            if (iMin == 0 && iMax == w0Var3.f129139b.length()) {
                z = true;
            }
        }
        this.f137531c.invoke(string2, Boolean.valueOf(z), Integer.valueOf(item.getItemId()));
        mode.finish();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode mode, Menu menu) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(menu, "menu");
        menu.add(0, R.id.copy, 5, R.string.copy);
        a(menu);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f137529a.g();
        this.e = null;
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode mode, View view, Rect outRect) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        w0 w0Var = this.f137529a.f137538c;
        if (w0Var == null) {
            super.onGetContentRect(mode, view, outRect);
            return;
        }
        int i = w0Var.f129141g;
        int i2 = w0Var.f129142h;
        if (i == -1 || i2 == -1) {
            super.onGetContentRect(mode, view, outRect);
            return;
        }
        Layout layout = w0Var.f129138a;
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int lineForOffset = layout.getLineForOffset(iMin);
        int lineForOffset2 = layout.getLineForOffset(iMax);
        float primaryHorizontal = layout.getPrimaryHorizontal(iMin);
        float primaryHorizontal2 = layout.getPrimaryHorizontal(iMax);
        int lineTop = layout.getLineTop(lineForOffset);
        int lineBottom = layout.getLineBottom(lineForOffset2);
        float scrollX = (w0Var.f129140c + w0Var.e) - view.getScrollX();
        float f = w0Var.d + w0Var.f;
        outRect.set((int) (Math.min(primaryHorizontal, primaryHorizontal2) + scrollX), (int) (lineTop + f), (int) (Math.max(primaryHorizontal, primaryHorizontal2) + scrollX), (int) (f + lineBottom));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(menu, "menu");
        List list = this.f;
        List list2 = this.d;
        if (list == list2) {
            return false;
        }
        this.f = list2;
        for (int size = menu.size() - 1; -1 < size; size--) {
            MenuItem item = menu.getItem(size);
            if (item.getItemId() != 16908321) {
                menu.removeItem(item.getItemId());
            }
        }
        a(menu);
        return true;
    }
}
