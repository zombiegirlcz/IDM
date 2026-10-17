package m9l;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiFunction;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements BiFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f203831b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f203830a = i;
        this.f203831b = obj2;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj2, Object obj3) {
        switch (this.f203830a) {
            case 0:
                return (g) ((m84.e) this.f203831b).invoke(obj2, obj3);
            case 1:
                mbm.a aVar = (mbm.a) this.f203831b;
                List list = (List) obj3;
                if (list != null) {
                    list.add(aVar);
                    return list;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                copyOnWriteArrayList.add(aVar);
                return copyOnWriteArrayList;
            case 2:
                return (sjf.c) ((qce.b) this.f203831b).invoke(obj2, obj3);
            default:
                return (sjf.c) ((sjf.a) this.f203831b).invoke(obj2, obj3);
        }
    }
}
