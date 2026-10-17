package e8;

import com.google.common.base.Preconditions;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes.dex */
public final class r implements y8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f123511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f123512b;

    public /* synthetic */ r(Object obj2) {
        this.f123511a = obj2;
    }

    public static void d(r rVar, Function0 function0, int i) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        synchronized (rVar) {
            rVar.f123512b = od0.k.f224258a;
            if (function0 != null) {
                function0.invoke();
                Unit unit = Unit.f186387a;
            }
        }
    }

    public g8.a a() {
        if (((g8.a) this.f123512b) == null) {
            synchronized (this) {
                try {
                    if (((g8.a) this.f123512b) == null) {
                        File cacheDir = ((g8.d) ((ecm.q) this.f123511a).f124861b).f141226a.getCacheDir();
                        g8.c cVarA = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            cVarA = g8.c.a(file);
                        }
                        this.f123512b = cVarA;
                    }
                    if (((g8.a) this.f123512b) == null) {
                        this.f123512b = new p96.a(13);
                    }
                } finally {
                }
            }
        }
        return (g8.a) this.f123512b;
    }

    public Object b(KProperty property) {
        Object objInvoke;
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj2 = this.f123512b;
        od0.k kVar = od0.k.f224258a;
        if (obj2 != kVar) {
            return obj2;
        }
        synchronized (this) {
            objInvoke = this.f123512b;
            if (objInvoke == kVar) {
                objInvoke = ((Function0) this.f123511a).invoke();
                this.f123512b = objInvoke;
            }
        }
        return objInvoke;
    }

    public void c(ecm.r rVar) {
        Preconditions.checkNotNull(rVar, "newState");
        if (((ecm.r) this.f123512b) == rVar || ((ecm.r) this.f123512b) == ecm.r.SHUTDOWN) {
            return;
        }
        this.f123512b = rVar;
        if (((ArrayList) this.f123511a).isEmpty()) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f123511a;
        this.f123511a = new ArrayList();
        Iterator it8 = arrayList.iterator();
        if (it8.hasNext()) {
            throw v0.a.e(it8);
        }
    }

    @Override // y8.g
    public Object get() {
        if (this.f123512b == null) {
            synchronized (this) {
                try {
                    if (this.f123512b == null) {
                        Object obj2 = ((y8.g) this.f123511a).get();
                        y8.f.c(obj2, "Argument must not be null");
                        this.f123512b = obj2;
                    }
                } finally {
                }
            }
        }
        return this.f123512b;
    }

    public r(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f123511a = initializer;
        this.f123512b = od0.k.f224258a;
    }
}
