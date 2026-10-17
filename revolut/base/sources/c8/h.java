package c8;

import android.content.Context;
import e8.e0;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22064a;

    public h(o... oVarArr) {
        if (oVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f22064a = Arrays.asList(oVarArr);
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        if (obj2 instanceof h) {
            return this.f22064a.equals(((h) obj2).f22064a);
        }
        return false;
    }

    @Override // c8.g
    public final int hashCode() {
        return this.f22064a.hashCode();
    }

    @Override // c8.o
    public final e0 transform(Context context, e0 e0Var, int i, int i2) {
        Iterator it8 = this.f22064a.iterator();
        e0 e0Var2 = e0Var;
        while (it8.hasNext()) {
            e0 e0VarTransform = ((o) it8.next()).transform(context, e0Var2, i, i2);
            if (e0Var2 != null && !e0Var2.equals(e0Var) && !e0Var2.equals(e0VarTransform)) {
                e0Var2.recycle();
            }
            e0Var2 = e0VarTransform;
        }
        return e0Var2;
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Iterator it8 = this.f22064a.iterator();
        while (it8.hasNext()) {
            ((o) it8.next()).updateDiskCacheKey(messageDigest);
        }
    }
}
