package qn5;

import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.ISO7816;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f247873b = {5, ISO7816.INS_REHABILITATE_CHV};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f247874c = {4, -109};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn5.b f247875a;

    public b(mn5.b base58Codec) {
        Intrinsics.checkNotNullParameter(base58Codec, "base58Codec");
        this.f247875a = base58Codec;
    }
}
