package rq0;

import android.view.View;
import com.revolut.core.ui_kit.internal.delegates.chat.ChatAttachmentMediaItemDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import et0.o;
import h30.l;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f256445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChatAttachmentMediaItemDelegate f256446c;
    public final /* synthetic */ ChatAttachmentMediaItemDelegate.Model d;

    public /* synthetic */ g(ChatAttachmentMediaItemDelegate.Model model, ChatAttachmentMediaItemDelegate chatAttachmentMediaItemDelegate, ChatAttachmentMediaItemDelegate.Model model2, int i) {
        this.f256444a = i;
        this.f256445b = model;
        this.f256446c = chatAttachmentMediaItemDelegate;
        this.d = model2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f256444a) {
            case 0:
                l.w(view, view).a(view, this.f256445b, null);
                o oVar = this.f256446c.f55859c;
                if (oVar != null) {
                    oVar.invoke(this.d.f55861b);
                }
                break;
            default:
                l.w(view, view).a(view, this.f256445b, null);
                o oVar2 = this.f256446c.d;
                if (oVar2 != null) {
                    oVar2.invoke(this.d.f55861b);
                }
                break;
        }
    }
}
