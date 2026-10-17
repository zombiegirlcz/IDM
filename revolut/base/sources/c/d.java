package c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d extends Binder implements e {
    public static e asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(e.d);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof e)) {
            return (e) iInterfaceQueryLocalInterface;
        }
        c cVar = new c();
        cVar.f20073a = iBinder;
        return cVar;
    }
}
