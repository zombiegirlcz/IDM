package rq7;

import com.revolut.feature.insurance_car.impl.data.model.TodoItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TodoItem f256494a;

    public o(TodoItem todoItem) {
        Intrinsics.checkNotNullParameter(todoItem, "todoItem");
        this.f256494a = todoItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f256494a, ((o) obj2).f256494a);
    }

    public final int hashCode() {
        return this.f256494a.hashCode();
    }
}
