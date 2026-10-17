package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ye0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l70 f35273a;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.RESIDENCE_PERMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.DRIVERS_LICENSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ye0(l70 lottieServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        this.f35273a = lottieServiceLocator;
    }

    public final p70 a(fd fdVar, DocumentType documentType, gd0 gd0Var) {
        fd0 fd0VarC;
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        if (gd0Var == null || (fd0VarC = gd0Var.c()) == null) {
            fd0VarC = fd0.f;
        }
        Object obj2 = null;
        String str = "Card";
        switch (a.$EnumSwitchMapping$0[documentType.ordinal()]) {
            case 1:
                String strC = fdVar != null ? fdVar.c() : null;
                str = (!Intrinsics.f(strC, "USA") && !Intrinsics.f(strC, "ITA")) ? "PassportFront" : "PassportBack";
                break;
        }
        String str2 = str + "Device" + fd0VarC.name();
        Iterator<E> it8 = k70.c().iterator();
        while (true) {
            if (it8.hasNext()) {
                Object next = it8.next();
                if (Intrinsics.f(((k70) next).name(), str2)) {
                    obj2 = next;
                }
            }
        }
        k70 k70Var = (k70) obj2;
        if (k70Var == null) {
            k70Var = k70.q0;
        }
        return this.f35273a.a(k70Var);
    }
}
