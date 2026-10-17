package zsc;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends atc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final atc.b f324864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vea.n f324865b;

    public a(atc.b delegate, vea.n mapper) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f324864a = delegate;
        this.f324865b = mapper;
    }

    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        this.f324864a.a(this.f324865b.invoke(obj2), targetCollection);
    }

    @Override // atc.b
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f324864a, aVar.f324864a) && this.f324865b.equals(aVar.f324865b);
    }

    @Override // atc.b
    public final int hashCode() {
        return this.f324864a.hashCode();
    }
}
