package osk;

import aw0.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class s {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f229357c = new d0(167, 180);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f229358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f229359b;

    public s(p headerBuilder, q priceTargetsWidgetBuilder, r ratingsWidgetBuilder) {
        Intrinsics.checkNotNullParameter(headerBuilder, "headerBuilder");
        Intrinsics.checkNotNullParameter(priceTargetsWidgetBuilder, "priceTargetsWidgetBuilder");
        Intrinsics.checkNotNullParameter(ratingsWidgetBuilder, "ratingsWidgetBuilder");
        this.f229358a = priceTargetsWidgetBuilder;
        this.f229359b = ratingsWidgetBuilder;
    }
}
