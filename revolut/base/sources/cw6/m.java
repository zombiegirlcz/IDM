package cw6;

import android.text.InputFilter;
import android.text.Spanned;
import com.revolut.feature.customer_present.tips.impl.screen.tips_management.TipsManagementScreen;
import com.revolut.feature.shared.branding.impl.ui.settings.BrandingSettingsScreen;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.text.CharsKt;
import kotlin.text.d0;
import kotlin.text.z;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109556a;

    public /* synthetic */ m(int i) {
        this.f109556a = i;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i5) {
        int iIntValue;
        int i6 = 0;
        switch (this.f109556a) {
            case 0:
                Intrinsics.h(charSequence);
                StringBuilder sb6 = new StringBuilder();
                int length = charSequence.length();
                while (i6 < length) {
                    char cCharAt = charSequence.charAt(i6);
                    if (Character.isLetterOrDigit(cCharAt)) {
                        sb6.append(cCharAt);
                    }
                    i6++;
                }
                if (sb6.length() == i2 - i) {
                    return null;
                }
                return sb6.toString();
            case 1:
                Intrinsics.h(charSequence);
                StringBuilder sb9 = new StringBuilder();
                int length2 = charSequence.length();
                while (i6 < length2) {
                    char cCharAt2 = charSequence.charAt(i6);
                    if (Character.isDigit(cCharAt2)) {
                        sb9.append(cCharAt2);
                    }
                    i6++;
                }
                if (sb9.length() == i2 - i) {
                    return null;
                }
                return sb9.toString();
            case 2:
                KProperty[] kPropertyArr = TipsManagementScreen.S;
                Intrinsics.h(spanned);
                Intrinsics.h(charSequence);
                Integer numM = z.m(d0.j0(spanned, i3, i5, charSequence.subSequence(i, i2).toString()).toString());
                if (numM == null || 1 > (iIntValue = numM.intValue()) || iIntValue >= 101) {
                    return "";
                }
                return null;
            case 3:
                Intrinsics.h(spanned);
                Intrinsics.h(charSequence);
                if (d0.j0(spanned, i3, i5, charSequence).length() <= 4) {
                    return null;
                }
                m70.a.c(t0.f186434a);
                return "";
            case 4:
                CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
                StringBuilder sb10 = new StringBuilder();
                int length3 = charSequenceSubSequence.length();
                while (i6 < length3) {
                    char cCharAt3 = charSequenceSubSequence.charAt(i6);
                    if (Character.isLetter(cCharAt3)) {
                        sb10.append(cCharAt3);
                    }
                    i6++;
                }
                if (sb10.length() == i2 - i) {
                    return null;
                }
                return sb10.toString();
            case 5:
                BrandingSettingsScreen.a aVar = BrandingSettingsScreen.Companion;
                Intrinsics.h(charSequence);
                StringBuilder sb11 = new StringBuilder();
                int length4 = charSequence.length();
                while (i6 < length4) {
                    char cCharAt4 = charSequence.charAt(i6);
                    if (d0.K("0123456789ABCDEF", cCharAt4)) {
                        sb11.append(cCharAt4);
                    }
                    i6++;
                }
                if (sb11.length() == i2 - i) {
                    return null;
                }
                return sb11.toString();
            case 6:
                Intrinsics.h(charSequence);
                StringBuilder sb12 = new StringBuilder();
                int length5 = charSequence.length();
                while (i6 < length5) {
                    char cCharAt5 = charSequence.charAt(i6);
                    if (Character.isLetterOrDigit(cCharAt5) || cCharAt5 == ' ' || cCharAt5 == '-') {
                        sb12.append(cCharAt5);
                    }
                    i6++;
                }
                if (sb12.length() == i2 - i) {
                    return null;
                }
                return sb12.toString();
            case 7:
                Intrinsics.h(charSequence);
                StringBuilder sb13 = new StringBuilder();
                int length6 = charSequence.length();
                while (i6 < length6) {
                    char cCharAt6 = charSequence.charAt(i6);
                    if (Character.isLetterOrDigit(cCharAt6) || cCharAt6 == ' ' || cCharAt6 == '-') {
                        sb13.append(cCharAt6);
                    }
                    i6++;
                }
                if (sb13.length() == i2 - i) {
                    return null;
                }
                return sb13.toString();
            case 8:
                Intrinsics.h(charSequence);
                StringBuilder sb14 = new StringBuilder();
                int length7 = charSequence.length();
                while (i6 < length7) {
                    char cCharAt7 = charSequence.charAt(i6);
                    if (Character.isLetterOrDigit(cCharAt7) || cCharAt7 == ' ' || cCharAt7 == '-') {
                        sb14.append(cCharAt7);
                    }
                    i6++;
                }
                if (sb14.length() == i2 - i) {
                    return null;
                }
                return sb14.toString();
            case 9:
                Intrinsics.h(charSequence);
                StringBuilder sb15 = new StringBuilder();
                int length8 = charSequence.length();
                while (i6 < length8) {
                    char cCharAt8 = charSequence.charAt(i6);
                    if (Character.isDigit(cCharAt8)) {
                        sb15.append(cCharAt8);
                    }
                    i6++;
                }
                if (sb15.length() == i2 - i) {
                    return null;
                }
                return sb15.toString();
            case 10:
                Intrinsics.h(charSequence);
                StringBuilder sb16 = new StringBuilder();
                int length9 = charSequence.length();
                while (i6 < length9) {
                    char cCharAt9 = charSequence.charAt(i6);
                    if (Character.isLetter(cCharAt9) || CharsKt.e(cCharAt9)) {
                        sb16.append(cCharAt9);
                    }
                    i6++;
                }
                if (sb16.length() == i2 - i) {
                    return null;
                }
                return sb16;
            default:
                Intrinsics.h(charSequence);
                StringBuilder sb17 = new StringBuilder();
                int length10 = charSequence.length();
                while (i6 < length10) {
                    char cCharAt10 = charSequence.charAt(i6);
                    if (!CharsKt.e(cCharAt10)) {
                        sb17.append(cCharAt10);
                    }
                    i6++;
                }
                if (sb17.length() == i2 - i) {
                    return null;
                }
                return sb17;
        }
    }
}
