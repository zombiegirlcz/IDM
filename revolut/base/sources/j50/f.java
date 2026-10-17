package j50;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f171430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f171431c;
    public final List d;
    public final String e;

    public f(String str, UUID referenceId, boolean z, List chosenTags, String str2) {
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        Intrinsics.checkNotNullParameter(chosenTags, "chosenTags");
        this.f171429a = str;
        this.f171430b = referenceId;
        this.f171431c = z;
        this.d = chosenTags;
        this.e = str2;
    }

    public static f a(f fVar, String str, ArrayList chosenTags, String str2, int i) {
        if ((i & 1) != 0) {
            str = fVar.f171429a;
        }
        UUID referenceId = fVar.f171430b;
        boolean z = fVar.f171431c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        Intrinsics.checkNotNullParameter(chosenTags, "chosenTags");
        return new f(str, referenceId, z, chosenTags, str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f171429a, fVar.f171429a) && this.f171430b.equals(fVar.f171430b) && this.f171431c == fVar.f171431c && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        String str = this.f171429a;
        int iD = p.a.d(j6.a.c(t61.a.f(this.f171430b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.f171431c), 31, this.d);
        String str2 = this.e;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}
