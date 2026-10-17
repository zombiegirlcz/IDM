package qkf;

import elf.c0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    @NotNull
    private static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f247000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f247001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f247002c;

    public m(h0 commonDataSource, f itemsMapper, c0 cryptoRemittanceFieldClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(cryptoRemittanceFieldClickHandler, "cryptoRemittanceFieldClickHandler");
        this.f247000a = commonDataSource;
        this.f247001b = itemsMapper;
        this.f247002c = cryptoRemittanceFieldClickHandler;
    }
}
