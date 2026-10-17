package com.fourthline.orca.internal;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import com.fourthline.orca.internal.c21;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ak1 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26832b;

    public /* synthetic */ ak1(Object obj2, int i) {
        this.f26831a = i;
        this.f26832b = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f26831a) {
            case 0:
                return c40.a((Modifier) this.f26832b, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 1:
                return er0.a((c81) this.f26832b, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 2:
                return h21.a((c21.b) this.f26832b, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 3:
                return hi0.a((Function2) this.f26832b, (AnimatedVisibilityScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 4:
                return hi0.a((Pair) this.f26832b, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 5:
                return k11.a((i11) this.f26832b, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 6:
                return pe1.a((String) this.f26832b, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 7:
                return pr0.a((MutableState) this.f26832b, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            default:
                return r7.a((Function1) this.f26832b, (BoxWithConstraintsScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
        }
    }
}
