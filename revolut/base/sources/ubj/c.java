package ubj;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress;
import efm.h0;
import efm.w;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import tx0.g4;
import u6b.k;
import ud3.m;
import ueg.p0;
import wk5.n;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements o, kfm.g, p, OnSuccessListener, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f278916b;

    public /* synthetic */ c(int i, Function1 function1) {
        this.f278915a = i;
        this.f278916b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) throws Exception {
        switch (this.f278915a) {
            case 9:
                ((uc1.c) this.f278916b).invoke(obj2);
                break;
            default:
                ((te8.a) this.f278916b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f278915a) {
            case 0:
                u8c.c cVar = (u8c.c) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) cVar.invoke(p0);
            case 1:
                u8c.c cVar2 = (u8c.c) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) cVar2.invoke(p0);
            case 2:
                a aVar = (a) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CryptoDepositAddress) aVar.invoke(p0);
            case 3:
                u8c.c cVar3 = (u8c.c) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) cVar3.invoke(p0);
            case 4:
                g4 g4Var = (g4) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) g4Var.invoke(p0);
            case 5:
                u8c.c cVar4 = (u8c.c) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) cVar4.invoke(p0);
            case 6:
                u8c.c cVar5 = (u8c.c) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) cVar5.invoke(p0);
            case 7:
                u8c.c cVar6 = (u8c.c) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) cVar6.invoke(p0);
            case 8:
                u8c.c cVar7 = (u8c.c) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) cVar7.invoke(p0);
            case 9:
            case 17:
            case 20:
            case 22:
            case 23:
            case 24:
            default:
                p0 p0Var = (p0) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) p0Var.invoke(p0);
            case 10:
                u8c.c cVar8 = (u8c.c) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wi0.b) cVar8.invoke(p0);
            case 11:
                k kVar = (k) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) kVar.invoke(p0);
            case 12:
                g4 g4Var2 = (g4) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (dda.a) g4Var2.invoke(p0);
            case 13:
                m mVar = (m) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) mVar.invoke(p0);
            case 14:
                m mVar2 = (m) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) mVar2.invoke(p0);
            case 15:
                m mVar3 = (m) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) mVar3.invoke(p0);
            case 16:
                u69.g gVar = (u69.g) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) gVar.invoke(p0);
            case 18:
                p0 p0Var2 = (p0) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) p0Var2.invoke(p0);
            case 19:
                ugc.b bVar = (ugc.b) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) bVar.invoke(p0);
            case 21:
                u69.g gVar2 = (u69.g) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) gVar2.invoke(p0);
            case 25:
                ud3.n nVar = (ud3.n) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                nVar.invoke(p0);
                return pfm.m.f235744a;
            case 26:
                u69.g gVar3 = (u69.g) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) gVar3.invoke(p0);
            case 27:
                p0 p0Var3 = (p0) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) p0Var3.invoke(p0);
            case 28:
                p0 p0Var4 = (p0) this.f278916b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (uhl.d) p0Var4.invoke(p0);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception) {
        ofg.a aVar = (ofg.a) this.f278916b;
        Intrinsics.checkNotNullParameter(exception, "exception");
        aVar.invoke(exception);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
    public void onSuccess(Object obj2) {
        switch (this.f278915a) {
            case 22:
                ((js7.c) this.f278916b).invoke(obj2);
                break;
            default:
                ((ud3.n) this.f278916b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        m mVar = (m) this.f278916b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) mVar.invoke(p0)).booleanValue();
    }
}
