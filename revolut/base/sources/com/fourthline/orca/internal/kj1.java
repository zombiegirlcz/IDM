package com.fourthline.orca.internal;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.content.NavBackStackEntry;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class kj1 implements oim.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30295b;

    public /* synthetic */ kj1(Object obj2, int i) {
        this.f30294a = i;
        this.f30295b = obj2;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f30294a) {
            case 0:
                return b60.a((b60) this.f30295b, (AnimatedContentScope) obj2, (NavBackStackEntry) obj3, (Composer) obj4, ((Integer) obj5).intValue());
            case 1:
                return k0.a((k0) this.f30295b, (AnimatedContentScope) obj2, (NavBackStackEntry) obj3, (Composer) obj4, ((Integer) obj5).intValue());
            case 2:
                return r80.a((oim.n) this.f30295b, (AnimatedContentScope) obj2, (NavBackStackEntry) obj3, (Composer) obj4, ((Integer) obj5).intValue());
            case 3:
                return yf1.a((yf1) this.f30295b, (AnimatedContentScope) obj2, (NavBackStackEntry) obj3, (Composer) obj4, ((Integer) obj5).intValue());
            default:
                return zb.a((zb) this.f30295b, (AnimatedContentScope) obj2, (NavBackStackEntry) obj3, (Composer) obj4, ((Integer) obj5).intValue());
        }
    }
}
