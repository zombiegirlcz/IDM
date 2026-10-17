package com.fourthline.orca.internal;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.content.NavBackStackEntry;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class lk1 implements oim.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30671c;

    public /* synthetic */ lk1(Object obj2, Object obj3, int i) {
        this.f30669a = i;
        this.f30670b = obj2;
        this.f30671c = obj3;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f30669a) {
            case 0:
                return ci0.a((bi0) this.f30670b, (Function0) this.f30671c, (ColumnScope) obj2, (PagerState) obj3, (Composer) obj4, ((Integer) obj5).intValue());
            default:
                return k01.a((k01) this.f30670b, (Lazy) this.f30671c, (AnimatedContentScope) obj2, (NavBackStackEntry) obj3, (Composer) obj4, ((Integer) obj5).intValue());
        }
    }
}
