package zbj;

import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements cli.j {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f320925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f320926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final od0.i f320927c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final od0.i f320928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final od0.i f320929h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CircleActionButtonsBarDelegate.CircleActionButton f320930j;
    public final DisclaimerParams k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jbj.a f320931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u0 f320932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f320933n;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q(Data data, xi0.b bVar, od0.i iVar, Data data2, Data data3, Data data4, od0.i iVar2, od0.i iVar3, jbj.a aVar, u0 u0Var, int i) {
        od0.i iVar4;
        od0.i iVar5;
        od0.i iVar6;
        int i2 = i & 4;
        od0.i iVar7 = od0.i.f224256b;
        if (i2 != 0) {
            od0.i.Companion.getClass();
            iVar4 = iVar7;
        } else {
            iVar4 = iVar;
        }
        Data data5 = (i & 8) != 0 ? new Data(null, null, false, 7, null) : data2;
        Data data6 = (i & 16) != 0 ? new Data(null, null, false, 7, null) : data3;
        Data data7 = (i & 32) != 0 ? new Data(null, null, false, 7, null) : data4;
        if ((i & 64) != 0) {
            od0.i.Companion.getClass();
            iVar5 = iVar7;
        } else {
            iVar5 = iVar2;
        }
        if ((i & 128) != 0) {
            od0.i.Companion.getClass();
            iVar6 = iVar7;
        } else {
            iVar6 = iVar3;
        }
        this(data, bVar, iVar4, data5, data6, data7, iVar5, iVar6, false, null, null, (i & 2048) != 0 ? null : aVar, (i & 4096) != 0 ? null : u0Var, false);
    }

    public static q a(q qVar, Data data, xi0.b bVar, od0.i iVar, Data data2, Data data3, Data data4, od0.i iVar2, od0.i iVar3, CircleActionButtonsBarDelegate.CircleActionButton circleActionButton, DisclaimerParams disclaimerParams, jbj.a aVar, u0 u0Var, int i) {
        Data stateType = (i & 1) != 0 ? qVar.f320925a : data;
        xi0.b currency = (i & 2) != 0 ? qVar.f320926b : bVar;
        od0.i contactsPermissionGranted = (i & 4) != 0 ? qVar.f320927c : iVar;
        Data contactsData = (i & 8) != 0 ? qVar.d : data2;
        Data addressData = (i & 16) != 0 ? qVar.e : data3;
        Data blockchains = (i & 32) != 0 ? qVar.f : data4;
        od0.i selectedBlockchain = (i & 64) != 0 ? qVar.f320928g : iVar2;
        od0.i minimumDeposit = (i & 128) != 0 ? qVar.f320929h : iVar3;
        boolean z = (i & 256) != 0 ? qVar.i : true;
        CircleActionButtonsBarDelegate.CircleActionButton circleActionButton2 = (i & 512) != 0 ? qVar.f320930j : circleActionButton;
        DisclaimerParams disclaimerParams2 = (i & 1024) != 0 ? qVar.k : disclaimerParams;
        jbj.a aVar2 = (i & 2048) != 0 ? qVar.f320931l : aVar;
        u0 u0Var2 = (i & 4096) != 0 ? qVar.f320932m : u0Var;
        boolean z3 = (i & 8192) != 0 ? qVar.f320933n : true;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(stateType, "stateType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(contactsPermissionGranted, "contactsPermissionGranted");
        Intrinsics.checkNotNullParameter(contactsData, "contactsData");
        Intrinsics.checkNotNullParameter(addressData, "addressData");
        Intrinsics.checkNotNullParameter(blockchains, "blockchains");
        Intrinsics.checkNotNullParameter(selectedBlockchain, "selectedBlockchain");
        Intrinsics.checkNotNullParameter(minimumDeposit, "minimumDeposit");
        return new q(stateType, currency, contactsPermissionGranted, contactsData, addressData, blockchains, selectedBlockchain, minimumDeposit, z, circleActionButton2, disclaimerParams2, aVar2, u0Var2, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f320925a, qVar.f320925a) && Intrinsics.f(this.f320926b, qVar.f320926b) && Intrinsics.f(this.f320927c, qVar.f320927c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f320928g, qVar.f320928g) && Intrinsics.f(this.f320929h, qVar.f320929h) && this.i == qVar.i && Intrinsics.f(this.f320930j, qVar.f320930j) && Intrinsics.f(this.k, qVar.k) && Intrinsics.f(this.f320931l, qVar.f320931l) && this.f320932m == qVar.f320932m && this.f320933n == qVar.f320933n;
    }

    public final int hashCode() {
        int iC = j6.a.c(r6.b.f(this.f320929h, r6.b.f(this.f320928g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, r6.b.f(this.f320927c, h30.l.j(this.f320926b, this.f320925a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.i);
        CircleActionButtonsBarDelegate.CircleActionButton circleActionButton = this.f320930j;
        int iHashCode = (iC + (circleActionButton == null ? 0 : circleActionButton.hashCode())) * 31;
        DisclaimerParams disclaimerParams = this.k;
        int iHashCode2 = (iHashCode + (disclaimerParams == null ? 0 : disclaimerParams.hashCode())) * 31;
        jbj.a aVar = this.f320931l;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        u0 u0Var = this.f320932m;
        return Boolean.hashCode(this.f320933n) + ((iHashCode3 + (u0Var != null ? u0Var.hashCode() : 0)) * 31);
    }

    public q(Data stateType, xi0.b currency, od0.i contactsPermissionGranted, Data contactsData, Data addressData, Data blockchains, od0.i selectedBlockchain, od0.i minimumDeposit, boolean z, CircleActionButtonsBarDelegate.CircleActionButton circleActionButton, DisclaimerParams disclaimerParams, jbj.a aVar, u0 u0Var, boolean z3) {
        Intrinsics.checkNotNullParameter(stateType, "stateType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(contactsPermissionGranted, "contactsPermissionGranted");
        Intrinsics.checkNotNullParameter(contactsData, "contactsData");
        Intrinsics.checkNotNullParameter(addressData, "addressData");
        Intrinsics.checkNotNullParameter(blockchains, "blockchains");
        Intrinsics.checkNotNullParameter(selectedBlockchain, "selectedBlockchain");
        Intrinsics.checkNotNullParameter(minimumDeposit, "minimumDeposit");
        this.f320925a = stateType;
        this.f320926b = currency;
        this.f320927c = contactsPermissionGranted;
        this.d = contactsData;
        this.e = addressData;
        this.f = blockchains;
        this.f320928g = selectedBlockchain;
        this.f320929h = minimumDeposit;
        this.i = z;
        this.f320930j = circleActionButton;
        this.k = disclaimerParams;
        this.f320931l = aVar;
        this.f320932m = u0Var;
        this.f320933n = z3;
    }
}
