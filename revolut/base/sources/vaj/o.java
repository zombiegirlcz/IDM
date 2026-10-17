package vaj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f287319b = {yhm.j.c(yhm.k.PUBLICATION, new v4a.a(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f287320a;

    public /* synthetic */ o(int i, List list) {
        if (1 == (i & 1)) {
            this.f287320a = list;
        } else {
            j1.f(m.f287318a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f287320a, ((o) obj2).f287320a);
    }

    public final int hashCode() {
        return this.f287320a.hashCode();
    }

    public o(ArrayList launches) {
        Intrinsics.checkNotNullParameter(launches, "launches");
        this.f287320a = launches;
    }
}
