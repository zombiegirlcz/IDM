package p8;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes16.dex */
public final class f implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f233800a;

    public f(g gVar) {
        this.f233800a = gVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        g gVar = this.f233800a;
        if (i == 1) {
            gVar.h((d) message.obj);
            return true;
        }
        if (i != 2) {
            return false;
        }
        gVar.d.m((d) message.obj);
        return false;
    }
}
