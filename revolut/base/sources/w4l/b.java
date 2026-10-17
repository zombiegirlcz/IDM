package w4l;

import com.revolut.data.model.Data;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ihm.k f294629b;

    public /* synthetic */ b(ihm.k kVar, int i) {
        this.f294628a = i;
        this.f294629b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f294628a) {
            case 0:
                Data storageData = (Data) obj2;
                Intrinsics.checkNotNullParameter(storageData, "storageData");
                Data dataCopy$default = Data.copy$default(storageData, null, null, true, 3, null);
                this.f294629b.onNext(dataCopy$default);
                return dataCopy$default;
            default:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                Data data = new Data(null, error, true);
                this.f294629b.onNext(data);
                return d0.m(data);
        }
    }
}
