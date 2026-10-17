package b4d;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f12293b;

    public /* synthetic */ a(HashMap map, int i) {
        this.f12292a = i;
        this.f12293b = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f12292a) {
            case 0:
                c4d.a it8 = (c4d.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Integer num = (Integer) this.f12293b.get(it8.g());
                if (num != null) {
                    return num;
                }
                throw new IllegalStateException(j6.a.q("Unable to find assetTypeKeyToOrder, alertId=", it8.g()));
            case 1:
                s6b.g update = (s6b.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return s6b.g.a(update, this.f12293b, null, null, false, 14);
            default:
                u6b.e update2 = (u6b.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return u6b.e.a(update2, this.f12293b, null, null, false, 14);
        }
    }
}
