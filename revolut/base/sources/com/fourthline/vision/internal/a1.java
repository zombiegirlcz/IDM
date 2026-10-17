package com.fourthline.vision.internal;

import android.renderscript.RenderScript;

/* JADX INFO: loaded from: classes23.dex */
public abstract class a1 implements e4m.e {
    public static i7 a(s0 s0Var, RenderScript renderScript, df dfVar) {
        i7 i7VarProvideImageConverter = s0Var.provideImageConverter(renderScript, dfVar);
        vc.s.k(i7VarProvideImageConverter);
        return i7VarProvideImageConverter;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
