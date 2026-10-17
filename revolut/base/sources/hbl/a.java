package hbl;

import hb4.k;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f150755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f150756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f150757c;

    public a(Set selectedIds, boolean z, Function1 selectableStateProvider) {
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        Intrinsics.checkNotNullParameter(selectableStateProvider, "selectableStateProvider");
        this.f150755a = selectedIds;
        this.f150756b = z;
        this.f150757c = selectableStateProvider;
    }

    @Override // hbl.c
    public final boolean a() {
        return this.f150756b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f150755a, aVar.f150755a) && this.f150756b == aVar.f150756b && Intrinsics.f(this.f150757c, aVar.f150757c);
    }

    public final int hashCode() {
        return this.f150757c.hashCode() + j6.a.c(this.f150755a.hashCode() * 31, 31, this.f150756b);
    }

    public /* synthetic */ a(Set set, boolean z) {
        this(set, z, new k(21));
    }
}
