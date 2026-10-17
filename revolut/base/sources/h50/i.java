package h50;

import cli.j;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f149415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f149416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f149417c;
    public final Set d;
    public final String e;

    public i(UUID messageId, boolean z, List negativeTags, Set chosenTags, String comment) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(negativeTags, "negativeTags");
        Intrinsics.checkNotNullParameter(chosenTags, "chosenTags");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f149415a = messageId;
        this.f149416b = z;
        this.f149417c = negativeTags;
        this.d = chosenTags;
        this.e = comment;
    }

    public static i a(i iVar, LinkedHashSet linkedHashSet, String str, int i) {
        UUID messageId = iVar.f149415a;
        boolean z = iVar.f149416b;
        List negativeTags = iVar.f149417c;
        Set set = linkedHashSet;
        if ((i & 8) != 0) {
            set = iVar.d;
        }
        Set chosenTags = set;
        if ((i & 16) != 0) {
            str = iVar.e;
        }
        String comment = str;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(negativeTags, "negativeTags");
        Intrinsics.checkNotNullParameter(chosenTags, "chosenTags");
        Intrinsics.checkNotNullParameter(comment, "comment");
        return new i(messageId, z, negativeTags, chosenTags, comment);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f149415a, iVar.f149415a) && this.f149416b == iVar.f149416b && Intrinsics.f(this.f149417c, iVar.f149417c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.f(p.a.d(j6.a.c(this.f149415a.hashCode() * 31, 31, this.f149416b), 31, this.f149417c), 31, this.d);
    }
}
