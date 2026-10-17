package ma1;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.location.LocationManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f203874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BluetoothAdapter f203875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationManager f203876c;
    public final y80.a d;

    public e(Context context, BluetoothAdapter bluetoothAdapter, LocationManager locationManager, y80.a permissionProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        this.f203874a = context;
        this.f203875b = bluetoothAdapter;
        this.f203876c = locationManager;
        this.d = permissionProvider;
    }
}
