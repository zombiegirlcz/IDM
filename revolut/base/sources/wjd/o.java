package wjd;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f298056w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f298057x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f298058y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, Object obj3, Object obj4, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f298057x = obj2;
        this.f298058y = obj3;
        this.z = obj4;
        this.f298056w = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o((com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a) this.f298057x, (String) this.f298058y, this.f298056w, this.z, continuation, 0);
            case 1:
                return new o((b9k.f) this.f298057x, (BankTransferData) this.f298058y, (kq2.a) this.z, this.f298056w, continuation, 1);
            case 2:
                return new o((xif.o) this.f298057x, (String) this.f298058y, this.f298056w, (wif.b) this.z, continuation, 2);
            case 3:
                return new o((rob.i) this.f298057x, (ynb.r) this.f298058y, (rob.h) this.z, this.f298056w, continuation, 3);
            default:
                return new o(this.f298056w, (com.revolut.feature.tax_residency.impl.v2.ui.tin_input.a) this.f298057x, (String) this.f298058y, (String) this.z, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wjd.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, String str, boolean z, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f298057x = obj2;
        this.f298058y = str;
        this.f298056w = z;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z, com.revolut.feature.tax_residency.impl.v2.ui.tin_input.a aVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = 4;
        this.f298056w = z;
        this.f298057x = aVar;
        this.f298058y = str;
        this.z = str2;
    }
}
