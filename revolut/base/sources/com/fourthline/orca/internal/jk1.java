package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.VisualTransformation;
import com.fourthline.orca.internal.lo;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.compose.SelfieScannerComposableKt;
import java.util.List;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class jk1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f29939c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f29940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f29941h;

    public /* synthetic */ jk1(ColumnScope columnScope, zp0 zp0Var, Function2 function2, Function2 function22, Function2 function23, int i, int i2) {
        this.f29937a = 1;
        this.f29938b = columnScope;
        this.f = zp0Var;
        this.f29939c = function2;
        this.f29940g = function22;
        this.f29941h = function23;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f29937a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return ci0.a((ColumnScope) this.f29938b, (Modifier) this.f, (List) this.f29940g, (PagerState) this.f29941h, (Function2) this.f29939c, this.d, this.e, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return hi0.a((ColumnScope) this.f29938b, (zp0) this.f, (Function2) this.f29939c, (Function2) this.f29940g, (Function2) this.f29941h, this.d, this.e, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return so.a((lo.c) this.f29938b, (Function1) this.f, (Function0) this.f29940g, (Function0) this.f29941h, (Function1) this.f29939c, this.d, this.e, (Composer) obj2, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj3).intValue();
                return z21.a((Modifier) this.f, (VisualTransformation) this.f29938b, this.f29940g, (Function1) this.f29941h, (Function1) this.f29939c, this.d, this.e, (Composer) obj2, iIntValue4);
            default:
                int iIntValue5 = ((Integer) obj3).intValue();
                return SelfieScannerComposableKt.SelfieScanner$lambda$0((SelfieScannerConfig) this.f29938b, (Function0) this.f, (Flow) this.f29940g, (Function1) this.f29941h, (Function2) this.f29939c, this.d, this.e, (Composer) obj2, iIntValue5);
        }
    }

    public /* synthetic */ jk1(Modifier modifier, VisualTransformation visualTransformation, Object obj2, Function1 function1, Function1 function12, int i, int i2) {
        this.f29937a = 3;
        this.f = modifier;
        this.f29938b = visualTransformation;
        this.f29940g = obj2;
        this.f29941h = function1;
        this.f29939c = function12;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ jk1(Object obj2, Object obj3, Object obj4, Object obj5, Function function, int i, int i2, int i3) {
        this.f29937a = i3;
        this.f29938b = obj2;
        this.f = obj3;
        this.f29940g = obj4;
        this.f29941h = obj5;
        this.f29939c = function;
        this.d = i;
        this.e = i2;
    }
}
