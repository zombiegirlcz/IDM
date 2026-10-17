package i8l;

import android.os.Parcel;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private a() {
    }

    public static BigDecimal a(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        if (string != null) {
            return new BigDecimal(string);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static void b(BigDecimal bigDecimal, Parcel parcel) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(bigDecimal.toPlainString());
    }
}
