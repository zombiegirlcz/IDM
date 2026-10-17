package qul;

import bul.o;
import f7j.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements e4i.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4i.a f249489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vdf.d f249490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f249491c;
    public final o d;
    public final f e;
    public final Object f;

    public b(u80.o moneyPrefixFormatter, l4i.a amountConverter, vdf.d assetFormatter, p targetPriceBuilder, o targetPriceHintMapper, f targetPriceExplanationMapper) {
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(assetFormatter, "assetFormatter");
        Intrinsics.checkNotNullParameter(targetPriceBuilder, "targetPriceBuilder");
        Intrinsics.checkNotNullParameter(targetPriceHintMapper, "targetPriceHintMapper");
        Intrinsics.checkNotNullParameter(targetPriceExplanationMapper, "targetPriceExplanationMapper");
        this.f249489a = amountConverter;
        this.f249490b = assetFormatter;
        this.f249491c = targetPriceBuilder;
        this.d = targetPriceHintMapper;
        this.e = targetPriceExplanationMapper;
        this.f = w.y0(new qu1.d(5));
    }

    @Override // e4i.a
    public final l4i.a e() {
        return this.f249489a;
    }
}
