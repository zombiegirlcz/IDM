package xsi;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f308538b;

    public /* synthetic */ n(b bVar, int i) {
        this.f308537a = i;
        this.f308538b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        c update = (c) obj2;
        switch (this.f308537a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
        }
        return c.a(update, new Data(this.f308538b, null, false, 6, null));
    }
}
