package qmg;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f247824a;

    public a(Data checklistItem) {
        Intrinsics.checkNotNullParameter(checklistItem, "checklistItem");
        this.f247824a = checklistItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f247824a, ((a) obj2).f247824a);
    }

    public final int hashCode() {
        return this.f247824a.hashCode();
    }
}
