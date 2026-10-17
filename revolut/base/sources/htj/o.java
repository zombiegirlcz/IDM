package htj;

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
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new ht1.e(3)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f155431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f155432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155433c;

    public /* synthetic */ o(int i, f fVar, List list, String str) {
        if (7 != (i & 7)) {
            j1.f(m.f155430a.getDescriptor(), i, 7);
            throw null;
        }
        this.f155431a = fVar;
        this.f155432b = list;
        this.f155433c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f155431a, oVar.f155431a) && Intrinsics.f(this.f155432b, oVar.f155432b) && Intrinsics.f(this.f155433c, oVar.f155433c);
    }

    public final int hashCode() {
        return this.f155433c.hashCode() + p.a.d(this.f155431a.hashCode() * 31, 31, this.f155432b);
    }
}
