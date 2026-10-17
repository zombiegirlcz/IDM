package cw7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f109561a;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f109561a, ((f) obj2).f109561a);
    }

    public final int hashCode() {
        return this.f109561a.hashCode();
    }

    public f(Data policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        this.f109561a = policy;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
