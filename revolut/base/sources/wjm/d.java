package wjm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends RenderingFormat {
    @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
    public final String escape(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return a0.D(a0.D(string, "<", "&lt;", false), ">", "&gt;", false);
    }
}
