package z6l;

import java.util.concurrent.CopyOnWriteArrayList;
import qc0.i1;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f319810b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f319809a = i;
        this.f319810b = obj2;
    }

    @Override // kfm.a
    public final void run() {
        int i = this.f319809a;
        Object obj2 = this.f319810b;
        switch (i) {
            case 0:
                ((s) obj2).f319830b.a();
                break;
            case 1:
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "BackendScreenPresenter", a0.d.m(obj2, "Unsupported NotificationCentreItemDelegate parcel = "), null, h0Var);
                break;
            case 2:
                ((nc0.f) ((i1) obj2)).a();
                break;
            case 3:
                ypi.i iVar = (ypi.i) obj2;
                iVar.t(ypi.b.f315913a);
                iVar.d(false);
                break;
            case 4:
                zh3.f fVar = (zh3.f) ((zh3.g) obj2).f322225a;
                fVar.f322224c.getValue(fVar, zh3.f.f[1]).set(Boolean.FALSE);
                break;
            default:
                ((zii.h) obj2).d0(false, false);
                break;
        }
    }
}
