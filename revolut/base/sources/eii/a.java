package eii;

import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountCellItemDelegate.Model f126645a;

    public a(AccountCellItemDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f126645a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f126645a, ((a) obj2).f126645a);
    }

    public final int hashCode() {
        return this.f126645a.hashCode();
    }
}
