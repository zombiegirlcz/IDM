package dd3;

import com.revolut.feature.cashback.impl.R$string;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public interface t extends a {

    @NotNull
    public static final s Companion = s.f113102a;

    @Override // dd3.a
    default String a() {
        return "3D222";
    }

    @Override // dd3.a
    default int b() {
        return R$string.cashback_source_shopping_title;
    }
}
