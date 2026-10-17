package nrl;

import java.lang.reflect.Type;
import kg.u;
import kg.w;
import kg.y;
import kg.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import orl.f;
import orl.h;
import orl.i;
import orl.k;
import orl.l;
import orl.o;
import orl.p;
import orl.q;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements z {
    @Override // kg.z
    public final u serialize(Object obj2, Type type, y context) {
        Class cls;
        o src2 = (o) obj2;
        Intrinsics.checkNotNullParameter(src2, "src");
        Intrinsics.checkNotNullParameter(context, "context");
        if (src2 instanceof p) {
            cls = p.class;
        } else if (src2 instanceof q) {
            cls = q.class;
        } else if (src2 instanceof f) {
            cls = f.class;
        } else if (src2 instanceof i) {
            cls = i.class;
        } else if (src2 instanceof h) {
            cls = h.class;
        } else if (src2 instanceof k) {
            cls = k.class;
        } else {
            if (!(src2 instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            cls = l.class;
        }
        w wVarC = ((a31.a) context).o(src2, cls).c();
        Intrinsics.checkNotNullExpressionValue(wVarC, "getAsJsonObject(...)");
        return wVarC;
    }
}
