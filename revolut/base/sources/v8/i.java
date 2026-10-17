package v8;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes16.dex */
public final class i implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        j jVar = (j) message.obj;
        jVar.d.m(jVar);
        return true;
    }
}
