package com.fourthline.vision.internal;

import android.renderscript.RenderScript;

/* JADX INFO: loaded from: classes23.dex */
public abstract class h1 implements e4m.e {
    public static RenderScript a(s0 s0Var) {
        RenderScript renderScriptProvideRenderScript = s0Var.provideRenderScript();
        vc.s.k(renderScriptProvideRenderScript);
        return renderScriptProvideRenderScript;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
