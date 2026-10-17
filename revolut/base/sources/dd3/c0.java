package dd3;

import com.revolut.feature.cashback.impl.R$string;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public interface c0 extends a {

    @NotNull
    public static final b0 Companion = b0.f113086a;

    @Override // dd3.a
    default String a() {
        return "3D225";
    }

    @Override // dd3.a
    default int b() {
        return R$string.cashback_source_travel_title;
    }
}
