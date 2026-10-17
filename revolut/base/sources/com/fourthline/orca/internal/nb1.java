package com.fourthline.orca.internal;

import com.fourthline.orca.internal.gb1;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes23.dex */
public interface nb1 extends j20 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[gb1.d.values().length];
            try {
                iArr[gb1.d.f28842c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gb1.d.f28840a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gb1.d.f28841b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    default Function1 a(boolean z) {
        return new rk1(z, 7);
    }

    default c81 b(Object type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static gb1 a(boolean z, gb1 gb1Var) {
        Intrinsics.checkNotNullParameter(gb1Var, "<this>");
        boolean z3 = !z;
        return gb1.a(gb1Var, null, null, null, null, null, gb1Var.q().a(z3, z), gb1Var.r().a(z3), 31, null);
    }

    default Function1 a(Object type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new jn1(type, this, 17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static gb1 a(Object obj2, nb1 nb1Var, gb1 gb1Var) {
        Intrinsics.checkNotNullParameter(gb1Var, "<this>");
        List<gb1.b> listP = gb1Var.p();
        ArrayList arrayList = new ArrayList(zhm.w.t(listP, 10));
        for (gb1.b bVarA : listP) {
            boolean zF = Intrinsics.f(obj2, bVarA.g());
            int i = a.$EnumSwitchMapping$0[bVarA.e().ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                bVarA = gb1.b.a(bVarA, zF ? gb1.d.f28840a : gb1.d.f28841b, null, null, null, zF ? nb1Var.b(obj2) : null, null, null, LDSFile.EF_DG14_TAG, null);
            }
            arrayList.add(bVarA);
        }
        return gb1.a(gb1Var, null, null, arrayList, null, null, gb1Var.q().b(true), null, 91, null);
    }
}
