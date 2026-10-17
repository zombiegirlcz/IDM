package ame;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f6360a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f6360a, ((d) obj2).f6360a);
    }

    public final int hashCode() {
        return this.f6360a.hashCode();
    }

    public d(Data dataTerms) {
        Intrinsics.checkNotNullParameter(dataTerms, "dataTerms");
        this.f6360a = dataTerms;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
