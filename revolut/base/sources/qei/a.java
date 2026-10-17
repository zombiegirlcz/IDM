package qei;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f245162a;

    public a(ArrayList rooms) {
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        this.f245162a = rooms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f245162a.equals(((a) obj2).f245162a);
    }

    public final int hashCode() {
        return this.f245162a.hashCode();
    }
}
