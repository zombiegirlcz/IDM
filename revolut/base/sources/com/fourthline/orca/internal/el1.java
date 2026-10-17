package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class el1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28181a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28183c;
    public final /* synthetic */ long d;
    public final /* synthetic */ z10 e;
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f28184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f28185h;

    public /* synthetic */ el1(Modifier modifier, AnnotatedString annotatedString, int i, long j2, z10 z10Var, int i2, int i3) {
        this.f28185h = modifier;
        this.f28182b = annotatedString;
        this.f28183c = i;
        this.d = j2;
        this.e = z10Var;
        this.f = i2;
        this.f28184g = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f28181a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return e10.a((AnnotatedString) this.f28182b, this.f28183c, this.d, this.e, (Function0) this.f28185h, this.f, this.f28184g, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return e10.a((Modifier) this.f28185h, (AnnotatedString) this.f28182b, this.f28183c, this.d, this.e, this.f, this.f28184g, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return e10.a((Modifier) this.f28182b, (String) this.f28185h, this.f28183c, this.d, this.e, this.f, this.f28184g, (Composer) obj2, iIntValue3);
        }
    }

    public /* synthetic */ el1(Modifier modifier, String str, int i, long j2, z10 z10Var, int i2, int i3) {
        this.f28182b = modifier;
        this.f28185h = str;
        this.f28183c = i;
        this.d = j2;
        this.e = z10Var;
        this.f = i2;
        this.f28184g = i3;
    }

    public /* synthetic */ el1(AnnotatedString annotatedString, int i, long j2, z10 z10Var, Function0 function0, int i2, int i3) {
        this.f28182b = annotatedString;
        this.f28183c = i;
        this.d = j2;
        this.e = z10Var;
        this.f28185h = function0;
        this.f = i2;
        this.f28184g = i3;
    }
}
