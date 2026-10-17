package defpackage;

import com.youTransactor.uCube.AbstractTask;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.mdm.BinaryUpdate;
import com.youTransactor.uCube.mdm.Config;
import com.youTransactor.uCube.rpc.DeviceInfos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p.a;
import ymm.g;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends AbstractTask {
    public final DeviceInfos H;
    public final List I;
    public ArrayList J;
    public boolean K;
    public boolean L;

    public d(DeviceInfos deviceInfos, List list) {
        this.H = deviceInfos;
        this.I = list;
    }

    public static int b(int[] iArr, int[] iArr2) {
        v1.a("current : " + Arrays.toString(iArr));
        v1.a("expected : " + Arrays.toString(iArr2));
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
        }
        return 0;
    }

    public static int[] d(String str) {
        if (g.c(str)) {
            return null;
        }
        try {
            int[] iArr = new int[4];
            String[] strArrSplit = str.split("\\.");
            int length = strArrSplit.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                iArr[i2] = Integer.valueOf(strArrSplit[i]).intValue();
                i++;
                i2 = i3;
            }
            return iArr;
        } catch (Exception e) {
            v1.b(a.p("invalid binary version: '", str, "'"), e);
            return null;
        }
    }

    public final ArrayList c() {
        DeviceInfos deviceInfos;
        int iB;
        if (this.J == null) {
            this.J = new ArrayList();
            List<Config> list = this.I;
            if (list != null && (deviceInfos = this.H) != null) {
                for (Config config : list) {
                    if (!this.K || config.getType() == 0 || config.getType() == 7) {
                        int type = config.getType();
                        int[] iArrD = type != 0 ? type != 7 ? type != 4 ? type != 5 ? type != 11 ? type != 12 ? null : d(deviceInfos.getBleFirmwareVersion()) : d(deviceInfos.getResourcesVersion()) : d(deviceInfos.getNfcEmvConfigVersion()) : d(deviceInfos.getIccEmvConfigVersion()) : d(deviceInfos.getPCISecuVersion()) : d(deviceInfos.getSvppFirmware());
                        if (iArrD == null) {
                            this.J.add(new BinaryUpdate(config, true));
                        } else if (config.getCurrentVersion() != null && (iB = b(iArrD, d(config.getCurrentVersion()))) <= 0 && (iB != 0 || this.L)) {
                            if (config.getMinVersion() != null) {
                                this.J.add(new BinaryUpdate(config, b(iArrD, d(config.getMinVersion())) < 0));
                            }
                        }
                    }
                }
            }
        }
        return this.J;
    }

    @Override // com.youTransactor.uCube.AbstractTask
    public final void start() {
        notifyMonitor(TaskEvent.SUCCESS, c());
    }
}
