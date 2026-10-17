package z0m;

import android.net.NetworkInfo;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes23.dex */
public final class m extends kotlin.jvm.internal.u implements Function0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f318648h;
    public final /* synthetic */ NetworkInfo i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, NetworkInfo networkInfo, int i) {
        super(0);
        this.f = i;
        this.f318648h = oVar;
        this.i = networkInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f) {
            case 0:
                this.f318648h.f318652c.getClass();
                NetworkInfo networkInfo = this.i;
                if (networkInfo != null) {
                    String typeName = networkInfo.getTypeName();
                    Intrinsics.checkNotNullExpressionValue(typeName, "networkInfo.typeName");
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                    String lowerCase = typeName.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (Intrinsics.f(lowerCase, "mobile") ? true : Intrinsics.f(lowerCase, "wifi")) {
                        return lowerCase;
                    }
                }
                return "offline";
            default:
                this.f318648h.f318652c.getClass();
                NetworkInfo networkInfo2 = this.i;
                if (networkInfo2 == null || !a0.z(networkInfo2.getTypeName(), "MOBILE", true)) {
                    return null;
                }
                return networkInfo2.getSubtypeName();
        }
    }
}
