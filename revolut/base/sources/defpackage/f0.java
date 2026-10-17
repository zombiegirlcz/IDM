package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.youTransactor.uCube.ITaskCancelListener;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TLV;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.payment.PaymentContext;
import com.youTransactor.uCube.payment.PaymentState;
import com.youTransactor.uCube.payment.PaymentStatus;
import com.youTransactor.uCube.rpc.CardReaderType;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.DeviceInfos;
import com.youTransactor.uCube.rpc.EMVApplicationDescriptor;
import com.youTransactor.uCube.rpc.Event;
import com.youTransactor.uCube.rpc.EventListener;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCCommandStatus;
import com.youTransactor.uCube.rpc.command.BuildCandidateListCommand;
import com.youTransactor.uCube.rpc.command.CompleteNFCTransactionCommand;
import com.youTransactor.uCube.rpc.command.DisplayChoiceCommand;
import com.youTransactor.uCube.rpc.command.EnterSecureSessionCommand;
import com.youTransactor.uCube.rpc.command.GetInfosCommand;
import com.youTransactor.uCube.rpc.command.GetPlainTagCommand;
import com.youTransactor.uCube.rpc.command.GetSecuredTagCommand;
import com.youTransactor.uCube.rpc.command.InitTransactionCommand;
import com.youTransactor.uCube.rpc.command.SimplifiedOnlinePINCommand;
import com.youTransactor.uCube.rpc.command.StartNFCTransactionCommand;
import com.youTransactor.uCube.rpc.command.TransactionFinalizationCommand;
import com.youTransactor.uCube.rpc.command.TransactionProcessCommand;
import fp0.l;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p.a;
import ymm.g;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class f0 implements ITaskMonitor, EventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f130986b;

    public /* synthetic */ f0(h0 h0Var, int i) {
        this.f130985a = i;
        this.f130986b = h0Var;
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public void handleEvent(TaskEvent taskEvent, Object[] objArr) {
        ITaskCancelListener iTaskCancelListener;
        ITaskCancelListener iTaskCancelListener2;
        ITaskCancelListener iTaskCancelListener3;
        int[] iArr;
        ITaskCancelListener iTaskCancelListener4;
        ITaskCancelListener iTaskCancelListener5;
        ITaskCancelListener iTaskCancelListener6;
        ITaskCancelListener iTaskCancelListener7;
        ITaskCancelListener iTaskCancelListener8;
        ITaskCancelListener iTaskCancelListener9;
        switch (this.f130985a) {
            case 0:
                h0 h0Var = this.f130986b;
                h0Var.getClass();
                b.a("cancel all command event  : " + taskEvent);
                int i = b0.f11495b[taskEvent.ordinal()];
                if (i == 3) {
                    ITaskCancelListener iTaskCancelListener10 = h0Var.Q;
                    if (iTaskCancelListener10 != null) {
                        iTaskCancelListener10.onCancelFinish(false);
                        h0Var.Q = null;
                    }
                    if (RPCCommandStatus.SHUTTING_DOWN.equals(((RPCCommand) objArr[0]).getState())) {
                        b.a("device shutting down");
                        PaymentContext paymentContext = h0Var.I;
                        paymentContext.paymentStatus = PaymentStatus.ERROR_SHUTTING_DOWN;
                        h0Var.notifyMonitor(TaskEvent.SUCCESS, paymentContext);
                    }
                    break;
                } else if (i == 4) {
                    h0Var.f107543b = false;
                    ITaskCancelListener iTaskCancelListener11 = h0Var.Q;
                    if (iTaskCancelListener11 != null) {
                        iTaskCancelListener11.onCancelFinish(true);
                        h0Var.Q = null;
                    }
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    h0Var.c(PaymentStatus.CANCELLED);
                    break;
                }
                break;
            case 1:
                h0 h0Var2 = this.f130986b;
                h0Var2.getClass();
                int i2 = b0.f11495b[taskEvent.ordinal()];
                if (i2 == 2) {
                    if (h0Var2.f107542a && (iTaskCancelListener = h0Var2.Q) != null) {
                        iTaskCancelListener.onCancelFinish(true);
                        h0Var2.Q = null;
                    }
                    h0Var2.c(PaymentStatus.CANCELLED);
                    break;
                } else if (i2 == 3) {
                    RPCCommandStatus state = ((RPCCommand) objArr[0]).getState();
                    if (RPCCommandStatus.SHUTTING_DOWN.equals(state)) {
                        b.a("device shutting down");
                        if (h0Var2.f107542a && (iTaskCancelListener3 = h0Var2.Q) != null) {
                            iTaskCancelListener3.onCancelFinish(false);
                            h0Var2.Q = null;
                        }
                        PaymentContext paymentContext2 = h0Var2.I;
                        paymentContext2.paymentStatus = PaymentStatus.ERROR_SHUTTING_DOWN;
                        h0Var2.notifyMonitor(TaskEvent.SUCCESS, paymentContext2);
                        break;
                    } else if (!RPCCommandStatus.DISCONNECT.equals(state)) {
                        if (!h0Var2.f107542a) {
                            h0Var2.c(PaymentStatus.ERROR);
                        } else {
                            b.a("Cancel was Requested");
                            ITaskCancelListener iTaskCancelListener12 = h0Var2.Q;
                            if (iTaskCancelListener12 != null) {
                                iTaskCancelListener12.onCancelFinish(true);
                                h0Var2.Q = null;
                            }
                            h0Var2.c(PaymentStatus.CANCELLED);
                        }
                        break;
                    } else {
                        b.a("device disconnected");
                        if (h0Var2.f107542a && (iTaskCancelListener2 = h0Var2.Q) != null) {
                            iTaskCancelListener2.onCancelFinish(false);
                            h0Var2.Q = null;
                            break;
                        }
                    }
                } else if (i2 == 4) {
                    h0Var2.I.tagF5 = ((GetInfosCommand) objArr[0]).response.getBuffer();
                    if (!h0Var2.f107542a) {
                        ITaskCancelListener iTaskCancelListener13 = h0Var2.Q;
                        if (iTaskCancelListener13 != null) {
                            iTaskCancelListener13.onCancelFinish(false);
                            h0Var2.Q = null;
                        }
                        h0Var2.c(PaymentStatus.CARD_WAIT_FAILED);
                    } else {
                        b.a("Cancel was Requested");
                        ITaskCancelListener iTaskCancelListener14 = h0Var2.Q;
                        if (iTaskCancelListener14 != null) {
                            iTaskCancelListener14.onCancelFinish(true);
                            h0Var2.Q = null;
                        }
                        h0Var2.c(PaymentStatus.CANCELLED);
                    }
                    break;
                }
                break;
            case 2:
                h0 h0Var3 = this.f130986b;
                h0Var3.getClass();
                int i3 = b0.f11495b[taskEvent.ordinal()];
                if (i3 == 2) {
                    h0Var3.c(PaymentStatus.CANCELLED);
                    break;
                } else if (i3 == 3) {
                    h0Var3.d(((RPCCommand) objArr[0]).getState());
                    break;
                } else if (i3 == 4) {
                    h0Var3.j(PaymentState.START_TRANSACTION);
                    break;
                }
                break;
            case 3:
                h0 h0Var4 = this.f130986b;
                h0Var4.getClass();
                int i5 = b0.f11495b[taskEvent.ordinal()];
                if (i5 == 2) {
                    h0Var4.f(PaymentStatus.CANCELLED);
                    break;
                } else if (i5 == 3) {
                    h0Var4.d(((RPCCommand) objArr[0]).getState());
                    break;
                } else if (i5 == 4) {
                    h0Var4.I.sredKsn = ((EnterSecureSessionCommand) objArr[0]).getKsn();
                    h0Var4.j(PaymentState.KSN_AVAILABLE);
                    break;
                }
                break;
            case 4:
                h0 h0Var5 = this.f130986b;
                h0Var5.getClass();
                int i6 = b0.f11495b[taskEvent.ordinal()];
                if (i6 == 2) {
                    h0Var5.f(PaymentStatus.CANCELLED);
                    break;
                } else {
                    boolean z = false;
                    if (i6 == 3) {
                        RPCCommandStatus state2 = ((RPCCommand) objArr[0]).getState();
                        if (RPCCommandStatus.SHUTTING_DOWN.equals(state2)) {
                            b.a("device shutting down");
                            PaymentContext paymentContext3 = h0Var5.I;
                            paymentContext3.paymentStatus = PaymentStatus.ERROR_SHUTTING_DOWN;
                            h0Var5.notifyMonitor(TaskEvent.SUCCESS, paymentContext3);
                            break;
                        } else if (!RPCCommandStatus.DISCONNECT.equals(state2)) {
                            h0Var5.j(PaymentState.ENTER_SECURE_SESSION);
                            break;
                        }
                    } else if (i6 == 4) {
                        h0Var5.I.uCubeInfos = ((GetInfosCommand) objArr[0]).getResponseData();
                        DeviceInfos deviceInfos = new DeviceInfos(((GetInfosCommand) objArr[0]).getResponseData());
                        if (deviceInfos.getSvppFirmware() != null) {
                            String svppFirmware = deviceInfos.getSvppFirmware();
                            if (g.c(svppFirmware)) {
                                iArr = null;
                            } else {
                                try {
                                    iArr = new int[4];
                                    String[] strArrSplit = svppFirmware.split("\\.");
                                    int length = strArrSplit.length;
                                    int i21 = 0;
                                    int i22 = 0;
                                    while (i21 < length) {
                                        int i32 = i22 + 1;
                                        iArr[i22] = Integer.valueOf(strArrSplit[i21]).intValue();
                                        i21++;
                                        i22 = i32;
                                    }
                                } catch (Exception e2) {
                                    b.b(a.p("invalid binary version: '", svppFirmware, "'"), e2);
                                    iArr = null;
                                }
                            }
                            if (iArr != null) {
                                int[] iArr2 = {6, 0, 10, 28};
                                b.a("compare : " + Arrays.toString(iArr) + " to : " + Arrays.toString(iArr2));
                                int i33 = 0;
                                while (true) {
                                    if (i33 < 4) {
                                        int i43 = iArr[i33];
                                        int i59 = iArr2[i33];
                                        if (i43 < i59) {
                                            z = true;
                                        } else if (i43 <= i59) {
                                            i33++;
                                        }
                                    }
                                }
                                h0Var5.S = z;
                                b.a("FW is old version : " + h0Var5.S);
                                h0Var5.j(PaymentState.ENTER_SECURE_SESSION);
                            } else {
                                h0Var5.j(PaymentState.ENTER_SECURE_SESSION);
                            }
                        } else {
                            h0Var5.j(PaymentState.ENTER_SECURE_SESSION);
                        }
                        break;
                    }
                }
                break;
            case 5:
                h0 h0Var6 = this.f130986b;
                h0Var6.getClass();
                int i66 = b0.f11495b[taskEvent.ordinal()];
                if (i66 == 2) {
                    h0Var6.f(PaymentStatus.CANCELLED);
                    break;
                } else if (i66 == 3) {
                    RPCCommandStatus state3 = ((RPCCommand) objArr[0]).getState();
                    if (RPCCommandStatus.SHUTTING_DOWN.equals(state3)) {
                        b.a("device shutting down");
                        PaymentContext paymentContext4 = h0Var6.I;
                        paymentContext4.paymentStatus = PaymentStatus.ERROR_SHUTTING_DOWN;
                        h0Var6.notifyMonitor(TaskEvent.SUCCESS, paymentContext4);
                        break;
                    } else if (!RPCCommandStatus.DISCONNECT.equals(state3)) {
                        h0Var6.f(PaymentStatus.ERROR);
                        break;
                    }
                } else if (i66 == 4) {
                    h0Var6.j(PaymentState.GET_INFO);
                    break;
                }
                break;
            case 6:
                int i74 = b0.f11495b[taskEvent.ordinal()];
                h0 h0Var7 = this.f130986b;
                if (i74 != 2) {
                    if (i74 == 3) {
                        RPCCommandStatus state4 = ((RPCCommand) objArr[0]).getState();
                        if (RPCCommandStatus.SHUTTING_DOWN.equals(state4)) {
                            b.a("device shutting down");
                            PaymentContext paymentContext5 = h0Var7.I;
                            paymentContext5.paymentStatus = PaymentStatus.ERROR_SHUTTING_DOWN;
                            h0Var7.notifyMonitor(TaskEvent.SUCCESS, paymentContext5);
                            break;
                        } else if (RPCCommandStatus.DISCONNECT.equals(state4)) {
                        }
                    } else if (i74 != 4) {
                    }
                }
                new Handler(Looper.getMainLooper()).postDelayed(new l(h0Var7, 16), 100L);
                break;
            case 7:
                h0 h0Var8 = this.f130986b;
                h0Var8.getClass();
                int i92 = b0.f11495b[taskEvent.ordinal()];
                if (i92 == 2) {
                    h0Var8.c(PaymentStatus.CANCELLED);
                    break;
                } else if (i92 == 3) {
                    h0Var8.d(((RPCCommand) objArr[0]).getState());
                    break;
                } else if (i92 == 4) {
                    h0Var8.I.transactionFinalisationData = ((TransactionFinalizationCommand) objArr[0]).response.getBuffer();
                    short s2 = ((TransactionFinalizationCommand) objArr[0]).getResponseStatus().cmdStatus;
                    if (s2 == 7) {
                        h0Var8.c(PaymentStatus.APPROVED);
                    } else if (s2 == 8) {
                        h0Var8.c(PaymentStatus.DECLINED);
                    } else {
                        h0Var8.c(PaymentStatus.ERROR);
                    }
                    break;
                }
                break;
            case 8:
                h0 h0Var9 = this.f130986b;
                h0Var9.getClass();
                int i96 = b0.f11495b[taskEvent.ordinal()];
                if (i96 == 2) {
                    h0Var9.c(PaymentStatus.CANCELLED);
                    break;
                } else if (i96 == 3) {
                    h0Var9.c(PaymentStatus.ERROR);
                    break;
                } else if (i96 == 4) {
                    h0Var9.I.authorizationResponse = h0Var9.L.getAuthorizationResponse();
                    h0Var9.e(PaymentState.SMC_FINALIZE_TRANSACTION);
                    break;
                }
                break;
            case 9:
                h0 h0Var10 = this.f130986b;
                h0Var10.getClass();
                int i99 = b0.f11495b[taskEvent.ordinal()];
                if (i99 == 2) {
                    h0Var10.c(PaymentStatus.CANCELLED);
                    break;
                } else if (i99 == 3) {
                    h0Var10.d(((RPCCommand) objArr[0]).getState());
                    break;
                } else if (i99 == 4) {
                    h0Var10.I.authorizationSecuredTagsValues = ((GetSecuredTagCommand) objArr[0]).getResponseBuffer();
                    h0Var10.e(PaymentState.AUTHORIZATION);
                    break;
                }
                break;
            case 10:
                h0 h0Var11 = this.f130986b;
                h0Var11.getClass();
                int i100 = b0.f11495b[taskEvent.ordinal()];
                if (i100 == 2) {
                    h0Var11.c(PaymentStatus.CANCELLED);
                    break;
                } else if (i100 == 3) {
                    TransactionProcessCommand transactionProcessCommand = (TransactionProcessCommand) objArr[0];
                    RPCCommandStatus state5 = transactionProcessCommand.getState();
                    if (RPCCommandStatus.SHUTTING_DOWN.equals(state5)) {
                        b.a("device shutting down");
                        PaymentContext paymentContext6 = h0Var11.I;
                        paymentContext6.paymentStatus = PaymentStatus.ERROR_SHUTTING_DOWN;
                        h0Var11.notifyMonitor(TaskEvent.SUCCESS, paymentContext6);
                        break;
                    } else if (!RPCCommandStatus.DISCONNECT.equals(state5)) {
                        RPCCommand.ResponseStatus responseStatus = transactionProcessCommand.getResponseStatus();
                        if (responseStatus.rpcState == RPCCommand.ResponseStatus.RPCState.OKAY) {
                            h0Var11.c(responseStatus.cmdStatus == -301 ? PaymentStatus.REFUSED_CARD : PaymentStatus.ERROR);
                        } else {
                            h0Var11.c(PaymentStatus.ERROR);
                        }
                        break;
                    }
                } else if (i100 == 4) {
                    h0Var11.I.transactionProcessData = ((TransactionProcessCommand) objArr[0]).getResponseBuffer();
                    h0Var11.I.authorizationGetPlainTagsResponse = ((TransactionProcessCommand) objArr[0]).getResponseBuffer();
                    h0Var11.I.authorizationPlainTagsValues = ((TransactionProcessCommand) objArr[0]).getTagsTLV();
                    Map<Integer, byte[]> map = TLV.parse(((TransactionProcessCommand) objArr[0]).getResponseData());
                    h0Var11.I.onlinePinBlock = map.get(Integer.valueOf(Constants.TAG_PIN_BLOCK));
                    h0Var11.I.pinKsn = map.get(Integer.valueOf(Constants.TAG_PIN_KSN));
                    byte[] bArr = map.get(40743);
                    if (bArr != null) {
                        byte b4 = bArr[0];
                        if (b4 == -128) {
                            b.a("ARQC, Go online");
                            if (h0Var11.I.authorizationSecuredTags != null) {
                                h0Var11.e(PaymentState.SMC_GET_AUTHORIZATION_SECURED_TAGS);
                            } else {
                                h0Var11.e(PaymentState.AUTHORIZATION);
                            }
                        } else if (b4 == 0) {
                            b.a("AAC, offline declined");
                            h0Var11.c(PaymentStatus.DECLINED);
                        } else if (b4 == 64) {
                            b.a("TC, Approved");
                            h0Var11.c(PaymentStatus.APPROVED);
                        } else {
                            b.b("ERROR! wrong value", new Exception[0]);
                            h0Var11.c(PaymentStatus.ERROR_WRONG_CRYPTOGRAM_VALUE);
                        }
                    } else {
                        b.b("ERROR! MISSING REQUIRED 0X9F27 cryptogram data", new Exception[0]);
                        h0Var11.c(PaymentStatus.ERROR_MISSING_REQUIRED_CRYPTOGRAM);
                    }
                    break;
                }
                break;
            case 11:
                h0 h0Var12 = this.f130986b;
                h0Var12.getClass();
                int i101 = b0.f11495b[taskEvent.ordinal()];
                if (i101 == 2) {
                    h0Var12.c(PaymentStatus.CANCELLED);
                    break;
                } else if (i101 == 3) {
                    h0Var12.c(PaymentStatus.ERROR);
                    break;
                } else if (i101 == 4) {
                    h0Var12.e(PaymentState.SMC_PROCESS_TRANSACTION);
                    break;
                }
                break;
            case 12:
                h0 h0Var13 = this.f130986b;
                h0Var13.getClass();
                int i102 = b0.f11495b[taskEvent.ordinal()];
                if (i102 == 2) {
                    h0Var13.c(PaymentStatus.CANCELLED);
                    break;
                } else if (i102 == 3) {
                    RPCCommandStatus state6 = ((RPCCommand) objArr[0]).getState();
                    if (RPCCommandStatus.SHUTTING_DOWN.equals(state6)) {
                        b.a("device shutting down");
                        PaymentContext paymentContext7 = h0Var13.I;
                        paymentContext7.paymentStatus = PaymentStatus.ERROR_SHUTTING_DOWN;
                        h0Var13.notifyMonitor(TaskEvent.SUCCESS, paymentContext7);
                        break;
                    } else if (!RPCCommandStatus.DISCONNECT.equals(state6)) {
                        h0Var13.M.remove(h0Var13.O);
                        h0Var13.e(PaymentState.SMC_SELECT_APPLICATION);
                        break;
                    }
                } else if (i102 == 4) {
                    h0Var13.I.transactionInitData = ((InitTransactionCommand) objArr[0]).response.getBuffer();
                    h0Var13.I.selectedApplication = h0Var13.O;
                    if (h0Var13.K != null) {
                        h0Var13.e(PaymentState.SMC_RISK_MANAGEMENT);
                    } else {
                        h0Var13.e(PaymentState.SMC_PROCESS_TRANSACTION);
                    }
                    break;
                }
                break;
            case 13:
                h0 h0Var14 = this.f130986b;
                h0Var14.getClass();
                int i103 = b0.f11495b[taskEvent.ordinal()];
                if (i103 == 2) {
                    if (h0Var14.f107542a && (iTaskCancelListener4 = h0Var14.Q) != null) {
                        iTaskCancelListener4.onCancelFinish(true);
                        h0Var14.Q = null;
                    }
                    h0Var14.c(PaymentStatus.CANCELLED);
                    break;
                } else if (i103 == 3) {
                    RPCCommandStatus state7 = ((RPCCommand) objArr[0]).getState();
                    if (RPCCommandStatus.SHUTTING_DOWN.equals(state7)) {
                        b.a("device shutting down");
                        if (h0Var14.f107542a && (iTaskCancelListener6 = h0Var14.Q) != null) {
                            iTaskCancelListener6.onCancelFinish(false);
                            h0Var14.Q = null;
                        }
                        PaymentContext paymentContext8 = h0Var14.I;
                        paymentContext8.paymentStatus = PaymentStatus.ERROR_SHUTTING_DOWN;
                        h0Var14.notifyMonitor(TaskEvent.SUCCESS, paymentContext8);
                        break;
                    } else if (!RPCCommandStatus.DISCONNECT.equals(state7)) {
                        if (!h0Var14.f107542a) {
                            h0Var14.c(PaymentStatus.ERROR);
                        } else {
                            b.a("Cancel was Requested");
                            ITaskCancelListener iTaskCancelListener15 = h0Var14.Q;
                            if (iTaskCancelListener15 != null) {
                                iTaskCancelListener15.onCancelFinish(true);
                                h0Var14.Q = null;
                            }
                            h0Var14.c(PaymentStatus.CANCELLED);
                        }
                        break;
                    } else {
                        b.a("device disconnected");
                        if (h0Var14.f107542a && (iTaskCancelListener5 = h0Var14.Q) != null) {
                            iTaskCancelListener5.onCancelFinish(false);
                            h0Var14.Q = null;
                            break;
                        }
                    }
                } else if (i103 == 4) {
                    if (!h0Var14.f107542a) {
                        h0Var14.O = (EMVApplicationDescriptor) h0Var14.N.get(((DisplayChoiceCommand) objArr[0]).getSelectedIndex());
                        h0Var14.e(PaymentState.SMC_INIT_TRANSACTION);
                    } else {
                        ITaskCancelListener iTaskCancelListener16 = h0Var14.Q;
                        if (iTaskCancelListener16 != null) {
                            iTaskCancelListener16.onCancelFinish(true);
                            h0Var14.Q = null;
                        }
                        h0Var14.c(PaymentStatus.CANCELLED);
                    }
                    break;
                }
                break;
            case 14:
                h0 h0Var15 = this.f130986b;
                h0Var15.getClass();
                int i104 = b0.f11495b[taskEvent.ordinal()];
                if (i104 == 2) {
                    h0Var15.c(PaymentStatus.CANCELLED);
                    break;
                } else if (i104 == 3) {
                    h0Var15.c(PaymentStatus.ERROR);
                    break;
                } else if (i104 == 4) {
                    List<EMVApplicationDescriptor> selection = h0Var15.J.getSelection();
                    h0Var15.N = selection;
                    if (selection == null || selection.size() == 0) {
                        h0Var15.c(PaymentStatus.UNSUPPORTED_CARD);
                    } else if (h0Var15.N.size() != 1) {
                        h0Var15.e(PaymentState.SMC_USER_SELECT_APPLICATION);
                    } else {
                        h0Var15.O = (EMVApplicationDescriptor) h0Var15.N.get(0);
                        h0Var15.e(PaymentState.SMC_INIT_TRANSACTION);
                    }
                    break;
                }
                break;
            case 15:
                h0 h0Var16 = this.f130986b;
                h0Var16.getClass();
                int i105 = b0.f11495b[taskEvent.ordinal()];
                if (i105 == 2) {
                    h0Var16.c(PaymentStatus.CANCELLED);
                    break;
                } else if (i105 == 3) {
                    RPCCommandStatus state8 = ((RPCCommand) objArr[0]).getState();
                    if (RPCCommandStatus.SHUTTING_DOWN.equals(state8)) {
                        b.a("device shutting down");
                        PaymentContext paymentContext9 = h0Var16.I;
                        paymentContext9.paymentStatus = PaymentStatus.ERROR_SHUTTING_DOWN;
                        h0Var16.notifyMonitor(TaskEvent.SUCCESS, paymentContext9);
                        break;
                    } else if (!RPCCommandStatus.DISCONNECT.equals(state8)) {
                        RPCCommand.ResponseStatus responseStatus2 = ((BuildCandidateListCommand) objArr[0]).getResponseStatus();
                        if (responseStatus2.rpcState != RPCCommand.ResponseStatus.RPCState.OKAY) {
                            h0Var16.c(PaymentStatus.ERROR);
                        } else if (responseStatus2.cmdStatus != -300) {
                            h0Var16.c(PaymentStatus.ERROR);
                        } else {
                            h0Var16.c(PaymentStatus.UNSUPPORTED_CARD);
                        }
                        break;
                    }
                } else if (i105 == 4) {
                    List<EMVApplicationDescriptor> candidateList = ((BuildCandidateListCommand) objArr[0]).getCandidateList();
                    h0Var16.M = candidateList;
                    if (candidateList == null || candidateList.isEmpty()) {
                        h0Var16.c(PaymentStatus.UNSUPPORTED_CARD);
                    } else {
                        h0Var16.e(PaymentState.SMC_SELECT_APPLICATION);
                    }
                    break;
                }
                break;
            case 16:
                int i106 = b0.f11495b[taskEvent.ordinal()];
                h0 h0Var17 = this.f130986b;
                if (i106 == 2) {
                    h0Var17.c(PaymentStatus.CANCELLED);
                    break;
                } else if (i106 == 3) {
                    h0Var17.d(((RPCCommand) objArr[0]).getState());
                    break;
                } else if (i106 == 4) {
                    if (((CompleteNFCTransactionCommand) objArr[0]).getActivatedReader() != 17) {
                        h0Var17.I.nfcOutcome = ((CompleteNFCTransactionCommand) objArr[0]).getNFCOutcome();
                        h0Var17.h();
                    } else {
                        h0Var17.I.activatedReader = (byte) 17;
                        h0Var17.e(PaymentState.START_ICC);
                    }
                    break;
                }
                break;
            case 17:
                h0 h0Var18 = this.f130986b;
                h0Var18.getClass();
                int i107 = b0.f11495b[taskEvent.ordinal()];
                if (i107 == 2) {
                    h0Var18.c(PaymentStatus.CANCELLED);
                    break;
                } else if (i107 == 3) {
                    h0Var18.d(((RPCCommand) objArr[0]).getState());
                    break;
                } else if (i107 == 4) {
                    h0Var18.I.pinKsn = ((SimplifiedOnlinePINCommand) objArr[0]).getPinKSN();
                    h0Var18.I.onlinePinBlock = ((SimplifiedOnlinePINCommand) objArr[0]).getEncryptedPinBlock();
                    h0Var18.g(PaymentState.AUTHORIZATION);
                    break;
                }
                break;
            case 18:
                h0 h0Var19 = this.f130986b;
                h0Var19.getClass();
                int i108 = b0.f11495b[taskEvent.ordinal()];
                if (i108 == 2) {
                    h0Var19.c(PaymentStatus.CANCELLED);
                    break;
                } else if (i108 == 3) {
                    h0Var19.d(((RPCCommand) objArr[0]).getState());
                    break;
                } else if (i108 == 4) {
                    h0Var19.I.pinKsn = ((SimplifiedOnlinePINCommand) objArr[0]).getPinKSN();
                    h0Var19.I.onlinePinBlock = ((SimplifiedOnlinePINCommand) objArr[0]).getEncryptedPinBlock();
                    h0Var19.g(PaymentState.AUTHORIZATION);
                    break;
                }
                break;
            case 19:
                h0 h0Var20 = this.f130986b;
                h0Var20.getClass();
                int i109 = b0.f11495b[taskEvent.ordinal()];
                if (i109 == 2) {
                    h0Var20.c(PaymentStatus.CANCELLED);
                    break;
                } else if (i109 == 3) {
                    RPCCommandStatus state9 = ((RPCCommand) objArr[0]).getState();
                    if (RPCCommandStatus.SHUTTING_DOWN.equals(state9)) {
                        b.a("device shutting down");
                        PaymentContext paymentContext10 = h0Var20.I;
                        paymentContext10.paymentStatus = PaymentStatus.ERROR_SHUTTING_DOWN;
                        h0Var20.notifyMonitor(TaskEvent.SUCCESS, paymentContext10);
                        break;
                    } else if (!RPCCommandStatus.DISCONNECT.equals(state9)) {
                        h0Var20.g(PaymentState.AUTHORIZATION);
                        break;
                    }
                } else if (i109 == 4) {
                    h0Var20.I.authorizationSecuredTagsValues = ((GetSecuredTagCommand) objArr[0]).getResponseBuffer();
                    if (!h0Var20.P) {
                        h0Var20.g(PaymentState.AUTHORIZATION);
                    } else if (!h0Var20.S) {
                        h0Var20.g(PaymentState.NFC_SIMPLIFIED_ONLINE_PIN);
                    } else {
                        h0Var20.g(PaymentState.NFC_SIMPLIFIED_ONLINE_PIN_WITHOUT_AMOUNT_AND_CURRENCY);
                    }
                    break;
                }
                break;
            case 20:
            default:
                h0 h0Var21 = this.f130986b;
                h0Var21.getClass();
                int i110 = b0.f11495b[taskEvent.ordinal()];
                if (i110 == 2) {
                    if (h0Var21.f107542a && (iTaskCancelListener7 = h0Var21.Q) != null) {
                        iTaskCancelListener7.onCancelFinish(true);
                        h0Var21.Q = null;
                    }
                    h0Var21.c(PaymentStatus.CANCELLED);
                    break;
                } else if (i110 == 3) {
                    RPCCommandStatus state10 = ((RPCCommand) objArr[0]).getState();
                    if (RPCCommandStatus.SHUTTING_DOWN.equals(state10)) {
                        b.a("device shutting down");
                        if (h0Var21.f107542a && (iTaskCancelListener9 = h0Var21.Q) != null) {
                            iTaskCancelListener9.onCancelFinish(false);
                            h0Var21.Q = null;
                        }
                        PaymentContext paymentContext11 = h0Var21.I;
                        paymentContext11.paymentStatus = PaymentStatus.ERROR_SHUTTING_DOWN;
                        h0Var21.notifyMonitor(TaskEvent.SUCCESS, paymentContext11);
                        break;
                    } else if (!RPCCommandStatus.DISCONNECT.equals(state10)) {
                        if (h0Var21.f107542a) {
                            b.a("Cancel was Requested");
                            ITaskCancelListener iTaskCancelListener17 = h0Var21.Q;
                            if (iTaskCancelListener17 != null) {
                                iTaskCancelListener17.onCancelFinish(true);
                                h0Var21.Q = null;
                            }
                            h0Var21.c(PaymentStatus.CANCELLED);
                        } else if (!h0Var21.I.isRetrieveF5Tag()) {
                            h0Var21.c(PaymentStatus.CARD_WAIT_FAILED);
                        } else {
                            h0Var21.j(PaymentState.GET_F5_L2_LOG);
                        }
                        break;
                    } else {
                        b.a("device disconnected");
                        if (h0Var21.f107542a && (iTaskCancelListener8 = h0Var21.Q) != null) {
                            iTaskCancelListener8.onCancelFinish(false);
                            h0Var21.Q = null;
                            break;
                        }
                    }
                } else if (i110 == 4) {
                    h0Var21.I.activatedReader = ((StartNFCTransactionCommand) objArr[0]).getActivatedReader();
                    if (h0Var21.f107542a) {
                        if (h0Var21.I.activatedReader == 17) {
                            b.a("Cancel was Requested");
                            ITaskCancelListener iTaskCancelListener18 = h0Var21.Q;
                            if (iTaskCancelListener18 != null) {
                                iTaskCancelListener18.onCancelFinish(true);
                                h0Var21.Q = null;
                            }
                            h0Var21.c(PaymentStatus.CANCELLED);
                        } else {
                            ITaskCancelListener iTaskCancelListener19 = h0Var21.Q;
                            if (iTaskCancelListener19 != null) {
                                iTaskCancelListener19.onCancelFinish(false);
                                h0Var21.Q = null;
                            }
                        }
                    }
                    h0Var21.I.nfcOutcome = ((StartNFCTransactionCommand) objArr[0]).getNFCOutcome();
                    h0Var21.I.authorizationGetPlainTagsResponse = ((StartNFCTransactionCommand) objArr[0]).getResponseBuffer();
                    h0Var21.I.authorizationPlainTagsValues = ((StartNFCTransactionCommand) objArr[0]).getPlainTags();
                    PaymentContext paymentContext12 = h0Var21.I;
                    if (paymentContext12.amount < 0) {
                        paymentContext12.amount = ((StartNFCTransactionCommand) objArr[0]).getAmount();
                    }
                    if (h0Var21.I.activatedReader == 33) {
                        h0Var21.R = true;
                        h0Var21.i(PaymentState.CARD_READ_END);
                    }
                    byte b5 = h0Var21.I.activatedReader;
                    if (b5 == 17) {
                        h0Var21.e(PaymentState.START_ICC);
                    } else if (b5 == 33) {
                        h0Var21.g(PaymentState.START_NFC);
                    } else {
                        h0Var21.c(PaymentStatus.ERROR_WRONG_ACTIVATED_READER);
                    }
                    break;
                }
                break;
            case 21:
                h0 h0Var22 = this.f130986b;
                h0Var22.getClass();
                int i111 = b0.f11495b[taskEvent.ordinal()];
                if (i111 == 2) {
                    h0Var22.c(PaymentStatus.CANCELLED);
                    break;
                } else if (i111 == 3) {
                    h0Var22.c(PaymentStatus.ERROR);
                    break;
                } else if (i111 == 4) {
                    h0Var22.I.authorizationResponse = h0Var22.L.getAuthorizationResponse();
                    byte[] bArr2 = h0Var22.I.authorizationResponse;
                    if (bArr2 != null && TLV.parse(bArr2).containsKey(Integer.valueOf(Constants.TAG_HOST_RESPONSE_DATA))) {
                        h0Var22.I.containsOnlinePinChallengeResponse = true;
                    }
                    h0Var22.g(PaymentState.NFC_COMPLETE_TRANSACTION);
                    break;
                }
                break;
            case 22:
                h0 h0Var23 = this.f130986b;
                h0Var23.getClass();
                if (b0.f11495b[taskEvent.ordinal()] != 1) {
                    h0Var23.notifyMonitor(TaskEvent.SUCCESS, h0Var23.I);
                }
                break;
            case 23:
                h0 h0Var24 = this.f130986b;
                h0Var24.getClass();
                int i112 = b0.f11495b[taskEvent.ordinal()];
                if (i112 == 2) {
                    h0Var24.f(PaymentStatus.CANCELLED);
                    break;
                } else if (i112 == 3) {
                    RPCCommandStatus state11 = ((RPCCommand) objArr[0]).getState();
                    if (RPCCommandStatus.SHUTTING_DOWN.equals(state11)) {
                        b.a("device shutting down");
                        PaymentContext paymentContext13 = h0Var24.I;
                        paymentContext13.paymentStatus = PaymentStatus.ERROR_SHUTTING_DOWN;
                        h0Var24.notifyMonitor(TaskEvent.SUCCESS, paymentContext13);
                        break;
                    } else if (!RPCCommandStatus.DISCONNECT.equals(state11)) {
                        h0Var24.f(PaymentStatus.ERROR);
                        break;
                    }
                } else if (i112 == 4) {
                    if (h0Var24.I.activatedReader == CardReaderType.ICC.getCode() && !h0Var24.I.skipCardRemoval) {
                        h0Var24.b(PaymentState.SMC_REMOVE_CARD);
                    } else {
                        h0Var24.notifyMonitor(TaskEvent.SUCCESS, h0Var24.I);
                    }
                    break;
                }
                break;
            case 24:
                h0 h0Var25 = this.f130986b;
                h0Var25.getClass();
                int i113 = b0.f11495b[taskEvent.ordinal()];
                if (i113 == 2) {
                    h0Var25.I.paymentStatus = PaymentStatus.CANCELLED;
                    h0Var25.b(PaymentState.END_EXIT_SECURE_SESSION);
                    break;
                } else if (i113 == 3) {
                    RPCCommandStatus state12 = ((RPCCommand) objArr[0]).getState();
                    if (RPCCommandStatus.SHUTTING_DOWN.equals(state12)) {
                        b.a("device shutting down");
                        PaymentContext paymentContext14 = h0Var25.I;
                        paymentContext14.paymentStatus = PaymentStatus.ERROR_SHUTTING_DOWN;
                        h0Var25.notifyMonitor(TaskEvent.SUCCESS, paymentContext14);
                        break;
                    } else if (!RPCCommandStatus.DISCONNECT.equals(state12)) {
                        h0Var25.b(PaymentState.END_EXIT_SECURE_SESSION);
                        break;
                    }
                } else if (i113 == 4) {
                    h0Var25.I.tagF4 = ((GetInfosCommand) objArr[0]).response.getBuffer();
                    h0Var25.b(PaymentState.END_EXIT_SECURE_SESSION);
                    break;
                }
                break;
            case 25:
                h0 h0Var26 = this.f130986b;
                h0Var26.getClass();
                int i114 = b0.f11495b[taskEvent.ordinal()];
                if (i114 == 2) {
                    h0Var26.I.paymentStatus = PaymentStatus.CANCELLED;
                    h0Var26.b(PaymentState.END_EXIT_SECURE_SESSION);
                    break;
                } else if (i114 == 3) {
                    RPCCommandStatus state13 = ((RPCCommand) objArr[0]).getState();
                    if (RPCCommandStatus.SHUTTING_DOWN.equals(state13)) {
                        b.a("device shutting down");
                        PaymentContext paymentContext15 = h0Var26.I;
                        paymentContext15.paymentStatus = PaymentStatus.ERROR_SHUTTING_DOWN;
                        h0Var26.notifyMonitor(TaskEvent.SUCCESS, paymentContext15);
                        break;
                    } else if (!RPCCommandStatus.DISCONNECT.equals(state13)) {
                        h0Var26.b(PaymentState.GET_F4_L2_LOG);
                        break;
                    }
                } else if (i114 == 4) {
                    h0Var26.I.tagCC = ((GetInfosCommand) objArr[0]).response.getBuffer();
                    h0Var26.b(PaymentState.GET_F4_L2_LOG);
                    break;
                }
                break;
            case 26:
                h0 h0Var27 = this.f130986b;
                h0Var27.getClass();
                int i115 = b0.f11495b[taskEvent.ordinal()];
                if (i115 == 2) {
                    h0Var27.I.paymentStatus = PaymentStatus.CANCELLED;
                    h0Var27.b(PaymentState.END_EXIT_SECURE_SESSION);
                    break;
                } else if (i115 == 3) {
                    RPCCommandStatus state14 = ((RPCCommand) objArr[0]).getState();
                    if (RPCCommandStatus.SHUTTING_DOWN.equals(state14)) {
                        b.a("device shutting down");
                        PaymentContext paymentContext16 = h0Var27.I;
                        paymentContext16.paymentStatus = PaymentStatus.ERROR_SHUTTING_DOWN;
                        h0Var27.notifyMonitor(TaskEvent.SUCCESS, paymentContext16);
                        break;
                    } else if (!RPCCommandStatus.DISCONNECT.equals(state14)) {
                        if (!h0Var27.I.getSystemFailureInfoL2) {
                            h0Var27.b(PaymentState.END_EXIT_SECURE_SESSION);
                        } else {
                            h0Var27.b(PaymentState.GET_CC_L2_LOG);
                        }
                        break;
                    }
                } else if (i115 == 4) {
                    h0Var27.I.finalizationGetPlainTagsResponse = ((GetPlainTagCommand) objArr[0]).getResponseBuffer();
                    h0Var27.I.finalizationPlainTagsValues = ((GetPlainTagCommand) objArr[0]).getResult();
                    if (!h0Var27.I.getSystemFailureInfoL2) {
                        h0Var27.b(PaymentState.END_EXIT_SECURE_SESSION);
                    } else {
                        h0Var27.b(PaymentState.GET_CC_L2_LOG);
                    }
                    break;
                }
                break;
            case 27:
                h0 h0Var28 = this.f130986b;
                h0Var28.getClass();
                int i116 = b0.f11495b[taskEvent.ordinal()];
                if (i116 == 2) {
                    h0Var28.I.paymentStatus = PaymentStatus.CANCELLED;
                    h0Var28.b(PaymentState.END_EXIT_SECURE_SESSION);
                    break;
                } else if (i116 == 3) {
                    RPCCommandStatus state15 = ((RPCCommand) objArr[0]).getState();
                    if (RPCCommandStatus.SHUTTING_DOWN.equals(state15)) {
                        b.a("device shutting down");
                        PaymentContext paymentContext17 = h0Var28.I;
                        paymentContext17.paymentStatus = PaymentStatus.ERROR_SHUTTING_DOWN;
                        h0Var28.notifyMonitor(TaskEvent.SUCCESS, paymentContext17);
                        break;
                    } else if (!RPCCommandStatus.DISCONNECT.equals(state15)) {
                        h0Var28.b(PaymentState.GET_FINALIZATION_PLAIN_TAGS);
                        break;
                    }
                } else if (i116 == 4) {
                    h0Var28.I.finalizationSecuredTagsValues = ((GetSecuredTagCommand) objArr[0]).getResponseBuffer();
                    h0Var28.b(PaymentState.GET_FINALIZATION_PLAIN_TAGS);
                    break;
                }
                break;
        }
    }

    @Override // com.youTransactor.uCube.rpc.EventListener
    public void onEvent(Event event) {
        h0 h0Var = this.f130986b;
        h0Var.getClass();
        int i = b0.f11496c[event.ordinal()];
        if (i == 1) {
            h0Var.R = false;
            h0Var.i(PaymentState.WAITING_CARD);
        } else if (i == 2) {
            h0Var.i(PaymentState.ONLINE_PIN);
        } else {
            if (i != 3) {
                return;
            }
            h0Var.i(PaymentState.OFFLINE_PIN);
        }
    }
}
