package po0;

import android.content.Context;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class u implements t, kotlin.jvm.internal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f237864a;

    public u(Context context) {
        this.f237864a = context;
    }

    @Override // po0.t
    public final int a(int i) {
        return kli.a.s(i, this.f237864a);
    }

    public final boolean equals(Object obj2) {
        if ((obj2 instanceof t) && (obj2 instanceof kotlin.jvm.internal.n)) {
            return Intrinsics.f(getFunctionDelegate(), ((kotlin.jvm.internal.n) obj2).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        return new kotlin.jvm.internal.q(1, 1, kli.a.class, this.f237864a, "obtainColorFromAttr", "obtainColorFromAttr(Landroid/content/Context;I)I");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
