package hem;

import io.ktor.utils.io.t;
import kem.b0;
import kem.d0;
import kem.v;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public abstract class c implements v, CoroutineScope {
    public abstract wdm.f a();

    public abstract t b();

    public abstract qem.d c();

    public abstract qem.d d();

    public abstract d0 e();

    public abstract b0 f();

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("HttpResponse[");
        Intrinsics.checkNotNullParameter(this, "<this>");
        sb6.append(a().c().getUrl());
        sb6.append(", ");
        sb6.append(e());
        sb6.append(']');
        return sb6.toString();
    }
}
