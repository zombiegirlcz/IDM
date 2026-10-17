package com.youTransactor.uCube.api;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.youTransactor.uCube.BuildConfig;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.connexion.ConnectionService;
import com.youTransactor.uCube.connexion.IConnexionManager;
import com.youTransactor.uCube.connexion.SVPPRestartListener;
import com.youTransactor.uCube.log.ILogListener;
import com.youTransactor.uCube.log.ILogger;
import com.youTransactor.uCube.log.LogManager;
import com.youTransactor.uCube.mdm.BinaryUpdate;
import com.youTransactor.uCube.mdm.MDMServices;
import com.youTransactor.uCube.mdm.ServiceState;
import com.youTransactor.uCube.payment.PaymentContext;
import com.youTransactor.uCube.payment.PaymentService;
import com.youTransactor.uCube.payment.PaymentState;
import com.youTransactor.uCube.rpc.LostPacketListener;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCCommunicationErrorListener;
import com.youTransactor.uCube.rpc.RPCService;
import com.youTransactor.uCube.rpc.SecurityMode;
import defpackage.i;
import defpackage.k;
import defpackage.l1;
import defpackage.x;
import java.util.Hashtable;
import java.util.List;
import o28.g;
import o3m.a;
import o3m.b;

/* JADX INFO: loaded from: classes17.dex */
public class UCubeAPI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f107546a;

    public static /* synthetic */ void a(UCubeLibRpcSendListener uCubeLibRpcSendListener, RPCCommand rPCCommand, TaskEvent taskEvent, Object[] objArr) {
        int i = x.f301435a[taskEvent.ordinal()];
        if (i == 1) {
            uCubeLibRpcSendListener.onProgress(rPCCommand.getState());
            return;
        }
        if (i == 2 || i == 3) {
            uCubeLibRpcSendListener.onFinish(false, null);
        } else {
            if (i != 4) {
                return;
            }
            uCubeLibRpcSendListener.onFinish(true, rPCCommand.response.getBuffer());
        }
    }

    public static /* synthetic */ void b(UCubeLibMDMServiceListener uCubeLibMDMServiceListener, TaskEvent taskEvent, Object[] objArr) {
        int i = x.f301435a[taskEvent.ordinal()];
        if (i == 1) {
            uCubeLibMDMServiceListener.onProgress((ServiceState) objArr[0]);
            return;
        }
        if (i == 2 || i == 3) {
            uCubeLibMDMServiceListener.onFinish(false, new Object[0]);
        } else {
            if (i != 4) {
                return;
            }
            uCubeLibMDMServiceListener.onFinish(true, objArr[0]);
        }
    }

    public static /* synthetic */ void c(UCubeLibMDMServiceListener uCubeLibMDMServiceListener, TaskEvent taskEvent, Object[] objArr) {
        int i = x.f301435a[taskEvent.ordinal()];
        if (i == 1) {
            uCubeLibMDMServiceListener.onProgress((ServiceState) objArr[0]);
            return;
        }
        if (i == 2 || i == 3) {
            uCubeLibMDMServiceListener.onFinish(false, new Object[0]);
        } else {
            if (i != 4) {
                return;
            }
            uCubeLibMDMServiceListener.onFinish(true, new Object[0]);
        }
    }

    public static void close() {
        i.a("UCubeAPI close");
        RPCService.stop();
        ConnectionService.getInstance().close();
    }

    public static /* synthetic */ void d(UCubeLibMDMServiceListener uCubeLibMDMServiceListener, TaskEvent taskEvent, Object[] objArr) {
        int i = x.f301435a[taskEvent.ordinal()];
        if (i == 1) {
            uCubeLibMDMServiceListener.onProgress((ServiceState) objArr[0]);
            return;
        }
        if (i == 2 || i == 3) {
            uCubeLibMDMServiceListener.onFinish(false, new Object[0]);
        } else {
            if (i != 4) {
                return;
            }
            uCubeLibMDMServiceListener.onFinish(true, new Object[0]);
        }
    }

    public static /* synthetic */ void e(UCubeLibMDMServiceListener uCubeLibMDMServiceListener, TaskEvent taskEvent, Object[] objArr) {
        int i = x.f301435a[taskEvent.ordinal()];
        if (i == 1) {
            uCubeLibMDMServiceListener.onProgress((ServiceState) objArr[0]);
            return;
        }
        if (i == 2 || i == 3) {
            uCubeLibMDMServiceListener.onFinish(false, new Object[0]);
        } else {
            if (i != 4) {
                return;
            }
            uCubeLibMDMServiceListener.onFinish(true, new Object[0]);
        }
    }

    public static void enableLogs(boolean z) {
        i.a("enable Logs : " + z);
        LogManager.enableLogs(z);
    }

    public static void enableRecoveryMechanism(boolean z) {
        i.a("Recovery mechanism enabled: " + z);
        RPCService.enableRecoveryMechanism(z);
    }

    public static String getBuildType() {
        return "release";
    }

    public static IConnexionManager getConnexionManager() {
        return ConnectionService.getInstance();
    }

    public static Context getContext() {
        Context context = f107546a;
        if (context != null) {
            return context.getApplicationContext();
        }
        throw new ExceptionInInitializerError("UCubeAPI has not been initialized!");
    }

    public static int getCurrentSequenceNumber() {
        return RPCService.getSequenceNumber();
    }

    public static void getLocale(UCubeLibTaskListener uCubeLibTaskListener) {
        new l1(0).execute(new b(uCubeLibTaskListener, 0));
    }

    public static LogManager.LogLevel getLogLevel() {
        return LogManager.getLogLevel();
    }

    public static void getSupportedLocaleList(UCubeLibTaskListener uCubeLibTaskListener) {
        new l1(1).execute(new b(uCubeLibTaskListener, 2));
    }

    public static String getVersionName() {
        PackageManager packageManager;
        Context context = f107546a;
        if (context == null || (packageManager = context.getPackageManager()) == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(f107546a.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "Name Not found exception";
        }
    }

    public static void init(@NonNull Context context) {
        i.a("UCubeAPI init");
        f107546a = context.getApplicationContext();
    }

    public static boolean isLogsEnabled() {
        return LogManager.isEnabled();
    }

    public static boolean isMdmManagerReady() {
        return MDMServices.isReady();
    }

    public static boolean isRecoveryMechanismEnabled() {
        return RPCService.isRecoveryMechanismEnabled();
    }

    public static void mdmCheckUpdate(boolean z, boolean z3, UCubeLibMDMServiceListener uCubeLibMDMServiceListener) {
        i.a("check update :  forceUpdate : " + z + " checkOnlyFirmwareVersion : " + z3);
        MDMServices.mdmCheckUpdate(z, z3, new a(uCubeLibMDMServiceListener, 4));
    }

    public static void mdmGetConfig(UCubeLibMDMServiceListener uCubeLibMDMServiceListener) {
        i.a("Get Config");
        MDMServices.mdmGetConfig(new a(uCubeLibMDMServiceListener, 3));
    }

    public static void mdmRegister(UCubeLibMDMServiceListener uCubeLibMDMServiceListener) {
        i.a("Register");
        MDMServices.mdmRegister(getContext(), new a(uCubeLibMDMServiceListener, 0));
    }

    public static void mdmSendLogs(UCubeLibMDMServiceListener uCubeLibMDMServiceListener) {
        i.a("Send logs");
        MDMServices.mdmSendLogs(getContext(), new a(uCubeLibMDMServiceListener, 1));
    }

    public static void mdmSetup(@NonNull Context context) {
        i.a("Setup mdm manager");
        Hashtable<String, Object> hashtable = BuildConfig.PropertyPairs;
        MDMServices.changeServerUrl(context.getApplicationContext(), !hashtable.contains("server_url") ? "mdm-dev.youtransactor.com" : (String) hashtable.get("server_url"));
    }

    public static boolean mdmUnregister(@NonNull Context context) {
        return MDMServices.removeSSLCertificate(context.getApplicationContext());
    }

    public static void mdmUpdate(@NonNull List<BinaryUpdate> list, UCubeLibMDMServiceListener uCubeLibMDMServiceListener) {
        i.a("Start update");
        MDMServices.mdmUpdate(list, new a(uCubeLibMDMServiceListener, 2));
    }

    public static PaymentService pay(@NonNull UCubePaymentRequest uCubePaymentRequest, @NonNull UCubeLibPaymentServiceListener uCubeLibPaymentServiceListener) {
        i.a("Start pay");
        PaymentService paymentService = PaymentService.INSTANCE;
        paymentService.pay(uCubePaymentRequest, new g(uCubeLibPaymentServiceListener, 24));
        return paymentService;
    }

    public static void registerLogListener(ILogListener iLogListener) {
        LogManager.registerLogListener(iLogListener);
    }

    public static void registerLostPacketListener(LostPacketListener lostPacketListener) {
        RPCService.registerLostPacketListener(lostPacketListener);
    }

    public static void registerRPCCommunicationErrorListener(RPCCommunicationErrorListener rPCCommunicationErrorListener) {
        RPCService.registerCommunicationErrorListener(rPCCommunicationErrorListener);
    }

    public static void registerSVPPRestartListener(SVPPRestartListener sVPPRestartListener) {
        ConnectionService.getInstance().registerSVPPRestartListener(sVPPRestartListener);
    }

    public static void sendData(short s2, @NonNull byte[] bArr, SecurityMode securityMode, SecurityMode securityMode2, @NonNull UCubeLibRpcSendListener uCubeLibRpcSendListener) {
        RPCCommand rPCCommand = new RPCCommand(s2, securityMode, securityMode2);
        rPCCommand.setPayload(bArr);
        rPCCommand.execute(new kp0.b(uCubeLibRpcSendListener, rPCCommand, 21));
    }

    public static void setConnexionManagerType(@NonNull ConnectionService.ConnectionManagerType connectionManagerType) {
        i.a("Setup connexion manager");
        ConnectionService.getInstance().setConnectionManagerType(connectionManagerType);
        RPCService.init();
    }

    public static void setLocale(String str, UCubeLibTaskListener uCubeLibTaskListener) {
        new k(str).execute(new b(uCubeLibTaskListener, 1));
    }

    public static void setLogLevel(LogManager.LogLevel logLevel) {
        i.a("set Log level : " + logLevel);
        LogManager.setLogLevel(logLevel);
    }

    public static void setupLogger(ILogger iLogger) {
        i.a("Setup Log manager");
        LogManager.setLogger(iLogger);
    }

    public static void unregisterLogListener() {
        LogManager.registerLogListener(null);
    }

    public static void unregisterLostPacketListener() {
        RPCService.unregisterLostPacketListener();
    }

    public static void unregisterRPCCommunicationErrorListener() {
        RPCService.unregisterCommunicationErrorListener();
    }

    public static void unregisterSVPPRestartListener() {
        ConnectionService.getInstance().unregisterSVPPRestartListener();
    }

    public static /* synthetic */ void a(UCubeLibPaymentServiceListener uCubeLibPaymentServiceListener, TaskEvent taskEvent, Object[] objArr) {
        int i = x.f301435a[taskEvent.ordinal()];
        if (i == 1) {
            uCubeLibPaymentServiceListener.onProgress((PaymentState) objArr[0], (PaymentContext) objArr[1]);
        } else if (i == 2 || i == 3 || i == 4) {
            uCubeLibPaymentServiceListener.onFinish((PaymentContext) objArr[0]);
        }
    }

    public static /* synthetic */ void b(UCubeLibTaskListener uCubeLibTaskListener, TaskEvent taskEvent, Object[] objArr) {
        int i = x.f301435a[taskEvent.ordinal()];
        if (i == 2 || i == 3) {
            uCubeLibTaskListener.onFinish(false, new Object[0]);
        } else {
            if (i != 4) {
                return;
            }
            uCubeLibTaskListener.onFinish(true, objArr[0]);
        }
    }

    public static /* synthetic */ void c(UCubeLibTaskListener uCubeLibTaskListener, TaskEvent taskEvent, Object[] objArr) {
        int i = x.f301435a[taskEvent.ordinal()];
        if (i == 2 || i == 3) {
            uCubeLibTaskListener.onFinish(false, new Object[0]);
        } else {
            if (i != 4) {
                return;
            }
            uCubeLibTaskListener.onFinish(true, new Object[0]);
        }
    }

    public static /* synthetic */ void a(UCubeLibMDMServiceListener uCubeLibMDMServiceListener, TaskEvent taskEvent, Object[] objArr) {
        int i = x.f301435a[taskEvent.ordinal()];
        if (i == 1) {
            uCubeLibMDMServiceListener.onProgress((ServiceState) objArr[0]);
            return;
        }
        if (i == 2 || i == 3) {
            uCubeLibMDMServiceListener.onFinish(false, null, null);
        } else {
            if (i != 4) {
                return;
            }
            uCubeLibMDMServiceListener.onFinish(true, objArr[0], objArr[1]);
        }
    }

    public static /* synthetic */ void a(UCubeLibTaskListener uCubeLibTaskListener, TaskEvent taskEvent, Object[] objArr) {
        int i = x.f301435a[taskEvent.ordinal()];
        if (i == 2 || i == 3) {
            uCubeLibTaskListener.onFinish(false, new Object[0]);
        } else {
            if (i != 4) {
                return;
            }
            uCubeLibTaskListener.onFinish(true, objArr[0]);
        }
    }
}
