package j87;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.functions.Function1;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f172143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f172144c;
    public final /* synthetic */ List d;

    public /* synthetic */ h(Data data, List list, List list2) {
        this.f172142a = 0;
        this.f172144c = list;
        this.d = list2;
        this.f172143b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f172142a) {
            case 0:
                f fVar = (f) obj2;
                wi0.b bVar = fVar.f172140b.d;
                List list = this.f172144c;
                if (bVar == null) {
                    bVar = (wi0.b) d0.d0(list);
                }
                return f.a(fVar, e.a(fVar.f172140b, null, list, this.d, bVar, 17), this.f172143b, 1);
            case 1:
                w2e.a aVar = (w2e.a) obj2;
                List list2 = this.f172144c;
                List list3 = this.d != null ? list2 : aVar.f294027c;
                aVar.getClass();
                return w2e.a.a(this.f172143b, list2, list3);
            default:
                w2e.a aVar2 = (w2e.a) obj2;
                List list4 = this.f172144c;
                List list5 = this.d != null ? list4 : aVar2.f294027c;
                aVar2.getClass();
                return w2e.a.a(this.f172143b, list4, list5);
        }
    }

    public /* synthetic */ h(Data data, List list, List list2, int i) {
        this.f172142a = i;
        this.f172143b = data;
        this.f172144c = list;
        this.d = list2;
    }
}
