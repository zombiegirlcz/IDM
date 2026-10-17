package dd3;

import com.revolut.feature.cashback.impl.R$string;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public interface j extends a {

    @NotNull
    public static final i Companion = i.f113093a;

    @Override // dd3.a
    default String a() {
        return "3D114";
    }

    @Override // dd3.a
    default int b() {
        return R$string.cashback_source_metal_title;
    }
}
