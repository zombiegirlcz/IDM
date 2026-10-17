package com.fourthline.vision.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public abstract class lc implements e4m.e {
    public static xf a(bb bbVar, Context context, zf zfVar, k7 k7Var, df dfVar, ja jaVar, x xVar, la laVar, m7 m7Var) {
        xf xfVarProvideVisionViewModel = bbVar.provideVisionViewModel(context, zfVar, k7Var, dfVar, jaVar, xVar, laVar, m7Var);
        vc.s.k(xfVarProvideVisionViewModel);
        return xfVarProvideVisionViewModel;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
