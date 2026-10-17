package bqi;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17840b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f17839a = i;
        this.f17840b = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f17839a) {
            case 0:
                ((c) this.f17840b).f17842j = null;
                break;
            case 1:
                rp0.d dVar = (rp0.d) this.f17840b;
                AlertDialog alertDialog = dVar.f256059b;
                if (alertDialog != null) {
                    jh.d.f(dVar.f256058a).n0().c(alertDialog);
                }
                break;
            case 2:
                tyl.d dVar2 = (tyl.d) this.f17840b;
                ni1.a aVar = dVar2.f275725h;
                if (aVar != null) {
                    aVar.invoke();
                }
                dVar2.f275728m.d();
                break;
            default:
                ((yyl.c) this.f17840b).f.invoke();
                break;
        }
    }
}
