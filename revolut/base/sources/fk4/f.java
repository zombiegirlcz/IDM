package fk4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f135708a;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f135708a, ((f) obj2).f135708a);
    }

    public final int hashCode() {
        return this.f135708a.hashCode();
    }

    public f(Data externalLinkedAccounts) {
        Intrinsics.checkNotNullParameter(externalLinkedAccounts, "externalLinkedAccounts");
        this.f135708a = externalLinkedAccounts;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
