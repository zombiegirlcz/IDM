package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ab0;
import com.fourthline.orca.internal.je;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class zb1 {
    public static final List a(je.a.InterfaceC0222a interfaceC0222a, String fileName) {
        Intrinsics.checkNotNullParameter(interfaceC0222a, "<this>");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (interfaceC0222a instanceof je.a.InterfaceC0222a.b) {
            je.a.InterfaceC0222a.b bVar = (je.a.InterfaceC0222a.b) interfaceC0222a;
            return a(bVar, fileName, bVar.b());
        }
        if (!(interfaceC0222a instanceof je.a.InterfaceC0222a.C0223a)) {
            throw new NoWhenBranchMatchedException();
        }
        je.a.InterfaceC0222a.C0223a c0223a = (je.a.InterfaceC0222a.C0223a) interfaceC0222a;
        return a(c0223a, fileName, c0223a.b());
    }

    private static final List a(je.a.InterfaceC0222a.b bVar, String str, String str2) {
        sc scVarA = tc.a(bVar.a().toString());
        Map mapA = bx.a(bx.e(), str);
        if (str2 != null) {
            bx.b(mapA, str2);
        }
        Unit unit = Unit.f186387a;
        return zhm.u.c(new ab0.c.a(str, scVarA, mapA));
    }

    private static final List a(je.a.InterfaceC0222a.C0223a c0223a, String str, String str2) {
        sc scVar = new sc(c0223a.a());
        Map mapA = bx.a(bx.c(), str);
        if (str2 != null) {
            bx.b(mapA, str2);
        }
        Unit unit = Unit.f186387a;
        return zhm.u.c(new ab0.c.a(str, scVar, mapA));
    }
}
