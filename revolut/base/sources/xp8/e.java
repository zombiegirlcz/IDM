package xp8;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f307903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f307904b;

    public e(dj0.d reward, List suggestions) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f307903a = reward;
        this.f307904b = suggestions;
    }

    public static e a(e eVar, dj0.d reward, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            reward = eVar.f307903a;
        }
        List suggestions = arrayList;
        if ((i & 2) != 0) {
            suggestions = eVar.f307904b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        return new e(reward, suggestions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f307903a, eVar.f307903a) && Intrinsics.f(this.f307904b, eVar.f307904b);
    }

    public final int hashCode() {
        return this.f307904b.hashCode() + (this.f307903a.hashCode() * 31);
    }
}
