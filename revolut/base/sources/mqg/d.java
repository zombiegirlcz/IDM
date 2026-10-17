package mqg;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import pcd.s;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d extends q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, bcb.d.class, "<init>", "<init>(Lcom/revolut/feature/shared/savings/models/vault/Vault;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        s p0 = (s) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new bcb.d(p0);
    }
}
