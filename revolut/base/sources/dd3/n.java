package dd3;

import com.revolut.feature.cashback.impl.R$string;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public interface n extends a {

    @NotNull
    public static final m Companion = m.f113098a;

    @Override // dd3.a
    default String a() {
        return "3D206";
    }

    @Override // dd3.a
    default int b() {
        return R$string.cashback_source_pro_title;
    }
}
