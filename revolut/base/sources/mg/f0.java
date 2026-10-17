package mg;

import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import le.u1;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements kg.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.q f205070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kg.i f205071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.gson.internal.f f205072c;
    public final l d;
    public final List e;

    public f0(r8.q qVar, kg.i iVar, com.google.gson.internal.f fVar, l lVar, List list) {
        this.f205070a = qVar;
        this.f205071b = iVar;
        this.f205072c = fVar;
        this.d = lVar;
        this.e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj2, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj2 = null;
        }
        if (!com.google.gson.internal.u.f49657a.a(obj2, accessibleObject)) {
            throw new JsonIOException(a0.d.r(og.c.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    public static void c(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + og.c.c(field) + " and " + og.c.c(field2) + "\nSee " + com.google.gson.internal.j.f("duplicate-fields"));
    }

    @Override // kg.m0
    public final kg.l0 a(kg.o oVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        te0.w wVar = og.c.f224953a;
        if (!Modifier.isStatic(rawType.getModifiers()) && (rawType.isAnonymousClass() || rawType.isLocalClass())) {
            return new kg.k(2);
        }
        kg.d0 d0VarJ = u1.j(this.e);
        if (d0VarJ == kg.d0.BLOCK_ALL) {
            throw new JsonIOException(a0.d.q("ReflectionAccessFilter does not permit using reflection for ", rawType, ". Register a TypeAdapter for this type or adjust the access filter."));
        }
        boolean z = d0VarJ == kg.d0.BLOCK_INACCESSIBLE;
        return og.c.f224953a.X(rawType) ? new e0(rawType, d(oVar, typeToken, rawType, z, true), z) : new c0(this.f205070a.c(typeToken, true), d(oVar, typeToken, rawType, z, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final mg.d0 d(kg.o r30, com.google.gson.reflect.TypeToken r31, java.lang.Class r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.f0.d(kg.o, com.google.gson.reflect.TypeToken, java.lang.Class, boolean, boolean):mg.d0");
    }

    public final boolean e(Field field, boolean z) {
        boolean z3;
        com.google.gson.internal.f fVar = this.f205072c;
        fVar.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || fVar.c(field.getType(), z)) {
            z3 = true;
            break;
        }
        List list = z ? fVar.f49634a : fVar.f49635b;
        if (!list.isEmpty()) {
            mp.r rVar = new mp.r(field);
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (((kg.a) it8.next()).a(rVar)) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        return !z3;
    }
}
