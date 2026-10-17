package xec;

import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShippingContact f304611b;

    public /* synthetic */ z(ShippingContact shippingContact, int i) {
        this.f304610a = i;
        this.f304611b = shippingContact;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f304610a) {
            case 0:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                ShippingContact shippingContact = this.f304611b;
                return e.a(update, null, shippingContact != null ? shippingContact.f84740a : null, shippingContact != null ? shippingContact.f84740a : null, null, null, Constants.TAG_RESOURCE_FILE_VERSION);
            default:
                return e.a((e) obj2, null, this.f304611b.f84740a, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
        }
    }
}
