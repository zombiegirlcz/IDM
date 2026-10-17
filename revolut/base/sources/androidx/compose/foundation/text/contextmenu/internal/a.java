package androidx.compose.foundation.text.contextmenu.internal;

import android.content.Context;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7103c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f7101a = i;
        this.f7102b = obj2;
        this.f7103c = obj3;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f7101a) {
            case 0:
                return AndroidTextContextMenuToolbarProvider.TextActionModeCallbackImpl.updateMenuItems$lambda$0$0((TextContextMenuItem) this.f7102b, (AndroidTextContextMenuToolbarProvider.TextActionModeCallbackImpl) this.f7103c, menuItem);
            default:
                return TextToolbarHelperApi28.addLegacyMenuItem$lambda$0((Context) this.f7102b, (TextClassification) this.f7103c, menuItem);
        }
    }
}
