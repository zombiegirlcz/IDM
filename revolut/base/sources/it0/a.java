package it0;

import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    @NotNull
    public static final C0943a Companion = new C0943a();

    /* JADX INFO: renamed from: it0.a$a, reason: collision with other inner class name */
    public static final class C0943a {
        private C0943a() {
        }
    }

    public static Set a(float[] yValues) {
        Intrinsics.checkNotNullParameter(yValues, "yValues");
        if (yValues.length < 2) {
            return h0.f322473a;
        }
        float fG0 = d.g0(yValues);
        Intrinsics.checkNotNullParameter(yValues, "<this>");
        if (yValues.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z = false;
        float fMin = yValues[0];
        Intrinsics.checkNotNullParameter(yValues, "<this>");
        int length = yValues.length - 1;
        if (1 <= length) {
            int i = 1;
            while (true) {
                fMin = Math.min(fMin, yValues[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        if (fG0 <= fMin) {
            return h0.f322473a;
        }
        float f = (fG0 - fMin) * 0.15f;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        float f4 = yValues[0];
        b bVar = b.FINDING_PEAK;
        int length2 = yValues.length;
        int i2 = 0;
        int i3 = 1;
        b bVar2 = bVar;
        Integer numValueOf = null;
        float f5 = f4;
        while (i3 < length2) {
            float f6 = yValues[i3];
            boolean z3 = z;
            int i5 = c.f168320a[bVar2.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (f6 < f5) {
                    f5 = f6;
                } else if (f6 - f5 >= f) {
                    if (numValueOf != null) {
                        linkedHashSet.add(numValueOf);
                    }
                    bVar2 = b.FINDING_PEAK;
                    numValueOf = null;
                    i2 = i3;
                    f4 = f6;
                }
            } else if (f6 > f4) {
                i2 = i3;
                f4 = f6;
            } else if (f4 - f6 >= f) {
                numValueOf = Integer.valueOf(i2);
                bVar2 = b.FINDING_TROUGH;
                f5 = f6;
            }
            i3++;
            z = z3;
        }
        boolean z4 = z;
        if (bVar2 == b.FINDING_TROUGH && numValueOf != null) {
            linkedHashSet.add(numValueOf);
        }
        if (bVar2 == b.FINDING_PEAK && f4 >= fG0 && !linkedHashSet.contains(Integer.valueOf(i2)) && f4 - yValues[z4 ? 1 : 0] >= f) {
            linkedHashSet.add(Integer.valueOf(i2));
        }
        return linkedHashSet;
    }
}
