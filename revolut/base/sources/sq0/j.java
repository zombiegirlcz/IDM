package sq0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class j extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f264986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f264987c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i, f position) {
        super(position);
        Intrinsics.checkNotNullParameter(position, "position");
        this.f264986b = i;
        this.f264987c = -1;
    }

    @Override // sq0.g
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!getClass().equals(obj2 != null ? obj2.getClass() : null) || !super.equals(obj2)) {
            return false;
        }
        j jVar = obj2 instanceof j ? (j) obj2 : null;
        return jVar != null && this.f264986b == jVar.f264986b;
    }

    @Override // sq0.g
    public final int hashCode() {
        return Integer.hashCode(this.f264986b) + (super.hashCode() * 31);
    }

    public final String toString() {
        return j6.a.l(this.f264986b, "PaddingDecorationDelegate(paddingAttr=", ")");
    }

    public final int u(RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i = this.f264987c;
        if (i != -1) {
            return i;
        }
        int i2 = this.f264986b;
        if (i2 == 0) {
            this.f264987c = 0;
            return 0;
        }
        int iA = p31.a.m(parent).a(i2);
        this.f264987c = iA;
        return iA;
    }

    public final int v() {
        return this.f264986b;
    }
}
