package com.google.android.material.color.utilities;

import io.reactivex.rxjava3.core.Observable;
import java.lang.reflect.Field;
import java.util.function.Function;
import jnd.q;
import kotlinx.coroutines.flow.MutableStateFlow;
import nhm.i;
import vyg.h;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class f implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49090a;

    public /* synthetic */ f(int i) {
        this.f49090a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj2) {
        switch (this.f49090a) {
            case 0:
                return MaterialDynamicColors.lambda$primaryFixedDim$107((DynamicScheme) obj2);
            case 1:
                return ((DynamicScheme) obj2).tertiaryPalette;
            case 2:
                return MaterialDynamicColors.lambda$tertiaryContainer$86((DynamicScheme) obj2);
            case 3:
                return Observable.just(obj2);
            case 4:
                return jbm.b.a((jbm.b) obj2);
            case 5:
                return (MutableStateFlow) q.f176721a.invoke(obj2);
            case 6:
                mhm.d dVar = (mhm.d) obj2;
                return dVar.f205589a + " -> " + dVar.f205590b;
            case 7:
                i iVar = (i) obj2;
                return new mhm.d(iVar.f(), iVar.i());
            case 8:
                return ((i) obj2).i();
            case 9:
                return String.valueOf(obj2);
            case 10:
                return ((p9.g) obj2).o();
            case 11:
                return ((xvg.a) obj2).f309262a;
            case 12:
                return ((xvg.a) obj2).f309262a;
            case 13:
                return ((h) obj2).f293321c;
            default:
                return ((Field) obj2).getName();
        }
    }
}
