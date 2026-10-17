package sa1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import com.youTransactor.uCube.connexion.ScanError;
import com.youTransactor.uCube.connexion.ScanListener;
import com.youTransactor.uCube.connexion.UCubeDevice;
import fa1.a0;
import fa1.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements ScanListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f261235a;

    public p(q qVar) {
        this.f261235a = qVar;
    }

    @Override // com.youTransactor.uCube.connexion.ScanListener
    public final void onDeviceDiscovered(UCubeDevice uCubeDevice) {
        Intrinsics.checkNotNullParameter(uCubeDevice, "uCubeDevice");
        ea1.b.a("onDeviceDiscovered: " + uCubeDevice, fa1.k.INFO);
        q qVar = this.f261235a;
        Set set = qVar.f261241j;
        Intrinsics.checkNotNullParameter(uCubeDevice, "<this>");
        String name = uCubeDevice.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String address = uCubeDevice.getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
        set.add(new CardReaderDevice(name, address));
        qVar.f261240h.onNext(new a0(d0.d1(qVar.f261241j)));
    }

    @Override // com.youTransactor.uCube.connexion.ScanListener
    public final void onError(ScanError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        ea1.b.a(j6.a.q("Scan is failed, error=", error.name()), fa1.k.ERROR);
        this.f261235a.f261240h.onNext(z.a.b.f133228a);
    }

    @Override // com.youTransactor.uCube.connexion.ScanListener
    public final void onScanComplete(List discoveredUCubeDevices) {
        q qVar = this.f261235a;
        ihm.b bVar = qVar.f261240h;
        Intrinsics.checkNotNullParameter(discoveredUCubeDevices, "discoveredUCubeDevices");
        ea1.b.a("onScanComplete: discovered devices=" + discoveredUCubeDevices, fa1.k.INFO);
        List<UCubeDevice> list = discoveredUCubeDevices;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (UCubeDevice uCubeDevice : list) {
            Intrinsics.checkNotNullParameter(uCubeDevice, "<this>");
            String name = uCubeDevice.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            String address = uCubeDevice.getAddress();
            Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
            arrayList.add(new CardReaderDevice(name, address));
        }
        Set set = qVar.f261241j;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set) {
            if (arrayList.contains((CardReaderDevice) obj2)) {
                arrayList2.add(obj2);
            }
        }
        qVar.f261241j = d0.h1(arrayList2);
        bVar.onNext(new a0(arrayList2));
        bVar.onNext(z.a.C0782a.f133227a);
    }
}
