package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import com.fourthline.orca.internal.lo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class dk1 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27810c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dk1(ie1 ie1Var, Function1 function1, Object obj2, int i) {
        this.f27808a = i;
        this.d = ie1Var;
        this.f27809b = function1;
        this.f27810c = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f27808a) {
            case 0:
                return c91.a((v81) this.d, (FocusManager) this.f27810c, (Function1) this.f27809b, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 1:
                return hm.a((fm) this.d, (Function1) this.f27809b, (FocusManager) this.f27810c, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 2:
                return i0.a((f0) this.d, (Function1) this.f27809b, (FocusManager) this.f27810c, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 3:
                return ku.a((bu) this.d, (Function1) this.f27809b, (MutableIntState) this.f27810c, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 4:
                return ni.a((li) this.d, (FocusManager) this.f27810c, (Function1) this.f27809b, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 5:
                return o2.a((s2) this.d, (Function1) this.f27809b, (FocusManager) this.f27810c, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 6:
                return s3.a((p3) this.d, (FocusManager) this.f27810c, (Function1) this.f27809b, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 7:
                return so.a((lo.c) this.d, (Function1) this.f27809b, (Function1) this.f27810c, (BoxWithConstraintsScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 8:
                return u50.a((Modifier) this.d, (AnnotatedString) this.f27810c, (TextStyle) this.f27809b, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 9:
                return ue0.a((qe0) this.d, (qe0) this.f27810c, (Function1) this.f27809b, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            default:
                return vl0.a((sl0) this.d, (FocusManager) this.f27810c, (Function1) this.f27809b, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
        }
    }

    public /* synthetic */ dk1(Object obj2, int i, Object obj3, Object obj4) {
        this.f27808a = i;
        this.d = obj2;
        this.f27810c = obj3;
        this.f27809b = obj4;
    }
}
