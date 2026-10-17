package hi2;

import com.revolut.feature.apm.wero.impl.ui.pay.create.CreateRequestLinkData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f152462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f152463c;

    public /* synthetic */ k(n nVar, String str, int i) {
        this.f152461a = i;
        this.f152462b = nVar;
        this.f152463c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f152461a) {
            case 0:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e.a(update, CreateRequestLinkData.a(this.f152462b.I2(), 0L, this.f152463c, 3), null, 0, 6);
            default:
                CreateRequestLinkData updateData = (CreateRequestLinkData) obj2;
                Intrinsics.checkNotNullParameter(updateData, "$this$updateData");
                return CreateRequestLinkData.a(updateData, this.f152462b.f152467r.b(this.f152463c, updateData.f63100b.f306286a), null, 6);
        }
    }
}
