package w4l;

import com.revolut.data.model.Data;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f294626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f294627c;

    public /* synthetic */ a(f fVar, Object obj2, int i) {
        this.f294625a = i;
        this.f294626b = fVar;
        this.f294627c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f294625a) {
            case 0:
                Object content = ((Data) obj2).getContent();
                if (content != null) {
                    this.f294626b.f294635b.invoke(this.f294627c, content);
                }
                break;
            case 1:
                f fVar = this.f294626b;
                Function2 function2 = fVar.f294635b;
                Intrinsics.h(obj2);
                Object obj3 = this.f294627c;
                function2.invoke(obj3, obj2);
                fVar.d.invoke(obj3, obj2);
                break;
            default:
                f fVar2 = this.f294626b;
                ConcurrentHashMap concurrentHashMap = fVar2.k;
                Object obj4 = this.f294627c;
                concurrentHashMap.remove(obj4);
                fVar2.f294640l.remove(obj4);
                fVar2.i(obj4).onNext(new Data(obj2, null, false, 6, null));
                break;
        }
        return Unit.f186387a;
    }
}
