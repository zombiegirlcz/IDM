package zzb;

import com.revolut.feature.rev_points.models.RevPointsPersonalisationBrandsResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f326664a = new s();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        RevPointsPersonalisationBrandsResponse it8 = (RevPointsPersonalisationBrandsResponse) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return new i(it8);
    }
}
