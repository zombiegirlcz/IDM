package defpackage;

import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.rpc.DeviceInfos;
import com.youTransactor.uCube.rpc.command.InstallForLoadKeyCommand;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes22.dex */
public final class o1 extends p {
    public final /* synthetic */ int J = 0;

    public /* synthetic */ o1() {
    }

    @Override // com.youTransactor.uCube.AbstractTask
    public final void start() {
        switch (this.J) {
            case 0:
                InstallForLoadKeyCommand installForLoadKeyCommand = new InstallForLoadKeyCommand();
                installForLoadKeyCommand.execute(new e1(this, installForLoadKeyCommand, 8));
                return;
            default:
                HttpURLConnection httpURLConnection = null;
                try {
                    try {
                        n nVar = n.e;
                        HttpURLConnection httpURLConnectionA = nVar.a("private-api.", "/v3/dongle/checkState", "POST");
                        String serial = this.H.getSerial();
                        int i = s1.f259031a[nVar.f210814a.ordinal()];
                        if (i == 1) {
                            serial = this.H.getPartNumber();
                        } else if (i == 2 || i == 3) {
                            serial = this.H.getSerial();
                        }
                        v1.a("device : " + serial + " with terminal id type : " + nVar.f210814a);
                        httpURLConnectionA.setRequestProperty("Content-Type", "application/octet-stream");
                        httpURLConnectionA.setRequestProperty("x-device-id", serial);
                        httpURLConnectionA.setRequestProperty("x-id-type", nVar.f210814a.getName());
                        httpURLConnectionA.getOutputStream().write(this.H.getTlv());
                        int responseCode = httpURLConnectionA.getResponseCode();
                        this.I = responseCode;
                        if (responseCode == 200) {
                            notifyMonitor(TaskEvent.SUCCESS, new Object[0]);
                        } else {
                            v1.a("check state WS error: " + this.I);
                            notifyMonitor(TaskEvent.FAILED, new Object[0]);
                        }
                        httpURLConnectionA.disconnect();
                        return;
                    } catch (Exception e) {
                        v1.b("check state WS error", e);
                        notifyMonitor(TaskEvent.FAILED, new Object[0]);
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th10) {
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    throw th10;
                }
        }
    }

    public /* synthetic */ o1(DeviceInfos deviceInfos) {
        super(deviceInfos);
    }
}
