package ol;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.core.os.BundleKt;
import kotlin.Pair;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f226259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f226260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Messenger f226261c;

    public b(c cVar, String str, Messenger messenger) {
        this.f226259a = cVar;
        this.f226260b = str;
        this.f226261c = messenger;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        Messenger messenger = new Messenger(iBinder);
        this.f226259a.getClass();
        Message message = new Message();
        message.setData(BundleKt.bundleOf(new Pair("biometric_customer_user_hash", this.f226260b)));
        message.replyTo = this.f226261c;
        messenger.send(message);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
