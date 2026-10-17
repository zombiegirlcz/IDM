package zv6;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.address.models.Address;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325584a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Address f325585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f325586c;

    public /* synthetic */ i(Address address, k kVar) {
        this.f325585b = address;
        this.f325586c = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f325584a) {
            case 0:
                d updateState = (d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return d.a((d) this.f325586c.t2(), null, null, null, null, this.f325585b, 31);
            default:
                AddressFlowContract$OutputData addressFlowContract$OutputData = (AddressFlowContract$OutputData) obj2;
                boolean zF = Intrinsics.f(addressFlowContract$OutputData.f60940a, this.f325585b);
                Address address = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                k kVar = this.f325586c;
                if (zF) {
                    kVar.x2(new i(kVar, address));
                    kVar.l2(new zr5.k(kVar, objArr2 == true ? 1 : 0, 9), new yi5.b(26));
                } else {
                    kVar.x2(new i(kVar, addressFlowContract$OutputData.f60940a));
                    kVar.l2(new zr5.k(kVar, objArr == true ? 1 : 0, 9), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ i(k kVar, Address address) {
        this.f325586c = kVar;
        this.f325585b = address;
    }
}
