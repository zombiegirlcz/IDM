package tmh;

import aah.h;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f272227c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aoh.a f272228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f272229b;

    static {
        xnh.a[] elements = {xnh.a.STOCKS, xnh.a.ETFS, xnh.a.BONDS, xnh.a.CFD};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f272227c = kotlin.collections.d.y0(elements);
    }

    public g(aoh.a productProvider, h disclaimersExtension) {
        Intrinsics.checkNotNullParameter(productProvider, "productProvider");
        Intrinsics.checkNotNullParameter(disclaimersExtension, "disclaimersExtension");
        this.f272228a = productProvider;
        this.f272229b = disclaimersExtension;
    }
}
