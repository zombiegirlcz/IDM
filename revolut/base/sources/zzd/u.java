package zzd;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f326697b;

    public /* synthetic */ u(Object obj2, int i) {
        this.f326696a = i;
        this.f326697b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f326696a) {
            case 0:
                f0e.b bVar = (f0e.b) this.f326697b;
                q update = (q) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return q.a(update, new Data(null, null, true, 3, null), null, bVar.f131106a, null, null, null, 58);
            default:
                return q.a((q) obj2, null, null, null, null, (a0e.r) this.f326697b, null, 47);
        }
    }
}
