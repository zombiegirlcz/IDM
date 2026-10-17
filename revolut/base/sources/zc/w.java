package zc;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes16.dex */
public abstract class w extends pc.d implements x {
    public static x l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return iInterfaceQueryLocalInterface instanceof x ? (x) iInterfaceQueryLocalInterface : new v(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }
}
