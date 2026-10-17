package com.revolut.core.ui_kit.delegates.chat;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.revolut.core.ui_kit.delegates.chat.ChatUncontainedMessageDelegate;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import java.util.List;
import koe.y;
import kotlin.jvm.internal.Intrinsics;
import kp0.c1;

/* JADX INFO: loaded from: classes19.dex */
public final class m implements ActionMode.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChatUncontainedMessageDelegate.ViewHolder f53982a;

    public m(ChatUncontainedMessageDelegate.ViewHolder viewHolder) {
        this.f53982a = viewHolder;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        ChatUncontainedMessageDelegate.ViewHolder viewHolder = this.f53982a;
        UIKitTextView uIKitTextView = viewHolder.f;
        Integer numValueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (numValueOf != null) {
            List list = viewHolder.f53924h;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                ((c1) list.get(i)).getClass();
                if (1 == numValueOf.intValue()) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                int iMin = Math.min(uIKitTextView.getSelectionStart(), uIKitTextView.getSelectionEnd());
                int iMax = Math.max(uIKitTextView.getSelectionStart(), uIKitTextView.getSelectionEnd());
                if (iMin != -1 && iMax != -1 && iMin != iMax) {
                    CharSequence text = uIKitTextView.getText();
                    Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                    String string = text.subSequence(iMin, iMax).toString();
                    boolean zF = Intrinsics.f(string, uIKitTextView.getText().toString());
                    y yVar = viewHolder.i;
                    if (yVar != null) {
                        yVar.invoke(numValueOf, string, Boolean.valueOf(zF));
                    }
                    if (actionMode != null) {
                        actionMode.finish();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        List list = this.f53982a.f53924h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c1 c1Var = (c1) list.get(i);
            if (menu != null) {
                c1Var.getClass();
                menu.add(0, 1, i, c1Var.f187982a);
            }
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }
}
