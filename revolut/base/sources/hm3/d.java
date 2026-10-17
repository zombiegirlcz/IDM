package hm3;

import efm.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tof.i7;
import tof.i8;
import tof.j8;
import tof.k8;
import tof.l8;
import tof.m8;
import tof.n8;
import tof.oa;
import tof.t7;
import tof.v7;
import zm3.n;
import zm3.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d {
    public static oa a(String str) {
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {new l8(str), new k8(str), new v7(str)};
        cVar.getClass();
        return i7.c.b(i7VarArr);
    }

    public static r b(zm3.a contact) {
        Object objA;
        t7 t7Var;
        Intrinsics.checkNotNullParameter(contact, "contact");
        if (contact instanceof zm3.i) {
            i7.c cVar = i7.Companion;
            zm3.i iVar = (zm3.i) contact;
            oa oaVarA = a(iVar.f323351b);
            String str = iVar.f323353g;
            i7[] i7VarArr = {new j8(str), new i8(str)};
            cVar.getClass();
            oa oaVarB = i7.c.b(i7VarArr);
            String str2 = iVar.f323354h;
            i7[] i7VarArr2 = {new n8(str2), new m8(str2)};
            cVar.getClass();
            i7[] i7VarArr3 = {oaVarA, oaVarB, i7.c.b(i7VarArr2)};
            cVar.getClass();
            objA = i7.c.b(i7VarArr3);
        } else if (contact instanceof zm3.j) {
            i7.c cVar2 = i7.Companion;
            zm3.j jVar = (zm3.j) contact;
            String str3 = jVar.f;
            i7[] i7VarArr4 = {new j8(str3), new i8(str3)};
            cVar2.getClass();
            oa oaVarB2 = i7.c.b(i7VarArr4);
            String str4 = jVar.f323362g;
            i7[] i7VarArr5 = {new n8(str4), new m8(str4)};
            cVar2.getClass();
            i7[] i7VarArr6 = {oaVarB2, i7.c.b(i7VarArr5)};
            cVar2.getClass();
            objA = i7.c.b(i7VarArr6);
        } else {
            if (contact instanceof zm3.e) {
                t7Var = new t7(((zm3.e) contact).f323340a);
            } else if (contact instanceof zm3.f) {
                objA = a(((zm3.f) contact).f323345a);
            } else if (contact instanceof n) {
                t7Var = new t7(((n) contact).f323373a);
            } else {
                if (!(contact instanceof o)) {
                    throw new NoWhenBranchMatchedException();
                }
                objA = a(((o) contact).f323376a);
            }
            objA = t7Var;
        }
        return w.h(objA);
    }
}
