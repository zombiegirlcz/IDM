package e8;

import androidx.core.util.Pools$Pool;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pools$Pool f123436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f123437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f123438c;

    public c0(Class cls, Class cls2, Class cls3, List list, Pools$Pool pools$Pool) {
        this.f123436a = pools$Pool;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f123437b = list;
        this.f123438c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final e0 a(com.bumptech.glide.load.data.g gVar, c8.k kVar, int i, int i2, r10.w wVar, List list) throws GlideException {
        Pools$Pool pools$Pool;
        List list2;
        List list3 = this.f123437b;
        int size = list3.size();
        e0 e0VarD = null;
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = (n) list3.get(i3);
            try {
                pools$Pool = nVar.d;
                Object objAcquire = pools$Pool.acquire();
                y8.f.c(objAcquire, "Argument must not be null");
                list2 = (List) objAcquire;
            } catch (GlideException e) {
                e = e;
            }
            try {
                e0 e0VarA = nVar.a(gVar, i, i2, kVar, list2);
                pools$Pool.release(list2);
                try {
                    e0VarD = nVar.f123504c.d(wVar.t(e0VarA), kVar);
                } catch (GlideException e2) {
                    e = e2;
                    list.add(e);
                }
                if (e0VarD != null) {
                    break;
                }
            } catch (Throwable th10) {
                pools$Pool.release(list2);
                throw th10;
            }
        }
        if (e0VarD != null) {
            return e0VarD;
        }
        throw new GlideException(this.f123438c, new ArrayList(list));
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f123437b.toArray()) + CoreConstants.CURLY_RIGHT;
    }
}
