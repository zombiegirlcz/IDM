package xz8;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f309892c = {yhm.j.c(yhm.k.PUBLICATION, new xsf.c(22)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f309893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f309894b;

    public /* synthetic */ d(int i, List list, String str) {
        if (3 != (i & 3)) {
            j1.f(b.f309891a.getDescriptor(), i, 3);
            throw null;
        }
        this.f309893a = list;
        this.f309894b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f309893a, dVar.f309893a) && Intrinsics.f(this.f309894b, dVar.f309894b);
    }

    public final int hashCode() {
        return this.f309894b.hashCode() + (this.f309893a.hashCode() * 31);
    }

    public d(List optionId, String questionId) {
        Intrinsics.checkNotNullParameter(optionId, "optionId");
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        this.f309893a = optionId;
        this.f309894b = questionId;
    }
}
