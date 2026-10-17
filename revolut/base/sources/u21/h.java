package u21;

import com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee;
import com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFeeMessage;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import xze.a;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class h extends q implements Function1 {
    public static final h f = new h();

    public h() {
        super(1, wze.a.class, "toDomain", "toDomain(Lcom/revolut/feature/topup_screen/impl/google_pay/core/model/GooglePayFeeDto;)Lcom/revolut/feature/topup_screen/api/google_pay/models/GooglePayFee;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xze.a p0 = (xze.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        String type = p0.getType();
        int iHashCode = type.hashCode();
        if (iHashCode != -592089436) {
            if (iHashCode != -336361487) {
                if (iHashCode == 815738968 && type.equals("FEE_REQUIRED")) {
                    a.b message = p0.getMessage();
                    if (message == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    GooglePayFeeMessage googlePayFeeMessage = new GooglePayFeeMessage(message.getTitle(), message.getContent());
                    jo3.a fee2 = p0.getFee();
                    if (fee2 != null) {
                        return new GooglePayFee.FeeRequired(googlePayFeeMessage, mo3.a.o(fee2));
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else if (type.equals("FEE_OMITTED")) {
                a.b message2 = p0.getMessage();
                if (message2 != null) {
                    return new GooglePayFee.FeeOmitted(new GooglePayFeeMessage(message2.getTitle(), message2.getContent()));
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        } else if (type.equals("FEE_NOT_APPLICABLE")) {
            return GooglePayFee.FeeNotApplicable.f90517a;
        }
        throw new IllegalArgumentException(j6.a.q("Unknown fee type: ", p0.getType()));
    }
}
