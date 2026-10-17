package zw5;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f325737b;

    public /* synthetic */ h(n nVar, int i) {
        this.f325736a = i;
        this.f325737b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f325736a) {
            case 0:
                this.f325737b.x2(new znc.m((Data) obj2, 18));
                break;
            default:
                fx5.f outputData = (fx5.f) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                n.A2(this.f325737b, null, null, null, null, outputData.f138739a, 15);
                break;
        }
        return Unit.f186387a;
    }
}
