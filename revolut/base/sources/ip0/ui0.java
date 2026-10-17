package ip0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ui0 implements koi.j, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f166686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ti0 f166687c;
    public final Object d;

    public ui0(String listId, List items, ti0 button, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f166685a = listId;
        this.f166686b = items;
        this.f166687c = button;
        this.d = obj2;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF51565t() {
        return this.d;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51552a() {
        return this.f166685a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ui0)) {
            return false;
        }
        ui0 ui0Var = (ui0) obj2;
        return Intrinsics.f(this.f166685a, ui0Var.f166685a) && Intrinsics.f(this.f166686b, ui0Var.f166686b) && Intrinsics.f(this.f166687c, ui0Var.f166687c) && Intrinsics.f(this.d, ui0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f166687c.hashCode() + p.a.d(this.f166685a.hashCode() * 31, 31, this.f166686b)) * 31;
        Object obj2 = this.d;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof ui0)) {
            super.z(oldItem);
            return null;
        }
        ti0 oldItem2 = ((ui0) oldItem).f166687c;
        ti0 ti0Var = this.f166687c;
        ti0Var.getClass();
        Intrinsics.checkNotNullParameter(oldItem2, "oldItem");
        return new vi0(new si0(oldItem2.f166524a != ti0Var.f166524a, oldItem2.f166525b != ti0Var.f166525b, !Intrinsics.f(oldItem2.f166526c, ti0Var.f166526c), !Intrinsics.f(oldItem2.d, ti0Var.d)));
    }

    public /* synthetic */ ui0(String str, List list, ti0 ti0Var, int i) {
        this(str, list, (i & 4) != 0 ? new ti0(false, false, null, null) : ti0Var, (Object) null);
    }
}
