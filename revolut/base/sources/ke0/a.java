package ke0;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements je0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f182953a;

    public a(List mappers) {
        Intrinsics.checkNotNullParameter(mappers, "mappers");
        this.f182953a = mappers;
    }

    @Override // je0.c
    public final boolean a(Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        List list = this.f182953a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (((je0.c) it8.next()).a(type)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [byte[], java.io.Serializable, java.lang.Object] */
    @Override // je0.b
    public final Object b(Serializable serializable, Type type) {
        Object next;
        Object objB;
        ?? item = (byte[]) serializable;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator it8 = this.f182953a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((je0.c) next).a(type)) {
                break;
            }
        }
        je0.c cVar = (je0.c) next;
        if (cVar == 0 || (objB = cVar.b(item, type)) == null) {
            throw new IllegalArgumentException(p.a.p("Delegate mapper for the type: ", type.getClass().getName(), " not found!"));
        }
        return objB;
    }

    @Override // je0.b
    public final Object c(Object item, Type type) {
        Object next;
        byte[] bArr;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator it8 = this.f182953a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((je0.c) next).a(type)) {
                break;
            }
        }
        je0.c cVar = (je0.c) next;
        if (cVar == null || (bArr = (byte[]) cVar.c(item, type)) == null) {
            throw new IllegalArgumentException(p.a.p("Delegate mapper for the type: ", type.getClass().getName(), " not found!"));
        }
        return bArr;
    }
}
