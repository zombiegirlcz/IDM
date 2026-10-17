package my9;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.bc;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f210432b;

    public /* synthetic */ r(u uVar, int i) {
        this.f210431a = i;
        this.f210432b = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f210431a) {
            case 0:
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                efm.r map = this.f210432b.d.map(new bc(new lsl.d(items, 18), 25));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            default:
                ly9.j item = (ly9.j) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                return new o97.y(this.f210432b.f, item, null, 60);
        }
    }
}
