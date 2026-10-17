package b77;

import com.revolut.feature.giro.impl.ui.form.domain.FormState;
import com.revolut.feature.masav.impl.model.DirectDebitData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dm1.d f12932b;

    public /* synthetic */ m(dm1.d dVar, int i) {
        this.f12931a = i;
        this.f12932b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f12931a) {
            case 0:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return h.a(update, FormState.a(update.f12923b, ((dm1.c) this.f12932b).f115817a, null, null, null, null, 30), null, 5);
            default:
                DirectDebitData updateDirectDebitData = (DirectDebitData) obj2;
                Intrinsics.checkNotNullParameter(updateDirectDebitData, "$this$updateDirectDebitData");
                return DirectDebitData.a(updateDirectDebitData, ((dm1.c) this.f12932b).f115817a, null, null, null, 30);
        }
    }
}
