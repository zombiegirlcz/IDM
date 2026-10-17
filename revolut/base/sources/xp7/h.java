package xp7;

import com.revolut.feature.insurance_car.impl.data.model.Occupation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f307895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Occupation f307896b;

    public /* synthetic */ h(Occupation occupation, int i) {
        this.f307895a = i;
        this.f307896b = occupation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f307895a) {
            case 0:
                e updateState = (e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                updateState.getClass();
                return new e(this.f307896b);
            default:
                yo7.h updateState2 = (yo7.h) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return yo7.h.a(updateState2, null, null, null, null, null, null, null, null, null, null, null, null, this.f307896b, 8191);
        }
    }
}
