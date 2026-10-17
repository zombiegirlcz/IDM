package eb8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p98.a f124300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f124301c;

    public /* synthetic */ e(int i, String str, p98.a aVar, k kVar) {
        if (3 != (i & 3)) {
            j1.f(c.f124298a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124299a = str;
        this.f124300b = aVar;
        if ((i & 4) == 0) {
            this.f124301c = null;
        } else {
            this.f124301c = kVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f124299a, eVar.f124299a) && this.f124300b == eVar.f124300b && Intrinsics.f(this.f124301c, eVar.f124301c);
    }

    public final int hashCode() {
        int iHashCode = (this.f124300b.hashCode() + (this.f124299a.hashCode() * 31)) * 31;
        k kVar = this.f124301c;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public e(String id10, p98.a state, k kVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f124299a = id10;
        this.f124300b = state;
        this.f124301c = kVar;
    }
}
