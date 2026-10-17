package hf1;

import bp0.k;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import java.text.DecimalFormat;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f151741a;

    public g(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f151741a = w.y0(new k(languageProvider, 3));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final String a(TaxRate taxRate) {
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        Intrinsics.checkNotNullParameter(taxRate, "taxRate");
        String str = ((DecimalFormat) this.f151741a.getValue()).format(taxRate.e);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(str + "%", " · ", taxRate.f60696c);
    }
}
