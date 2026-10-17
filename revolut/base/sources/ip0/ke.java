package ip0;

import com.revolut.core.ui_kit.delegates.DisplayAmountToggleDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ke implements vn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je f164999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je f165000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f165001c;

    public ke(je primaryOption, je secondaryOption, String selectedOptionId) {
        Intrinsics.checkNotNullParameter("displayAmountToggleDelegate_displayAmount", "listId");
        Intrinsics.checkNotNullParameter(primaryOption, "primaryOption");
        Intrinsics.checkNotNullParameter(secondaryOption, "secondaryOption");
        Intrinsics.checkNotNullParameter(selectedOptionId, "selectedOptionId");
        this.f164999a = primaryOption;
        this.f165000b = secondaryOption;
        this.f165001c = selectedOptionId;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new DisplayAmountToggleDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52603a() {
        return "displayAmountToggleDelegate_displayAmount";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ke)) {
            return false;
        }
        ke keVar = (ke) obj2;
        return this.f164999a.equals(keVar.f164999a) && this.f165000b.equals(keVar.f165000b) && Intrinsics.f(this.f165001c, keVar.f165001c);
    }

    public final int hashCode() {
        return this.f165001c.hashCode() + ((this.f165000b.hashCode() + ((this.f164999a.hashCode() + 305059314) * 31)) * 31);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof ke ? (ke) oldItem : null) == null) {
            return null;
        }
        ((ke) oldItem).getClass();
        return new le(!true, !r7.f164999a.equals(this.f164999a), !r7.f165000b.equals(this.f165000b), !Intrinsics.f(r7.f165001c, this.f165001c));
    }
}
