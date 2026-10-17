package a96;

import android.print.PrintAttributes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements e4m.e {
    public static kgm.c a() {
        k.Companion.getClass();
        PrintAttributes printAttributesBuild = new PrintAttributes.Builder().setMediaSize(PrintAttributes.MediaSize.NA_LETTER).setResolution(new PrintAttributes.Resolution("pdf", "pdf", 600, 600)).setMinMargins(PrintAttributes.Margins.NO_MARGINS).build();
        Intrinsics.checkNotNullExpressionValue(printAttributesBuild, "build(...)");
        return new kgm.c(printAttributesBuild);
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
