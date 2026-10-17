package dm3;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f115849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b6k.e f115850c;

    public /* synthetic */ y(Data data, b6k.e eVar, int i) {
        this.f115848a = i;
        this.f115849b = data;
        this.f115850c = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f115848a) {
            case 0:
                Data data = this.f115849b;
                Intrinsics.h(data);
                return e.a((e) obj2, data, null, null, null, null, false, this.f115850c, false, false, null, 3835);
            case 1:
                Data data2 = this.f115849b;
                Intrinsics.h(data2);
                return fo9.h.a((fo9.h) obj2, null, data2, this.f115850c, null, 9);
            case 2:
                return h3j.e.a((h3j.e) obj2, null, this.f115849b, this.f115850c, null, null, 51);
            default:
                return z32.a.a((z32.a) obj2, null, null, this.f115849b, this.f115850c, null, 19);
        }
    }
}
