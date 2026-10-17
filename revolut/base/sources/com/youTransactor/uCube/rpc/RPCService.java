package com.youTransactor.uCube.rpc;

import com.youTransactor.uCube.connexion.ConnectionService;
import defpackage.e;
import defpackage.k0;
import defpackage.n0;

/* JADX INFO: loaded from: classes17.dex */
public class RPCService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f107650a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static LostPacketListener f107651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static RPCCommunicationErrorListener f107652c;

    public static void enableRecoveryMechanism(boolean z) {
        e.a("enable recovery mechanism : " + z);
        f107650a = z;
    }

    public static byte getSequenceNumber() {
        n0 n0Var;
        synchronized (n0.class) {
            n0Var = n0.f;
        }
        return n0Var.d;
    }

    public static void init() {
        n0 n0Var;
        e.a("initialise RPC manager");
        synchronized (n0.class) {
            n0Var = n0.f;
        }
        n0Var.getClass();
        ConnectionService.getInstance().registerDisconnectListener(n0Var);
        ConnectionService.getInstance().registerResponseListener(n0Var);
    }

    public static boolean isRecoveryMechanismEnabled() {
        return f107650a;
    }

    public static void registerCommunicationErrorListener(RPCCommunicationErrorListener rPCCommunicationErrorListener) {
        f107652c = rPCCommunicationErrorListener;
    }

    public static void registerEventListener(EventListener eventListener) {
        n0 n0Var;
        e.a("Register Event callback");
        synchronized (n0.class) {
            n0Var = n0.f;
        }
        n0Var.getClass();
        n0Var.e = eventListener;
    }

    public static void registerLostPacketListener(LostPacketListener lostPacketListener) {
        f107651b = lostPacketListener;
    }

    public static void send(RPCCommand rPCCommand) {
        n0 n0Var;
        synchronized (n0.class) {
            n0Var = n0.f;
        }
        n0Var.c(rPCCommand);
    }

    public static void sendFirst(RPCCommand rPCCommand) {
        n0 n0Var;
        synchronized (n0.class) {
            n0Var = n0.f;
        }
        n0Var.d(rPCCommand);
    }

    public static void stop() {
        n0 n0Var;
        e.a("STOP RPC manager");
        synchronized (n0.class) {
            n0Var = n0.f;
        }
        synchronized (n0Var) {
            e.a("stop RPC Manager");
            k0 k0Var = n0Var.f210826a;
            RPCCommandStatus rPCCommandStatus = RPCCommandStatus.CANCELED;
            k0Var.c(rPCCommandStatus);
            n0Var.f210827b.b(rPCCommandStatus);
        }
    }

    public static void unregisterCommunicationErrorListener() {
        f107651b = null;
    }

    public static void unregisterLostPacketListener() {
        f107651b = null;
    }
}
