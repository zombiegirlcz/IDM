package wbc;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f296114b;

    public l(String name, ArrayList modifiers) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(modifiers, "modifiers");
        this.f296113a = name;
        this.f296114b = modifiers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f296113a, lVar.f296113a) && this.f296114b.equals(lVar.f296114b);
    }

    public final int hashCode() {
        return this.f296114b.hashCode() + (this.f296113a.hashCode() * 31);
    }
}
