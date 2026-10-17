package lb;

import com.fourthline.orca.internal.jg0;
import com.fourthline.orca.internal.qz;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f193477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f193478c;

    public /* synthetic */ b(long j2, jg0 jg0Var) {
        this.f193476a = 5;
        this.f193478c = j2;
        this.f193477b = jg0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f193476a) {
            case 0:
                return com.fourthline.kyc.internal.g.d((com.fourthline.kyc.internal.g) this.f193477b, this.f193478c, (com.fourthline.kyc.internal.e) obj2);
            case 1:
                return com.fourthline.kyc.internal.g.b((com.fourthline.kyc.internal.g) this.f193477b, this.f193478c, (com.fourthline.kyc.internal.e) obj2);
            case 2:
                return com.fourthline.kyc.internal.g.e((com.fourthline.kyc.internal.g) this.f193477b, this.f193478c, (com.fourthline.kyc.internal.e) obj2);
            case 3:
                return com.fourthline.kyc.internal.g.c((com.fourthline.kyc.internal.g) this.f193477b, this.f193478c, (com.fourthline.kyc.internal.e) obj2);
            case 4:
                return com.fourthline.kyc.internal.g.a((com.fourthline.kyc.internal.g) this.f193477b, this.f193478c, (com.fourthline.kyc.internal.e) obj2);
            default:
                return qz.a(this.f193478c, (jg0) this.f193477b, (OkHttpClient.a) obj2);
        }
    }

    public /* synthetic */ b(com.fourthline.kyc.internal.g gVar, long j2, int i) {
        this.f193476a = i;
        this.f193477b = gVar;
        this.f193478c = j2;
    }
}
