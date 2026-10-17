package d3c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f111013b;

    public e(String fileName, byte[] data) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f111012a = fileName;
        this.f111013b = data;
    }
}
