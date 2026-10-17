package te0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements sim.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f270013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile e f270014b;

    public f() {
        this.f270013a = null;
    }

    public abstract e a(Object obj2, String str);

    public abstract e b(String str);

    @Override // sim.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final e getValue(Object thisRef, KProperty property) {
        e eVarB;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        e eVar = this.f270014b;
        if (eVar != null) {
            return eVar;
        }
        synchronized (this) {
            try {
                eVarB = this.f270014b;
                if (eVarB == null) {
                    String name = property.getName();
                    Object obj2 = this.f270013a;
                    eVarB = obj2 == null ? b(name) : a(obj2, name);
                    this.f270014b = eVarB;
                }
            } finally {
            }
        }
        return eVarB;
    }

    public f(Object obj2) {
        Intrinsics.checkNotNullParameter(obj2, "default");
        this.f270013a = obj2;
    }
}
