package hji;

import com.revolut.kompot.navigable.flow.BaseFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f152825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BaseFlow f152826c;
    public final boolean d;

    public a(com.revolut.kompot.navigable.a screen, BaseFlow parentFlow, boolean z) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(parentFlow, "parentFlow");
        this.f152825b = screen;
        this.f152826c = parentFlow;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f152825b.equals(aVar.f152825b) && this.f152826c.equals(aVar.f152826c) && this.d == aVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f152826c.hashCode() + (this.f152825b.hashCode() * 31)) * 31);
    }
}
