package dd3;

import com.revolut.feature.cashback.impl.R$string;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public interface g extends a {

    @NotNull
    public static final f Companion = f.f113091a;

    @Override // dd3.a
    default String a() {
        return "";
    }

    @Override // dd3.a
    default int b() {
        return R$string.cashback_source_gifts_title;
    }
}
