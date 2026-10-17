package com.fourthline.orca.internal;

import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ai1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26805a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f26806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26807c;
    public final /* synthetic */ r20 d;
    public final /* synthetic */ l20 e;
    public final /* synthetic */ String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f26808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f26809h;
    public final /* synthetic */ Function2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f26810j;
    public final /* synthetic */ String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z10 f26811l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f26812m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f26813n;
    public final /* synthetic */ String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f26814p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f26815q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f26816r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f26817s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f26818t;

    public /* synthetic */ ai1(Modifier modifier, String str, r20 r20Var, l20 l20Var, String str2, String str3, String str4, String str5, z10 z10Var, Function2 function2, z10 z10Var2, Function1 function1, Function1 function12, String str6, String str7, Float f, int i, int i2, int i3) {
        this.f26806b = modifier;
        this.f26807c = str;
        this.d = r20Var;
        this.e = l20Var;
        this.f = str2;
        this.f26808g = str3;
        this.f26809h = str4;
        this.k = str5;
        this.f26811l = z10Var;
        this.i = function2;
        this.f26817s = z10Var2;
        this.f26810j = function1;
        this.f26812m = function12;
        this.f26813n = str6;
        this.o = str7;
        this.f26818t = f;
        this.f26814p = i;
        this.f26815q = i2;
        this.f26816r = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f26805a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return a30.a(this.f26806b, this.f26807c, this.d, this.e, this.f, this.f26808g, this.f26809h, this.k, this.f26811l, this.i, (z10) this.f26817s, this.f26810j, this.f26812m, this.f26813n, this.o, (Float) this.f26818t, this.f26814p, this.f26815q, this.f26816r, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return a30.a(this.f26806b, this.f26807c, this.d, this.e, this.f, this.f26808g, this.f26809h, this.i, this.f26810j, this.k, this.f26811l, this.f26812m, (KeyboardOptions) this.f26817s, (KeyboardActions) this.f26818t, this.f26813n, this.o, this.f26814p, this.f26815q, this.f26816r, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ ai1(Modifier modifier, String str, r20 r20Var, l20 l20Var, String str2, String str3, String str4, Function2 function2, Function1 function1, String str5, z10 z10Var, Function1 function12, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, String str6, String str7, int i, int i2, int i3) {
        this.f26806b = modifier;
        this.f26807c = str;
        this.d = r20Var;
        this.e = l20Var;
        this.f = str2;
        this.f26808g = str3;
        this.f26809h = str4;
        this.i = function2;
        this.f26810j = function1;
        this.k = str5;
        this.f26811l = z10Var;
        this.f26812m = function12;
        this.f26817s = keyboardOptions;
        this.f26818t = keyboardActions;
        this.f26813n = str6;
        this.o = str7;
        this.f26814p = i;
        this.f26815q = i2;
        this.f26816r = i3;
    }
}
