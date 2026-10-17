package com.fourthline.orca.internal;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.content.NavBackStackEntry;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class qk1 implements oim.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lazy f32472b;

    public /* synthetic */ qk1(Lazy lazy, int i) {
        this.f32471a = i;
        this.f32472b = lazy;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.f32471a;
        AnimatedContentScope animatedContentScope = (AnimatedContentScope) obj2;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj3;
        Composer composer = (Composer) obj4;
        int iIntValue = ((Integer) obj5).intValue();
        switch (i) {
            case 0:
                return d01.a(this.f32472b, animatedContentScope, navBackStackEntry, composer, iIntValue);
            case 1:
                return hh.a(this.f32472b, animatedContentScope, navBackStackEntry, composer, iIntValue);
            case 2:
                return hh.b(this.f32472b, animatedContentScope, navBackStackEntry, composer, iIntValue);
            case 3:
                return po.a(this.f32472b, animatedContentScope, navBackStackEntry, composer, iIntValue);
            default:
                return po.b(this.f32472b, animatedContentScope, navBackStackEntry, composer, iIntValue);
        }
    }
}
