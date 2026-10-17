package ka1;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public interface b {

    @NotNull
    public static final a Companion = a.f182366a;

    static BluetoothAdapter a(BluetoothManager bluetoothManager) {
        Companion.getClass();
        if (bluetoothManager != null) {
            return bluetoothManager.getAdapter();
        }
        return null;
    }

    static BluetoothManager b(Context context) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return (BluetoothManager) ContextCompat.getSystemService(context, BluetoothManager.class);
    }
}
