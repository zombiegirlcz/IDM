package ffk;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {
    public static mha.a a(String str, List list) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            mha.h hVar = (mha.h) next;
            if (Intrinsics.f(hVar.a(), str) && (hVar instanceof mha.a)) {
                break;
            }
        }
        return (mha.a) next;
    }

    public static mha.d b(String str, List list) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            mha.h hVar = (mha.h) next;
            if (Intrinsics.f(hVar.a(), str) && (hVar instanceof mha.d)) {
                break;
            }
        }
        return (mha.d) next;
    }

    public static mha.e c(String str, List list) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            mha.h hVar = (mha.h) next;
            if (Intrinsics.f(hVar.a(), str) && (hVar instanceof mha.e)) {
                break;
            }
        }
        return (mha.e) next;
    }

    public static boolean d(mha.j jVar, mha.j jVar2) {
        dj0.d dVar = jVar.f205455b;
        dj0.d dVar2 = jVar2.f205455b;
        double d = jVar.f205454a;
        double d5 = jVar2.f205454a;
        if (d < d5) {
            return true;
        }
        if (d != d5) {
            return false;
        }
        if (dVar == null && dVar2 != null) {
            return true;
        }
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.i(dVar2);
    }
}
