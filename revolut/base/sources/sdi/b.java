package sdi;

import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f261897a = new b();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        RevPointsPocketState it8 = (RevPointsPocketState) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return com.revolut.feature_rev_points_pocket_api.model.a.a(it8);
    }
}
