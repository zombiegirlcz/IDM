package e0f;

import com.revolut.data.model.Data;
import com.revolut.data.network.models.checkout.PaymentMethodResponseDto;
import com.revolut.data.network.models.checkout.mapper.PaymentMethodResponseDtoMapperKt;
import com.revolut.data.network.models.topup.mapper.TopUpContextMapperKt;
import com.revolut.domain.models.externalcards.AddCardParams;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddCardParams f121585b;

    public /* synthetic */ b(AddCardParams addCardParams, int i) {
        this.f121584a = i;
        this.f121585b = addCardParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f121584a) {
            case 0:
                Data response = (Data) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                return new Pair(this.f121585b.f60307b, response);
            default:
                PaymentMethodResponseDto it8 = (PaymentMethodResponseDto) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return PaymentMethodResponseDtoMapperKt.toDomain(it8, TopUpContextMapperKt.toWalletId(this.f121585b.getF()));
        }
    }
}
