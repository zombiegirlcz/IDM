package afa;

import com.revolut.data.model.Data;
import com.youTransactor.uCube.rpc.Constants;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f4011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f4012c;

    public /* synthetic */ w(Data data, Map map, int i) {
        this.f4010a = i;
        this.f4011b = data;
        this.f4012c = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f4010a) {
            case 0:
                Data data = this.f4011b;
                Intrinsics.h(data);
                return g.a((g) obj2, null, null, null, data, this.f4012c, null, null, null, Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION);
            case 1:
                return dmj.a0.a((dmj.a0) obj2, null, null, this.f4011b, null, null, null, false, this.f4012c, 123);
            case 2:
                return njj.b0.a((njj.b0) obj2, null, null, null, null, this.f4011b, null, null, false, this.f4012c, 239);
            default:
                return rx5.a.a((rx5.a) obj2, null, this.f4011b, this.f4012c, 1);
        }
    }
}
