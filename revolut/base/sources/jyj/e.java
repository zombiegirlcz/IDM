package jyj;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e extends q implements Function1 {
    public static final e f = new e();

    public e() {
        super(1, lim.k.class, "readBytes", "readBytes(Ljava/io/File;)[B", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        File p0 = (File) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return lim.m.d(p0);
    }
}
