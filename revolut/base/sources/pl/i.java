package pl;

import com.onfido.android.sdk.capture.ui.nfc.NfcHostFragment;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class i implements igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f237230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f237231b;

    public i(j jVar, ArrayList arrayList) {
        this.f237230a = jVar;
        this.f237231b = arrayList;
    }

    @Override // igm.o
    public final Object apply(Object obj2) {
        NfcHostFragment.NfcHostResult result = (NfcHostFragment.NfcHostResult) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        boolean zF = Intrinsics.f(result, NfcHostFragment.NfcHostResult.Exit.INSTANCE);
        j jVar = this.f237230a;
        if (zF) {
            jVar.getClass();
            Observable observableFromCallable = Observable.fromCallable(new nc0.a(jVar, 10));
            Intrinsics.checkNotNullExpressionValue(observableFromCallable, "fromCallable(...)");
            return observableFromCallable;
        }
        boolean zF2 = Intrinsics.f(result, NfcHostFragment.NfcHostResult.NfcScanSkipped.INSTANCE);
        ArrayList arrayList = this.f237231b;
        if (zF2) {
            return jVar.a(arrayList);
        }
        if (result instanceof NfcHostFragment.NfcHostResult.NfcScanSuccess) {
            Observable observableCompose = jVar.f237233b.a(arrayList, (NfcHostFragment.NfcHostResult.NfcScanSuccess) result).l().compose(new pjg.i(jVar, 4));
            Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
            return observableCompose;
        }
        if (!Intrinsics.f(result, NfcHostFragment.NfcHostResult.ExitOnfidoFlow.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        Observable observableJust = Observable.just(c.f237224a);
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }
}
