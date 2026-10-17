package jk5;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c70.a f175101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sd5.b f175102b;

    public l(c70.a clipboard, sd5.b blockchainExplorerUrlResolver) {
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(blockchainExplorerUrlResolver, "blockchainExplorerUrlResolver");
        this.f175101a = clipboard;
        this.f175102b = blockchainExplorerUrlResolver;
    }

    public static efm.b a(b bVar, String str) {
        if (str != null) {
            return ((i) bVar).I2(str);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("url to blockchain Explorer shouldn't be null");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        ((i) bVar).B2();
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
