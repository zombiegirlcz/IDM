package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class fp1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f28603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f28604c;
    public final /* synthetic */ FontStyle d;
    public final /* synthetic */ FontWeight e;
    public final /* synthetic */ FontFamily f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f28605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ TextDecoration f28606h;
    public final /* synthetic */ TextAlign i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f28607j;
    public final /* synthetic */ int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f28608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f28609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28610n;
    public final /* synthetic */ Function1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ TextStyle f28611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f28612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f28613r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f28614s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CharSequence f28615t;

    public /* synthetic */ fp1(CharSequence charSequence, Modifier modifier, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j5, int i, boolean z, int i2, int i3, Function1 function1, TextStyle textStyle, int i5, int i6, int i21, int i22) {
        this.f28602a = i22;
        this.f28615t = charSequence;
        this.f28603b = modifier;
        this.f28604c = j2;
        this.d = fontStyle;
        this.e = fontWeight;
        this.f = fontFamily;
        this.f28605g = j3;
        this.f28606h = textDecoration;
        this.i = textAlign;
        this.f28607j = j5;
        this.k = i;
        this.f28608l = z;
        this.f28609m = i2;
        this.f28610n = i3;
        this.o = function1;
        this.f28611p = textStyle;
        this.f28612q = i5;
        this.f28613r = i6;
        this.f28614s = i21;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f28602a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return l2.a((AnnotatedString) this.f28615t, this.f28603b, this.f28604c, this.d, this.e, this.f, this.f28605g, this.f28606h, this.i, this.f28607j, this.k, this.f28608l, this.f28609m, this.f28610n, this.o, this.f28611p, this.f28612q, this.f28613r, this.f28614s, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return l2.a((String) this.f28615t, this.f28603b, this.f28604c, this.d, this.e, this.f, this.f28605g, this.f28606h, this.i, this.f28607j, this.k, this.f28608l, this.f28609m, this.f28610n, this.o, this.f28611p, this.f28612q, this.f28613r, this.f28614s, (Composer) obj2, iIntValue2);
        }
    }
}
