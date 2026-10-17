package com.youTransactor.uCube.rpc;

import com.youTransactor.uCube.AbstractTask;
import com.youTransactor.uCube.TaskEvent;
import defpackage.e;
import defpackage.n0;
import defpackage.u;
import defpackage.x0;
import java.util.Timer;

/* JADX INFO: loaded from: classes17.dex */
public class RPCCommand extends AbstractTask implements IRPCMessageHandler {
    public RPCCommandStatus d;
    public short e;
    public byte f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SecurityMode f107639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SecurityMode f107640h;
    public byte[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Timer f107641j;
    public x0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x0 f107642l;
    public RPCMessage response;

    public static class ResponseStatus {
        public short cmdStatus;
        public RPCState rpcState;

        public enum RPCState {
            ERROR,
            OKAY
        }

        public ResponseStatus(RPCState rPCState, short s2) {
            this.rpcState = rPCState;
            this.cmdStatus = s2;
        }
    }

    public RPCCommand() {
        this.e = (short) 0;
        SecurityMode securityMode = SecurityMode.NONE;
        this.f107639g = securityMode;
        this.f107640h = securityMode;
        this.f107641j = new Timer();
        this.k = new x0(this);
        this.f107642l = new x0(this);
        this.d = RPCCommandStatus.READY;
    }

    public final void a() {
        x0 x0Var = this.k;
        if (x0Var == null || x0Var.f301443b) {
            return;
        }
        e.a("cancel recovery mechanism command ID: 0x" + Integer.toHexString(this.e));
        this.k.a();
        Timer timer = this.f107641j;
        if (timer == null) {
            return;
        }
        timer.cancel();
        this.f107641j.purge();
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r5 = this;
            short r0 = r5.e
            r1 = 817(0x331, float:1.145E-42)
            if (r0 != r1) goto L9
            r0 = 3000(0xbb8, float:4.204E-42)
            goto L4b
        L9:
            r2 = 514(0x202, float:7.2E-43)
            if (r0 == r2) goto L49
            r2 = 20481(0x5001, float:2.87E-41)
            if (r0 == r2) goto L49
            r2 = 20483(0x5003, float:2.8703E-41)
            if (r0 == r2) goto L49
            r2 = 20544(0x5040, float:2.8788E-41)
            if (r0 == r2) goto L49
            r2 = 20576(0x5060, float:2.8833E-41)
            if (r0 == r2) goto L49
            r2 = 20738(0x5102, float:2.906E-41)
            if (r0 == r2) goto L49
            r2 = 20785(0x5131, float:2.9126E-41)
            if (r0 == r2) goto L49
            r2 = 21761(0x5501, float:3.0494E-41)
            if (r0 == r2) goto L49
            r2 = 21763(0x5503, float:3.0496E-41)
            if (r0 == r2) goto L49
            r2 = 769(0x301, float:1.078E-42)
            if (r0 == r2) goto L49
            r2 = 770(0x302, float:1.079E-42)
            if (r0 == r2) goto L49
            r2 = 816(0x330, float:1.143E-42)
            if (r0 == r2) goto L49
            if (r0 == r1) goto L49
            r1 = 20832(0x5160, float:2.9192E-41)
            if (r0 == r1) goto L49
            r1 = 20833(0x5161, float:2.9193E-41)
            if (r0 == r1) goto L49
            switch(r0) {
                case 20514: goto L49;
                case 20515: goto L49;
                case 20516: goto L49;
                case 20517: goto L49;
                case 20518: goto L49;
                default: goto L46;
            }
        L46:
            r0 = 9000(0x2328, float:1.2612E-41)
            goto L4b
        L49:
            r0 = 6000(0x1770, float:8.408E-42)
        L4b:
            java.lang.String r1 = "run recovery mechanism after "
            java.lang.String r2 = " ms command ID: 0x"
            java.lang.StringBuilder r1 = a0.d.w(r0, r1, r2)
            short r2 = r5.e
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.e.a(r1)
            java.util.Timer r1 = r5.f107641j     // Catch: java.lang.Throwable -> L6f
            r r2 = new r     // Catch: java.lang.Throwable -> L6f
            r3 = 0
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L6f
            long r3 = (long) r0     // Catch: java.lang.Throwable -> L6f
            r1.schedule(r2, r3)     // Catch: java.lang.Throwable -> L6f
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.youTransactor.uCube.rpc.RPCCommand.b():void");
    }

    public byte[] createPayload() {
        return new byte[0];
    }

    public short getCommandId() {
        return this.e;
    }

    public RPCCommandStatus getCommandStatusValue() {
        return RPCCommandStatus.SUCCESS;
    }

    public SecurityMode getInputSecurityMode() {
        return this.f107640h;
    }

    public SecurityMode getOutputSecurityMode() {
        return this.f107639g;
    }

    public byte[] getPayload() {
        if (this.i == null) {
            try {
                this.i = createPayload();
            } catch (Exception e) {
                e.b("create payload error", e);
                notifyMonitor(TaskEvent.FAILED, this);
            }
        }
        return this.i;
    }

    public byte[] getResponseBuffer() {
        RPCMessage rPCMessage = this.response;
        if (rPCMessage == null) {
            return null;
        }
        return rPCMessage.getBuffer();
    }

    public byte[] getResponseData() {
        RPCMessage rPCMessage = this.response;
        if (rPCMessage == null) {
            return null;
        }
        return rPCMessage.getData();
    }

    public ResponseStatus getResponseStatus() {
        RPCMessage rPCMessage = this.response;
        return rPCMessage == null ? new ResponseStatus(ResponseStatus.RPCState.ERROR, (short) 0) : new ResponseStatus(ResponseStatus.RPCState.OKAY, rPCMessage.getStatus());
    }

    public byte getSequenceNumber() {
        return this.f;
    }

    public synchronized RPCCommandStatus getState() {
        return this.d;
    }

    public boolean isValidResponse() {
        if (this.f107639g == SecurityMode.SIGNED_CIPHERED) {
            RPCMessage rPCMessage = this.response;
            return rPCMessage.i != 0 || rPCMessage.getStatus() == 0;
        }
        RPCMessage rPCMessage2 = this.response;
        return rPCMessage2 != null && rPCMessage2.getStatus() == 0;
    }

    public boolean parseResponse() {
        return true;
    }

    @Override // com.youTransactor.uCube.rpc.IRPCMessageHandler
    public void processMessage(RPCMessage rPCMessage) {
        this.response = rPCMessage;
        if (rPCMessage == null) {
            setState(RPCCommandStatus.FAILED);
            return;
        }
        if (rPCMessage.getStatus() == -28 || this.response.getStatus() == -32) {
            setState(RPCCommandStatus.CANCELED);
            return;
        }
        if (this.response.getStatus() == -401) {
            setState(RPCCommandStatus.SHUTTING_DOWN);
            return;
        }
        try {
            setState((isValidResponse() && parseResponse()) ? getCommandStatusValue() : RPCCommandStatus.FAILED);
        } catch (Exception e) {
            e.b("process message exception ", e);
            setState(RPCCommandStatus.FAILED);
        }
    }

    public void setCommandId(short s2) {
        this.e = s2;
    }

    public void setInputSecurityMode(SecurityMode securityMode) {
        this.f107640h = securityMode;
    }

    public void setOutputSecurityMode(SecurityMode securityMode) {
        this.f107639g = securityMode;
    }

    public void setPayload(byte[] bArr) {
        this.i = bArr;
    }

    public void setSequenceNumber(byte b4) {
        this.f = b4;
    }

    public synchronized void setState(RPCCommandStatus rPCCommandStatus) {
        try {
            if (rPCCommandStatus != this.d) {
                this.d = rPCCommandStatus;
                switch (u.f275996a[rPCCommandStatus.ordinal()]) {
                    case 1:
                        e.b("Run Lost packet recovery mechanism command ID: 0x" + Integer.toHexString(this.e), new Exception[0]);
                        this.f107642l.run();
                        return;
                    case 2:
                    case 3:
                        notifyMonitor(TaskEvent.FAILED, this);
                        return;
                    case 4:
                    case 5:
                        if (RPCService.isRecoveryMechanismEnabled()) {
                            a();
                        }
                        notifyMonitor(TaskEvent.FAILED, this);
                        return;
                    case 6:
                        if (RPCService.isRecoveryMechanismEnabled()) {
                            a();
                        }
                        notifyMonitor(TaskEvent.CANCELLED, this);
                        return;
                    case 7:
                        notifyMonitor(TaskEvent.SUCCESS, this);
                        return;
                    case 8:
                    case 9:
                        notifyMonitor(TaskEvent.PROGRESS, this, this.d);
                        return;
                    case 10:
                        if (RPCService.isRecoveryMechanismEnabled()) {
                            b();
                        }
                        notifyMonitor(TaskEvent.PROGRESS, this, this.d);
                        return;
                    case 11:
                        if (RPCService.isRecoveryMechanismEnabled()) {
                            a();
                        }
                        notifyMonitor(TaskEvent.PROGRESS, this, this.d);
                        return;
                }
            }
        } finally {
        }
    }

    @Override // com.youTransactor.uCube.AbstractTask
    public void start() {
        n0 n0Var;
        synchronized (n0.class) {
            n0Var = n0.f;
        }
        n0Var.c(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RPCCommand(short r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r0.<init>()
            r0.e = r1
            r4 = 817(0x331, float:1.145E-42)
            r5 = 816(0x330, float:1.143E-42)
            r6 = 770(0x302, float:1.079E-42)
            r7 = 769(0x301, float:1.078E-42)
            r8 = 21763(0x5503, float:3.0496E-41)
            r9 = 21761(0x5501, float:3.0494E-41)
            r10 = 20785(0x5131, float:2.9126E-41)
            r11 = 20738(0x5102, float:2.906E-41)
            r12 = 20576(0x5060, float:2.8833E-41)
            r13 = 20544(0x5040, float:2.8788E-41)
            r14 = 20483(0x5003, float:2.8703E-41)
            r15 = 20481(0x5001, float:2.87E-41)
            r2 = 514(0x202, float:7.2E-43)
            if (r1 != 0) goto L2b
            x0 r3 = new x0
            r3.<init>(r0)
            goto L5c
        L2b:
            if (r1 == r2) goto L56
            if (r1 == r15) goto L56
            if (r1 == r14) goto L56
            if (r1 == r13) goto L56
            if (r1 == r12) goto L56
            if (r1 == r11) goto L56
            if (r1 == r10) goto L56
            if (r1 == r9) goto L56
            if (r1 == r8) goto L56
            if (r1 == r7) goto L56
            if (r1 == r6) goto L56
            if (r1 == r5) goto L56
            if (r1 == r4) goto L56
            r3 = 20832(0x5160, float:2.9192E-41)
            if (r1 == r3) goto L56
            r3 = 20833(0x5161, float:2.9193E-41)
            if (r1 == r3) goto L56
            switch(r1) {
                case 20514: goto L56;
                case 20515: goto L56;
                case 20516: goto L56;
                case 20517: goto L56;
                case 20518: goto L56;
                default: goto L50;
            }
        L50:
            e0 r3 = new e0
            r3.<init>(r0)
            goto L5c
        L56:
            o r3 = new o
            r4 = 1
            r3.<init>(r0, r4)
        L5c:
            r0.k = r3
            if (r1 != 0) goto L66
            x0 r1 = new x0
            r1.<init>(r0)
            goto L9a
        L66:
            if (r1 == r2) goto L94
            if (r1 == r15) goto L94
            if (r1 == r14) goto L94
            if (r1 == r13) goto L94
            if (r1 == r12) goto L94
            if (r1 == r11) goto L94
            if (r1 == r10) goto L94
            if (r1 == r9) goto L94
            if (r1 == r8) goto L94
            if (r1 == r7) goto L94
            if (r1 == r6) goto L94
            if (r1 == r5) goto L94
            r2 = 817(0x331, float:1.145E-42)
            if (r1 == r2) goto L94
            r3 = 20832(0x5160, float:2.9192E-41)
            if (r1 == r3) goto L94
            r3 = 20833(0x5161, float:2.9193E-41)
            if (r1 == r3) goto L94
            switch(r1) {
                case 20514: goto L94;
                case 20515: goto L94;
                case 20516: goto L94;
                case 20517: goto L94;
                case 20518: goto L94;
                default: goto L8d;
            }
        L8d:
            o r1 = new o
            r2 = 2
            r1.<init>(r0, r2)
            goto L9a
        L94:
            o r1 = new o
            r2 = 0
            r1.<init>(r0, r2)
        L9a:
            r0.f107642l = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.youTransactor.uCube.rpc.RPCCommand.<init>(short):void");
    }

    public RPCCommand(short s2, SecurityMode securityMode, SecurityMode securityMode2) {
        this(s2);
        this.f107640h = securityMode;
        this.f107639g = securityMode2;
    }
}
