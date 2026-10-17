package zwd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f325951a;

    public b(a... mappers) {
        Intrinsics.checkNotNullParameter(mappers, "mappers");
        this.f325951a = mappers;
    }

    public final a a(yqi.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        for (int i = 0; i < 3; i++) {
            a aVar = this.f325951a[i];
            if (aVar.a(error)) {
                return aVar;
            }
        }
        return null;
    }
}
