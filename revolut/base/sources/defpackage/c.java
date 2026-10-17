package defpackage;

import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.mdm.Config;
import com.youTransactor.uCube.rpc.DeviceInfos;
import d8l.d;
import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.security.KeyStore;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends p {
    public final /* synthetic */ int J;
    public Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(DeviceInfos deviceInfos) {
        super(deviceInfos);
        this.J = 1;
    }

    @Override // com.youTransactor.uCube.AbstractTask
    public final void start() {
        HttpURLConnection httpURLConnectionA;
        int responseCode;
        switch (this.J) {
            case 0:
                HttpURLConnection httpURLConnection = null;
                try {
                    try {
                        n nVar = n.e;
                        httpURLConnectionA = nVar.a("public-api.", "/public/v3/dongle/logs/?type=zip", "POST");
                        String serial = this.H.getSerial();
                        int i = w1.f293776a[nVar.f210814a.ordinal()];
                        if (i == 1) {
                            serial = this.H.getPartNumber();
                        } else if (i == 2 || i == 3) {
                            serial = this.H.getSerial();
                        }
                        v1.a("device : " + serial + " with terminal id type : " + nVar.f210814a);
                        httpURLConnectionA.setRequestProperty("Content-Type", "application/octet-stream");
                        httpURLConnectionA.setRequestProperty("x-device-id", serial);
                        httpURLConnectionA.setRequestProperty("x-id-type", nVar.f210814a.getName());
                        tmm.c.b((FileInputStream) this.K, httpURLConnectionA.getOutputStream());
                        responseCode = httpURLConnectionA.getResponseCode();
                        this.I = responseCode;
                    } catch (Exception e) {
                        v1.b("\"send logs WS error", e);
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                    }
                    if (responseCode != 200 && responseCode != 201) {
                        v1.a("send logs WS error: " + this.I);
                        httpURLConnectionA.disconnect();
                        notifyMonitor(TaskEvent.FAILED, this);
                        return;
                    }
                    notifyMonitor(TaskEvent.SUCCESS, new Object[0]);
                    httpURLConnectionA.disconnect();
                    return;
                } catch (Throwable th10) {
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    throw th10;
                }
            case 1:
                HttpURLConnection httpURLConnection2 = null;
                try {
                    try {
                        n nVar2 = n.e;
                        HttpURLConnection httpURLConnectionA2 = nVar2.a("private-api.", "/v3/dongle/config/", "GET");
                        String serial2 = this.H.getSerial();
                        int i2 = w0.f293585a[nVar2.f210814a.ordinal()];
                        if (i2 == 1) {
                            serial2 = this.H.getPartNumber();
                        } else if (i2 == 2 || i2 == 3) {
                            serial2 = this.H.getSerial();
                        }
                        v1.a("device : " + serial2 + " with terminal id type : " + nVar2.f210814a);
                        httpURLConnectionA2.setRequestProperty("x-device-id", serial2);
                        httpURLConnectionA2.setRequestProperty("x-id-type", nVar2.f210814a.getName());
                        int responseCode2 = httpURLConnectionA2.getResponseCode();
                        this.I = responseCode2;
                        if (responseCode2 == 200) {
                            String strD = tmm.c.d(httpURLConnectionA2.getInputStream());
                            v1.a("result config server: " + strD);
                            List<Config> listFromJson = Config.fromJson(new JSONObject(strD));
                            this.K = listFromJson;
                            if (listFromJson == null) {
                                notifyMonitor(TaskEvent.FAILED, new Object[0]);
                                httpURLConnectionA2.disconnect();
                                return;
                            }
                        } else {
                            v1.a("config WS error: " + this.I);
                        }
                        httpURLConnectionA2.disconnect();
                        notifyMonitor(TaskEvent.SUCCESS, (List) this.K);
                        return;
                    } catch (Throwable th11) {
                        if (0 != 0) {
                            httpURLConnection2.disconnect();
                        }
                        throw th11;
                    }
                } catch (Exception e2) {
                    v1.b("config WS error", e2);
                    notifyMonitor(TaskEvent.FAILED, new Object[0]);
                    if (0 != 0) {
                        httpURLConnection2.disconnect();
                        return;
                    }
                    return;
                }
            default:
                HttpURLConnection httpURLConnection3 = null;
                try {
                    try {
                        n nVar3 = n.e;
                        HttpURLConnection httpURLConnectionA3 = nVar3.a("public-api.", "/public/v1/dongle/register", "POST");
                        String serial3 = this.H.getSerial();
                        int i3 = g1.f139503a[nVar3.f210814a.ordinal()];
                        if (i3 == 1) {
                            serial3 = this.H.getPartNumber();
                        } else if (i3 == 2 || i3 == 3) {
                            serial3 = this.H.getSerial();
                        }
                        v1.a("register for device : " + serial3 + " with terminal id type : " + nVar3.f210814a);
                        httpURLConnectionA3.setRequestProperty("Content-Type", "application/octet-stream");
                        httpURLConnectionA3.setRequestProperty("x-device-id", serial3);
                        httpURLConnectionA3.setRequestProperty("x-id-type", nVar3.f210814a.getName());
                        httpURLConnectionA3.getOutputStream().write((byte[]) this.K);
                        int responseCode3 = httpURLConnectionA3.getResponseCode();
                        this.I = responseCode3;
                        if (responseCode3 == 200 || responseCode3 == 201) {
                            String strD2 = tmm.c.d(httpURLConnectionA3.getInputStream());
                            v1.a("result register: " + strD2);
                            KeyStore keyStoreC = d.c(strD2, n.f);
                            if (keyStoreC == null) {
                                v1.b("register WS Error! Certificate null", new Exception[0]);
                                notifyMonitor(TaskEvent.FAILED, new Object[0]);
                            } else {
                                v1.a("register WS Success");
                                notifyMonitor(TaskEvent.SUCCESS, keyStoreC);
                            }
                        } else {
                            v1.b("register WS error: " + this.I, new Exception[0]);
                            notifyMonitor(TaskEvent.FAILED, this);
                        }
                        httpURLConnectionA3.disconnect();
                        return;
                    } catch (Exception e4) {
                        v1.b("register WS error", e4);
                        notifyMonitor(TaskEvent.FAILED, this);
                        if (0 != 0) {
                            httpURLConnection3.disconnect();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th12) {
                    if (0 != 0) {
                        httpURLConnection3.disconnect();
                    }
                    throw th12;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(DeviceInfos deviceInfos, Object obj2, int i) {
        super(deviceInfos);
        this.J = i;
        this.K = obj2;
    }
}
