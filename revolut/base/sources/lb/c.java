package lb;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f193480b;

    public /* synthetic */ c(Map.Entry entry, int i) {
        this.f193479a = i;
        this.f193480b = entry;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f193479a) {
            case 0:
                return com.fourthline.kyc.internal.g.a(this.f193480b, (com.fourthline.kyc.internal.e) obj2);
            case 1:
                return com.fourthline.kyc.internal.g.b(this.f193480b, (com.fourthline.kyc.internal.e) obj2);
            default:
                return com.fourthline.kyc.internal.g.c(this.f193480b, (com.fourthline.kyc.internal.e) obj2);
        }
    }
}
