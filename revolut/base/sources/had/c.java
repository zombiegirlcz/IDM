package had;

import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import ez0.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static CountryImage a(u9d.b language) {
        Intrinsics.checkNotNullParameter(language, "language");
        String code = language.getCode();
        return new CountryImage(d0.v0(code, "_", code), (Integer) null, (e) null, 14);
    }
}
