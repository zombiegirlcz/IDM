package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class fi0 {
    public static final long a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (kotlin.text.a0.H(str, "#", false)) {
                str = str.substring(1);
                Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
            }
            if (str.length() == 3) {
                str = zhm.d0.k0(kotlin.text.d0.n0(str, new String[]{""}, 0, 6), "", null, null, 0, new bi1(25), 30);
            }
            if (str.length() == 6) {
                str = str.concat("FF");
            }
            String strSubstring = str.substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Integer numValueOf = Integer.valueOf(strSubstring, 16);
            String strSubstring2 = str.substring(2, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            Integer numValueOf2 = Integer.valueOf(strSubstring2, 16);
            String strSubstring3 = str.substring(4, 6);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            Integer numValueOf3 = Integer.valueOf(strSubstring3, 16);
            String strSubstring4 = str.substring(6, 8);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
            Integer numValueOf4 = Integer.valueOf(strSubstring4, 16);
            Intrinsics.h(numValueOf);
            int iIntValue = numValueOf.intValue();
            Intrinsics.h(numValueOf2);
            int iIntValue2 = numValueOf2.intValue();
            Intrinsics.h(numValueOf3);
            int iIntValue3 = numValueOf3.intValue();
            Intrinsics.h(numValueOf4);
            return ColorKt.Color(iIntValue, iIntValue2, iIntValue3, numValueOf4.intValue());
        } catch (Exception unused) {
            return Color.INSTANCE.m1993getTransparent0d7_KjU();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence b(String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8 + it8;
    }
}
