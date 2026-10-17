package wbj;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f296234a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f296234a, ((d) obj2).f296234a);
    }

    public final int hashCode() {
        return this.f296234a.hashCode();
    }

    public d(Data depositReturnContent) {
        Intrinsics.checkNotNullParameter(depositReturnContent, "depositReturnContent");
        this.f296234a = depositReturnContent;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
