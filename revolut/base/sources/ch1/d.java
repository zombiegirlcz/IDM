package ch1;

import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.c;
import kg1.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b f24103b;

    public /* synthetic */ d(com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b bVar, int i) {
        this.f24102a = i;
        this.f24103b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f24102a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f24103b.C2(c.b.f60911a);
                return Boolean.TRUE;
            default:
                kg1.c result = (kg1.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof c.a;
                c.b bVar = c.b.f60911a;
                com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b bVar2 = this.f24103b;
                if (!z && !(result instanceof c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar2.C2(bVar);
                return Unit.f186387a;
        }
    }
}
