package lb;

import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SimpleDateFormat f193514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Date f193515c;

    public /* synthetic */ q(SimpleDateFormat simpleDateFormat, Date date, int i) {
        this.f193513a = i;
        this.f193514b = simpleDateFormat;
        this.f193515c = date;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f193513a) {
            case 0:
                return com.fourthline.kyc.internal.g.c(this.f193514b, this.f193515c, (com.fourthline.kyc.internal.e) obj2);
            case 1:
                return com.fourthline.kyc.internal.g.d(this.f193514b, this.f193515c, (com.fourthline.kyc.internal.e) obj2);
            case 2:
                return com.fourthline.kyc.internal.g.a(this.f193514b, this.f193515c, (com.fourthline.kyc.internal.e) obj2);
            default:
                return com.fourthline.kyc.internal.g.b(this.f193514b, this.f193515c, (com.fourthline.kyc.internal.e) obj2);
        }
    }
}
