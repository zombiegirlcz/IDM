package v73;

import android.app.Activity;
import efm.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v6l.e0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f286527b;

    public /* synthetic */ b(j jVar, int i) {
        this.f286526a = i;
        this.f286527b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f286526a) {
            case 0:
                j jVar = this.f286527b;
                li0.b bVar = jVar.f286543r;
                Activity activity = jVar.f286545t.m2();
                bVar.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                bVar.f195399a.createWallet(activity, 1001);
                return Unit.f186387a;
            default:
                Boolean isWalletExist = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isWalletExist, "isWalletExist");
                if (isWalletExist.booleanValue()) {
                    return pfm.m.f235744a;
                }
                j jVar2 = this.f286527b;
                d0 d0VarFirstOrError = jVar2.u.doOnSubscribe(new e0(7, new b(jVar2, 0))).firstOrError();
                d0VarFirstOrError.getClass();
                return new pfm.h(d0VarFirstOrError, 4);
        }
    }
}
