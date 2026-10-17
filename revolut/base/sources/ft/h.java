package ft;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectableDelegate.Model f137748a;

    public h(SelectableDelegate.Model selectableDelegateModel) {
        Intrinsics.checkNotNullParameter(selectableDelegateModel, "selectableDelegateModel");
        this.f137748a = selectableDelegateModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f137748a, ((h) obj2).f137748a);
    }

    public final int hashCode() {
        return this.f137748a.hashCode();
    }
}
