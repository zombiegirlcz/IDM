package bmm;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class l implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f16943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16944c;
    public final /* synthetic */ b d;

    public /* synthetic */ l(u uVar, int i, b bVar, int i2) {
        this.f16942a = i2;
        this.f16943b = uVar;
        this.f16944c = i;
        this.d = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16942a) {
            case 0:
                u uVar = this.f16943b;
                int i = this.f16944c;
                b statusCode = this.d;
                try {
                    Intrinsics.checkNotNullParameter(statusCode, "statusCode");
                    uVar.f16976x.i(i, statusCode);
                    break;
                } catch (IOException e) {
                    b bVar = b.PROTOCOL_ERROR;
                    uVar.d(bVar, bVar, e);
                }
                return Unit.f186387a;
            default:
                u uVar2 = this.f16943b;
                int i2 = this.f16944c;
                b errorCode = this.d;
                uVar2.k.getClass();
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                synchronized (uVar2) {
                    uVar2.z.remove(Integer.valueOf(i2));
                }
                return Unit.f186387a;
        }
    }
}
