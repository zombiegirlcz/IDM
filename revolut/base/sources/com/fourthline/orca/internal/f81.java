package com.fourthline.orca.internal;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class f81 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[aj0.values().length];
            try {
                iArr[aj0.f26821b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[aj0.f26822c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[aj0.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final di0 a(di0 di0Var, aj0 themeStrategy) {
        Intrinsics.checkNotNullParameter(di0Var, "<this>");
        Intrinsics.checkNotNullParameter(themeStrategy, "themeStrategy");
        int i = a.$EnumSwitchMapping$0[themeStrategy.ordinal()];
        if (i == 1) {
            return di0.a(di0Var, 0L, di0Var.getLight(), 1, null);
        }
        if (i == 2) {
            return di0.a(di0Var, di0Var.getDark(), 0L, 2, null);
        }
        if (i == 3) {
            return di0Var;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ea a(String lightKey, String darkKey, aj0 themeStrategy, Function1 resolve) {
        Intrinsics.checkNotNullParameter(lightKey, "lightKey");
        Intrinsics.checkNotNullParameter(darkKey, "darkKey");
        Intrinsics.checkNotNullParameter(themeStrategy, "themeStrategy");
        Intrinsics.checkNotNullParameter(resolve, "resolve");
        int i = a.$EnumSwitchMapping$0[themeStrategy.ordinal()];
        if (i == 1) {
            ea eaVar = (ea) resolve.invoke(lightKey);
            return new ea(eaVar.getLight(), eaVar.getLight(), null);
        }
        if (i == 2) {
            ea eaVar2 = (ea) resolve.invoke(darkKey);
            return new ea(eaVar2.getDark(), eaVar2.getDark(), null);
        }
        if (i == 3) {
            return new ea(((ea) resolve.invoke(lightKey)).getLight(), ((ea) resolve.invoke(darkKey)).getDark(), null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
