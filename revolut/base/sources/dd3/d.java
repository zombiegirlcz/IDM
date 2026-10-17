package dd3;

import com.revolut.feature.cashback.impl.R$string;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public interface d extends a {

    @NotNull
    public static final c Companion = c.f113087a;

    @Override // dd3.a
    default String a() {
        return "3D296";
    }

    @Override // dd3.a
    default int b() {
        return R$string.cashback_source_credit_title;
    }
}
