package hrg;

import java.util.Map;
import jki.i;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f154823a;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f154823a, ((a) obj2).f154823a);
    }

    public final int hashCode() {
        return this.f154823a.hashCode();
    }

    public a(Map remoteUrlHeaders) {
        Intrinsics.checkNotNullParameter(remoteUrlHeaders, "remoteUrlHeaders");
        this.f154823a = remoteUrlHeaders;
    }

    public /* synthetic */ a(int i) {
        this(r0.g());
    }
}
