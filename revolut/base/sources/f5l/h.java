package f5l;

import android.content.Context;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import yhm.j;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements g5l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f132368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f132369b;

    public h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f132368a = context;
        this.f132369b = j.b(new es.e(this, 15));
    }

    @Override // g5l.a
    public final Flow a() {
        return q.q(q.k(new esa.i(this, (Continuation) null, 18)));
    }
}
