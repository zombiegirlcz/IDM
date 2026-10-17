package o5l;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements Serializable {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f222471b;

    public m(String groupId, ArrayList designs) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(designs, "designs");
        this.f222470a = groupId;
        this.f222471b = designs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f222470a, mVar.f222470a) && this.f222471b.equals(mVar.f222471b);
    }

    public final int hashCode() {
        return this.f222471b.hashCode() + (this.f222470a.hashCode() * 29791);
    }
}
