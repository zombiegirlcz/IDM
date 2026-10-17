package q2j;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.q implements Function1 {
    public static final s f = new s();

    public s() {
        super(1, p.class, "<init>", "<init>(Lcom/revolut/feature/pockets/api/interactors/PocketDetailsInteractor$GetOrCreatePocketResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        eda.e p0 = (eda.e) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new p(p0);
    }
}
