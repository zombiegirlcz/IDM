package dzb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f121300a;

    public b() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f121300a, ((b) obj2).f121300a);
    }

    public final int hashCode() {
        return this.f121300a.hashCode();
    }

    public b(Data challenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        this.f121300a = challenge;
    }

    public /* synthetic */ b(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
