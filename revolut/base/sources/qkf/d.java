package qkf;

import elf.c0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f246991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f246992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f246993c;

    public d(h0 commonDataSource, f itemsMapper, c0 cryptoRemittanceFieldClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(cryptoRemittanceFieldClickHandler, "cryptoRemittanceFieldClickHandler");
        this.f246991a = commonDataSource;
        this.f246992b = itemsMapper;
        this.f246993c = cryptoRemittanceFieldClickHandler;
    }
}
