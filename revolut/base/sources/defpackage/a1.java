package defpackage;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import com.youTransactor.uCube.connexion.ScanListener;
import com.youTransactor.uCube.connexion.UCubeDevice;
import java.util.ArrayList;
import java.util.regex.Pattern;
import sz5.f;

/* JADX INFO: loaded from: classes21.dex */
public final class a1 extends ScanCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f443a;

    public a1(f fVar) {
        this.f443a = fVar;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i, ScanResult scanResult) {
        if (scanResult.getDevice().getName() == null) {
            return;
        }
        f fVar = this.f443a;
        ArrayList arrayList = (ArrayList) fVar.f266768g;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            if (((UCubeDevice) obj2).getAddress().equals(scanResult.getDevice().getAddress())) {
                return;
            }
        }
        Pattern pattern = (Pattern) fVar.f266767c;
        boolean zMatches = pattern != null ? pattern.matcher(scanResult.getDevice().getName()).matches() : true;
        if (((String) fVar.d) != null) {
            zMatches = scanResult.getDevice().getName().toLowerCase().contains(((String) fVar.d).toLowerCase());
        }
        if (zMatches) {
            t1.a("device : " + scanResult.getDevice().getName() + ": " + scanResult.getDevice().getAddress());
            UCubeDevice uCubeDevice = new UCubeDevice(scanResult.getDevice().getName(), scanResult.getDevice().getAddress(), scanResult.getRssi());
            ((ArrayList) fVar.f266768g).add(uCubeDevice);
            ScanListener scanListener = (ScanListener) fVar.e;
            if (scanListener != null) {
                scanListener.onDeviceDiscovered(uCubeDevice);
            }
        }
    }
}
