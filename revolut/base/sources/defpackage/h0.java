package defpackage;

import com.youTransactor.uCube.AbstractService;
import com.youTransactor.uCube.ITaskCancelListener;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.connexion.ConnectionService;
import com.youTransactor.uCube.payment.PaymentContext;
import com.youTransactor.uCube.payment.PaymentState;
import com.youTransactor.uCube.payment.PaymentStatus;
import com.youTransactor.uCube.payment.task.IApplicationSelectionTask;
import com.youTransactor.uCube.payment.task.IAuthorizationTask;
import com.youTransactor.uCube.payment.task.IPaymentTask;
import com.youTransactor.uCube.payment.task.IRiskManagementTask;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.EMVApplicationDescriptor;
import com.youTransactor.uCube.rpc.RPCCommandStatus;
import com.youTransactor.uCube.rpc.RPCService;
import com.youTransactor.uCube.rpc.command.BuildCandidateListCommand;
import com.youTransactor.uCube.rpc.command.CancelCommand;
import com.youTransactor.uCube.rpc.command.CompleteNFCTransactionCommand;
import com.youTransactor.uCube.rpc.command.DisplayChoiceCommand;
import com.youTransactor.uCube.rpc.command.DisplayMessageCommand;
import com.youTransactor.uCube.rpc.command.EnterSecureSessionCommand;
import com.youTransactor.uCube.rpc.command.ExitSecureSessionCommand;
import com.youTransactor.uCube.rpc.command.GetInfosCommand;
import com.youTransactor.uCube.rpc.command.GetPlainTagCommand;
import com.youTransactor.uCube.rpc.command.GetSecuredTagCommand;
import com.youTransactor.uCube.rpc.command.InitTransactionCommand;
import com.youTransactor.uCube.rpc.command.SimplifiedOnlinePINCommand;
import com.youTransactor.uCube.rpc.command.StartNFCTransactionCommand;
import com.youTransactor.uCube.rpc.command.TransactionFinalizationCommand;
import com.youTransactor.uCube.rpc.command.TransactionProcessCommand;
import com.youTransactor.uCube.rpc.command.WaitCardRemovalCommand;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class h0 extends AbstractService implements IPaymentTask {
    public PaymentState H;
    public PaymentContext I;
    public IApplicationSelectionTask J;
    public IRiskManagementTask K;
    public final IAuthorizationTask L;
    public List M;
    public List N;
    public EMVApplicationDescriptor O;
    public ITaskCancelListener Q;
    public boolean P = false;
    public boolean R = false;
    public boolean S = true;

    public h0(PaymentContext paymentContext, IAuthorizationTask iAuthorizationTask) {
        this.I = paymentContext;
        this.L = iAuthorizationTask;
    }

    @Override // com.youTransactor.uCube.AbstractTask
    public final void a(ITaskCancelListener iTaskCancelListener) {
        if (this.R) {
            b.a("try to cancel transaction but card was read ==> cancel ignored");
            iTaskCancelListener.onCancelFinish(false);
        }
        b.a("try to cancel transaction at " + this.H);
        switch (b0.f11494a[this.H.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                this.f107543b = false;
                this.Q = iTaskCancelListener;
                break;
            case 8:
                IApplicationSelectionTask iApplicationSelectionTask = this.J;
                if (iApplicationSelectionTask == null) {
                    this.f107543b = false;
                    iTaskCancelListener.onCancelFinish(true);
                    c(PaymentStatus.CANCELLED);
                } else {
                    iApplicationSelectionTask.cancel(iTaskCancelListener);
                }
                break;
            case 9:
                this.f107543b = false;
                iTaskCancelListener.onCancelFinish(true);
                c(PaymentStatus.CANCELLED);
                break;
            case 10:
            case 11:
            case 12:
                this.Q = iTaskCancelListener;
                f0 f0Var = new f0(this, 0);
                CancelCommand cancelCommand = new CancelCommand();
                cancelCommand.setWithMessage(true);
                cancelCommand.execute(f0Var);
                break;
            default:
                iTaskCancelListener.onCancelFinish(false);
                break;
        }
    }

    public final void b(PaymentState paymentState) {
        switch (b0.f11494a[paymentState.ordinal()]) {
            case 25:
                if (this.I.finalizationSecuredTags != null) {
                    i(paymentState);
                    int[] iArr = this.I.finalizationSecuredTags;
                    new GetSecuredTagCommand(iArr).execute(new f0(this, 27));
                } else {
                    b(PaymentState.GET_FINALIZATION_PLAIN_TAGS);
                }
                break;
            case 26:
                PaymentContext paymentContext = this.I;
                if (paymentContext.finalizationPlainTags != null) {
                    i(paymentState);
                    int[] iArr2 = this.I.finalizationPlainTags;
                    new GetPlainTagCommand(iArr2).execute(new f0(this, 26));
                } else if (!paymentContext.getSystemFailureInfoL2) {
                    b(PaymentState.END_EXIT_SECURE_SESSION);
                } else {
                    b(PaymentState.GET_CC_L2_LOG);
                }
                break;
            case 27:
                i(paymentState);
                new GetInfosCommand(Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2).execute(new f0(this, 25));
                break;
            case 28:
                i(paymentState);
                new GetInfosCommand(Constants.TAG_F4).execute(new f0(this, 24));
                break;
            case 29:
                i(paymentState);
                new ExitSecureSessionCommand().execute(new f0(this, 23));
                break;
            case 30:
                i(paymentState);
                new WaitCardRemovalCommand().execute(new f0(this, 22));
                break;
        }
    }

    public final void c(PaymentStatus paymentStatus) {
        PaymentContext paymentContext = this.I;
        paymentContext.paymentStatus = paymentStatus;
        if (paymentStatus == PaymentStatus.CANCELLED) {
            b(PaymentState.END_EXIT_SECURE_SESSION);
        } else {
            if (!this.R) {
                b(PaymentState.END_EXIT_SECURE_SESSION);
                return;
            }
            if (paymentContext.isForceDebug()) {
                this.I.getSystemFailureInfoL2 = true;
            }
            b(PaymentState.GET_FINALIZATION_SECURED_TAGS);
        }
    }

    public final void d(RPCCommandStatus rPCCommandStatus) {
        if (!RPCCommandStatus.SHUTTING_DOWN.equals(rPCCommandStatus)) {
            if (RPCCommandStatus.DISCONNECT.equals(rPCCommandStatus)) {
                return;
            }
            c(PaymentStatus.ERROR);
        } else {
            b.a("device shutting down");
            PaymentContext paymentContext = this.I;
            paymentContext.paymentStatus = PaymentStatus.ERROR_SHUTTING_DOWN;
            notifyMonitor(TaskEvent.SUCCESS, paymentContext);
        }
    }

    public final void e(PaymentState paymentState) {
        if (!this.f107543b) {
            b.a("transaction stop running");
            a();
        }
        i(paymentState);
        int i = b0.f11494a[paymentState.ordinal()];
        if (i == 7) {
            new BuildCandidateListCommand(true, 1).execute(new f0(this, 15));
            return;
        }
        if (i == 8) {
            if (this.J == null) {
                this.J = new y();
            }
            IApplicationSelectionTask iApplicationSelectionTask = this.J;
            PaymentContext paymentContext = this.I;
            List<EMVApplicationDescriptor> list = this.M;
            f0 f0Var = new f0(this, 14);
            iApplicationSelectionTask.setContext(paymentContext);
            iApplicationSelectionTask.setAvailableApplication(list);
            iApplicationSelectionTask.execute(f0Var);
            return;
        }
        switch (i) {
            case 12:
                List list2 = this.N;
                f0 f0Var2 = new f0(this, 13);
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((EMVApplicationDescriptor) it8.next()).getLabel());
                }
                new DisplayChoiceCommand(arrayList).execute(f0Var2);
                break;
            case 13:
                e(PaymentState.SMC_BUILD_CANDIDATE_LIST);
                break;
            case 14:
                this.R = true;
                i(PaymentState.CARD_READ_END);
                PaymentContext paymentContext2 = this.I;
                EMVApplicationDescriptor eMVApplicationDescriptor = this.O;
                f0 f0Var3 = new f0(this, 12);
                InitTransactionCommand initTransactionCommand = new InitTransactionCommand(paymentContext2.amount, paymentContext2.currency, paymentContext2.transactionType.getCode(), eMVApplicationDescriptor);
                initTransactionCommand.setPreferredLanguageList(paymentContext2.preferredLanguageList);
                initTransactionCommand.setDate(paymentContext2.transactionDate);
                initTransactionCommand.setEnableTIP(paymentContext2.tip);
                initTransactionCommand.execute(f0Var3);
                break;
            case 15:
                IRiskManagementTask iRiskManagementTask = this.K;
                PaymentContext paymentContext3 = this.I;
                f0 f0Var4 = new f0(this, 11);
                iRiskManagementTask.setContext(paymentContext3);
                iRiskManagementTask.execute(f0Var4);
                break;
            case 16:
                PaymentContext paymentContext4 = this.I;
                f0 f0Var5 = new f0(this, 10);
                TransactionProcessCommand transactionProcessCommand = new TransactionProcessCommand(paymentContext4.tvr);
                if (paymentContext4.transactionDate == null) {
                    transactionProcessCommand.setDate(new Date());
                }
                transactionProcessCommand.setApplicationVersion(paymentContext4.applicationVersion);
                transactionProcessCommand.setRequestedTags(paymentContext4.authorizationPlainTags);
                transactionProcessCommand.execute(f0Var5);
                break;
            case 17:
                int[] iArr = this.I.authorizationSecuredTags;
                new GetSecuredTagCommand(iArr).execute(new f0(this, 9));
                break;
            case 18:
                PaymentContext paymentContext5 = this.I;
                f0 f0Var6 = new f0(this, 8);
                IAuthorizationTask iAuthorizationTask = this.L;
                iAuthorizationTask.setContext(paymentContext5);
                iAuthorizationTask.execute(f0Var6);
                break;
            case 19:
                PaymentContext paymentContext6 = this.I;
                f0 f0Var7 = new f0(this, 7);
                TransactionFinalizationCommand transactionFinalizationCommand = new TransactionFinalizationCommand();
                transactionFinalizationCommand.setAuthResponse(paymentContext6.authorizationResponse);
                transactionFinalizationCommand.execute(f0Var7);
                break;
        }
    }

    public final void f(PaymentStatus paymentStatus) {
        PaymentContext paymentContext = this.I;
        paymentContext.paymentStatus = paymentStatus;
        notifyMonitor(TaskEvent.SUCCESS, paymentContext);
    }

    public final void g(PaymentState paymentState) {
        i(paymentState);
        switch (b0.f11494a[paymentState.ordinal()]) {
            case 18:
                PaymentContext paymentContext = this.I;
                f0 f0Var = new f0(this, 21);
                IAuthorizationTask iAuthorizationTask = this.L;
                iAuthorizationTask.setContext(paymentContext);
                iAuthorizationTask.execute(f0Var);
                break;
            case 20:
                h();
                break;
            case 21:
                int[] iArr = this.I.authorizationSecuredTags;
                new GetSecuredTagCommand(iArr).execute(new f0(this, 19));
                break;
            case 22:
                PaymentContext paymentContext2 = this.I;
                f0 f0Var2 = new f0(this, 18);
                SimplifiedOnlinePINCommand simplifiedOnlinePINCommand = new SimplifiedOnlinePINCommand(paymentContext2.amount, paymentContext2.currency, paymentContext2.onlinePinBlockFormat);
                simplifiedOnlinePINCommand.setPinRequestLabel(paymentContext2.getPinRequestLabel());
                simplifiedOnlinePINCommand.setWaitLabel(paymentContext2.getWaitLabel());
                simplifiedOnlinePINCommand.setWaitLabelFont(paymentContext2.getWaitLabelFont());
                simplifiedOnlinePINCommand.setPinRequestLabelFont(paymentContext2.getPinRequestLabelFont());
                simplifiedOnlinePINCommand.setPinRequestLabelXPosition(paymentContext2.getPinRequestLabelXPosition());
                simplifiedOnlinePINCommand.setPinRequestLabelYPosition(paymentContext2.getPinRequestLabelYPosition());
                simplifiedOnlinePINCommand.setWaitLabelXPosition(paymentContext2.getWaitLabelXPosition());
                simplifiedOnlinePINCommand.setWaitLabelYPosition(paymentContext2.getWaitLabelYPosition());
                simplifiedOnlinePINCommand.setAddAmountAndCurrencyTags(true);
                simplifiedOnlinePINCommand.execute(f0Var2);
                break;
            case 23:
                PaymentContext paymentContext3 = this.I;
                f0 f0Var3 = new f0(this, 17);
                SimplifiedOnlinePINCommand simplifiedOnlinePINCommand2 = new SimplifiedOnlinePINCommand(paymentContext3.amount, paymentContext3.currency, paymentContext3.onlinePinBlockFormat);
                simplifiedOnlinePINCommand2.setPinRequestLabel(paymentContext3.getPinRequestLabel());
                simplifiedOnlinePINCommand2.setWaitLabel(paymentContext3.getWaitLabel());
                simplifiedOnlinePINCommand2.setWaitLabelFont(paymentContext3.getWaitLabelFont());
                simplifiedOnlinePINCommand2.setPinRequestLabelFont(paymentContext3.getPinRequestLabelFont());
                simplifiedOnlinePINCommand2.setPinRequestLabelXPosition(paymentContext3.getPinRequestLabelXPosition());
                simplifiedOnlinePINCommand2.setPinRequestLabelYPosition(paymentContext3.getPinRequestLabelYPosition());
                simplifiedOnlinePINCommand2.setWaitLabelXPosition(paymentContext3.getWaitLabelXPosition());
                simplifiedOnlinePINCommand2.setWaitLabelYPosition(paymentContext3.getWaitLabelYPosition());
                simplifiedOnlinePINCommand2.setAddAmountAndCurrencyTags(false);
                simplifiedOnlinePINCommand2.execute(f0Var3);
                break;
            case 24:
                PaymentContext paymentContext4 = this.I;
                new CompleteNFCTransactionCommand(paymentContext4.authorizationResponse).execute(new f0(this, 16));
                break;
        }
    }

    @Override // com.youTransactor.uCube.payment.task.IPaymentTask
    public final PaymentContext getContext() {
        return this.I;
    }

    public final void h() {
        this.P = this.I.isForceOnlinePIN();
        PaymentContext paymentContext = this.I;
        byte[] bArr = paymentContext.nfcOutcome;
        switch (bArr[0]) {
            case 48:
            case 50:
                break;
            case 49:
                paymentContext.signatureRequired = true;
                break;
            case 51:
            default:
                c(PaymentStatus.ERROR_WRONG_NFC_OUTCOME);
            case 52:
                this.P = true;
                break;
        }
        byte b4 = bArr[1];
        if (b4 == 49) {
            c(PaymentStatus.NFC_OUTCOME_TRY_OTHER_INTERFACE);
            return;
        }
        if (b4 == 58) {
            c(PaymentStatus.CANCELLED);
            return;
        }
        if (b4 == 62) {
            if (paymentContext.authorizationSecuredTags != null) {
                g(PaymentState.NFC_GET_AUTHORIZATION_SECURED_TAGS);
                return;
            }
            if (!this.P) {
                g(PaymentState.AUTHORIZATION);
                return;
            } else if (this.S) {
                g(PaymentState.NFC_SIMPLIFIED_ONLINE_PIN_WITHOUT_AMOUNT_AND_CURRENCY);
                return;
            } else {
                g(PaymentState.NFC_SIMPLIFIED_ONLINE_PIN);
                return;
            }
        }
        if (b4 == 63) {
            c(PaymentStatus.NFC_OUTCOME_END_APPLICATION);
            return;
        }
        switch (b4) {
            case 54:
                c(PaymentStatus.APPROVED);
                break;
            case 55:
                c(PaymentStatus.DECLINED);
                break;
            case 56:
                c(PaymentStatus.NFC_OUTCOME_FAILED);
                break;
            default:
                c(PaymentStatus.ERROR_WRONG_NFC_OUTCOME);
                break;
        }
    }

    public final void i(PaymentState paymentState) {
        this.H = paymentState;
        b.a("On state change : " + paymentState);
        notifyMonitor(TaskEvent.PROGRESS, paymentState, this.I);
    }

    public final void j(PaymentState paymentState) {
        if (!this.f107543b) {
            b.a("transaction stop running");
            a();
        }
        this.f107542a = false;
        i(paymentState);
        switch (b0.f11494a[paymentState.ordinal()]) {
            case 1:
                new CancelCommand().execute(new f0(this, 6));
                break;
            case 2:
                new ExitSecureSessionCommand().execute(new f0(this, 5));
                break;
            case 3:
                new GetInfosCommand(Constants.TAG_FIRMWARE_VERSION).execute(new f0(this, 4));
                break;
            case 4:
                new EnterSecureSessionCommand().execute(new f0(this, 3));
                break;
            case 5:
                String str = this.I.cardWaitMessage;
                f0 f0Var = new f0(this, 2);
                DisplayMessageCommand displayMessageCommand = new DisplayMessageCommand(str);
                displayMessageCommand.setXPosition((byte) -1);
                displayMessageCommand.setYPosition((byte) 12);
                displayMessageCommand.execute(f0Var);
                break;
            case 6:
                new GetInfosCommand(Constants.TAG_F5).execute(new f0(this, 1));
                break;
            case 9:
                if (this.I.cardWaitMessage == null) {
                    j(PaymentState.START_TRANSACTION);
                } else {
                    j(PaymentState.DISPLAY_START_WAIT_CARD);
                }
                break;
            case 10:
                PaymentContext paymentContext = this.I;
                f0 f0Var2 = new f0(this, 28);
                int size = paymentContext.readerList.size();
                byte[] bArr = new byte[size];
                for (int i = 0; i < size; i++) {
                    bArr[i] = paymentContext.readerList.get(i).getCode();
                }
                StartNFCTransactionCommand startNFCTransactionCommand = new StartNFCTransactionCommand(bArr, paymentContext.currency);
                startNFCTransactionCommand.setDate(paymentContext.transactionDate);
                startNFCTransactionCommand.setNoAmount(paymentContext.amount < 0);
                startNFCTransactionCommand.setAmount(paymentContext.amount);
                startNFCTransactionCommand.setTimeout(paymentContext.cardWaitTimeout);
                startNFCTransactionCommand.setTransactionType(paymentContext.transactionType.getCode());
                startNFCTransactionCommand.setForceAuthorization(paymentContext.isForceAuthorization());
                startNFCTransactionCommand.setInputProprietaryTLVStream(paymentContext.inputProprietaryTLVStream);
                startNFCTransactionCommand.setRequestedTagList(paymentContext.authorizationPlainTags);
                startNFCTransactionCommand.execute(f0Var2);
                break;
        }
    }

    @Override // com.youTransactor.uCube.payment.task.IPaymentTask
    public final void setContext(PaymentContext paymentContext) {
        this.I = paymentContext;
    }

    @Override // com.youTransactor.uCube.AbstractTask
    public final void start() {
        if (this.I.getReaderList().isEmpty()) {
            b.b("Error empty reader list", new Exception[0]);
            f(PaymentStatus.ERROR_WRONG_ACTIVATED_READER);
            return;
        }
        ConnectionService.getInstance().registerDisconnectListener(new g0(this, 0));
        RPCService.registerEventListener(new f0(this, 20));
        this.R = false;
        this.P = false;
        if (this.I.skipStartingSteps) {
            j(PaymentState.GET_INFO);
        } else {
            j(PaymentState.START_CANCEL_ALL);
        }
    }

    public final void a() {
        b.a("cancel loop at state :" + this.H);
        PaymentContext paymentContext = this.I;
        PaymentStatus paymentStatus = PaymentStatus.CANCELLED;
        paymentContext.paymentStatus = paymentStatus;
        ITaskCancelListener iTaskCancelListener = this.Q;
        if (iTaskCancelListener != null) {
            iTaskCancelListener.onCancelFinish(true);
            this.Q = null;
        }
        int i = b0.f11494a[this.H.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            c(paymentStatus);
        } else {
            f(paymentStatus);
        }
    }
}
