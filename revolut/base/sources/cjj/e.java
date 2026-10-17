package cjj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f24690a;

    public e(Data phoneNumberSelections) {
        Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
        this.f24690a = phoneNumberSelections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f24690a, ((e) obj2).f24690a);
    }

    public final int hashCode() {
        return this.f24690a.hashCode();
    }
}
