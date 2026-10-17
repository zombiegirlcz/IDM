package zkk;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import m9d.z;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f323080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Data f323081c;

    public /* synthetic */ r(Data data, Data data2, int i) {
        this.f323079a = i;
        this.f323080b = data;
        this.f323081c = data2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f323079a) {
            case 0:
                return j.a((j) obj2, this.f323080b, this.f323081c, null, 4);
            default:
                return z.a((z) obj2, null, null, null, null, null, null, this.f323080b, this.f323081c, null, null, null, false, false, null, null, null, false, 261951);
        }
    }
}
