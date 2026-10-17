package mjf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.q implements Function1 {
    public static final s f = new s();

    public s() {
        super(1, l71.f.class, "isHungary", "isHungary(Lcom/revolut/domain/models/user/UserCompany;)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        l71.d p0 = (l71.d) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(l71.f.d(p0));
    }
}
