package sdl;

import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new s8f.h(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f261941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f261942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f261943c;

    public /* synthetic */ c(int i, UUID uuid, String str, e eVar) {
        if (7 != (i & 7)) {
            qlm.j1.f(a.f261937a.getDescriptor(), i, 7);
            throw null;
        }
        this.f261941a = uuid;
        this.f261942b = str;
        this.f261943c = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f261941a, cVar.f261941a) && Intrinsics.f(this.f261942b, cVar.f261942b) && this.f261943c == cVar.f261943c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f261941a.hashCode() * 31, 31, this.f261942b);
        e eVar = this.f261943c;
        return iC + (eVar == null ? 0 : eVar.hashCode());
    }

    public c(UUID id10, String displayName, e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.f261941a = id10;
        this.f261942b = displayName;
        this.f261943c = eVar;
    }
}
