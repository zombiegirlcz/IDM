package com.youTransactor.uCube.api;

import a0.d;
import androidx.annotation.NonNull;
import com.youTransactor.uCube.payment.task.IApplicationSelectionTask;
import com.youTransactor.uCube.payment.task.IAuthorizationTask;
import com.youTransactor.uCube.payment.task.IRiskManagementTask;
import com.youTransactor.uCube.rpc.CardReaderType;
import com.youTransactor.uCube.rpc.Currency;
import com.youTransactor.uCube.rpc.TransactionType;
import j6.a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class UCubePaymentRequest {
    public static final int DEFAULT_CARD_WAIT_TIMEOUT = 30;
    public static final boolean FORCE_AUTHORISATION = false;
    public static final boolean FORCE_ONLINE_PIN = false;
    public static final boolean SYSTEM_FAILURE_INFO_2 = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f107548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Currency f107549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransactionType f107550c;
    public final List d;
    public final List e;
    public final IAuthorizationTask f;
    public byte[] inputProprietaryTLVStream;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IRiskManagementTask f107555m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IApplicationSelectionTask f107556n;
    public int[] o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[] f107557p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int[] f107558q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int[] f107559r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f107560s;
    public String u;
    public static final Currency CURRENCY_EUR = new Currency(978, 2, "EUR");
    public static final Currency CURRENCY_USD = new Currency(840, 2, "USD");
    public static final Currency CURRENCY_GBP = new Currency(826, 2, "GBP");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Date f107551g = new Date();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f107552h = 30;
    public boolean i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f107553j = false;
    public boolean k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f107554l = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte f107561t = 0;
    public boolean v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f107562w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f107563x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f107564y = false;
    public String z = "PIN ?";
    public String A = "...";
    public int B = 0;
    public int C = 0;
    public byte D = 0;
    public byte E = 0;
    public byte F = 0;
    public byte G = 0;

    public UCubePaymentRequest(long j2, Currency currency, TransactionType transactionType, List<CardReaderType> list, IAuthorizationTask iAuthorizationTask, List<String> list2) {
        this.f107548a = j2;
        this.f107549b = currency;
        this.f107550c = transactionType;
        this.e = list;
        this.f = iAuthorizationTask;
        this.d = list2;
    }

    public long getAmount() {
        return this.f107548a;
    }

    public IApplicationSelectionTask getApplicationSelectionTask() {
        return this.f107556n;
    }

    public int getApplicationVersion() {
        return this.f107560s;
    }

    public int[] getAuthorizationPlainTags() {
        return this.o;
    }

    public int[] getAuthorizationSecuredTags() {
        return this.f107557p;
    }

    public IAuthorizationTask getAuthorizationTask() {
        return this.f;
    }

    public String getCardWaitMessage() {
        return this.u;
    }

    public int getCardWaitTimeout() {
        return this.f107552h;
    }

    public Currency getCurrency() {
        return this.f107549b;
    }

    public int[] getFinalizationPlainTags() {
        return this.f107558q;
    }

    public int[] getFinalizationSecuredTags() {
        return this.f107559r;
    }

    public byte getOnlinePinBlockFormat() {
        return this.f107561t;
    }

    public String getPinRequestLabel() {
        return this.z;
    }

    public int getPinRequestLabelFont() {
        return this.B;
    }

    public byte getPinRequestLabelXPosition() {
        return this.D;
    }

    public byte getPinRequestLabelYPosition() {
        return this.E;
    }

    public String getPinWaitLabel() {
        return this.A;
    }

    public int getPinWaitLabelFont() {
        return this.C;
    }

    public byte getPinWaitLabelXPosition() {
        return this.F;
    }

    public byte getPinWaitLabelYPosition() {
        return this.G;
    }

    public List<String> getPreferredLanguageList() {
        return this.d;
    }

    public List<CardReaderType> getReaderList() {
        return this.e;
    }

    public IRiskManagementTask getRiskManagementTask() {
        return this.f107555m;
    }

    public byte[] getStartNFCTransactionInputProprietaryTLVStream() {
        return this.inputProprietaryTLVStream;
    }

    public Date getTransactionDate() {
        return this.f107551g;
    }

    public TransactionType getTransactionType() {
        return this.f107550c;
    }

    public boolean isForceAuthorisation() {
        return this.f107554l;
    }

    public boolean isForceDebug() {
        return this.f107553j;
    }

    public boolean isForceOnlinePin() {
        return this.k;
    }

    public boolean isRetrieveF5Tag() {
        return this.f107563x;
    }

    public boolean isSkipCardRemoval() {
        return this.v;
    }

    public boolean isSkipStartingSteps() {
        return this.f107562w;
    }

    public boolean isSystemFailureInfo2() {
        return this.i;
    }

    public boolean isTipRequired() {
        return this.f107564y;
    }

    public UCubePaymentRequest setApplicationSelectionTask(IApplicationSelectionTask iApplicationSelectionTask) {
        this.f107556n = iApplicationSelectionTask;
        return this;
    }

    public void setApplicationVersion(int i) {
        this.f107560s = i;
    }

    public UCubePaymentRequest setAuthorizationPlainTags(int... iArr) {
        int[] iArr2 = new int[iArr.length];
        this.o = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return this;
    }

    public UCubePaymentRequest setAuthorizationSecuredTags(int... iArr) {
        int[] iArr2 = new int[iArr.length];
        this.f107557p = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return this;
    }

    public UCubePaymentRequest setCardWaitMessage(String str) {
        this.u = str;
        return this;
    }

    public UCubePaymentRequest setCardWaitTimeout(int i) {
        this.f107552h = i;
        return this;
    }

    public UCubePaymentRequest setFinalizationPlainTags(int... iArr) {
        int[] iArr2 = new int[iArr.length];
        this.f107558q = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return this;
    }

    public UCubePaymentRequest setFinalizationSecuredTags(int... iArr) {
        int[] iArr2 = new int[iArr.length];
        this.f107559r = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return this;
    }

    public UCubePaymentRequest setForceAuthorisation(boolean z) {
        this.f107554l = z;
        return this;
    }

    public UCubePaymentRequest setForceDebug(boolean z) {
        this.f107553j = z;
        return this;
    }

    public UCubePaymentRequest setForceOnlinePin(boolean z) {
        this.k = z;
        return this;
    }

    public void setOnlinePinBlockFormat(byte b4) {
        this.f107561t = b4;
    }

    public UCubePaymentRequest setPinRequestLabel(String str) {
        this.z = str;
        return this;
    }

    public UCubePaymentRequest setPinRequestLabelFont(int i) {
        this.B = i;
        return this;
    }

    public UCubePaymentRequest setPinRequestLabelXPosition(byte b4) {
        this.D = b4;
        return this;
    }

    public UCubePaymentRequest setPinRequestLabelYPosition(byte b4) {
        this.E = b4;
        return this;
    }

    public UCubePaymentRequest setPinWaitLabel(String str) {
        this.A = str;
        return this;
    }

    public UCubePaymentRequest setPinWaitLabelFont(int i) {
        this.C = i;
        return this;
    }

    public UCubePaymentRequest setPinWaitLabelXPosition(byte b4) {
        this.F = b4;
        return this;
    }

    public UCubePaymentRequest setPinWaitLabelYPosition(byte b4) {
        this.G = b4;
        return this;
    }

    public UCubePaymentRequest setRetrieveF5Tag(boolean z) {
        this.f107563x = z;
        return this;
    }

    public UCubePaymentRequest setRiskManagementTask(IRiskManagementTask iRiskManagementTask) {
        this.f107555m = iRiskManagementTask;
        return this;
    }

    public UCubePaymentRequest setSkipCardRemoval(boolean z) {
        this.v = z;
        return this;
    }

    public UCubePaymentRequest setSkipStartingSteps(boolean z) {
        this.f107562w = z;
        return this;
    }

    public UCubePaymentRequest setStartNFCTransactionInputProprietaryTLVStream(byte[] bArr) {
        this.inputProprietaryTLVStream = bArr;
        return this;
    }

    public UCubePaymentRequest setSystemFailureInfo2(boolean z) {
        this.i = z;
        return this;
    }

    public UCubePaymentRequest setTipRequired(boolean z) {
        this.f107564y = z;
        return this;
    }

    public UCubePaymentRequest setTransactionDate(Date date) {
        this.f107551g = date;
        return this;
    }

    @NonNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("Amount : ");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss", Locale.FRANCE);
        sb6.append(this.f107548a);
        sb6.append("\nCurrency : ");
        sb6.append(this.f107549b.getLabel());
        sb6.append("\nTransaction type : ");
        sb6.append(this.f107550c.getLabel());
        sb6.append("\n");
        Iterator it8 = this.d.iterator();
        while (it8.hasNext()) {
            d.C(sb6, "preferred lang : ", (String) it8.next(), "\n");
        }
        for (CardReaderType cardReaderType : this.e) {
            sb6.append("Card Reader Type : ");
            sb6.append(cardReaderType);
            sb6.append("\n");
        }
        sb6.append("Transaction date : ");
        sb6.append(simpleDateFormat.format(this.f107551g));
        sb6.append("\ncard Wait Timeout : ");
        sb6.append(this.f107552h);
        sb6.append("\nsystem Failure Info2 : ");
        sb6.append(this.i);
        sb6.append("\nforce Debug : ");
        sb6.append(this.f107553j);
        sb6.append("\nforce Online Pin : ");
        sb6.append(this.k);
        sb6.append("\nforce Authorisation : ");
        sb6.append(this.f107554l);
        sb6.append("\napplicationVersion : ");
        sb6.append(this.f107560s);
        sb6.append("\ncardWaitMessage : ");
        sb6.append(this.u);
        sb6.append("\n skip card removal : ");
        sb6.append(this.v);
        sb6.append("\n skip starting steps : ");
        sb6.append(this.f107562w);
        sb6.append("\nretrieve F5 tag : ");
        sb6.append(this.f107563x);
        sb6.append("\ntip required : ");
        sb6.append(this.f107564y);
        sb6.append("\npin request label : ");
        sb6.append(this.z);
        sb6.append("\npin wait label : ");
        sb6.append(this.A);
        sb6.append("\npin request label font : ");
        sb6.append(this.B);
        sb6.append("\npin wait label font : ");
        sb6.append(this.C);
        sb6.append("\npin request label x position : ");
        sb6.append((int) this.D);
        sb6.append("\npin request label y position : ");
        sb6.append((int) this.D);
        sb6.append("\npin wait label x position : ");
        sb6.append((int) this.F);
        sb6.append("\npin wait label y position : ");
        sb6.append((int) this.G);
        sb6.append("\n");
        if (this.inputProprietaryTLVStream != null) {
            sb6.append("\ninputProprietary TLV Stream : ");
            for (byte b4 : this.inputProprietaryTLVStream) {
                sb6.append((int) b4);
                sb6.append(",");
            }
        }
        if (this.o != null) {
            sb6.append("\nauthorisation plain tag : ");
            for (int i : this.o) {
                sb6.append(i);
                sb6.append(",");
            }
        }
        if (this.f107557p != null) {
            sb6.append("\nauthorisation secure tag : ");
            for (int i2 : this.f107557p) {
                sb6.append(i2);
                sb6.append(",");
            }
        }
        if (this.f107558q != null) {
            sb6.append("\nfinalization plain tag : ");
            for (int i3 : this.f107558q) {
                sb6.append(i3);
                sb6.append(",");
            }
        }
        if (this.f107559r != null) {
            sb6.append("\nfinalization secure tag : ");
            for (int i5 : this.f107559r) {
                sb6.append(i5);
                sb6.append(",");
            }
        }
        sb6.append("\nonline pin block format : ");
        return a.v(sb6, "\n", this.f107561t);
    }
}
