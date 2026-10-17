package i8;

import com.bumptech.glide.Registry;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public static final d e = new d(4);
    public static final z f = new z();
    public final gpk.c d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f159347a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f159349c = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f159348b = e;

    public b0(gpk.c cVar) {
        this.d = cVar;
    }

    public final synchronized u a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it8 = this.f159347a.iterator();
            boolean z = false;
            while (true) {
                boolean z3 = true;
                if (!it8.hasNext()) {
                    break;
                }
                a0 a0Var = (a0) it8.next();
                if (this.f159349c.contains(a0Var)) {
                    z = true;
                } else {
                    if (!a0Var.f159341a.isAssignableFrom(cls) || !a0Var.f159342b.isAssignableFrom(cls2)) {
                        z3 = false;
                    }
                    if (z3) {
                        this.f159349c.add(a0Var);
                        arrayList.add(a0Var.f159343c.a(this));
                        this.f159349c.remove(a0Var);
                    }
                }
            }
            if (arrayList.size() > 1) {
                d dVar = this.f159348b;
                gpk.c cVar = this.d;
                dVar.getClass();
                return new b(arrayList, cVar, 1);
            }
            if (arrayList.size() == 1) {
                return (u) arrayList.get(0);
            }
            if (!z) {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
            return f;
        } catch (Throwable th10) {
            this.f159349c.clear();
            throw th10;
        }
    }

    public final synchronized ArrayList b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (a0 a0Var : this.f159347a) {
                if (!this.f159349c.contains(a0Var) && a0Var.f159341a.isAssignableFrom(cls)) {
                    this.f159349c.add(a0Var);
                    arrayList.add(a0Var.f159343c.a(this));
                    this.f159349c.remove(a0Var);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (a0 a0Var : this.f159347a) {
            if (!arrayList.contains(a0Var.f159342b) && a0Var.f159341a.isAssignableFrom(cls)) {
                arrayList.add(a0Var.f159342b);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList d() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it8 = this.f159347a.iterator();
        while (it8.hasNext()) {
            a0 a0Var = (a0) it8.next();
            if (a0Var.f159341a.isAssignableFrom(k.class) && a0Var.f159342b.isAssignableFrom(InputStream.class)) {
                it8.remove();
                arrayList.add(a0Var.f159343c);
            }
        }
        return arrayList;
    }
}
