package rq0;

import android.view.View;
import com.revolut.core.ui_kit.internal.delegates.chat.ChatAttachmentHorizontalItemDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import et0.o;
import h30.l;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f256436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChatAttachmentHorizontalItemDelegate f256437c;
    public final /* synthetic */ ChatAttachmentHorizontalItemDelegate.Model d;

    public /* synthetic */ c(ChatAttachmentHorizontalItemDelegate.Model model, ChatAttachmentHorizontalItemDelegate chatAttachmentHorizontalItemDelegate, ChatAttachmentHorizontalItemDelegate.Model model2, int i) {
        this.f256435a = i;
        this.f256436b = model;
        this.f256437c = chatAttachmentHorizontalItemDelegate;
        this.d = model2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f256435a) {
            case 0:
                l.w(view, view).a(view, this.f256436b, null);
                o oVar = this.f256437c.f55850c;
                if (oVar != null) {
                    oVar.invoke(this.d.f55852b);
                }
                break;
            default:
                l.w(view, view).a(view, this.f256436b, null);
                o oVar2 = this.f256437c.d;
                if (oVar2 != null) {
                    oVar2.invoke(this.d.f55852b);
                }
                break;
        }
    }
}
