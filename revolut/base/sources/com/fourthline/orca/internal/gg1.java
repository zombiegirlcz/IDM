package com.fourthline.orca.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class gg1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(fh1 fh1Var, boolean z) {
        if (!lh0.f30621a.a() || z) {
            return false;
        }
        List modules = fh1Var.getModules();
        if ((modules instanceof Collection) && modules.isEmpty()) {
            return false;
        }
        Iterator it8 = modules.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(((ig1) it8.next()).getName(), "QualifiedElectronicSignature")) {
                return true;
            }
        }
        return false;
    }
}
