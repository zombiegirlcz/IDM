package vja;

import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.product.onboarding.domain.models.AddressValue;
import com.revolut.feature.product.onboarding.domain.models.NameValue;
import com.revolut.shared.feature.user_declarations.api.navigation.NameControllerDescriptor$OutputData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import til.p;
import til.r;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.product.onboarding.flow.a f289667b;

    public /* synthetic */ g(com.revolut.feature.product.onboarding.flow.a aVar, int i) {
        this.f289666a = i;
        this.f289667b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f289666a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                kvh.h.Companion.getClass();
                kvh.g.a("Failed to load steps", error);
                final int i = 0;
                final com.revolut.feature.product.onboarding.flow.a aVar = this.f289667b;
                Function0 function0 = new Function0() { // from class: vja.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                aVar.I2();
                                break;
                            default:
                                aVar.C2(j.f289670a);
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                final int i2 = 1;
                Function0 function02 = new Function0() { // from class: vja.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                aVar.I2();
                                break;
                            default:
                                aVar.C2(j.f289670a);
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                b bVar = aVar.f81257q;
                if (!(error instanceof HandledNetworkException)) {
                    if (bVar.Z2(error)) {
                        aVar.C2(m.f289674a);
                    } else {
                        bVar.b3(error, function0, function02);
                    }
                }
                break;
            case 1:
                AddressFlowContract$OutputData result = (AddressFlowContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                this.f289667b.J2("RESIDENTIAL_ADDRESS", new AddressValue(result.f60940a));
                break;
            case 2:
                r result2 = (r) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                boolean z = result2 instanceof p;
                com.revolut.feature.product.onboarding.flow.a aVar2 = this.f289667b;
                if (z) {
                    p pVar = (p) result2;
                    aVar2.C2(new k(pVar.f271584a, pVar.f271585b));
                } else {
                    aVar2.I2();
                }
                break;
            default:
                NameControllerDescriptor$OutputData result3 = (NameControllerDescriptor$OutputData) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                this.f289667b.J2("LEGAL_NAME", new NameValue(result3.f105059a, result3.f105060b));
                break;
        }
        return Unit.f186387a;
    }
}
