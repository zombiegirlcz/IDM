package qa1;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f243939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f243940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f243941c;
    public final byte[] d;
    public final ArrayList e;

    public h(String fileName, boolean z, byte[] key, byte[] signature, ArrayList binaryBlocks) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(binaryBlocks, "binaryBlocks");
        this.f243939a = fileName;
        this.f243940b = z;
        this.f243941c = key;
        this.d = signature;
        this.e = binaryBlocks;
    }
}
