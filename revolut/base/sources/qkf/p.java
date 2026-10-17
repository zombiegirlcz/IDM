package qkf;

import elf.c0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class p {

    @NotNull
    private static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f247004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f247005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f247006c;

    public p(h0 commonDataSource, f itemsMapper, c0 cryptoRemittanceFieldClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(cryptoRemittanceFieldClickHandler, "cryptoRemittanceFieldClickHandler");
        this.f247004a = commonDataSource;
        this.f247005b = itemsMapper;
        this.f247006c = cryptoRemittanceFieldClickHandler;
    }
}
