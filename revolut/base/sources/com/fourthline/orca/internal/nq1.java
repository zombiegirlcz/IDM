package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.fourthline.orca.internal.ab0;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class nq1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31467a;

    public /* synthetic */ nq1(int i) {
        this.f31467a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f31467a) {
            case 0:
                return oe1.a((SemanticsPropertyReceiver) obj2);
            case 1:
                return Long.valueOf(pa0.a(((Integer) obj2).intValue()));
            case 2:
                return Long.valueOf(pa0.b(((Integer) obj2).intValue()));
            case 3:
                return q7.a((SemanticsPropertyReceiver) obj2);
            case 4:
                return qb0.a((Pair) obj2);
            case 5:
                return Boolean.valueOf(r91.a((g51) obj2));
            case 6:
                return Boolean.valueOf(rj.a((g51) obj2));
            case 7:
                return ro.a((SemanticsPropertyReceiver) obj2);
            case 8:
                return s40.a((rlm.f) obj2);
            case 9:
                return sa.a((ir) obj2);
            case 10:
                return so.a((Rect) obj2);
            case 11:
                return so.a((SemanticsPropertyReceiver) obj2);
            case 12:
                return so.b(((Float) obj2).floatValue());
            case 13:
                return so.b((SemanticsPropertyReceiver) obj2);
            case 14:
                return so.a(((Float) obj2).floatValue());
            case 15:
                return so.a((Bitmap) obj2);
            case 16:
                return u1.a((Pair) obj2);
            case 17:
                return u1.b((ab0.c.a) obj2);
            case 18:
                return v1.a((AnimatedContentTransitionScope) obj2);
            case 19:
                return v1.b((AnimatedContentTransitionScope) obj2);
            case 20:
                return v1.c((AnimatedContentTransitionScope) obj2);
            case 21:
                return v1.d((AnimatedContentTransitionScope) obj2);
            case 22:
                return wl0.c((sl0) obj2);
            case 23:
                return wl0.a((sl0) obj2);
            case 24:
                return wl0.b((sl0) obj2);
            case 25:
                return x40.a((aem.j1) obj2);
            case 26:
                return xe.d((li) obj2);
            case 27:
                return xe.a((li) obj2);
            case 28:
                return xe.c((li) obj2);
            default:
                return xe.b((li) obj2);
        }
    }
}
