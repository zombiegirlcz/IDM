package com.youTransactor.uCube.mdm;

import android.content.Context;
import androidx.annotation.NonNull;
import com.youTransactor.uCube.ITaskMonitor;
import defpackage.a;
import defpackage.c1;
import defpackage.n;
import defpackage.q0;
import defpackage.u0;
import defpackage.u1;
import defpackage.v1;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class MDMServices {
    public static final String DEFAULT_URL = "mdm-dev.youtransactor.com";

    public static void changeServerUrl(Context context, String str) {
        n nVar = n.e;
        Context applicationContext = context.getApplicationContext();
        nVar.getClass();
        v1.a("setup server url: " + str);
        nVar.f210815b = str;
        nVar.b(applicationContext);
    }

    public static void changeTerminalIdType(TerminalIdType terminalIdType) {
        n nVar = n.e;
        nVar.getClass();
        v1.a("setup Terminal id type : " + terminalIdType.getName());
        nVar.f210814a = terminalIdType;
    }

    public static boolean isReady() {
        return n.e.d;
    }

    public static void mdmCheckUpdate(boolean z, boolean z3, @NonNull ITaskMonitor iTaskMonitor) {
        a aVar = new a();
        aVar.J = z;
        aVar.K = z3;
        aVar.execute(iTaskMonitor);
    }

    public static void mdmGetConfig(@NonNull ITaskMonitor iTaskMonitor) {
        new q0().execute(iTaskMonitor);
    }

    public static void mdmRegister(Context context, @NonNull ITaskMonitor iTaskMonitor) {
        new c1(context).execute(iTaskMonitor);
    }

    public static void mdmSendLogs(Context context, @NonNull ITaskMonitor iTaskMonitor) {
        new u1(context).execute(iTaskMonitor);
    }

    public static void mdmUpdate(List<BinaryUpdate> list, @NonNull ITaskMonitor iTaskMonitor) {
        u0 u0Var = new u0();
        u0Var.M = false;
        u0Var.I = list;
        u0Var.execute(iTaskMonitor);
    }

    public static boolean removeSSLCertificate(Context context) {
        n nVar = n.e;
        Context applicationContext = context.getApplicationContext();
        nVar.getClass();
        try {
            File fileStreamPath = applicationContext.getFileStreamPath("keystore_client.jks");
            if (!fileStreamPath.exists() || fileStreamPath.delete()) {
                nVar.b(applicationContext);
                return !nVar.d;
            }
            v1.b("Error to delete Device SSL Certificate", new Exception[0]);
            return false;
        } catch (Exception e) {
            v1.b("Remove dongle certificate fail ", e);
            return false;
        }
    }
}
