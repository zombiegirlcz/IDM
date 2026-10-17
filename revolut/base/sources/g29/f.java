package g29;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class f {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f139951b = {j.c(k.PUBLICATION, new fyh.k(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f139952a;

    public /* synthetic */ f(int i, List list) {
        if (1 == (i & 1)) {
            this.f139952a = list;
        } else {
            j1.f(a.f139946a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f139952a, ((f) obj2).f139952a);
    }

    public final int hashCode() {
        return this.f139952a.hashCode();
    }

    public f(ArrayList requestedContent) {
        Intrinsics.checkNotNullParameter(requestedContent, "requestedContent");
        this.f139952a = requestedContent;
    }
}
