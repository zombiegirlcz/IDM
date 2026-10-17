package z7c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.revolut.feature.revolutpay.impl.external.service.IsReadyToPayService;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends Binder implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IsReadyToPayService f319956a;

    public b(IsReadyToPayService isReadyToPayService) {
        this.f319956a = isReadyToPayService;
        attachInterface(this, "org.chromium.IsReadyToPayService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        jnm.a aVar;
        jnm.a callback;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("org.chromium.IsReadyToPayService");
        }
        if (i == 1598968902) {
            parcel2.writeString("org.chromium.IsReadyToPayService");
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            callback = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("org.chromium.IsReadyToPayServiceCallback");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof jnm.a)) {
                aVar = new jnm.a();
                aVar.f176818a = strongBinder;
            } else {
                aVar = (jnm.a) iInterfaceQueryLocalInterface;
            }
            callback = aVar;
        }
        Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
        Intrinsics.checkNotNullParameter(callback, "callback");
        int callingUid = Binder.getCallingUid();
        IsReadyToPayService isReadyToPayService = this.f319956a;
        String[] packagesForUid = isReadyToPayService.getPackageManager().getPackagesForUid(callingUid);
        if (packagesForUid == null) {
            packagesForUid = new String[0];
        }
        e0.C(isReadyToPayService.f84464c, null, null, new a(callback, isReadyToPayService, bundle, d.y0(packagesForUid), null), 3);
        return true;
    }
}
